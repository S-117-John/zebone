package com.zebone.quality.modules.stemi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Stemi implements Serializable {

    @JSONField(name="CM-0-1-1-1")
    private String cm_0_1_1_1;
    @JSONField(name="CM-0-1-1-2")
    private String cm_0_1_1_2;
    @JSONField(name="CM-0-1-1-3")
    private String cm_0_1_1_3;
    @JSONField(name="CM-0-1-1-4")
    private String cm_0_1_1_4;
    @JSONField(name="CM-0-1-1-5")
    private String cm_0_1_1_5;
    @JSONField(name="caseId")
    private String caseid;
    @JSONField(name="CM-0-1-3-1")
    private String cm_0_1_3_1;
    @JSONField(name="CM-0-1-3-2")
    private String cm_0_1_3_2;
    @JSONField(name="CM-0-1-4-1")
    private String cm_0_1_4_1;
    @JSONField(name="CM-0-1-4-2")
    private String cm_0_1_4_2;
    @JSONField(name="CM-0-1-5")
    private String cm_0_1_5;
    @JSONField(format = "yyyy-MM-dd",name = "CM-0-2-1-1")
    private Date cm_0_2_1_1;
    @JSONField(name="CM-0-2-1-2")
    private String cm_0_2_1_2;
    @JSONField(name="CM-0-2-1-3")
    private Double cm_0_2_1_3;
    @JSONField(name="CM-0-2-1-5")
    private Double cm_0_2_1_5;
    @JSONField(name="CM-0-2-2-1")
    private List<String> cm_0_2_2_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-2-2")
    private Date cm_0_2_2_2;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-3-2")
    private Date cm_0_2_3_2;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-4-1")
    private Date cm_0_2_4_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-4-2")
    private Date cm_0_2_4_2;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-5-1")
    private Date cm_0_2_5_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-5-2")
    private Date cm_0_2_5_2;
    @JSONField(name="CM-0-3-1")
    private String cm_0_3_1;
    @JSONField(name="CM-0-3-2")
    private String cm_0_3_2;
    @JSONField(name="CM-0-3-3")
    private String cm_0_3_3;
    @JSONField(name="STEMI-0-4-6")
    private String stemi_0_4_6;
    @JSONField(name="STEMI-0-4-1")
    private String stemi_0_4_1;
    @JSONField(name="STEMI-0-4-2")
    private String stemi_0_4_2;
    @JSONField(name="STEMI-0-4-3")
    private String stemi_0_4_3;
    @JSONField(name="STEMI-0-4-4")
    private String stemi_0_4_4;
    @JSONField(name="STEMI-0-4-5")
    private String stemi_0_4_5;
    @JSONField(name="STEMI-0-4-7")
    private String stemi_0_4_7;
    @JSONField(name="STEMI-1-1-4")
    private String stemi_1_1_4;
    @JSONField(name="STEMI-1-1-5")
    private String stemi_1_1_5;
    @JSONField(name="STEMI-1-1-6")
    private String stemi_1_1_6;
    @JSONField(name="STEMI-1-1-7")
    private String stemi_1_1_7;
    @JSONField(name="STEMI-1-1-1")
    private String stemi_1_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-1-1-2-1")
    private Date stemi_1_1_2_1;
    @JSONField(name="STEMI-1-1-3")
    private List<String> stemi_1_1_3;
    @JSONField(name="STEMI-1-1-3-1")
    private String stemi_1_1_3_1;
    @JSONField(name="STEMI-1-2-1")
    private String stemi_1_2_1;
    @JSONField(name="STEMI-1-2-2")
    private List<String> stemi_1_2_2;
    @JSONField(name="STEMI-1-2-2-1")
    private String stemi_1_2_2_1;
    @JSONField(name="STEMI-1-2-3")
    private List<String> stemi_1_2_3;
    @JSONField(name="STEMI-1-2-3-1")
    private String stemi_1_2_3_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-1-2-4-1")
    private Date stemi_1_2_4_1;
    @JSONField(name="STEMI-1-3-1-1")
    private String stemi_1_3_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-1-3-1-2-1")
    private Date stemi_1_3_1_2_1;
    @JSONField(name="STEMI-1-3-2")
    private List<String> stemi_1_3_2;
    @JSONField(name="STEMI-1-4-1-1")
    private String stemi_1_4_1_1;
    @JSONField(name="STEMI-1-3-2-1")
    private Double stemi_1_3_2_1;
    @JSONField(name="STEMI-1-4-1-2")
    private String stemi_1_4_1_2;
    @JSONField(name="STEMI-1-4-2-1")
    private String stemi_1_4_2_1;
    @JSONField(name="STEMI-1-3-2-2")
    private Double stemi_1_3_2_2;
    @JSONField(name="STEMI-1-4-2-2")
    private String stemi_1_4_2_2;
    @JSONField(name="STEMI-1-4-3-1")
    private String stemi_1_4_3_1;
    @JSONField(name="STEMI-1-3-2-3")
    private Double stemi_1_3_2_3;
    @JSONField(name="STEMI-1-4-3-2")
    private String stemi_1_4_3_2;
    @JSONField(name="STEMI-1-4-4-1")
    private String stemi_1_4_4_1;
    @JSONField(name="STEMI-1-3-2-4")
    private Double stemi_1_3_2_4;
    @JSONField(name="STEMI-1-4-4-2")
    private String stemi_1_4_4_2;
    @JSONField(name="STEMI-1-4-5-1")
    private String stemi_1_4_5_1;
    @JSONField(name="STEMI-1-3-2-5")
    private Double stemi_1_3_2_5;
    @JSONField(name="STEMI-1-4-5-2")
    private String stemi_1_4_5_2;
    @JSONField(name="STEMI-1-4-6-1")
    private String stemi_1_4_6_1;
    @JSONField(name="STEMI-1-3-2-6")
    private Double stemi_1_3_2_6;
    @JSONField(name="STEMI-1-4-6-2")
    private String stemi_1_4_6_2;
    @JSONField(name="STEMI-2-1-1")
    private String stemi_2_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-2-1-2-1")
    private Date stemi_2_1_2_1;
    @JSONField(name="STEMI-2-1-3")
    private String stemi_2_1_3;
    @JSONField(name="STEMI-2-2-1")
    private String stemi_2_2_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-2-2-2-1")
    private Date stemi_2_2_2_1;
    @JSONField(name="STEMI-2-2-3-1")
    private Double stemi_2_2_3_1;
    @JSONField(name="STEMI-2-2-3-3-1")
    private Double stemi_2_2_3_3_1;
    @JSONField(name="STEMI-2-2-3-4")
    private String stemi_2_2_3_4;
    @JSONField(name="STEMI-2-3-1-1")
    private String stemi_2_3_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-2-3-1-2-1")
    private Date stemi_2_3_1_2_1;
    @JSONField(name="STEMI-2-3-1-3-1")
    private Double stemi_2_3_1_3_1;
    @JSONField(name="STEMI-2-3-1-4")
    private String stemi_2_3_1_4;
    @JSONField(name="STEMI-2-3-2-1")
    private String stemi_2_3_2_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-2-3-2-2-1")
    private Date stemi_2_3_2_2_1;
    @JSONField(name="STEMI-2-3-2-3-1")
    private Double stemi_2_3_2_3_1;
    @JSONField(name="STEMI-2-3-2-4")
    private String stemi_2_3_2_4;
    @JSONField(name="STEMI-2-3-3-1")
    private String stemi_2_3_3_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-2-3-3-2-1")
    private Date stemi_2_3_3_2_1;
    @JSONField(name="STEMI-2-3-3-3-1")
    private Double stemi_2_3_3_3_1;
    @JSONField(name="STEMI-2-3-3-4")
    private String stemi_2_3_3_4;
    @JSONField(name="STEMI-3-0-2")
    private String stemi_3_0_2;
    @JSONField(name="STEMI-3-1-1")
    private String stemi_3_1_1;
    @JSONField(name="STEMI-3-1-2-1")
    private String stemi_3_1_2_1;
    @JSONField(name="STEMI-3-1-2-2")
    private List<String> stemi_3_1_2_2;
    @JSONField(name="STEMI-3-1-2-3")
    private List<String> stemi_3_1_2_3;
    @JSONField(name="STEMI-3-1-3")
    private String stemi_3_1_3;
    @JSONField(name="STEMI-3-1-4")
    private String stemi_3_1_4;
    @JSONField(name="STEMI-3-1-4-1")
    private String stemi_3_1_4_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-3-1-5-1")
    private Date stemi_3_1_5_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-3-1-6-1")
    private Date stemi_3_1_6_1;
    @JSONField(name="STEMI-3-1-7-1")
    private Double stemi_3_1_7_1;
    @JSONField(name="STEMI-3-1-8")
    private List<String> stemi_3_1_8;
    @JSONField(name="STEMI-3-1-9")
    private String stemi_3_1_9;
    @JSONField(name="STEMI-3-1-10")
    private List<String> stemi_3_1_10;
    @JSONField(name="STEMI-3-2-1")
    private String stemi_3_2_1;
    @JSONField(name="STEMI-3-2-2-1-3")
    private String stemi_3_2_2_1_3;
    @JSONField(name="STEMI-3-2-2-1-1")
    private String stemi_3_2_2_1_1;
    @JSONField(name="STEMI-3-2-2-1-1-1")
    private String stemi_3_2_2_1_1_1;
    @JSONField(name="STEMI-3-2-2-1-2")
    private String stemi_3_2_2_1_2;
    @JSONField(name="STEMI-3-2-2")
    private String stemi_3_2_2;
    @JSONField(name="STEMI-3-2-2-1")
    private String stemi_3_2_2_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-3-2-2-2-1")
    private Date stemi_3_2_2_2_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-3-2-2-3-1")
    private Date stemi_3_2_2_3_1;
    @JSONField(name="STEMI-3-2-2-4-1")
    private Double stemi_3_2_2_4_1;
    @JSONField(name="STEMI-3-2-2-5")
    private String stemi_3_2_2_5;
    @JSONField(name="STEMI-3-2-3-1")
    private List<String> stemi_3_2_3_1;
    @JSONField(name="STEMI-3-2-3-2-1")
    private String stemi_3_2_3_2_1;
    @JSONField(name="STEMI-3-2-3-2-5")
    private String stemi_3_2_3_2_5;
    @JSONField(name="STEMI-3-2-3-2-2")
    private String stemi_3_2_3_2_2;
    @JSONField(name="STEMI-3-2-3-2-6")
    private String stemi_3_2_3_2_6;
    @JSONField(name="STEMI-3-2-3-2-3")
    private String stemi_3_2_3_2_3;
    @JSONField(name="STEMI-3-2-3-2-7")
    private String stemi_3_2_3_2_7;
    @JSONField(name="STEMI-3-2-3-2-4")
    private String stemi_3_2_3_2_4;
    @JSONField(name="STEMI-3-2-3-2-8")
    private String stemi_3_2_3_2_8;
    @JSONField(name="STEMI-3-2-3-3")
    private List<String> stemi_3_2_3_3;
    @JSONField(name="STEMI-3-2-3-3-1")
    private String stemi_3_2_3_3_1;
    @JSONField(name="STEMI-3-2-3-3-2")
    private String stemi_3_2_3_3_2;
    @JSONField(name="STEMI-3-2-3-3-2-1")
    private String stemi_3_2_3_3_2_1;
    @JSONField(name="STEMI-3-2-3-3-3")
    private String stemi_3_2_3_3_3;
    @JSONField(name="STEMI-3-2-3-3-4")
    private String stemi_3_2_3_3_4;
    @JSONField(name="STEMI-3-2-3-3-4-1")
    private String stemi_3_2_3_3_4_1;
    @JSONField(name="STEMI-3-2-3-3-5")
    private String stemi_3_2_3_3_5;
    @JSONField(name="STEMI-3-2-3-3-6")
    private String stemi_3_2_3_3_6;
    @JSONField(name="STEMI-3-2-3-3-6-1")
    private String stemi_3_2_3_3_6_1;
    @JSONField(name="STEMI-3-2-3-3-7")
    private String stemi_3_2_3_3_7;
    @JSONField(name="STEMI-3-2-3-3-8")
    private String stemi_3_2_3_3_8;
    @JSONField(name="STEMI-3-2-3-3-8-1")
    private String stemi_3_2_3_3_8_1;
    @JSONField(name="STEMI-3-2-3-9-1")
    private String stemi_3_2_3_9_1;
    @JSONField(name="STEMI-3-2-3-3-10")
    private String stemi_3_2_3_3_10;
    @JSONField(name="STEMI-3-2-3-3-10-1")
    private String stemi_3_2_3_3_10_1;
    @JSONField(name="STEMI-3-2-3-3-11")
    private String stemi_3_2_3_3_11;
    @JSONField(name="STEMI-3-2-3-3-12")
    private String stemi_3_2_3_3_12;
    @JSONField(name="STEMI-3-2-3-3-12-1")
    private String stemi_3_2_3_3_12_1;
    @JSONField(name="STEMI-3-2-3-3-13")
    private String stemi_3_2_3_3_13;
    @JSONField(name="STEMI-3-2-3-3-14")
    private String stemi_3_2_3_3_14;
    @JSONField(name="STEMI-3-2-3-3-14-1")
    private String stemi_3_2_3_3_14_1;
    @JSONField(name="STEMI-3-2-3-15-1")
    private String stemi_3_2_3_15_1;
    @JSONField(name="STEMI-3-2-3-3-16")
    private String stemi_3_2_3_3_16;
    @JSONField(name="STEMI-3-2-3-3-16-1")
    private String stemi_3_2_3_3_16_1;
    @JSONField(name="STEMI-3-2-4-1")
    private String stemi_3_2_4_1;
    @JSONField(name="STEMI-3-2-4-2")
    private String stemi_3_2_4_2;
    @JSONField(name="STEMI-3-2-4-3")
    private String stemi_3_2_4_3;
    @JSONField(name="STEMI-3-2-4-4")
    private String stemi_3_2_4_4;
    @JSONField(name="STEMI-3-2-5-1")
    private List<String> stemi_3_2_5_1;
    @JSONField(name="STEMI-3-2-5-1-1")
    private String stemi_3_2_5_1_1;
    @JSONField(name="STEMI-3-2-5-2")
    private List<String> stemi_3_2_5_2;
    @JSONField(name="STEMI-3-2-5-2-1")
    private String stemi_3_2_5_2_1;
    @JSONField(name="STEMI-3-2-6-1")
    private String stemi_3_2_6_1;
    @JSONField(name="STEMI-3-2-6-2-1-1")
    private Double stemi_3_2_6_2_1_1;
    @JSONField(name="STEMI-3-2-6-2-2")
    private Double stemi_3_2_6_2_2;
    @JSONField(name="STEMI-3-2-7-1")
    private String stemi_3_2_7_1;
    @JSONField(name="STEMI-3-2-7-2")
    private String stemi_3_2_7_2;
    @JSONField(name="STEMI-3-2-7-3")
    private String stemi_3_2_7_3;
    @JSONField(name="STEMI-3-3-0")
    private String stemi_3_3_0;
    @JSONField(name="STEMI-3-3-1-1")
    private List<String> stemi_3_3_1_1;
    @JSONField(name="STEMI-3-3-1-1-1")
    private String stemi_3_3_1_1_1;
    @JSONField(name="STEMI-3-3-1-2")
    private List<String> stemi_3_3_1_2;
    @JSONField(name="STEMI-3-3-1-2-1")
    private String stemi_3_3_1_2_1;
    @JSONField(name="STEMI-3-3-2")
    private String stemi_3_3_2;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-3-3-3-1")
    private Date stemi_3_3_3_1;
    @JSONField(name="STEMI-3-3-4-1")
    private Double stemi_3_3_4_1;
    @JSONField(name="STEMI-3-4")
    private String stemi_3_4;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-3-4-1-1")
    private Date stemi_3_4_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-3-4-2-1")
    private Date stemi_3_4_2_1;
    @JSONField(name="STEMI-3-4-3-1")
    private Double stemi_3_4_3_1;
    @JSONField(name="STEMI-3-4-4")
    private List<String> stemi_3_4_4;
    @JSONField(name="STEMI-4-1-1")
    private String stemi_4_1_1;
    @JSONField(name="STEMI-4-1-2-1")
    private List<String> stemi_4_1_2_1;
    @JSONField(name="STEMI-4-1-2-1-1")
    private String stemi_4_1_2_1_1;
    @JSONField(name="STEMI-4-1-2-2")
    private List<String> stemi_4_1_2_2;
    @JSONField(name="STEMI-4-1-2-2-1")
    private String stemi_4_1_2_2_1;
    @JSONField(name="STEMI-4-2")
    private String stemi_4_2;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "STEMI-4-3-1")
    private Date stemi_4_3_1;
    @JSONField(name="STEMI-5-1-1")
    private String stemi_5_1_1;
    @JSONField(name="STEMI-5-1-2")
    private String stemi_5_1_2;
    @JSONField(name="STEMI-5-1-2-1")
    private String stemi_5_1_2_1;
    @JSONField(name="STEMI-5-2-1")
    private String stemi_5_2_1;
    @JSONField(name="STEMI-5-2-2")
    private String stemi_5_2_2;
    @JSONField(name="STEMI-5-3-1")
    private String stemi_5_3_1;
    @JSONField(name="STEMI-5-3-2")
    private List<String> stemi_5_3_2;
    @JSONField(name="STEMI-5-3-3")
    private String stemi_5_3_3;
    @JSONField(name="STEMI-5-3-4-A")
    private String stemi_5_3_4_a;
    @JSONField(name="STEMI-5-3-4-A-1")
    private String stemi_5_3_4_a_1;
    @JSONField(name="STEMI-5-3-4-B")
    private String stemi_5_3_4_b;
    @JSONField(name="STEMI-5-3-4-B-1")
    private String stemi_5_3_4_b_1;
    @JSONField(name="STEMI-5-4-1")
    private String stemi_5_4_1;
    @JSONField(name="STEMI-5-4-2")
    private List<String> stemi_5_4_2;
    @JSONField(name="STEMI-5-4-3")
    private String stemi_5_4_3;
    @JSONField(name="STEMI-5-4-4")
    private String stemi_5_4_4;
    @JSONField(name="STEMI-5-4-4-1")
    private String stemi_5_4_4_1;
    @JSONField(name="STEMI-6-1")
    private String stemi_6_1;
    @JSONField(name="STEMI-6-1-2")
    private String stemi_6_1_2;
    @JSONField(name="STEMI-6-1-2-1")
    private String stemi_6_1_2_1;
    @JSONField(name="STEMI-6-2")
    private String stemi_6_2;
    @JSONField(name="STEMI-6-2-2")
    private String stemi_6_2_2;
    @JSONField(name="STEMI-6-3")
    private String stemi_6_3;
    @JSONField(name="STEMI-6-3-2")
    private String stemi_6_3_2;
    @JSONField(name="STEMI-6-3-2-A")
    private String stemi_6_3_2_a;
    @JSONField(name="STEMI-6-3-2-A-1")
    private String stemi_6_3_2_a_1;
    @JSONField(name="STEMI-6-3-2-B")
    private String stemi_6_3_2_b;
    @JSONField(name="STEMI-6-3-2-B-1")
    private String stemi_6_3_2_b_1;
    @JSONField(name="STEMI-6-4")
    private String stemi_6_4;
    @JSONField(name="STEMI-6-4-2")
    private String stemi_6_4_2;
    @JSONField(name="STEMI-6-4-2-1")
    private String stemi_6_4_2_1;
    @JSONField(name="STEMI-6-5-1")
    private String stemi_6_5_1;
    @JSONField(name="STEMI-6-5-2")
    private List<String> stemi_6_5_2;
    @JSONField(name="STEMI-6-5-2-1")
    private String stemi_6_5_2_1;
    @JSONField(name="STEMI-6-5-3")
    private String stemi_6_5_3;
    @JSONField(name="STEMI-6-5-4")
    private List<String> stemi_6_5_4;
    @JSONField(name="STEMI-6-5-5")
    private String stemi_6_5_5;
    @JSONField(name="STEMI-6-5-6")
    private String stemi_6_5_6;
    @JSONField(name="STEMI-6-5-6-1")
    private String stemi_6_5_6_1;
    @JSONField(name="STEMI-7-1")
    private String stemi_7_1;
    @JSONField(name="STEMI-7-2")
    private String stemi_7_2;
    @JSONField(name="STEMI-7-3-1")
    private String stemi_7_3_1;
    @JSONField(name="STEMI-7-3-2")
    private List<String> stemi_7_3_2;
    @JSONField(name="STEMI-7-4")
    private String stemi_7_4;
    @JSONField(name="STEMI-7-5")
    private String stemi_7_5;
    @JSONField(name="STEMI-8-1-1")
    private String stemi_8_1_1;
    @JSONField(name="STEMI-8-1-2")
    private String stemi_8_1_2;
    @JSONField(name="STEMI-8-1-3")
    private String stemi_8_1_3;
    @JSONField(name="STEMI-8-2-1")
    private List<String> stemi_8_2_1;
    @JSONField(name="STEMI-8-2-2")
    private String stemi_8_2_2;
    @JSONField(name="STEMI-8-3")
    private List<String> stemi_8_3;
    @JSONField(name="STEMI-8-4-1")
    private List<String> stemi_8_4_1;
    @JSONField(name="STEMI-8-4-2")
    private List<String> stemi_8_4_2;
    @JSONField(name="STEMI-8-4-3")
    private List<String> stemi_8_4_3;
    @JSONField(name="STEMI-8-4-4")
    private List<String> stemi_8_4_4;
    @JSONField(name="STEMI-8-4-5")
    private List<String> stemi_8_4_5;
    @JSONField(name="STEMI-9-2-1")
    private List<String> stemi_9_2_1;
    @JSONField(name="STEMI-9-2-1-1")
    private String stemi_9_2_1_1;
    @JSONField(name="STEMI-9-2-2-A-2")
    private List<String> stemi_9_2_2_a_2;
    @JSONField(name="STEMI-9-2-2-A-1-1")
    private Double stemi_9_2_2_a_1_1;
    @JSONField(name="STEMI-9-2-2-A-3")
    private String stemi_9_2_2_a_3;
    @JSONField(name="CM-4-3")
    private String cm_4_3;
    @JSONField(name="CM-4-5")
    private List<String> cm_4_5;
    @JSONField(name="CM-4-4-1")
    private String cm_4_4_1;
    @JSONField(name="CM-4-6")
    private String cm_4_6;
    @JSONField(name="CM-5-1")
    private String cm_5_1;
    @JSONField(name="CM-5-2-1")
    private String cm_5_2_1;
    @JSONField(name="CM-5-2-2")
    private String cm_5_2_2;
    @JSONField(name="CM-5-2-3")
    private String cm_5_2_3;
    @JSONField(name="CM-5-2-5")
    private String cm_5_2_5;
    @JSONField(name="CM-5-2-6")
    private String cm_5_2_6;
    @JSONField(name="CM-5-2-7")
    private String cm_5_2_7;
    @JSONField(name="CM-5-2-8")
    private String cm_5_2_8;
    @JSONField(name="CM-5-2-9")
    private String cm_5_2_9;
    @JSONField(name="CM-5-2-10")
    private String cm_5_2_10;
    @JSONField(name="CM-5-2-11")
    private String cm_5_2_11;
    @JSONField(name="CM-6-1")
    private Double cm_6_1;
    @JSONField(name="CM-6-2")
    private Double cm_6_2;
    @JSONField(name="CM-6-3")
    private Double cm_6_3;
    @JSONField(name="CM-6-4")
    private Double cm_6_4;
    @JSONField(name="CM-6-5")
    private Double cm_6_5;
    @JSONField(name="CM-6-6")
    private Double cm_6_6;
    @JSONField(name="CM-6-7")
    private Double cm_6_7;
    @JSONField(name="CM-6-8")
    private Double cm_6_8;
    @JSONField(name="CM-6-9")
    private Double cm_6_9;
    @JSONField(name="CM-6-10")
    private Double cm_6_10;
    @JSONField(name="CM-6-11")
    private Double cm_6_11;
    @JSONField(name="CM-6-12")
    private Double cm_6_12;
    @JSONField(name="CM-6-13")
    private Double cm_6_13;
    @JSONField(name="CM-6-14")
    private Double cm_6_14;
    @JSONField(name="CM-6-15")
    private Double cm_6_15;
    @JSONField(name="CM-6-16")
    private Double cm_6_16;
    @JSONField(name="CM-6-17")
    private Double cm_6_17;
    @JSONField(name="CM-6-18")
    private Double cm_6_18;
    @JSONField(name="CM-6-19")
    private Double cm_6_19;
    @JSONField(name="CM-6-20")
    private Double cm_6_20;
    @JSONField(name="CM-6-21")
    private Double cm_6_21;
    @JSONField(name="CM-6-22")
    private Double cm_6_22;
    @JSONField(name="CM-6-23")
    private Double cm_6_23;
    @JSONField(name="CM-6-24")
    private Double cm_6_24;
    @JSONField(name="CM-6-25")
    private Double cm_6_25;
    @JSONField(name="CM-6-26")
    private Double cm_6_26;
    @JSONField(name="CM-6-27")
    private Double cm_6_27;
    @JSONField(name="CM-6-28")
    private Double cm_6_28;
    @JSONField(name="CM-6-29")
    private Double cm_6_29;
    @JSONField(name="CM-6-30")
    private Double cm_6_30;

    public String getCm_0_1_1_1() {
        return cm_0_1_1_1;
    }

    public void setCm_0_1_1_1(String cm_0_1_1_1) {
        this.cm_0_1_1_1 = cm_0_1_1_1;
    }

    public String getCm_0_1_1_2() {
        return cm_0_1_1_2;
    }

    public void setCm_0_1_1_2(String cm_0_1_1_2) {
        this.cm_0_1_1_2 = cm_0_1_1_2;
    }

    public String getCm_0_1_1_3() {
        return cm_0_1_1_3;
    }

    public void setCm_0_1_1_3(String cm_0_1_1_3) {
        this.cm_0_1_1_3 = cm_0_1_1_3;
    }

    public String getCm_0_1_1_4() {
        return cm_0_1_1_4;
    }

    public void setCm_0_1_1_4(String cm_0_1_1_4) {
        this.cm_0_1_1_4 = cm_0_1_1_4;
    }

    public String getCm_0_1_1_5() {
        return cm_0_1_1_5;
    }

    public void setCm_0_1_1_5(String cm_0_1_1_5) {
        this.cm_0_1_1_5 = cm_0_1_1_5;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getCm_0_1_3_1() {
        return cm_0_1_3_1;
    }

    public void setCm_0_1_3_1(String cm_0_1_3_1) {
        this.cm_0_1_3_1 = cm_0_1_3_1;
    }

    public String getCm_0_1_3_2() {
        return cm_0_1_3_2;
    }

    public void setCm_0_1_3_2(String cm_0_1_3_2) {
        this.cm_0_1_3_2 = cm_0_1_3_2;
    }

    public String getCm_0_1_4_1() {
        return cm_0_1_4_1;
    }

    public void setCm_0_1_4_1(String cm_0_1_4_1) {
        this.cm_0_1_4_1 = cm_0_1_4_1;
    }

    public String getCm_0_1_4_2() {
        return cm_0_1_4_2;
    }

    public void setCm_0_1_4_2(String cm_0_1_4_2) {
        this.cm_0_1_4_2 = cm_0_1_4_2;
    }

    public String getCm_0_1_5() {
        return cm_0_1_5;
    }

    public void setCm_0_1_5(String cm_0_1_5) {
        this.cm_0_1_5 = cm_0_1_5;
    }

    public Date getCm_0_2_1_1() {
        return cm_0_2_1_1;
    }

    public void setCm_0_2_1_1(Date cm_0_2_1_1) {
        this.cm_0_2_1_1 = cm_0_2_1_1;
    }

    public String getCm_0_2_1_2() {
        return cm_0_2_1_2;
    }

    public void setCm_0_2_1_2(String cm_0_2_1_2) {
        this.cm_0_2_1_2 = cm_0_2_1_2;
    }

    public Double getCm_0_2_1_3() {
        return cm_0_2_1_3;
    }

    public void setCm_0_2_1_3(Double cm_0_2_1_3) {
        this.cm_0_2_1_3 = cm_0_2_1_3;
    }

    public Double getCm_0_2_1_5() {
        return cm_0_2_1_5;
    }

    public void setCm_0_2_1_5(Double cm_0_2_1_5) {
        this.cm_0_2_1_5 = cm_0_2_1_5;
    }

    public List<String> getCm_0_2_2_1() {
        return cm_0_2_2_1;
    }

    public void setCm_0_2_2_1(List<String> cm_0_2_2_1) {
        this.cm_0_2_2_1 = cm_0_2_2_1;
    }

    public Date getCm_0_2_2_2() {
        return cm_0_2_2_2;
    }

    public void setCm_0_2_2_2(Date cm_0_2_2_2) {
        this.cm_0_2_2_2 = cm_0_2_2_2;
    }

    public Date getCm_0_2_3_2() {
        return cm_0_2_3_2;
    }

    public void setCm_0_2_3_2(Date cm_0_2_3_2) {
        this.cm_0_2_3_2 = cm_0_2_3_2;
    }

    public Date getCm_0_2_4_1() {
        return cm_0_2_4_1;
    }

    public void setCm_0_2_4_1(Date cm_0_2_4_1) {
        this.cm_0_2_4_1 = cm_0_2_4_1;
    }

    public Date getCm_0_2_4_2() {
        return cm_0_2_4_2;
    }

    public void setCm_0_2_4_2(Date cm_0_2_4_2) {
        this.cm_0_2_4_2 = cm_0_2_4_2;
    }

    public Date getCm_0_2_5_1() {
        return cm_0_2_5_1;
    }

    public void setCm_0_2_5_1(Date cm_0_2_5_1) {
        this.cm_0_2_5_1 = cm_0_2_5_1;
    }

    public Date getCm_0_2_5_2() {
        return cm_0_2_5_2;
    }

    public void setCm_0_2_5_2(Date cm_0_2_5_2) {
        this.cm_0_2_5_2 = cm_0_2_5_2;
    }

    public String getCm_0_3_1() {
        return cm_0_3_1;
    }

    public void setCm_0_3_1(String cm_0_3_1) {
        this.cm_0_3_1 = cm_0_3_1;
    }

    public String getCm_0_3_2() {
        return cm_0_3_2;
    }

    public void setCm_0_3_2(String cm_0_3_2) {
        this.cm_0_3_2 = cm_0_3_2;
    }

    public String getCm_0_3_3() {
        return cm_0_3_3;
    }

    public void setCm_0_3_3(String cm_0_3_3) {
        this.cm_0_3_3 = cm_0_3_3;
    }

    public String getStemi_0_4_6() {
        return stemi_0_4_6;
    }

    public void setStemi_0_4_6(String stemi_0_4_6) {
        this.stemi_0_4_6 = stemi_0_4_6;
    }

    public String getStemi_0_4_1() {
        return stemi_0_4_1;
    }

    public void setStemi_0_4_1(String stemi_0_4_1) {
        this.stemi_0_4_1 = stemi_0_4_1;
    }

    public String getStemi_0_4_2() {
        return stemi_0_4_2;
    }

    public void setStemi_0_4_2(String stemi_0_4_2) {
        this.stemi_0_4_2 = stemi_0_4_2;
    }

    public String getStemi_0_4_3() {
        return stemi_0_4_3;
    }

    public void setStemi_0_4_3(String stemi_0_4_3) {
        this.stemi_0_4_3 = stemi_0_4_3;
    }

    public String getStemi_0_4_4() {
        return stemi_0_4_4;
    }

    public void setStemi_0_4_4(String stemi_0_4_4) {
        this.stemi_0_4_4 = stemi_0_4_4;
    }

    public String getStemi_0_4_5() {
        return stemi_0_4_5;
    }

    public void setStemi_0_4_5(String stemi_0_4_5) {
        this.stemi_0_4_5 = stemi_0_4_5;
    }

    public String getStemi_0_4_7() {
        return stemi_0_4_7;
    }

    public void setStemi_0_4_7(String stemi_0_4_7) {
        this.stemi_0_4_7 = stemi_0_4_7;
    }

    public String getStemi_1_1_4() {
        return stemi_1_1_4;
    }

    public void setStemi_1_1_4(String stemi_1_1_4) {
        this.stemi_1_1_4 = stemi_1_1_4;
    }

    public String getStemi_1_1_5() {
        return stemi_1_1_5;
    }

    public void setStemi_1_1_5(String stemi_1_1_5) {
        this.stemi_1_1_5 = stemi_1_1_5;
    }

    public String getStemi_1_1_6() {
        return stemi_1_1_6;
    }

    public void setStemi_1_1_6(String stemi_1_1_6) {
        this.stemi_1_1_6 = stemi_1_1_6;
    }

    public String getStemi_1_1_7() {
        return stemi_1_1_7;
    }

    public void setStemi_1_1_7(String stemi_1_1_7) {
        this.stemi_1_1_7 = stemi_1_1_7;
    }

    public String getStemi_1_1_1() {
        return stemi_1_1_1;
    }

    public void setStemi_1_1_1(String stemi_1_1_1) {
        this.stemi_1_1_1 = stemi_1_1_1;
    }

    public Date getStemi_1_1_2_1() {
        return stemi_1_1_2_1;
    }

    public void setStemi_1_1_2_1(Date stemi_1_1_2_1) {
        this.stemi_1_1_2_1 = stemi_1_1_2_1;
    }

    public List<String> getStemi_1_1_3() {
        return stemi_1_1_3;
    }

    public void setStemi_1_1_3(List<String> stemi_1_1_3) {
        this.stemi_1_1_3 = stemi_1_1_3;
    }

    public String getStemi_1_1_3_1() {
        return stemi_1_1_3_1;
    }

    public void setStemi_1_1_3_1(String stemi_1_1_3_1) {
        this.stemi_1_1_3_1 = stemi_1_1_3_1;
    }

    public String getStemi_1_2_1() {
        return stemi_1_2_1;
    }

    public void setStemi_1_2_1(String stemi_1_2_1) {
        this.stemi_1_2_1 = stemi_1_2_1;
    }

    public List<String> getStemi_1_2_2() {
        return stemi_1_2_2;
    }

    public void setStemi_1_2_2(List<String> stemi_1_2_2) {
        this.stemi_1_2_2 = stemi_1_2_2;
    }

    public String getStemi_1_2_2_1() {
        return stemi_1_2_2_1;
    }

    public void setStemi_1_2_2_1(String stemi_1_2_2_1) {
        this.stemi_1_2_2_1 = stemi_1_2_2_1;
    }

    public List<String> getStemi_1_2_3() {
        return stemi_1_2_3;
    }

    public void setStemi_1_2_3(List<String> stemi_1_2_3) {
        this.stemi_1_2_3 = stemi_1_2_3;
    }

    public String getStemi_1_2_3_1() {
        return stemi_1_2_3_1;
    }

    public void setStemi_1_2_3_1(String stemi_1_2_3_1) {
        this.stemi_1_2_3_1 = stemi_1_2_3_1;
    }

    public Date getStemi_1_2_4_1() {
        return stemi_1_2_4_1;
    }

    public void setStemi_1_2_4_1(Date stemi_1_2_4_1) {
        this.stemi_1_2_4_1 = stemi_1_2_4_1;
    }

    public String getStemi_1_3_1_1() {
        return stemi_1_3_1_1;
    }

    public void setStemi_1_3_1_1(String stemi_1_3_1_1) {
        this.stemi_1_3_1_1 = stemi_1_3_1_1;
    }

    public Date getStemi_1_3_1_2_1() {
        return stemi_1_3_1_2_1;
    }

    public void setStemi_1_3_1_2_1(Date stemi_1_3_1_2_1) {
        this.stemi_1_3_1_2_1 = stemi_1_3_1_2_1;
    }

    public List<String> getStemi_1_3_2() {
        return stemi_1_3_2;
    }

    public void setStemi_1_3_2(List<String> stemi_1_3_2) {
        this.stemi_1_3_2 = stemi_1_3_2;
    }

    public String getStemi_1_4_1_1() {
        return stemi_1_4_1_1;
    }

    public void setStemi_1_4_1_1(String stemi_1_4_1_1) {
        this.stemi_1_4_1_1 = stemi_1_4_1_1;
    }

    public Double getStemi_1_3_2_1() {
        return stemi_1_3_2_1;
    }

    public void setStemi_1_3_2_1(Double stemi_1_3_2_1) {
        this.stemi_1_3_2_1 = stemi_1_3_2_1;
    }

    public String getStemi_1_4_1_2() {
        return stemi_1_4_1_2;
    }

    public void setStemi_1_4_1_2(String stemi_1_4_1_2) {
        this.stemi_1_4_1_2 = stemi_1_4_1_2;
    }

    public String getStemi_1_4_2_1() {
        return stemi_1_4_2_1;
    }

    public void setStemi_1_4_2_1(String stemi_1_4_2_1) {
        this.stemi_1_4_2_1 = stemi_1_4_2_1;
    }

    public Double getStemi_1_3_2_2() {
        return stemi_1_3_2_2;
    }

    public void setStemi_1_3_2_2(Double stemi_1_3_2_2) {
        this.stemi_1_3_2_2 = stemi_1_3_2_2;
    }

    public String getStemi_1_4_2_2() {
        return stemi_1_4_2_2;
    }

    public void setStemi_1_4_2_2(String stemi_1_4_2_2) {
        this.stemi_1_4_2_2 = stemi_1_4_2_2;
    }

    public String getStemi_1_4_3_1() {
        return stemi_1_4_3_1;
    }

    public void setStemi_1_4_3_1(String stemi_1_4_3_1) {
        this.stemi_1_4_3_1 = stemi_1_4_3_1;
    }

    public Double getStemi_1_3_2_3() {
        return stemi_1_3_2_3;
    }

    public void setStemi_1_3_2_3(Double stemi_1_3_2_3) {
        this.stemi_1_3_2_3 = stemi_1_3_2_3;
    }

    public String getStemi_1_4_3_2() {
        return stemi_1_4_3_2;
    }

    public void setStemi_1_4_3_2(String stemi_1_4_3_2) {
        this.stemi_1_4_3_2 = stemi_1_4_3_2;
    }

    public String getStemi_1_4_4_1() {
        return stemi_1_4_4_1;
    }

    public void setStemi_1_4_4_1(String stemi_1_4_4_1) {
        this.stemi_1_4_4_1 = stemi_1_4_4_1;
    }

    public Double getStemi_1_3_2_4() {
        return stemi_1_3_2_4;
    }

    public void setStemi_1_3_2_4(Double stemi_1_3_2_4) {
        this.stemi_1_3_2_4 = stemi_1_3_2_4;
    }

    public String getStemi_1_4_4_2() {
        return stemi_1_4_4_2;
    }

    public void setStemi_1_4_4_2(String stemi_1_4_4_2) {
        this.stemi_1_4_4_2 = stemi_1_4_4_2;
    }

    public String getStemi_1_4_5_1() {
        return stemi_1_4_5_1;
    }

    public void setStemi_1_4_5_1(String stemi_1_4_5_1) {
        this.stemi_1_4_5_1 = stemi_1_4_5_1;
    }

    public Double getStemi_1_3_2_5() {
        return stemi_1_3_2_5;
    }

    public void setStemi_1_3_2_5(Double stemi_1_3_2_5) {
        this.stemi_1_3_2_5 = stemi_1_3_2_5;
    }

    public String getStemi_1_4_5_2() {
        return stemi_1_4_5_2;
    }

    public void setStemi_1_4_5_2(String stemi_1_4_5_2) {
        this.stemi_1_4_5_2 = stemi_1_4_5_2;
    }

    public String getStemi_1_4_6_1() {
        return stemi_1_4_6_1;
    }

    public void setStemi_1_4_6_1(String stemi_1_4_6_1) {
        this.stemi_1_4_6_1 = stemi_1_4_6_1;
    }

    public Double getStemi_1_3_2_6() {
        return stemi_1_3_2_6;
    }

    public void setStemi_1_3_2_6(Double stemi_1_3_2_6) {
        this.stemi_1_3_2_6 = stemi_1_3_2_6;
    }

    public String getStemi_1_4_6_2() {
        return stemi_1_4_6_2;
    }

    public void setStemi_1_4_6_2(String stemi_1_4_6_2) {
        this.stemi_1_4_6_2 = stemi_1_4_6_2;
    }

    public String getStemi_2_1_1() {
        return stemi_2_1_1;
    }

    public void setStemi_2_1_1(String stemi_2_1_1) {
        this.stemi_2_1_1 = stemi_2_1_1;
    }

    public Date getStemi_2_1_2_1() {
        return stemi_2_1_2_1;
    }

    public void setStemi_2_1_2_1(Date stemi_2_1_2_1) {
        this.stemi_2_1_2_1 = stemi_2_1_2_1;
    }

    public String getStemi_2_1_3() {
        return stemi_2_1_3;
    }

    public void setStemi_2_1_3(String stemi_2_1_3) {
        this.stemi_2_1_3 = stemi_2_1_3;
    }

    public String getStemi_2_2_1() {
        return stemi_2_2_1;
    }

    public void setStemi_2_2_1(String stemi_2_2_1) {
        this.stemi_2_2_1 = stemi_2_2_1;
    }

    public Date getStemi_2_2_2_1() {
        return stemi_2_2_2_1;
    }

    public void setStemi_2_2_2_1(Date stemi_2_2_2_1) {
        this.stemi_2_2_2_1 = stemi_2_2_2_1;
    }

    public Double getStemi_2_2_3_1() {
        return stemi_2_2_3_1;
    }

    public void setStemi_2_2_3_1(Double stemi_2_2_3_1) {
        this.stemi_2_2_3_1 = stemi_2_2_3_1;
    }

    public Double getStemi_2_2_3_3_1() {
        return stemi_2_2_3_3_1;
    }

    public void setStemi_2_2_3_3_1(Double stemi_2_2_3_3_1) {
        this.stemi_2_2_3_3_1 = stemi_2_2_3_3_1;
    }

    public String getStemi_2_2_3_4() {
        return stemi_2_2_3_4;
    }

    public void setStemi_2_2_3_4(String stemi_2_2_3_4) {
        this.stemi_2_2_3_4 = stemi_2_2_3_4;
    }

    public String getStemi_2_3_1_1() {
        return stemi_2_3_1_1;
    }

    public void setStemi_2_3_1_1(String stemi_2_3_1_1) {
        this.stemi_2_3_1_1 = stemi_2_3_1_1;
    }

    public Date getStemi_2_3_1_2_1() {
        return stemi_2_3_1_2_1;
    }

    public void setStemi_2_3_1_2_1(Date stemi_2_3_1_2_1) {
        this.stemi_2_3_1_2_1 = stemi_2_3_1_2_1;
    }

    public Double getStemi_2_3_1_3_1() {
        return stemi_2_3_1_3_1;
    }

    public void setStemi_2_3_1_3_1(Double stemi_2_3_1_3_1) {
        this.stemi_2_3_1_3_1 = stemi_2_3_1_3_1;
    }

    public String getStemi_2_3_1_4() {
        return stemi_2_3_1_4;
    }

    public void setStemi_2_3_1_4(String stemi_2_3_1_4) {
        this.stemi_2_3_1_4 = stemi_2_3_1_4;
    }

    public String getStemi_2_3_2_1() {
        return stemi_2_3_2_1;
    }

    public void setStemi_2_3_2_1(String stemi_2_3_2_1) {
        this.stemi_2_3_2_1 = stemi_2_3_2_1;
    }

    public Date getStemi_2_3_2_2_1() {
        return stemi_2_3_2_2_1;
    }

    public void setStemi_2_3_2_2_1(Date stemi_2_3_2_2_1) {
        this.stemi_2_3_2_2_1 = stemi_2_3_2_2_1;
    }

    public Double getStemi_2_3_2_3_1() {
        return stemi_2_3_2_3_1;
    }

    public void setStemi_2_3_2_3_1(Double stemi_2_3_2_3_1) {
        this.stemi_2_3_2_3_1 = stemi_2_3_2_3_1;
    }

    public String getStemi_2_3_2_4() {
        return stemi_2_3_2_4;
    }

    public void setStemi_2_3_2_4(String stemi_2_3_2_4) {
        this.stemi_2_3_2_4 = stemi_2_3_2_4;
    }

    public String getStemi_2_3_3_1() {
        return stemi_2_3_3_1;
    }

    public void setStemi_2_3_3_1(String stemi_2_3_3_1) {
        this.stemi_2_3_3_1 = stemi_2_3_3_1;
    }

    public Date getStemi_2_3_3_2_1() {
        return stemi_2_3_3_2_1;
    }

    public void setStemi_2_3_3_2_1(Date stemi_2_3_3_2_1) {
        this.stemi_2_3_3_2_1 = stemi_2_3_3_2_1;
    }

    public Double getStemi_2_3_3_3_1() {
        return stemi_2_3_3_3_1;
    }

    public void setStemi_2_3_3_3_1(Double stemi_2_3_3_3_1) {
        this.stemi_2_3_3_3_1 = stemi_2_3_3_3_1;
    }

    public String getStemi_2_3_3_4() {
        return stemi_2_3_3_4;
    }

    public void setStemi_2_3_3_4(String stemi_2_3_3_4) {
        this.stemi_2_3_3_4 = stemi_2_3_3_4;
    }

    public String getStemi_3_0_2() {
        return stemi_3_0_2;
    }

    public void setStemi_3_0_2(String stemi_3_0_2) {
        this.stemi_3_0_2 = stemi_3_0_2;
    }

    public String getStemi_3_1_1() {
        return stemi_3_1_1;
    }

    public void setStemi_3_1_1(String stemi_3_1_1) {
        this.stemi_3_1_1 = stemi_3_1_1;
    }

    public String getStemi_3_1_2_1() {
        return stemi_3_1_2_1;
    }

    public void setStemi_3_1_2_1(String stemi_3_1_2_1) {
        this.stemi_3_1_2_1 = stemi_3_1_2_1;
    }

    public List<String> getStemi_3_1_2_2() {
        return stemi_3_1_2_2;
    }

    public void setStemi_3_1_2_2(List<String> stemi_3_1_2_2) {
        this.stemi_3_1_2_2 = stemi_3_1_2_2;
    }

    public List<String> getStemi_3_1_2_3() {
        return stemi_3_1_2_3;
    }

    public void setStemi_3_1_2_3(List<String> stemi_3_1_2_3) {
        this.stemi_3_1_2_3 = stemi_3_1_2_3;
    }

    public String getStemi_3_1_3() {
        return stemi_3_1_3;
    }

    public void setStemi_3_1_3(String stemi_3_1_3) {
        this.stemi_3_1_3 = stemi_3_1_3;
    }

    public String getStemi_3_1_4() {
        return stemi_3_1_4;
    }

    public void setStemi_3_1_4(String stemi_3_1_4) {
        this.stemi_3_1_4 = stemi_3_1_4;
    }

    public String getStemi_3_1_4_1() {
        return stemi_3_1_4_1;
    }

    public void setStemi_3_1_4_1(String stemi_3_1_4_1) {
        this.stemi_3_1_4_1 = stemi_3_1_4_1;
    }

    public Date getStemi_3_1_5_1() {
        return stemi_3_1_5_1;
    }

    public void setStemi_3_1_5_1(Date stemi_3_1_5_1) {
        this.stemi_3_1_5_1 = stemi_3_1_5_1;
    }

    public Date getStemi_3_1_6_1() {
        return stemi_3_1_6_1;
    }

    public void setStemi_3_1_6_1(Date stemi_3_1_6_1) {
        this.stemi_3_1_6_1 = stemi_3_1_6_1;
    }

    public Double getStemi_3_1_7_1() {
        return stemi_3_1_7_1;
    }

    public void setStemi_3_1_7_1(Double stemi_3_1_7_1) {
        this.stemi_3_1_7_1 = stemi_3_1_7_1;
    }

    public List<String> getStemi_3_1_8() {
        return stemi_3_1_8;
    }

    public void setStemi_3_1_8(List<String> stemi_3_1_8) {
        this.stemi_3_1_8 = stemi_3_1_8;
    }

    public String getStemi_3_1_9() {
        return stemi_3_1_9;
    }

    public void setStemi_3_1_9(String stemi_3_1_9) {
        this.stemi_3_1_9 = stemi_3_1_9;
    }

    public List<String> getStemi_3_1_10() {
        return stemi_3_1_10;
    }

    public void setStemi_3_1_10(List<String> stemi_3_1_10) {
        this.stemi_3_1_10 = stemi_3_1_10;
    }

    public String getStemi_3_2_1() {
        return stemi_3_2_1;
    }

    public void setStemi_3_2_1(String stemi_3_2_1) {
        this.stemi_3_2_1 = stemi_3_2_1;
    }

    public String getStemi_3_2_2_1_3() {
        return stemi_3_2_2_1_3;
    }

    public void setStemi_3_2_2_1_3(String stemi_3_2_2_1_3) {
        this.stemi_3_2_2_1_3 = stemi_3_2_2_1_3;
    }

    public String getStemi_3_2_2_1_1() {
        return stemi_3_2_2_1_1;
    }

    public void setStemi_3_2_2_1_1(String stemi_3_2_2_1_1) {
        this.stemi_3_2_2_1_1 = stemi_3_2_2_1_1;
    }

    public String getStemi_3_2_2_1_1_1() {
        return stemi_3_2_2_1_1_1;
    }

    public void setStemi_3_2_2_1_1_1(String stemi_3_2_2_1_1_1) {
        this.stemi_3_2_2_1_1_1 = stemi_3_2_2_1_1_1;
    }

    public String getStemi_3_2_2_1_2() {
        return stemi_3_2_2_1_2;
    }

    public void setStemi_3_2_2_1_2(String stemi_3_2_2_1_2) {
        this.stemi_3_2_2_1_2 = stemi_3_2_2_1_2;
    }

    public String getStemi_3_2_2() {
        return stemi_3_2_2;
    }

    public void setStemi_3_2_2(String stemi_3_2_2) {
        this.stemi_3_2_2 = stemi_3_2_2;
    }

    public String getStemi_3_2_2_1() {
        return stemi_3_2_2_1;
    }

    public void setStemi_3_2_2_1(String stemi_3_2_2_1) {
        this.stemi_3_2_2_1 = stemi_3_2_2_1;
    }

    public Date getStemi_3_2_2_2_1() {
        return stemi_3_2_2_2_1;
    }

    public void setStemi_3_2_2_2_1(Date stemi_3_2_2_2_1) {
        this.stemi_3_2_2_2_1 = stemi_3_2_2_2_1;
    }

    public Date getStemi_3_2_2_3_1() {
        return stemi_3_2_2_3_1;
    }

    public void setStemi_3_2_2_3_1(Date stemi_3_2_2_3_1) {
        this.stemi_3_2_2_3_1 = stemi_3_2_2_3_1;
    }

    public Double getStemi_3_2_2_4_1() {
        return stemi_3_2_2_4_1;
    }

    public void setStemi_3_2_2_4_1(Double stemi_3_2_2_4_1) {
        this.stemi_3_2_2_4_1 = stemi_3_2_2_4_1;
    }

    public String getStemi_3_2_2_5() {
        return stemi_3_2_2_5;
    }

    public void setStemi_3_2_2_5(String stemi_3_2_2_5) {
        this.stemi_3_2_2_5 = stemi_3_2_2_5;
    }

    public List<String> getStemi_3_2_3_1() {
        return stemi_3_2_3_1;
    }

    public void setStemi_3_2_3_1(List<String> stemi_3_2_3_1) {
        this.stemi_3_2_3_1 = stemi_3_2_3_1;
    }

    public String getStemi_3_2_3_2_1() {
        return stemi_3_2_3_2_1;
    }

    public void setStemi_3_2_3_2_1(String stemi_3_2_3_2_1) {
        this.stemi_3_2_3_2_1 = stemi_3_2_3_2_1;
    }

    public String getStemi_3_2_3_2_5() {
        return stemi_3_2_3_2_5;
    }

    public void setStemi_3_2_3_2_5(String stemi_3_2_3_2_5) {
        this.stemi_3_2_3_2_5 = stemi_3_2_3_2_5;
    }

    public String getStemi_3_2_3_2_2() {
        return stemi_3_2_3_2_2;
    }

    public void setStemi_3_2_3_2_2(String stemi_3_2_3_2_2) {
        this.stemi_3_2_3_2_2 = stemi_3_2_3_2_2;
    }

    public String getStemi_3_2_3_2_6() {
        return stemi_3_2_3_2_6;
    }

    public void setStemi_3_2_3_2_6(String stemi_3_2_3_2_6) {
        this.stemi_3_2_3_2_6 = stemi_3_2_3_2_6;
    }

    public String getStemi_3_2_3_2_3() {
        return stemi_3_2_3_2_3;
    }

    public void setStemi_3_2_3_2_3(String stemi_3_2_3_2_3) {
        this.stemi_3_2_3_2_3 = stemi_3_2_3_2_3;
    }

    public String getStemi_3_2_3_2_7() {
        return stemi_3_2_3_2_7;
    }

    public void setStemi_3_2_3_2_7(String stemi_3_2_3_2_7) {
        this.stemi_3_2_3_2_7 = stemi_3_2_3_2_7;
    }

    public String getStemi_3_2_3_2_4() {
        return stemi_3_2_3_2_4;
    }

    public void setStemi_3_2_3_2_4(String stemi_3_2_3_2_4) {
        this.stemi_3_2_3_2_4 = stemi_3_2_3_2_4;
    }

    public String getStemi_3_2_3_2_8() {
        return stemi_3_2_3_2_8;
    }

    public void setStemi_3_2_3_2_8(String stemi_3_2_3_2_8) {
        this.stemi_3_2_3_2_8 = stemi_3_2_3_2_8;
    }

    public List<String> getStemi_3_2_3_3() {
        return stemi_3_2_3_3;
    }

    public void setStemi_3_2_3_3(List<String> stemi_3_2_3_3) {
        this.stemi_3_2_3_3 = stemi_3_2_3_3;
    }

    public String getStemi_3_2_3_3_1() {
        return stemi_3_2_3_3_1;
    }

    public void setStemi_3_2_3_3_1(String stemi_3_2_3_3_1) {
        this.stemi_3_2_3_3_1 = stemi_3_2_3_3_1;
    }

    public String getStemi_3_2_3_3_2() {
        return stemi_3_2_3_3_2;
    }

    public void setStemi_3_2_3_3_2(String stemi_3_2_3_3_2) {
        this.stemi_3_2_3_3_2 = stemi_3_2_3_3_2;
    }

    public String getStemi_3_2_3_3_2_1() {
        return stemi_3_2_3_3_2_1;
    }

    public void setStemi_3_2_3_3_2_1(String stemi_3_2_3_3_2_1) {
        this.stemi_3_2_3_3_2_1 = stemi_3_2_3_3_2_1;
    }

    public String getStemi_3_2_3_3_3() {
        return stemi_3_2_3_3_3;
    }

    public void setStemi_3_2_3_3_3(String stemi_3_2_3_3_3) {
        this.stemi_3_2_3_3_3 = stemi_3_2_3_3_3;
    }

    public String getStemi_3_2_3_3_4() {
        return stemi_3_2_3_3_4;
    }

    public void setStemi_3_2_3_3_4(String stemi_3_2_3_3_4) {
        this.stemi_3_2_3_3_4 = stemi_3_2_3_3_4;
    }

    public String getStemi_3_2_3_3_4_1() {
        return stemi_3_2_3_3_4_1;
    }

    public void setStemi_3_2_3_3_4_1(String stemi_3_2_3_3_4_1) {
        this.stemi_3_2_3_3_4_1 = stemi_3_2_3_3_4_1;
    }

    public String getStemi_3_2_3_3_5() {
        return stemi_3_2_3_3_5;
    }

    public void setStemi_3_2_3_3_5(String stemi_3_2_3_3_5) {
        this.stemi_3_2_3_3_5 = stemi_3_2_3_3_5;
    }

    public String getStemi_3_2_3_3_6() {
        return stemi_3_2_3_3_6;
    }

    public void setStemi_3_2_3_3_6(String stemi_3_2_3_3_6) {
        this.stemi_3_2_3_3_6 = stemi_3_2_3_3_6;
    }

    public String getStemi_3_2_3_3_6_1() {
        return stemi_3_2_3_3_6_1;
    }

    public void setStemi_3_2_3_3_6_1(String stemi_3_2_3_3_6_1) {
        this.stemi_3_2_3_3_6_1 = stemi_3_2_3_3_6_1;
    }

    public String getStemi_3_2_3_3_7() {
        return stemi_3_2_3_3_7;
    }

    public void setStemi_3_2_3_3_7(String stemi_3_2_3_3_7) {
        this.stemi_3_2_3_3_7 = stemi_3_2_3_3_7;
    }

    public String getStemi_3_2_3_3_8() {
        return stemi_3_2_3_3_8;
    }

    public void setStemi_3_2_3_3_8(String stemi_3_2_3_3_8) {
        this.stemi_3_2_3_3_8 = stemi_3_2_3_3_8;
    }

    public String getStemi_3_2_3_3_8_1() {
        return stemi_3_2_3_3_8_1;
    }

    public void setStemi_3_2_3_3_8_1(String stemi_3_2_3_3_8_1) {
        this.stemi_3_2_3_3_8_1 = stemi_3_2_3_3_8_1;
    }

    public String getStemi_3_2_3_9_1() {
        return stemi_3_2_3_9_1;
    }

    public void setStemi_3_2_3_9_1(String stemi_3_2_3_9_1) {
        this.stemi_3_2_3_9_1 = stemi_3_2_3_9_1;
    }

    public String getStemi_3_2_3_3_10() {
        return stemi_3_2_3_3_10;
    }

    public void setStemi_3_2_3_3_10(String stemi_3_2_3_3_10) {
        this.stemi_3_2_3_3_10 = stemi_3_2_3_3_10;
    }

    public String getStemi_3_2_3_3_10_1() {
        return stemi_3_2_3_3_10_1;
    }

    public void setStemi_3_2_3_3_10_1(String stemi_3_2_3_3_10_1) {
        this.stemi_3_2_3_3_10_1 = stemi_3_2_3_3_10_1;
    }

    public String getStemi_3_2_3_3_11() {
        return stemi_3_2_3_3_11;
    }

    public void setStemi_3_2_3_3_11(String stemi_3_2_3_3_11) {
        this.stemi_3_2_3_3_11 = stemi_3_2_3_3_11;
    }

    public String getStemi_3_2_3_3_12() {
        return stemi_3_2_3_3_12;
    }

    public void setStemi_3_2_3_3_12(String stemi_3_2_3_3_12) {
        this.stemi_3_2_3_3_12 = stemi_3_2_3_3_12;
    }

    public String getStemi_3_2_3_3_12_1() {
        return stemi_3_2_3_3_12_1;
    }

    public void setStemi_3_2_3_3_12_1(String stemi_3_2_3_3_12_1) {
        this.stemi_3_2_3_3_12_1 = stemi_3_2_3_3_12_1;
    }

    public String getStemi_3_2_3_3_13() {
        return stemi_3_2_3_3_13;
    }

    public void setStemi_3_2_3_3_13(String stemi_3_2_3_3_13) {
        this.stemi_3_2_3_3_13 = stemi_3_2_3_3_13;
    }

    public String getStemi_3_2_3_3_14() {
        return stemi_3_2_3_3_14;
    }

    public void setStemi_3_2_3_3_14(String stemi_3_2_3_3_14) {
        this.stemi_3_2_3_3_14 = stemi_3_2_3_3_14;
    }

    public String getStemi_3_2_3_3_14_1() {
        return stemi_3_2_3_3_14_1;
    }

    public void setStemi_3_2_3_3_14_1(String stemi_3_2_3_3_14_1) {
        this.stemi_3_2_3_3_14_1 = stemi_3_2_3_3_14_1;
    }

    public String getStemi_3_2_3_15_1() {
        return stemi_3_2_3_15_1;
    }

    public void setStemi_3_2_3_15_1(String stemi_3_2_3_15_1) {
        this.stemi_3_2_3_15_1 = stemi_3_2_3_15_1;
    }

    public String getStemi_3_2_3_3_16() {
        return stemi_3_2_3_3_16;
    }

    public void setStemi_3_2_3_3_16(String stemi_3_2_3_3_16) {
        this.stemi_3_2_3_3_16 = stemi_3_2_3_3_16;
    }

    public String getStemi_3_2_3_3_16_1() {
        return stemi_3_2_3_3_16_1;
    }

    public void setStemi_3_2_3_3_16_1(String stemi_3_2_3_3_16_1) {
        this.stemi_3_2_3_3_16_1 = stemi_3_2_3_3_16_1;
    }

    public String getStemi_3_2_4_1() {
        return stemi_3_2_4_1;
    }

    public void setStemi_3_2_4_1(String stemi_3_2_4_1) {
        this.stemi_3_2_4_1 = stemi_3_2_4_1;
    }

    public String getStemi_3_2_4_2() {
        return stemi_3_2_4_2;
    }

    public void setStemi_3_2_4_2(String stemi_3_2_4_2) {
        this.stemi_3_2_4_2 = stemi_3_2_4_2;
    }

    public String getStemi_3_2_4_3() {
        return stemi_3_2_4_3;
    }

    public void setStemi_3_2_4_3(String stemi_3_2_4_3) {
        this.stemi_3_2_4_3 = stemi_3_2_4_3;
    }

    public String getStemi_3_2_4_4() {
        return stemi_3_2_4_4;
    }

    public void setStemi_3_2_4_4(String stemi_3_2_4_4) {
        this.stemi_3_2_4_4 = stemi_3_2_4_4;
    }

    public List<String> getStemi_3_2_5_1() {
        return stemi_3_2_5_1;
    }

    public void setStemi_3_2_5_1(List<String> stemi_3_2_5_1) {
        this.stemi_3_2_5_1 = stemi_3_2_5_1;
    }

    public String getStemi_3_2_5_1_1() {
        return stemi_3_2_5_1_1;
    }

    public void setStemi_3_2_5_1_1(String stemi_3_2_5_1_1) {
        this.stemi_3_2_5_1_1 = stemi_3_2_5_1_1;
    }

    public List<String> getStemi_3_2_5_2() {
        return stemi_3_2_5_2;
    }

    public void setStemi_3_2_5_2(List<String> stemi_3_2_5_2) {
        this.stemi_3_2_5_2 = stemi_3_2_5_2;
    }

    public String getStemi_3_2_5_2_1() {
        return stemi_3_2_5_2_1;
    }

    public void setStemi_3_2_5_2_1(String stemi_3_2_5_2_1) {
        this.stemi_3_2_5_2_1 = stemi_3_2_5_2_1;
    }

    public String getStemi_3_2_6_1() {
        return stemi_3_2_6_1;
    }

    public void setStemi_3_2_6_1(String stemi_3_2_6_1) {
        this.stemi_3_2_6_1 = stemi_3_2_6_1;
    }

    public Double getStemi_3_2_6_2_1_1() {
        return stemi_3_2_6_2_1_1;
    }

    public void setStemi_3_2_6_2_1_1(Double stemi_3_2_6_2_1_1) {
        this.stemi_3_2_6_2_1_1 = stemi_3_2_6_2_1_1;
    }

    public Double getStemi_3_2_6_2_2() {
        return stemi_3_2_6_2_2;
    }

    public void setStemi_3_2_6_2_2(Double stemi_3_2_6_2_2) {
        this.stemi_3_2_6_2_2 = stemi_3_2_6_2_2;
    }

    public String getStemi_3_2_7_1() {
        return stemi_3_2_7_1;
    }

    public void setStemi_3_2_7_1(String stemi_3_2_7_1) {
        this.stemi_3_2_7_1 = stemi_3_2_7_1;
    }

    public String getStemi_3_2_7_2() {
        return stemi_3_2_7_2;
    }

    public void setStemi_3_2_7_2(String stemi_3_2_7_2) {
        this.stemi_3_2_7_2 = stemi_3_2_7_2;
    }

    public String getStemi_3_2_7_3() {
        return stemi_3_2_7_3;
    }

    public void setStemi_3_2_7_3(String stemi_3_2_7_3) {
        this.stemi_3_2_7_3 = stemi_3_2_7_3;
    }

    public String getStemi_3_3_0() {
        return stemi_3_3_0;
    }

    public void setStemi_3_3_0(String stemi_3_3_0) {
        this.stemi_3_3_0 = stemi_3_3_0;
    }

    public List<String> getStemi_3_3_1_1() {
        return stemi_3_3_1_1;
    }

    public void setStemi_3_3_1_1(List<String> stemi_3_3_1_1) {
        this.stemi_3_3_1_1 = stemi_3_3_1_1;
    }

    public String getStemi_3_3_1_1_1() {
        return stemi_3_3_1_1_1;
    }

    public void setStemi_3_3_1_1_1(String stemi_3_3_1_1_1) {
        this.stemi_3_3_1_1_1 = stemi_3_3_1_1_1;
    }

    public List<String> getStemi_3_3_1_2() {
        return stemi_3_3_1_2;
    }

    public void setStemi_3_3_1_2(List<String> stemi_3_3_1_2) {
        this.stemi_3_3_1_2 = stemi_3_3_1_2;
    }

    public String getStemi_3_3_1_2_1() {
        return stemi_3_3_1_2_1;
    }

    public void setStemi_3_3_1_2_1(String stemi_3_3_1_2_1) {
        this.stemi_3_3_1_2_1 = stemi_3_3_1_2_1;
    }

    public String getStemi_3_3_2() {
        return stemi_3_3_2;
    }

    public void setStemi_3_3_2(String stemi_3_3_2) {
        this.stemi_3_3_2 = stemi_3_3_2;
    }

    public Date getStemi_3_3_3_1() {
        return stemi_3_3_3_1;
    }

    public void setStemi_3_3_3_1(Date stemi_3_3_3_1) {
        this.stemi_3_3_3_1 = stemi_3_3_3_1;
    }

    public Double getStemi_3_3_4_1() {
        return stemi_3_3_4_1;
    }

    public void setStemi_3_3_4_1(Double stemi_3_3_4_1) {
        this.stemi_3_3_4_1 = stemi_3_3_4_1;
    }

    public String getStemi_3_4() {
        return stemi_3_4;
    }

    public void setStemi_3_4(String stemi_3_4) {
        this.stemi_3_4 = stemi_3_4;
    }

    public Date getStemi_3_4_1_1() {
        return stemi_3_4_1_1;
    }

    public void setStemi_3_4_1_1(Date stemi_3_4_1_1) {
        this.stemi_3_4_1_1 = stemi_3_4_1_1;
    }

    public Date getStemi_3_4_2_1() {
        return stemi_3_4_2_1;
    }

    public void setStemi_3_4_2_1(Date stemi_3_4_2_1) {
        this.stemi_3_4_2_1 = stemi_3_4_2_1;
    }

    public Double getStemi_3_4_3_1() {
        return stemi_3_4_3_1;
    }

    public void setStemi_3_4_3_1(Double stemi_3_4_3_1) {
        this.stemi_3_4_3_1 = stemi_3_4_3_1;
    }

    public List<String> getStemi_3_4_4() {
        return stemi_3_4_4;
    }

    public void setStemi_3_4_4(List<String> stemi_3_4_4) {
        this.stemi_3_4_4 = stemi_3_4_4;
    }

    public String getStemi_4_1_1() {
        return stemi_4_1_1;
    }

    public void setStemi_4_1_1(String stemi_4_1_1) {
        this.stemi_4_1_1 = stemi_4_1_1;
    }

    public List<String> getStemi_4_1_2_1() {
        return stemi_4_1_2_1;
    }

    public void setStemi_4_1_2_1(List<String> stemi_4_1_2_1) {
        this.stemi_4_1_2_1 = stemi_4_1_2_1;
    }

    public String getStemi_4_1_2_1_1() {
        return stemi_4_1_2_1_1;
    }

    public void setStemi_4_1_2_1_1(String stemi_4_1_2_1_1) {
        this.stemi_4_1_2_1_1 = stemi_4_1_2_1_1;
    }

    public List<String> getStemi_4_1_2_2() {
        return stemi_4_1_2_2;
    }

    public void setStemi_4_1_2_2(List<String> stemi_4_1_2_2) {
        this.stemi_4_1_2_2 = stemi_4_1_2_2;
    }

    public String getStemi_4_1_2_2_1() {
        return stemi_4_1_2_2_1;
    }

    public void setStemi_4_1_2_2_1(String stemi_4_1_2_2_1) {
        this.stemi_4_1_2_2_1 = stemi_4_1_2_2_1;
    }

    public String getStemi_4_2() {
        return stemi_4_2;
    }

    public void setStemi_4_2(String stemi_4_2) {
        this.stemi_4_2 = stemi_4_2;
    }

    public Date getStemi_4_3_1() {
        return stemi_4_3_1;
    }

    public void setStemi_4_3_1(Date stemi_4_3_1) {
        this.stemi_4_3_1 = stemi_4_3_1;
    }

    public String getStemi_5_1_1() {
        return stemi_5_1_1;
    }

    public void setStemi_5_1_1(String stemi_5_1_1) {
        this.stemi_5_1_1 = stemi_5_1_1;
    }

    public String getStemi_5_1_2() {
        return stemi_5_1_2;
    }

    public void setStemi_5_1_2(String stemi_5_1_2) {
        this.stemi_5_1_2 = stemi_5_1_2;
    }

    public String getStemi_5_1_2_1() {
        return stemi_5_1_2_1;
    }

    public void setStemi_5_1_2_1(String stemi_5_1_2_1) {
        this.stemi_5_1_2_1 = stemi_5_1_2_1;
    }

    public String getStemi_5_2_1() {
        return stemi_5_2_1;
    }

    public void setStemi_5_2_1(String stemi_5_2_1) {
        this.stemi_5_2_1 = stemi_5_2_1;
    }

    public String getStemi_5_2_2() {
        return stemi_5_2_2;
    }

    public void setStemi_5_2_2(String stemi_5_2_2) {
        this.stemi_5_2_2 = stemi_5_2_2;
    }

    public String getStemi_5_3_1() {
        return stemi_5_3_1;
    }

    public void setStemi_5_3_1(String stemi_5_3_1) {
        this.stemi_5_3_1 = stemi_5_3_1;
    }

    public List<String> getStemi_5_3_2() {
        return stemi_5_3_2;
    }

    public void setStemi_5_3_2(List<String> stemi_5_3_2) {
        this.stemi_5_3_2 = stemi_5_3_2;
    }

    public String getStemi_5_3_3() {
        return stemi_5_3_3;
    }

    public void setStemi_5_3_3(String stemi_5_3_3) {
        this.stemi_5_3_3 = stemi_5_3_3;
    }

    public String getStemi_5_3_4_a() {
        return stemi_5_3_4_a;
    }

    public void setStemi_5_3_4_a(String stemi_5_3_4_a) {
        this.stemi_5_3_4_a = stemi_5_3_4_a;
    }

    public String getStemi_5_3_4_a_1() {
        return stemi_5_3_4_a_1;
    }

    public void setStemi_5_3_4_a_1(String stemi_5_3_4_a_1) {
        this.stemi_5_3_4_a_1 = stemi_5_3_4_a_1;
    }

    public String getStemi_5_3_4_b() {
        return stemi_5_3_4_b;
    }

    public void setStemi_5_3_4_b(String stemi_5_3_4_b) {
        this.stemi_5_3_4_b = stemi_5_3_4_b;
    }

    public String getStemi_5_3_4_b_1() {
        return stemi_5_3_4_b_1;
    }

    public void setStemi_5_3_4_b_1(String stemi_5_3_4_b_1) {
        this.stemi_5_3_4_b_1 = stemi_5_3_4_b_1;
    }

    public String getStemi_5_4_1() {
        return stemi_5_4_1;
    }

    public void setStemi_5_4_1(String stemi_5_4_1) {
        this.stemi_5_4_1 = stemi_5_4_1;
    }

    public List<String> getStemi_5_4_2() {
        return stemi_5_4_2;
    }

    public void setStemi_5_4_2(List<String> stemi_5_4_2) {
        this.stemi_5_4_2 = stemi_5_4_2;
    }

    public String getStemi_5_4_3() {
        return stemi_5_4_3;
    }

    public void setStemi_5_4_3(String stemi_5_4_3) {
        this.stemi_5_4_3 = stemi_5_4_3;
    }

    public String getStemi_5_4_4() {
        return stemi_5_4_4;
    }

    public void setStemi_5_4_4(String stemi_5_4_4) {
        this.stemi_5_4_4 = stemi_5_4_4;
    }

    public String getStemi_5_4_4_1() {
        return stemi_5_4_4_1;
    }

    public void setStemi_5_4_4_1(String stemi_5_4_4_1) {
        this.stemi_5_4_4_1 = stemi_5_4_4_1;
    }

    public String getStemi_6_1() {
        return stemi_6_1;
    }

    public void setStemi_6_1(String stemi_6_1) {
        this.stemi_6_1 = stemi_6_1;
    }

    public String getStemi_6_1_2() {
        return stemi_6_1_2;
    }

    public void setStemi_6_1_2(String stemi_6_1_2) {
        this.stemi_6_1_2 = stemi_6_1_2;
    }

    public String getStemi_6_1_2_1() {
        return stemi_6_1_2_1;
    }

    public void setStemi_6_1_2_1(String stemi_6_1_2_1) {
        this.stemi_6_1_2_1 = stemi_6_1_2_1;
    }

    public String getStemi_6_2() {
        return stemi_6_2;
    }

    public void setStemi_6_2(String stemi_6_2) {
        this.stemi_6_2 = stemi_6_2;
    }

    public String getStemi_6_2_2() {
        return stemi_6_2_2;
    }

    public void setStemi_6_2_2(String stemi_6_2_2) {
        this.stemi_6_2_2 = stemi_6_2_2;
    }

    public String getStemi_6_3() {
        return stemi_6_3;
    }

    public void setStemi_6_3(String stemi_6_3) {
        this.stemi_6_3 = stemi_6_3;
    }

    public String getStemi_6_3_2() {
        return stemi_6_3_2;
    }

    public void setStemi_6_3_2(String stemi_6_3_2) {
        this.stemi_6_3_2 = stemi_6_3_2;
    }

    public String getStemi_6_3_2_a() {
        return stemi_6_3_2_a;
    }

    public void setStemi_6_3_2_a(String stemi_6_3_2_a) {
        this.stemi_6_3_2_a = stemi_6_3_2_a;
    }

    public String getStemi_6_3_2_a_1() {
        return stemi_6_3_2_a_1;
    }

    public void setStemi_6_3_2_a_1(String stemi_6_3_2_a_1) {
        this.stemi_6_3_2_a_1 = stemi_6_3_2_a_1;
    }

    public String getStemi_6_3_2_b() {
        return stemi_6_3_2_b;
    }

    public void setStemi_6_3_2_b(String stemi_6_3_2_b) {
        this.stemi_6_3_2_b = stemi_6_3_2_b;
    }

    public String getStemi_6_3_2_b_1() {
        return stemi_6_3_2_b_1;
    }

    public void setStemi_6_3_2_b_1(String stemi_6_3_2_b_1) {
        this.stemi_6_3_2_b_1 = stemi_6_3_2_b_1;
    }

    public String getStemi_6_4() {
        return stemi_6_4;
    }

    public void setStemi_6_4(String stemi_6_4) {
        this.stemi_6_4 = stemi_6_4;
    }

    public String getStemi_6_4_2() {
        return stemi_6_4_2;
    }

    public void setStemi_6_4_2(String stemi_6_4_2) {
        this.stemi_6_4_2 = stemi_6_4_2;
    }

    public String getStemi_6_4_2_1() {
        return stemi_6_4_2_1;
    }

    public void setStemi_6_4_2_1(String stemi_6_4_2_1) {
        this.stemi_6_4_2_1 = stemi_6_4_2_1;
    }

    public String getStemi_6_5_1() {
        return stemi_6_5_1;
    }

    public void setStemi_6_5_1(String stemi_6_5_1) {
        this.stemi_6_5_1 = stemi_6_5_1;
    }

    public List<String> getStemi_6_5_2() {
        return stemi_6_5_2;
    }

    public void setStemi_6_5_2(List<String> stemi_6_5_2) {
        this.stemi_6_5_2 = stemi_6_5_2;
    }

    public String getStemi_6_5_2_1() {
        return stemi_6_5_2_1;
    }

    public void setStemi_6_5_2_1(String stemi_6_5_2_1) {
        this.stemi_6_5_2_1 = stemi_6_5_2_1;
    }

    public String getStemi_6_5_3() {
        return stemi_6_5_3;
    }

    public void setStemi_6_5_3(String stemi_6_5_3) {
        this.stemi_6_5_3 = stemi_6_5_3;
    }

    public List<String> getStemi_6_5_4() {
        return stemi_6_5_4;
    }

    public void setStemi_6_5_4(List<String> stemi_6_5_4) {
        this.stemi_6_5_4 = stemi_6_5_4;
    }

    public String getStemi_6_5_5() {
        return stemi_6_5_5;
    }

    public void setStemi_6_5_5(String stemi_6_5_5) {
        this.stemi_6_5_5 = stemi_6_5_5;
    }

    public String getStemi_6_5_6() {
        return stemi_6_5_6;
    }

    public void setStemi_6_5_6(String stemi_6_5_6) {
        this.stemi_6_5_6 = stemi_6_5_6;
    }

    public String getStemi_6_5_6_1() {
        return stemi_6_5_6_1;
    }

    public void setStemi_6_5_6_1(String stemi_6_5_6_1) {
        this.stemi_6_5_6_1 = stemi_6_5_6_1;
    }

    public String getStemi_7_1() {
        return stemi_7_1;
    }

    public void setStemi_7_1(String stemi_7_1) {
        this.stemi_7_1 = stemi_7_1;
    }

    public String getStemi_7_2() {
        return stemi_7_2;
    }

    public void setStemi_7_2(String stemi_7_2) {
        this.stemi_7_2 = stemi_7_2;
    }

    public String getStemi_7_3_1() {
        return stemi_7_3_1;
    }

    public void setStemi_7_3_1(String stemi_7_3_1) {
        this.stemi_7_3_1 = stemi_7_3_1;
    }

    public List<String> getStemi_7_3_2() {
        return stemi_7_3_2;
    }

    public void setStemi_7_3_2(List<String> stemi_7_3_2) {
        this.stemi_7_3_2 = stemi_7_3_2;
    }

    public String getStemi_7_4() {
        return stemi_7_4;
    }

    public void setStemi_7_4(String stemi_7_4) {
        this.stemi_7_4 = stemi_7_4;
    }

    public String getStemi_7_5() {
        return stemi_7_5;
    }

    public void setStemi_7_5(String stemi_7_5) {
        this.stemi_7_5 = stemi_7_5;
    }

    public String getStemi_8_1_1() {
        return stemi_8_1_1;
    }

    public void setStemi_8_1_1(String stemi_8_1_1) {
        this.stemi_8_1_1 = stemi_8_1_1;
    }

    public String getStemi_8_1_2() {
        return stemi_8_1_2;
    }

    public void setStemi_8_1_2(String stemi_8_1_2) {
        this.stemi_8_1_2 = stemi_8_1_2;
    }

    public String getStemi_8_1_3() {
        return stemi_8_1_3;
    }

    public void setStemi_8_1_3(String stemi_8_1_3) {
        this.stemi_8_1_3 = stemi_8_1_3;
    }

    public List<String> getStemi_8_2_1() {
        return stemi_8_2_1;
    }

    public void setStemi_8_2_1(List<String> stemi_8_2_1) {
        this.stemi_8_2_1 = stemi_8_2_1;
    }

    public String getStemi_8_2_2() {
        return stemi_8_2_2;
    }

    public void setStemi_8_2_2(String stemi_8_2_2) {
        this.stemi_8_2_2 = stemi_8_2_2;
    }

    public List<String> getStemi_8_3() {
        return stemi_8_3;
    }

    public void setStemi_8_3(List<String> stemi_8_3) {
        this.stemi_8_3 = stemi_8_3;
    }

    public List<String> getStemi_8_4_1() {
        return stemi_8_4_1;
    }

    public void setStemi_8_4_1(List<String> stemi_8_4_1) {
        this.stemi_8_4_1 = stemi_8_4_1;
    }

    public List<String> getStemi_8_4_2() {
        return stemi_8_4_2;
    }

    public void setStemi_8_4_2(List<String> stemi_8_4_2) {
        this.stemi_8_4_2 = stemi_8_4_2;
    }

    public List<String> getStemi_8_4_3() {
        return stemi_8_4_3;
    }

    public void setStemi_8_4_3(List<String> stemi_8_4_3) {
        this.stemi_8_4_3 = stemi_8_4_3;
    }

    public List<String> getStemi_8_4_4() {
        return stemi_8_4_4;
    }

    public void setStemi_8_4_4(List<String> stemi_8_4_4) {
        this.stemi_8_4_4 = stemi_8_4_4;
    }

    public List<String> getStemi_8_4_5() {
        return stemi_8_4_5;
    }

    public void setStemi_8_4_5(List<String> stemi_8_4_5) {
        this.stemi_8_4_5 = stemi_8_4_5;
    }

    public List<String> getStemi_9_2_1() {
        return stemi_9_2_1;
    }

    public void setStemi_9_2_1(List<String> stemi_9_2_1) {
        this.stemi_9_2_1 = stemi_9_2_1;
    }

    public String getStemi_9_2_1_1() {
        return stemi_9_2_1_1;
    }

    public void setStemi_9_2_1_1(String stemi_9_2_1_1) {
        this.stemi_9_2_1_1 = stemi_9_2_1_1;
    }

    public List<String> getStemi_9_2_2_a_2() {
        return stemi_9_2_2_a_2;
    }

    public void setStemi_9_2_2_a_2(List<String> stemi_9_2_2_a_2) {
        this.stemi_9_2_2_a_2 = stemi_9_2_2_a_2;
    }

    public Double getStemi_9_2_2_a_1_1() {
        return stemi_9_2_2_a_1_1;
    }

    public void setStemi_9_2_2_a_1_1(Double stemi_9_2_2_a_1_1) {
        this.stemi_9_2_2_a_1_1 = stemi_9_2_2_a_1_1;
    }

    public String getStemi_9_2_2_a_3() {
        return stemi_9_2_2_a_3;
    }

    public void setStemi_9_2_2_a_3(String stemi_9_2_2_a_3) {
        this.stemi_9_2_2_a_3 = stemi_9_2_2_a_3;
    }

    public String getCm_4_3() {
        return cm_4_3;
    }

    public void setCm_4_3(String cm_4_3) {
        this.cm_4_3 = cm_4_3;
    }

    public List<String> getCm_4_5() {
        return cm_4_5;
    }

    public void setCm_4_5(List<String> cm_4_5) {
        this.cm_4_5 = cm_4_5;
    }

    public String getCm_4_4_1() {
        return cm_4_4_1;
    }

    public void setCm_4_4_1(String cm_4_4_1) {
        this.cm_4_4_1 = cm_4_4_1;
    }

    public String getCm_4_6() {
        return cm_4_6;
    }

    public void setCm_4_6(String cm_4_6) {
        this.cm_4_6 = cm_4_6;
    }

    public String getCm_5_1() {
        return cm_5_1;
    }

    public void setCm_5_1(String cm_5_1) {
        this.cm_5_1 = cm_5_1;
    }

    public String getCm_5_2_1() {
        return cm_5_2_1;
    }

    public void setCm_5_2_1(String cm_5_2_1) {
        this.cm_5_2_1 = cm_5_2_1;
    }

    public String getCm_5_2_2() {
        return cm_5_2_2;
    }

    public void setCm_5_2_2(String cm_5_2_2) {
        this.cm_5_2_2 = cm_5_2_2;
    }

    public String getCm_5_2_3() {
        return cm_5_2_3;
    }

    public void setCm_5_2_3(String cm_5_2_3) {
        this.cm_5_2_3 = cm_5_2_3;
    }

    public String getCm_5_2_5() {
        return cm_5_2_5;
    }

    public void setCm_5_2_5(String cm_5_2_5) {
        this.cm_5_2_5 = cm_5_2_5;
    }

    public String getCm_5_2_6() {
        return cm_5_2_6;
    }

    public void setCm_5_2_6(String cm_5_2_6) {
        this.cm_5_2_6 = cm_5_2_6;
    }

    public String getCm_5_2_7() {
        return cm_5_2_7;
    }

    public void setCm_5_2_7(String cm_5_2_7) {
        this.cm_5_2_7 = cm_5_2_7;
    }

    public String getCm_5_2_8() {
        return cm_5_2_8;
    }

    public void setCm_5_2_8(String cm_5_2_8) {
        this.cm_5_2_8 = cm_5_2_8;
    }

    public String getCm_5_2_9() {
        return cm_5_2_9;
    }

    public void setCm_5_2_9(String cm_5_2_9) {
        this.cm_5_2_9 = cm_5_2_9;
    }

    public String getCm_5_2_10() {
        return cm_5_2_10;
    }

    public void setCm_5_2_10(String cm_5_2_10) {
        this.cm_5_2_10 = cm_5_2_10;
    }

    public String getCm_5_2_11() {
        return cm_5_2_11;
    }

    public void setCm_5_2_11(String cm_5_2_11) {
        this.cm_5_2_11 = cm_5_2_11;
    }

    public Double getCm_6_1() {
        return cm_6_1;
    }

    public void setCm_6_1(Double cm_6_1) {
        this.cm_6_1 = cm_6_1;
    }

    public Double getCm_6_2() {
        return cm_6_2;
    }

    public void setCm_6_2(Double cm_6_2) {
        this.cm_6_2 = cm_6_2;
    }

    public Double getCm_6_3() {
        return cm_6_3;
    }

    public void setCm_6_3(Double cm_6_3) {
        this.cm_6_3 = cm_6_3;
    }

    public Double getCm_6_4() {
        return cm_6_4;
    }

    public void setCm_6_4(Double cm_6_4) {
        this.cm_6_4 = cm_6_4;
    }

    public Double getCm_6_5() {
        return cm_6_5;
    }

    public void setCm_6_5(Double cm_6_5) {
        this.cm_6_5 = cm_6_5;
    }

    public Double getCm_6_6() {
        return cm_6_6;
    }

    public void setCm_6_6(Double cm_6_6) {
        this.cm_6_6 = cm_6_6;
    }

    public Double getCm_6_7() {
        return cm_6_7;
    }

    public void setCm_6_7(Double cm_6_7) {
        this.cm_6_7 = cm_6_7;
    }

    public Double getCm_6_8() {
        return cm_6_8;
    }

    public void setCm_6_8(Double cm_6_8) {
        this.cm_6_8 = cm_6_8;
    }

    public Double getCm_6_9() {
        return cm_6_9;
    }

    public void setCm_6_9(Double cm_6_9) {
        this.cm_6_9 = cm_6_9;
    }

    public Double getCm_6_10() {
        return cm_6_10;
    }

    public void setCm_6_10(Double cm_6_10) {
        this.cm_6_10 = cm_6_10;
    }

    public Double getCm_6_11() {
        return cm_6_11;
    }

    public void setCm_6_11(Double cm_6_11) {
        this.cm_6_11 = cm_6_11;
    }

    public Double getCm_6_12() {
        return cm_6_12;
    }

    public void setCm_6_12(Double cm_6_12) {
        this.cm_6_12 = cm_6_12;
    }

    public Double getCm_6_13() {
        return cm_6_13;
    }

    public void setCm_6_13(Double cm_6_13) {
        this.cm_6_13 = cm_6_13;
    }

    public Double getCm_6_14() {
        return cm_6_14;
    }

    public void setCm_6_14(Double cm_6_14) {
        this.cm_6_14 = cm_6_14;
    }

    public Double getCm_6_15() {
        return cm_6_15;
    }

    public void setCm_6_15(Double cm_6_15) {
        this.cm_6_15 = cm_6_15;
    }

    public Double getCm_6_16() {
        return cm_6_16;
    }

    public void setCm_6_16(Double cm_6_16) {
        this.cm_6_16 = cm_6_16;
    }

    public Double getCm_6_17() {
        return cm_6_17;
    }

    public void setCm_6_17(Double cm_6_17) {
        this.cm_6_17 = cm_6_17;
    }

    public Double getCm_6_18() {
        return cm_6_18;
    }

    public void setCm_6_18(Double cm_6_18) {
        this.cm_6_18 = cm_6_18;
    }

    public Double getCm_6_19() {
        return cm_6_19;
    }

    public void setCm_6_19(Double cm_6_19) {
        this.cm_6_19 = cm_6_19;
    }

    public Double getCm_6_20() {
        return cm_6_20;
    }

    public void setCm_6_20(Double cm_6_20) {
        this.cm_6_20 = cm_6_20;
    }

    public Double getCm_6_21() {
        return cm_6_21;
    }

    public void setCm_6_21(Double cm_6_21) {
        this.cm_6_21 = cm_6_21;
    }

    public Double getCm_6_22() {
        return cm_6_22;
    }

    public void setCm_6_22(Double cm_6_22) {
        this.cm_6_22 = cm_6_22;
    }

    public Double getCm_6_23() {
        return cm_6_23;
    }

    public void setCm_6_23(Double cm_6_23) {
        this.cm_6_23 = cm_6_23;
    }

    public Double getCm_6_24() {
        return cm_6_24;
    }

    public void setCm_6_24(Double cm_6_24) {
        this.cm_6_24 = cm_6_24;
    }

    public Double getCm_6_25() {
        return cm_6_25;
    }

    public void setCm_6_25(Double cm_6_25) {
        this.cm_6_25 = cm_6_25;
    }

    public Double getCm_6_26() {
        return cm_6_26;
    }

    public void setCm_6_26(Double cm_6_26) {
        this.cm_6_26 = cm_6_26;
    }

    public Double getCm_6_27() {
        return cm_6_27;
    }

    public void setCm_6_27(Double cm_6_27) {
        this.cm_6_27 = cm_6_27;
    }

    public Double getCm_6_28() {
        return cm_6_28;
    }

    public void setCm_6_28(Double cm_6_28) {
        this.cm_6_28 = cm_6_28;
    }

    public Double getCm_6_29() {
        return cm_6_29;
    }

    public void setCm_6_29(Double cm_6_29) {
        this.cm_6_29 = cm_6_29;
    }

    public Double getCm_6_30() {
        return cm_6_30;
    }

    public void setCm_6_30(Double cm_6_30) {
        this.cm_6_30 = cm_6_30;
    }
}
