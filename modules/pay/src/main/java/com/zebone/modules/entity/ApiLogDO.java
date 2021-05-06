package com.zebone.modules.entity;

import com.jeesite.common.collect.MapUtils;
import com.jeesite.common.lang.StringUtils;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Map;

/**
 * @author 卡卡西
 */
@Entity
@Data
@Table(name = "payment_api_log")
public class ApiLogDO {

    @Id
    @GeneratedValue(generator = "snowflakeId")
    @GenericGenerator(name = "snowflakeId", strategy = "com.zebone.common.SnowflakeId")
    private Long id;

    /**
     * 接入日志
     */
    public static final String TYPE_ACCESS = "access";

    /**
     * 修改日志
     */
    public static final String TYPE_UPDATE = "update";

    /**
     * 查询日志
     */
    public static final String TYPE_SELECT = "select";


    /**
     * 日志类型
     */
    private String logType;

    /**
     * 日志标题
     */
    private String logTitle;

    /**
     * 请求URI
     */
    private String requestUri;

    /**
     * 操作方式
     */
    private String requestMethod;

    /**
     * 操作提交的数据
     */
    @Setter(AccessLevel.NONE)
    private String requestParams;

    /**
     * 业务主键
     */
    private String bizKey;

    /**
     * 业务类型
     */
    private String bizType;

    /**
     * 操作IP地址
     */
    private String remoteAddr;

    /**
     * 请求服务器地址
     */
    private String serverAddr;

    /**
     * 是否有异常
     */
    private String isException;

    /**
     * 异常信息
     */
    private String exceptionInfo;

    /**
     * 用户代理
     */
    private String userAgent;

    /**
     * 设备名称/操作系统
     */
    private String deviceName;

    /**
     * 浏览器名称
     */
    private String browserName;

    /**
     * 执行时间
     */
    private Long executeTime;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Transient
    private Map<String, String[]> paramsMap;

    @Transient
    private int pageSize;

    @Transient
    private int pageNo;



    public void setRequestParams(Map paramsMap) {
        if (paramsMap == null){
            return;
        }
        if (this.paramsMap == null){
            this.paramsMap = MapUtils.newHashMap();
        }
        StringBuilder params = new StringBuilder();
        for (Map.Entry<String, String[]> param : ((Map<String, String[]>)paramsMap).entrySet()){
            params.append(("".equals(params.toString()) ? "" : "&") + param.getKey() + "=");
            String paramValue = (param.getValue() != null && param.getValue().length > 0 ? param.getValue()[0] : "");
            params.append(StringUtils.abbr(StringUtils.endsWithIgnoreCase(param.getKey(), "password") ? "*" : paramValue, 1000));
            this.paramsMap.put(param.getKey(), param.getValue());
        }
        this.requestParams = params.toString();
    }
}
