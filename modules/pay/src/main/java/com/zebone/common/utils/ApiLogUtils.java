package com.zebone.common.utils;




import com.zebone.common.config.Global;
import com.zebone.modules.api.service.ApiLogService;
import com.zebone.modules.entity.ApiLogDO;

import org.springframework.util.StringUtils;


import javax.servlet.http.HttpServletRequest;


/**
 * @author 卡卡西
 */
public class ApiLogUtils {

    private static final class Static{
        private static ApiLogService logService = SpringUtils.getBean(ApiLogService.class);
    }

    public static void saveLog(HttpServletRequest request, Object handler, Exception ex, String logTitle, String logType, long executeTime){
        ApiLogDO apiLog = new ApiLogDO();
        apiLog.setLogTitle(logTitle);
        apiLog.setLogType(logType);
        apiLog.setServerAddr(request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort());
        apiLog.setRemoteAddr(IpUtils.getRemoteAddr(request));
        apiLog.setRequestParams(request.getParameterMap());
        apiLog.setRequestMethod(request.getMethod());
        apiLog.setExecuteTime(executeTime);
        apiLog.setRequestUri(request.getRequestURI());
        Throwable throwable = null;
        if (ex != null){
            throwable = ExceptionUtils.getThrowable(request);
        }

        // 异步保存日志
        new ApiLogUtils.SaveLogThread(apiLog, handler, request.getContextPath(), throwable).start();
    }

    public static class SaveLogThread extends Thread{

        private ApiLogDO log;
        private Object handler;
        private String contextPath;
        private Throwable throwable;

        public SaveLogThread(ApiLogDO log, Object handler, String contextPath, Throwable throwable){
            super(ApiLogUtils.SaveLogThread.class.getSimpleName());
            this.log = log;
            this.handler = handler;
            this.contextPath = contextPath;
            this.throwable = throwable;
        }

        @Override
        public void run() {

            if (StringUtils.isEmpty(log.getLogTitle())){
                log.setLogTitle("未知操作");
            }
            // 如果有异常，设置异常信息（将异常对象转换为字符串）
            log.setIsException(throwable != null ? Global.YES : Global.NO);
            log.setExceptionInfo(com.jeesite.common.lang.ExceptionUtils.getStackTraceAsString(throwable));
            // 如果无地址并无异常日志，则不保存信息
            if (StringUtils.isEmpty(log.getRequestUri()) && StringUtils.isEmpty(log.getExceptionInfo())){
                return;
            }
            // 保存日志信息
            ApiLogUtils.Static.logService.insertLog(log);

        }
    }
}
