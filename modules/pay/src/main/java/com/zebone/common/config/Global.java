package com.zebone.common.config;

import com.jeesite.common.collect.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class Global {

    public static final String TRUE = "true";
    public static final String HIDE = "0";
    public static final String SHOW = "1";
    public static final String YES = "1";
    private static final com.jeesite.common.config.Global INSTANCE = new com.jeesite.common.config.Global();
    public static final String USERFILES_BASE_URL = "/userfiles/";
    public static final String OP_EDIT = "edit";
    private static Logger logger = LoggerFactory.getLogger(com.jeesite.common.config.Global.class);
    public static final String OP_ADD = "add";
    public static final String NO = "0";
    public static final String OP_AUTH = "auth";
    private static Map<String, String> props = MapUtils.newHashMap();
    public static final String FALSE = "false";
}
