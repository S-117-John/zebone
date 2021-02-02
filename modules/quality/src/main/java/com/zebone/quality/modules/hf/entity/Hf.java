package com.zebone.quality.modules.hf.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.jeesite.common.web.annotation.JsonField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Hf implements Serializable {



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
    @JSONField(name="HF-0-1-4-1")
    private String hf_0_1_4_1;
    @JSONField(name="HF-0-1-4-2")
    private String hf_0_1_4_2;
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
    private String cm_0_2_2_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-2-2")
    private Date cm_0_2_2_2;
    @JSONField(name="CM-0-2-3-1")
    private String cm_0_2_3_1;
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
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-6-1")
    private Date cm_0_2_6_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-6-2")
    private Date cm_0_2_6_2;
    @JSONField(name="CM-0-3-1")
    private String cm_0_3_1;
    @JSONField(name="CM-0-3-2")
    private String cm_0_3_2;
    @JSONField(name="CM-0-3-3")
    private String cm_0_3_3;
    @JSONField(name="HF-1-1-1")
    private String hf_1_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-1-1-2")
    private Date hf_1_1_2;
    @JSONField(name="HF-1-1-3")
    private String hf_1_1_3;
    @JSONField(name="HF-1-2-1")
    private String hf_1_2_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-1-2-2")
    private Date hf_1_2_2;
    @JSONField(name="HF-1-2-3-4")
    private Double hf_1_2_3_4;
    @JSONField(name="HF-1-2-3-1")
    private Double hf_1_2_3_1;
    @JSONField(name="HF-1-2-3-2")
    private String hf_1_2_3_2;
    @JSONField(name="HF-1-2-3-3")
    private String hf_1_2_3_3;
    @JSONField(name="HF-1-3-1")
    private String hf_1_3_1;
    @JSONField(name="HF-1-3-3")
    private String hf_1_3_3;
    @JSONField(name="HF-1-3-2")
    private String hf_1_3_2;
    @JSONField(name="HF-1-3-5")
    private String hf_1_3_5;
    @JSONField(name="HF-1-3-6-1")
    private String hf_1_3_6_1;
    @JSONField(name="HF-1-3-6-2")
    private Double hf_1_3_6_2;
    @JSONField(name="HF-1-3-6-3")
    private String hf_1_3_6_3;
    @JSONField(name="HF-1-4-1")
    private String hf_1_4_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-1-4-2")
    private Date hf_1_4_2;
    @JSONField(name="HF-1-4-3")
    private Double hf_1_4_3;
    @JSONField(name="HF-1-4-4")
    private List<String> hf_1_4_4;
    @JSONField(name="HF-1-4-4-1")
    private String hf_1_4_4_1;
    @JSONField(name="HF-1-5-1-1")
    private String hf_1_5_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-1-5-1-2")
    private Date hf_1_5_1_2;
    @JSONField(name="HF-1-5-3")
    private List<String> hf_1_5_3;
    @JSONField(name="HF-1-5-2-1")
    private Double hf_1_5_2_1;
    @JSONField(name="HF-1-5-2-2")
    private Double hf_1_5_2_2;
    @JSONField(name="HF-1-5-2-3")
    private Double hf_1_5_2_3;
    @JSONField(name="HF-1-5-2-4")
    private Double hf_1_5_2_4;
    @JSONField(name="HF-1-5-2-5")
    private Double hf_1_5_2_5;
    @JSONField(name="HF-1-5-2-6")
    private Double hf_1_5_2_6;
    @JSONField(name="HF-2-1-A")
    private String hf_2_1_a;
    @JSONField(name="HF-2-1")
    private String hf_2_1;
    @JSONField(name="HF-2-1-1")
    private String hf_2_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-2-2")
    private Date hf_2_2;
    @JSONField(name="HF-2-3")
    private String hf_2_3;
    @JSONField(name="HF-2-3-1")
    private String hf_2_3_1;
    @JSONField(name="HF-2-5")
    private String hf_2_5;
    @JSONField(name="HF-2-4")
    private String hf_2_4;
    @JSONField(name="HF-2-4-1")
    private String hf_2_4_1;
    @JSONField(name="HF-3-1")
    private String hf_3_1;
    @JSONField(name="HF-3-2-A")
    private String hf_3_2_a;
    @JSONField(name="HF-3-2-1")
    private List<String> hf_3_2_1;
    @JSONField(name="HF-3-4-A")
    private String hf_3_4_a;
    @JSONField(name="HF-3-4-A-1")
    private String hf_3_4_a_1;
    @JSONField(name="HF-3-4-B")
    private String hf_3_4_b;
    @JSONField(name="HF-3-4-B-1")
    private String hf_3_4_b_1;
    @JSONField(name="HF-3-2-B")
    private String hf_3_2_b;
    @JSONField(name="HF-3-2-2")
    private String hf_3_2_2;
    @JSONField(name="HF-3-4-C")
    private String hf_3_4_c;
    @JSONField(name="HF-3-4-C-1")
    private String hf_3_4_c_1;
    @JSONField(name="HF-3-3-1")
    private String hf_3_3_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-3-3")
    private Date hf_3_3;
    @JSONField(name="HF-3-6")
    private String hf_3_6;
    @JSONField(name="HF-3-5")
    private String hf_3_5;
    @JSONField(name="HF-3-5-1")
    private String hf_3_5_1;
    @JSONField(name="HF-4-1-1")
    private String hf_4_1_1;
    @JSONField(name="HF-4-1-2")
    private List<String> hf_4_1_2;
    @JSONField(name="HF-4-3")
    private String hf_4_3;
    @JSONField(name="HF-4-3-1")
    private String hf_4_3_1;
    @JSONField(name="HF-4-2-1")
    private String hf_4_2_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-4-2")
    private Date hf_4_2;
    @JSONField(name="HF-4-5")
    private String hf_4_5;
    @JSONField(name="HF-4-4")
    private String hf_4_4;
    @JSONField(name="HF-4-4-1")
    private String hf_4_4_1;
    @JSONField(name="HF-5-1-1")
    private String hf_5_1_1;
    @JSONField(name="HF-5-1-2")
    private List<String> hf_5_1_2;
    @JSONField(name="HF-5-2")
    private String hf_5_2;
    @JSONField(name="HF-5-2-1-1")
    private String hf_5_2_1_1;
    @JSONField(name="HF-5-3-1")
    private String hf_5_3_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-5-3")
    private Date hf_5_3;
    @JSONField(name="HF-5-6")
    private String hf_5_6;
    @JSONField(name="HF-5-4")
    private String hf_5_4;
    @JSONField(name="HF-5-4-1")
    private String hf_5_4_1;
    @JSONField(name="HF-5-5")
    private String hf_5_5;
    @JSONField(name="HF-5-5-1")
    private String hf_5_5_1;
    @JSONField(name="HF-6-1-1")
    private String hf_6_1_1;
    @JSONField(name="HF-6-1-2")
    private String hf_6_1_2;
    @JSONField(name="HF-6-1-2-1")
    private String hf_6_1_2_1;
    @JSONField(name="HF-6-2-1")
    private String hf_6_2_1;
    @JSONField(name="HF-6-2-2")
    private String hf_6_2_2;
    @JSONField(name="HF-6-2-2-A")
    private String hf_6_2_2_a;
    @JSONField(name="HF-6-2-2-A-1")
    private String hf_6_2_2_a_1;
    @JSONField(name="HF-6-2-2-B")
    private String hf_6_2_2_b;
    @JSONField(name="HF-6-2-2-B-1")
    private String hf_6_2_2_b_1;
    @JSONField(name="HF-6-2-2-C")
    private String hf_6_2_2_c;
    @JSONField(name="HF-6-2-2-C-1")
    private String hf_6_2_2_c_1;
    @JSONField(name="HF-6-3-1")
    private String hf_6_3_1;
    @JSONField(name="HF-6-3-2")
    private String hf_6_3_2;
    @JSONField(name="HF-6-3-2-1")
    private String hf_6_3_2_1;
    @JSONField(name="HF-6-4-1")
    private String hf_6_4_1;
    @JSONField(name="HF-6-4-2")
    private String hf_6_4_2;
    @JSONField(name="HF-6-4-2-1")
    private String hf_6_4_2_1;
    @JSONField(name="HF-6-5-1")
    private String hf_6_5_1;
    @JSONField(name="HF-6-5-2")
    private String hf_6_5_2;
    @JSONField(name="HF-6-5-2-1")
    private String hf_6_5_2_1;
    @JSONField(name="HF-7-1-1")
    private String hf_7_1_1;
    @JSONField(name="HF-7-1-2")
    private String hf_7_1_2;
    @JSONField(name="HF-7-1-2-1")
    private String hf_7_1_2_1;
    @JSONField(name="HF-7-2-1")
    private String hf_7_2_1;
    @JSONField(name="HF-7-2-2")
    private String hf_7_2_2;
    @JSONField(name="HF-7-2-2-A")
    private String hf_7_2_2_a;
    @JSONField(name="HF-7-2-2-A-1")
    private String hf_7_2_2_a_1;
    @JSONField(name="HF-7-2-2-B")
    private String hf_7_2_2_b;
    @JSONField(name="HF-7-2-2-B-1")
    private String hf_7_2_2_b_1;
    @JSONField(name="HF-7-2-2-C")
    private String hf_7_2_2_c;
    @JSONField(name="HF-7-2-2-C-1")
    private String hf_7_2_2_c_1;
    @JSONField(name="HF-7-3-1")
    private String hf_7_3_1;
    @JSONField(name="HF-7-3-2")
    private String hf_7_3_2;
    @JSONField(name="HF-7-3-2-1")
    private String hf_7_3_2_1;
    @JSONField(name="HF-7-4-1")
    private String hf_7_4_1;
    @JSONField(name="HF-7-4-2")
    private String hf_7_4_2;
    @JSONField(name="HF-7-4-2-1")
    private String hf_7_4_2_1;
    @JSONField(name="HF-7-5-1")
    private String hf_7_5_1;
    @JSONField(name="HF-7-5-2")
    private String hf_7_5_2;
    @JSONField(name="HF-7-5-2-1")
    private String hf_7_5_2_1;
    @JSONField(name="CM-4-3")
    private String cm_4_3;
    @JSONField(name="CM-4-5")
    private String cm_4_5;
    @JSONField(name="CM-4-4-1")
    private String cm_4_4_1;
    @JSONField(name="CM-4-6")
    private String cm_4_6;
    @JSONField(name="HF-8-1-1")
    private String hf_8_1_1;
    @JSONField(name="HF-8-1-2")
    private List<String> hf_8_1_2;
    @JSONField(name="HF-8-1-3")
    private List<String> hf_8_1_3;
    @JSONField(name="HF-8-2-1-A")
    private List<String> hf_8_2_1_a;
    @JSONField(name="HF-8-2-1-B")
    private List<String> hf_8_2_1_b;
    @JSONField(name="HF-8-2-2")
    private String hf_8_2_2;
    @JSONField(name="HF-8-3")
    private List<String> hf_8_3;
    @JSONField(name="HF-8-4-1")
    private List<String> hf_8_4_1;
    @JSONField(name="HF-8-4-2")
    private List<String> hf_8_4_2;
    @JSONField(name="HF-8-4-3")
    private String hf_8_4_3;
    @JSONField(name="HF-8-4-4")
    private List<String> hf_8_4_4;
    @JSONField(name="HF-8-4-5")
    private String hf_8_4_5;
    @JSONField(name="HF-9-2-1-1")
    private String hf_9_2_1_1;
    @JSONField(name="HF-9-2-1-2")
    private String hf_9_2_1_2;
    @JSONField(name="HF-9-2-2-1")
    private String hf_9_2_2_1;
    @JSONField(name="HF-9-2-2-2-4")
    private Double hf_9_2_2_2_4;
    @JSONField(name="HF-9-2-2-2-1")
    private Double hf_9_2_2_2_1;
    @JSONField(name="HF-9-2-2-2-2")
    private String hf_9_2_2_2_2;
    @JSONField(name="HF-9-2-2-2-3")
    private String hf_9_2_2_2_3;
    @JSONField(name="HF-9-2-3-1")
    private String hf_9_2_3_1;
    @JSONField(name="HF-9-2-3-2-AB")
    private String hf_9_2_3_2_ab;
    @JSONField(name="HF-9-2-3-2")
    private String hf_9_2_3_2;
    @JSONField(name="HF-9-2-3-3")
    private String hf_9_2_3_3;
    @JSONField(name="HF-9-2-4-1")
    private String hf_9_2_4_1;
    @JSONField(name="HF-9-2-4-2")
    private List<String> hf_9_2_4_2;
    @JSONField(name="HF-9-2-4-2-1")
    private Double hf_9_2_4_2_1;
    @JSONField(name="HF-9-2-4-2-2")
    private Double hf_9_2_4_2_2;
    @JSONField(name="HF-9-2-4-2-3")
    private Double hf_9_2_4_2_3;
    @JSONField(name="HF-9-2-4-2-4")
    private Double hf_9_2_4_2_4;
    @JSONField(name="HF-9-2-4-2-5")
    private Double hf_9_2_4_2_5;
    @JSONField(name="HF-9-2-4-2-6")
    private Double hf_9_2_4_2_6;
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
    @JSONField(name="HF-11-4-1")
    private String hf_11_4_1;
    @JSONField(name="HF-11-1-1")
    private String hf_11_1_1;
    @JSONField(name="HF-11-1-2")
    private String hf_11_1_2;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-11-1-3")
    private Date hf_11_1_3;
    @JSONField(name="HF-11-1-4-1")
    private String hf_11_1_4_1;
    @JSONField(name="HF-11-1-4-2")
    private String hf_11_1_4_2;
    @JSONField(name="HF-11-1-4-3")
    private Double hf_11_1_4_3;
    @JSONField(name="HF-11-5-1")
    private String hf_11_5_1;
    @JSONField(name="HF-11-5-2")
    private String hf_11_5_2;
    @JSONField(name="HF-11-5-4")
    private String hf_11_5_4;
    @JSONField(name="HF-11-5-3")
    private String hf_11_5_3;
    @JSONField(name="HF-11-5-3-1")
    private String hf_11_5_3_1;
    @JSONField(name="HF-11-5-3-2")
    private String hf_11_5_3_2;
    @JSONField(name="HF-11-2-2")
    private String hf_11_2_2;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-11-2-3")
    private Date hf_11_2_3;
    @JSONField(name="HF-11-2-4-1")
    private String hf_11_2_4_1;
    @JSONField(name="HF-11-2-4-2")
    private String hf_11_2_4_2;
    @JSONField(name="HF-11-2-5")
    private Double hf_11_2_5;
    @JSONField(name="HF-11-3-1")
    private String hf_11_3_1;
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

    public String getHf_0_1_4_1() {
        return hf_0_1_4_1;
    }

    public void setHf_0_1_4_1(String hf_0_1_4_1) {
        this.hf_0_1_4_1 = hf_0_1_4_1;
    }

    public String getHf_0_1_4_2() {
        return hf_0_1_4_2;
    }

    public void setHf_0_1_4_2(String hf_0_1_4_2) {
        this.hf_0_1_4_2 = hf_0_1_4_2;
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

    public String getCm_0_2_2_1() {
        return cm_0_2_2_1;
    }

    public void setCm_0_2_2_1(String cm_0_2_2_1) {
        this.cm_0_2_2_1 = cm_0_2_2_1;
    }

    public Date getCm_0_2_2_2() {
        return cm_0_2_2_2;
    }

    public void setCm_0_2_2_2(Date cm_0_2_2_2) {
        this.cm_0_2_2_2 = cm_0_2_2_2;
    }

    public String getCm_0_2_3_1() {
        return cm_0_2_3_1;
    }

    public void setCm_0_2_3_1(String cm_0_2_3_1) {
        this.cm_0_2_3_1 = cm_0_2_3_1;
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

    public Date getCm_0_2_6_1() {
        return cm_0_2_6_1;
    }

    public void setCm_0_2_6_1(Date cm_0_2_6_1) {
        this.cm_0_2_6_1 = cm_0_2_6_1;
    }

    public Date getCm_0_2_6_2() {
        return cm_0_2_6_2;
    }

    public void setCm_0_2_6_2(Date cm_0_2_6_2) {
        this.cm_0_2_6_2 = cm_0_2_6_2;
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

    public String getHf_1_1_1() {
        return hf_1_1_1;
    }

    public void setHf_1_1_1(String hf_1_1_1) {
        this.hf_1_1_1 = hf_1_1_1;
    }

    public Date getHf_1_1_2() {
        return hf_1_1_2;
    }

    public void setHf_1_1_2(Date hf_1_1_2) {
        this.hf_1_1_2 = hf_1_1_2;
    }

    public String getHf_1_1_3() {
        return hf_1_1_3;
    }

    public void setHf_1_1_3(String hf_1_1_3) {
        this.hf_1_1_3 = hf_1_1_3;
    }

    public String getHf_1_2_1() {
        return hf_1_2_1;
    }

    public void setHf_1_2_1(String hf_1_2_1) {
        this.hf_1_2_1 = hf_1_2_1;
    }

    public Date getHf_1_2_2() {
        return hf_1_2_2;
    }

    public void setHf_1_2_2(Date hf_1_2_2) {
        this.hf_1_2_2 = hf_1_2_2;
    }

    public Double getHf_1_2_3_4() {
        return hf_1_2_3_4;
    }

    public void setHf_1_2_3_4(Double hf_1_2_3_4) {
        this.hf_1_2_3_4 = hf_1_2_3_4;
    }

    public Double getHf_1_2_3_1() {
        return hf_1_2_3_1;
    }

    public void setHf_1_2_3_1(Double hf_1_2_3_1) {
        this.hf_1_2_3_1 = hf_1_2_3_1;
    }

    public String getHf_1_2_3_2() {
        return hf_1_2_3_2;
    }

    public void setHf_1_2_3_2(String hf_1_2_3_2) {
        this.hf_1_2_3_2 = hf_1_2_3_2;
    }

    public String getHf_1_2_3_3() {
        return hf_1_2_3_3;
    }

    public void setHf_1_2_3_3(String hf_1_2_3_3) {
        this.hf_1_2_3_3 = hf_1_2_3_3;
    }

    public String getHf_1_3_1() {
        return hf_1_3_1;
    }

    public void setHf_1_3_1(String hf_1_3_1) {
        this.hf_1_3_1 = hf_1_3_1;
    }

    public String getHf_1_3_3() {
        return hf_1_3_3;
    }

    public void setHf_1_3_3(String hf_1_3_3) {
        this.hf_1_3_3 = hf_1_3_3;
    }

    public String getHf_1_3_2() {
        return hf_1_3_2;
    }

    public void setHf_1_3_2(String hf_1_3_2) {
        this.hf_1_3_2 = hf_1_3_2;
    }

    public String getHf_1_3_5() {
        return hf_1_3_5;
    }

    public void setHf_1_3_5(String hf_1_3_5) {
        this.hf_1_3_5 = hf_1_3_5;
    }

    public String getHf_1_3_6_1() {
        return hf_1_3_6_1;
    }

    public void setHf_1_3_6_1(String hf_1_3_6_1) {
        this.hf_1_3_6_1 = hf_1_3_6_1;
    }

    public Double getHf_1_3_6_2() {
        return hf_1_3_6_2;
    }

    public void setHf_1_3_6_2(Double hf_1_3_6_2) {
        this.hf_1_3_6_2 = hf_1_3_6_2;
    }

    public String getHf_1_3_6_3() {
        return hf_1_3_6_3;
    }

    public void setHf_1_3_6_3(String hf_1_3_6_3) {
        this.hf_1_3_6_3 = hf_1_3_6_3;
    }

    public String getHf_1_4_1() {
        return hf_1_4_1;
    }

    public void setHf_1_4_1(String hf_1_4_1) {
        this.hf_1_4_1 = hf_1_4_1;
    }

    public Date getHf_1_4_2() {
        return hf_1_4_2;
    }

    public void setHf_1_4_2(Date hf_1_4_2) {
        this.hf_1_4_2 = hf_1_4_2;
    }

    public Double getHf_1_4_3() {
        return hf_1_4_3;
    }

    public void setHf_1_4_3(Double hf_1_4_3) {
        this.hf_1_4_3 = hf_1_4_3;
    }

    public List<String> getHf_1_4_4() {
        return hf_1_4_4;
    }

    public void setHf_1_4_4(List<String> hf_1_4_4) {
        this.hf_1_4_4 = hf_1_4_4;
    }

    public String getHf_1_4_4_1() {
        return hf_1_4_4_1;
    }

    public void setHf_1_4_4_1(String hf_1_4_4_1) {
        this.hf_1_4_4_1 = hf_1_4_4_1;
    }

    public String getHf_1_5_1_1() {
        return hf_1_5_1_1;
    }

    public void setHf_1_5_1_1(String hf_1_5_1_1) {
        this.hf_1_5_1_1 = hf_1_5_1_1;
    }

    public Date getHf_1_5_1_2() {
        return hf_1_5_1_2;
    }

    public void setHf_1_5_1_2(Date hf_1_5_1_2) {
        this.hf_1_5_1_2 = hf_1_5_1_2;
    }

    public List<String> getHf_1_5_3() {
        return hf_1_5_3;
    }

    public void setHf_1_5_3(List<String> hf_1_5_3) {
        this.hf_1_5_3 = hf_1_5_3;
    }

    public Double getHf_1_5_2_1() {
        return hf_1_5_2_1;
    }

    public void setHf_1_5_2_1(Double hf_1_5_2_1) {
        this.hf_1_5_2_1 = hf_1_5_2_1;
    }

    public Double getHf_1_5_2_2() {
        return hf_1_5_2_2;
    }

    public void setHf_1_5_2_2(Double hf_1_5_2_2) {
        this.hf_1_5_2_2 = hf_1_5_2_2;
    }

    public Double getHf_1_5_2_3() {
        return hf_1_5_2_3;
    }

    public void setHf_1_5_2_3(Double hf_1_5_2_3) {
        this.hf_1_5_2_3 = hf_1_5_2_3;
    }

    public Double getHf_1_5_2_4() {
        return hf_1_5_2_4;
    }

    public void setHf_1_5_2_4(Double hf_1_5_2_4) {
        this.hf_1_5_2_4 = hf_1_5_2_4;
    }

    public Double getHf_1_5_2_5() {
        return hf_1_5_2_5;
    }

    public void setHf_1_5_2_5(Double hf_1_5_2_5) {
        this.hf_1_5_2_5 = hf_1_5_2_5;
    }

    public Double getHf_1_5_2_6() {
        return hf_1_5_2_6;
    }

    public void setHf_1_5_2_6(Double hf_1_5_2_6) {
        this.hf_1_5_2_6 = hf_1_5_2_6;
    }

    public String getHf_2_1_a() {
        return hf_2_1_a;
    }

    public void setHf_2_1_a(String hf_2_1_a) {
        this.hf_2_1_a = hf_2_1_a;
    }

    public String getHf_2_1() {
        return hf_2_1;
    }

    public void setHf_2_1(String hf_2_1) {
        this.hf_2_1 = hf_2_1;
    }

    public String getHf_2_1_1() {
        return hf_2_1_1;
    }

    public void setHf_2_1_1(String hf_2_1_1) {
        this.hf_2_1_1 = hf_2_1_1;
    }

    public Date getHf_2_2() {
        return hf_2_2;
    }

    public void setHf_2_2(Date hf_2_2) {
        this.hf_2_2 = hf_2_2;
    }

    public String getHf_2_3() {
        return hf_2_3;
    }

    public void setHf_2_3(String hf_2_3) {
        this.hf_2_3 = hf_2_3;
    }

    public String getHf_2_3_1() {
        return hf_2_3_1;
    }

    public void setHf_2_3_1(String hf_2_3_1) {
        this.hf_2_3_1 = hf_2_3_1;
    }

    public String getHf_2_5() {
        return hf_2_5;
    }

    public void setHf_2_5(String hf_2_5) {
        this.hf_2_5 = hf_2_5;
    }

    public String getHf_2_4() {
        return hf_2_4;
    }

    public void setHf_2_4(String hf_2_4) {
        this.hf_2_4 = hf_2_4;
    }

    public String getHf_2_4_1() {
        return hf_2_4_1;
    }

    public void setHf_2_4_1(String hf_2_4_1) {
        this.hf_2_4_1 = hf_2_4_1;
    }

    public String getHf_3_1() {
        return hf_3_1;
    }

    public void setHf_3_1(String hf_3_1) {
        this.hf_3_1 = hf_3_1;
    }

    public String getHf_3_2_a() {
        return hf_3_2_a;
    }

    public void setHf_3_2_a(String hf_3_2_a) {
        this.hf_3_2_a = hf_3_2_a;
    }

    public List<String> getHf_3_2_1() {
        return hf_3_2_1;
    }

    public void setHf_3_2_1(List<String> hf_3_2_1) {
        this.hf_3_2_1 = hf_3_2_1;
    }

    public String getHf_3_4_a() {
        return hf_3_4_a;
    }

    public void setHf_3_4_a(String hf_3_4_a) {
        this.hf_3_4_a = hf_3_4_a;
    }

    public String getHf_3_4_a_1() {
        return hf_3_4_a_1;
    }

    public void setHf_3_4_a_1(String hf_3_4_a_1) {
        this.hf_3_4_a_1 = hf_3_4_a_1;
    }

    public String getHf_3_4_b() {
        return hf_3_4_b;
    }

    public void setHf_3_4_b(String hf_3_4_b) {
        this.hf_3_4_b = hf_3_4_b;
    }

    public String getHf_3_4_b_1() {
        return hf_3_4_b_1;
    }

    public void setHf_3_4_b_1(String hf_3_4_b_1) {
        this.hf_3_4_b_1 = hf_3_4_b_1;
    }

    public String getHf_3_2_b() {
        return hf_3_2_b;
    }

    public void setHf_3_2_b(String hf_3_2_b) {
        this.hf_3_2_b = hf_3_2_b;
    }

    public String getHf_3_2_2() {
        return hf_3_2_2;
    }

    public void setHf_3_2_2(String hf_3_2_2) {
        this.hf_3_2_2 = hf_3_2_2;
    }

    public String getHf_3_4_c() {
        return hf_3_4_c;
    }

    public void setHf_3_4_c(String hf_3_4_c) {
        this.hf_3_4_c = hf_3_4_c;
    }

    public String getHf_3_4_c_1() {
        return hf_3_4_c_1;
    }

    public void setHf_3_4_c_1(String hf_3_4_c_1) {
        this.hf_3_4_c_1 = hf_3_4_c_1;
    }

    public String getHf_3_3_1() {
        return hf_3_3_1;
    }

    public void setHf_3_3_1(String hf_3_3_1) {
        this.hf_3_3_1 = hf_3_3_1;
    }

    public Date getHf_3_3() {
        return hf_3_3;
    }

    public void setHf_3_3(Date hf_3_3) {
        this.hf_3_3 = hf_3_3;
    }

    public String getHf_3_6() {
        return hf_3_6;
    }

    public void setHf_3_6(String hf_3_6) {
        this.hf_3_6 = hf_3_6;
    }

    public String getHf_3_5() {
        return hf_3_5;
    }

    public void setHf_3_5(String hf_3_5) {
        this.hf_3_5 = hf_3_5;
    }

    public String getHf_3_5_1() {
        return hf_3_5_1;
    }

    public void setHf_3_5_1(String hf_3_5_1) {
        this.hf_3_5_1 = hf_3_5_1;
    }

    public String getHf_4_1_1() {
        return hf_4_1_1;
    }

    public void setHf_4_1_1(String hf_4_1_1) {
        this.hf_4_1_1 = hf_4_1_1;
    }

    public List<String> getHf_4_1_2() {
        return hf_4_1_2;
    }

    public void setHf_4_1_2(List<String> hf_4_1_2) {
        this.hf_4_1_2 = hf_4_1_2;
    }

    public String getHf_4_3() {
        return hf_4_3;
    }

    public void setHf_4_3(String hf_4_3) {
        this.hf_4_3 = hf_4_3;
    }

    public String getHf_4_3_1() {
        return hf_4_3_1;
    }

    public void setHf_4_3_1(String hf_4_3_1) {
        this.hf_4_3_1 = hf_4_3_1;
    }

    public String getHf_4_2_1() {
        return hf_4_2_1;
    }

    public void setHf_4_2_1(String hf_4_2_1) {
        this.hf_4_2_1 = hf_4_2_1;
    }

    public Date getHf_4_2() {
        return hf_4_2;
    }

    public void setHf_4_2(Date hf_4_2) {
        this.hf_4_2 = hf_4_2;
    }

    public String getHf_4_5() {
        return hf_4_5;
    }

    public void setHf_4_5(String hf_4_5) {
        this.hf_4_5 = hf_4_5;
    }

    public String getHf_4_4() {
        return hf_4_4;
    }

    public void setHf_4_4(String hf_4_4) {
        this.hf_4_4 = hf_4_4;
    }

    public String getHf_4_4_1() {
        return hf_4_4_1;
    }

    public void setHf_4_4_1(String hf_4_4_1) {
        this.hf_4_4_1 = hf_4_4_1;
    }

    public String getHf_5_1_1() {
        return hf_5_1_1;
    }

    public void setHf_5_1_1(String hf_5_1_1) {
        this.hf_5_1_1 = hf_5_1_1;
    }

    public List<String> getHf_5_1_2() {
        return hf_5_1_2;
    }

    public void setHf_5_1_2(List<String> hf_5_1_2) {
        this.hf_5_1_2 = hf_5_1_2;
    }

    public String getHf_5_2() {
        return hf_5_2;
    }

    public void setHf_5_2(String hf_5_2) {
        this.hf_5_2 = hf_5_2;
    }

    public String getHf_5_2_1_1() {
        return hf_5_2_1_1;
    }

    public void setHf_5_2_1_1(String hf_5_2_1_1) {
        this.hf_5_2_1_1 = hf_5_2_1_1;
    }

    public String getHf_5_3_1() {
        return hf_5_3_1;
    }

    public void setHf_5_3_1(String hf_5_3_1) {
        this.hf_5_3_1 = hf_5_3_1;
    }

    public Date getHf_5_3() {
        return hf_5_3;
    }

    public void setHf_5_3(Date hf_5_3) {
        this.hf_5_3 = hf_5_3;
    }

    public String getHf_5_6() {
        return hf_5_6;
    }

    public void setHf_5_6(String hf_5_6) {
        this.hf_5_6 = hf_5_6;
    }

    public String getHf_5_4() {
        return hf_5_4;
    }

    public void setHf_5_4(String hf_5_4) {
        this.hf_5_4 = hf_5_4;
    }

    public String getHf_5_4_1() {
        return hf_5_4_1;
    }

    public void setHf_5_4_1(String hf_5_4_1) {
        this.hf_5_4_1 = hf_5_4_1;
    }

    public String getHf_5_5() {
        return hf_5_5;
    }

    public void setHf_5_5(String hf_5_5) {
        this.hf_5_5 = hf_5_5;
    }

    public String getHf_5_5_1() {
        return hf_5_5_1;
    }

    public void setHf_5_5_1(String hf_5_5_1) {
        this.hf_5_5_1 = hf_5_5_1;
    }

    public String getHf_6_1_1() {
        return hf_6_1_1;
    }

    public void setHf_6_1_1(String hf_6_1_1) {
        this.hf_6_1_1 = hf_6_1_1;
    }

    public String getHf_6_1_2() {
        return hf_6_1_2;
    }

    public void setHf_6_1_2(String hf_6_1_2) {
        this.hf_6_1_2 = hf_6_1_2;
    }

    public String getHf_6_1_2_1() {
        return hf_6_1_2_1;
    }

    public void setHf_6_1_2_1(String hf_6_1_2_1) {
        this.hf_6_1_2_1 = hf_6_1_2_1;
    }

    public String getHf_6_2_1() {
        return hf_6_2_1;
    }

    public void setHf_6_2_1(String hf_6_2_1) {
        this.hf_6_2_1 = hf_6_2_1;
    }

    public String getHf_6_2_2() {
        return hf_6_2_2;
    }

    public void setHf_6_2_2(String hf_6_2_2) {
        this.hf_6_2_2 = hf_6_2_2;
    }

    public String getHf_6_2_2_a() {
        return hf_6_2_2_a;
    }

    public void setHf_6_2_2_a(String hf_6_2_2_a) {
        this.hf_6_2_2_a = hf_6_2_2_a;
    }

    public String getHf_6_2_2_a_1() {
        return hf_6_2_2_a_1;
    }

    public void setHf_6_2_2_a_1(String hf_6_2_2_a_1) {
        this.hf_6_2_2_a_1 = hf_6_2_2_a_1;
    }

    public String getHf_6_2_2_b() {
        return hf_6_2_2_b;
    }

    public void setHf_6_2_2_b(String hf_6_2_2_b) {
        this.hf_6_2_2_b = hf_6_2_2_b;
    }

    public String getHf_6_2_2_b_1() {
        return hf_6_2_2_b_1;
    }

    public void setHf_6_2_2_b_1(String hf_6_2_2_b_1) {
        this.hf_6_2_2_b_1 = hf_6_2_2_b_1;
    }

    public String getHf_6_2_2_c() {
        return hf_6_2_2_c;
    }

    public void setHf_6_2_2_c(String hf_6_2_2_c) {
        this.hf_6_2_2_c = hf_6_2_2_c;
    }

    public String getHf_6_2_2_c_1() {
        return hf_6_2_2_c_1;
    }

    public void setHf_6_2_2_c_1(String hf_6_2_2_c_1) {
        this.hf_6_2_2_c_1 = hf_6_2_2_c_1;
    }

    public String getHf_6_3_1() {
        return hf_6_3_1;
    }

    public void setHf_6_3_1(String hf_6_3_1) {
        this.hf_6_3_1 = hf_6_3_1;
    }

    public String getHf_6_3_2() {
        return hf_6_3_2;
    }

    public void setHf_6_3_2(String hf_6_3_2) {
        this.hf_6_3_2 = hf_6_3_2;
    }

    public String getHf_6_3_2_1() {
        return hf_6_3_2_1;
    }

    public void setHf_6_3_2_1(String hf_6_3_2_1) {
        this.hf_6_3_2_1 = hf_6_3_2_1;
    }

    public String getHf_6_4_1() {
        return hf_6_4_1;
    }

    public void setHf_6_4_1(String hf_6_4_1) {
        this.hf_6_4_1 = hf_6_4_1;
    }

    public String getHf_6_4_2() {
        return hf_6_4_2;
    }

    public void setHf_6_4_2(String hf_6_4_2) {
        this.hf_6_4_2 = hf_6_4_2;
    }

    public String getHf_6_4_2_1() {
        return hf_6_4_2_1;
    }

    public void setHf_6_4_2_1(String hf_6_4_2_1) {
        this.hf_6_4_2_1 = hf_6_4_2_1;
    }

    public String getHf_6_5_1() {
        return hf_6_5_1;
    }

    public void setHf_6_5_1(String hf_6_5_1) {
        this.hf_6_5_1 = hf_6_5_1;
    }

    public String getHf_6_5_2() {
        return hf_6_5_2;
    }

    public void setHf_6_5_2(String hf_6_5_2) {
        this.hf_6_5_2 = hf_6_5_2;
    }

    public String getHf_6_5_2_1() {
        return hf_6_5_2_1;
    }

    public void setHf_6_5_2_1(String hf_6_5_2_1) {
        this.hf_6_5_2_1 = hf_6_5_2_1;
    }

    public String getHf_7_1_1() {
        return hf_7_1_1;
    }

    public void setHf_7_1_1(String hf_7_1_1) {
        this.hf_7_1_1 = hf_7_1_1;
    }

    public String getHf_7_1_2() {
        return hf_7_1_2;
    }

    public void setHf_7_1_2(String hf_7_1_2) {
        this.hf_7_1_2 = hf_7_1_2;
    }

    public String getHf_7_1_2_1() {
        return hf_7_1_2_1;
    }

    public void setHf_7_1_2_1(String hf_7_1_2_1) {
        this.hf_7_1_2_1 = hf_7_1_2_1;
    }

    public String getHf_7_2_1() {
        return hf_7_2_1;
    }

    public void setHf_7_2_1(String hf_7_2_1) {
        this.hf_7_2_1 = hf_7_2_1;
    }

    public String getHf_7_2_2() {
        return hf_7_2_2;
    }

    public void setHf_7_2_2(String hf_7_2_2) {
        this.hf_7_2_2 = hf_7_2_2;
    }

    public String getHf_7_2_2_a() {
        return hf_7_2_2_a;
    }

    public void setHf_7_2_2_a(String hf_7_2_2_a) {
        this.hf_7_2_2_a = hf_7_2_2_a;
    }

    public String getHf_7_2_2_a_1() {
        return hf_7_2_2_a_1;
    }

    public void setHf_7_2_2_a_1(String hf_7_2_2_a_1) {
        this.hf_7_2_2_a_1 = hf_7_2_2_a_1;
    }

    public String getHf_7_2_2_b() {
        return hf_7_2_2_b;
    }

    public void setHf_7_2_2_b(String hf_7_2_2_b) {
        this.hf_7_2_2_b = hf_7_2_2_b;
    }

    public String getHf_7_2_2_b_1() {
        return hf_7_2_2_b_1;
    }

    public void setHf_7_2_2_b_1(String hf_7_2_2_b_1) {
        this.hf_7_2_2_b_1 = hf_7_2_2_b_1;
    }

    public String getHf_7_2_2_c() {
        return hf_7_2_2_c;
    }

    public void setHf_7_2_2_c(String hf_7_2_2_c) {
        this.hf_7_2_2_c = hf_7_2_2_c;
    }

    public String getHf_7_2_2_c_1() {
        return hf_7_2_2_c_1;
    }

    public void setHf_7_2_2_c_1(String hf_7_2_2_c_1) {
        this.hf_7_2_2_c_1 = hf_7_2_2_c_1;
    }

    public String getHf_7_3_1() {
        return hf_7_3_1;
    }

    public void setHf_7_3_1(String hf_7_3_1) {
        this.hf_7_3_1 = hf_7_3_1;
    }

    public String getHf_7_3_2() {
        return hf_7_3_2;
    }

    public void setHf_7_3_2(String hf_7_3_2) {
        this.hf_7_3_2 = hf_7_3_2;
    }

    public String getHf_7_3_2_1() {
        return hf_7_3_2_1;
    }

    public void setHf_7_3_2_1(String hf_7_3_2_1) {
        this.hf_7_3_2_1 = hf_7_3_2_1;
    }

    public String getHf_7_4_1() {
        return hf_7_4_1;
    }

    public void setHf_7_4_1(String hf_7_4_1) {
        this.hf_7_4_1 = hf_7_4_1;
    }

    public String getHf_7_4_2() {
        return hf_7_4_2;
    }

    public void setHf_7_4_2(String hf_7_4_2) {
        this.hf_7_4_2 = hf_7_4_2;
    }

    public String getHf_7_4_2_1() {
        return hf_7_4_2_1;
    }

    public void setHf_7_4_2_1(String hf_7_4_2_1) {
        this.hf_7_4_2_1 = hf_7_4_2_1;
    }

    public String getHf_7_5_1() {
        return hf_7_5_1;
    }

    public void setHf_7_5_1(String hf_7_5_1) {
        this.hf_7_5_1 = hf_7_5_1;
    }

    public String getHf_7_5_2() {
        return hf_7_5_2;
    }

    public void setHf_7_5_2(String hf_7_5_2) {
        this.hf_7_5_2 = hf_7_5_2;
    }

    public String getHf_7_5_2_1() {
        return hf_7_5_2_1;
    }

    public void setHf_7_5_2_1(String hf_7_5_2_1) {
        this.hf_7_5_2_1 = hf_7_5_2_1;
    }

    public String getCm_4_3() {
        return cm_4_3;
    }

    public void setCm_4_3(String cm_4_3) {
        this.cm_4_3 = cm_4_3;
    }

    public String getCm_4_5() {
        return cm_4_5;
    }

    public void setCm_4_5(String cm_4_5) {
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

    public String getHf_8_1_1() {
        return hf_8_1_1;
    }

    public void setHf_8_1_1(String hf_8_1_1) {
        this.hf_8_1_1 = hf_8_1_1;
    }

    public List<String> getHf_8_1_2() {
        return hf_8_1_2;
    }

    public void setHf_8_1_2(List<String> hf_8_1_2) {
        this.hf_8_1_2 = hf_8_1_2;
    }

    public List<String> getHf_8_1_3() {
        return hf_8_1_3;
    }

    public void setHf_8_1_3(List<String> hf_8_1_3) {
        this.hf_8_1_3 = hf_8_1_3;
    }

    public List<String> getHf_8_2_1_a() {
        return hf_8_2_1_a;
    }

    public void setHf_8_2_1_a(List<String> hf_8_2_1_a) {
        this.hf_8_2_1_a = hf_8_2_1_a;
    }

    public List<String> getHf_8_2_1_b() {
        return hf_8_2_1_b;
    }

    public void setHf_8_2_1_b(List<String> hf_8_2_1_b) {
        this.hf_8_2_1_b = hf_8_2_1_b;
    }

    public String getHf_8_2_2() {
        return hf_8_2_2;
    }

    public void setHf_8_2_2(String hf_8_2_2) {
        this.hf_8_2_2 = hf_8_2_2;
    }

    public List<String> getHf_8_3() {
        return hf_8_3;
    }

    public void setHf_8_3(List<String> hf_8_3) {
        this.hf_8_3 = hf_8_3;
    }

    public List<String> getHf_8_4_1() {
        return hf_8_4_1;
    }

    public void setHf_8_4_1(List<String> hf_8_4_1) {
        this.hf_8_4_1 = hf_8_4_1;
    }

    public List<String> getHf_8_4_2() {
        return hf_8_4_2;
    }

    public void setHf_8_4_2(List<String> hf_8_4_2) {
        this.hf_8_4_2 = hf_8_4_2;
    }

    public String getHf_8_4_3() {
        return hf_8_4_3;
    }

    public void setHf_8_4_3(String hf_8_4_3) {
        this.hf_8_4_3 = hf_8_4_3;
    }

    public List<String> getHf_8_4_4() {
        return hf_8_4_4;
    }

    public void setHf_8_4_4(List<String> hf_8_4_4) {
        this.hf_8_4_4 = hf_8_4_4;
    }

    public String getHf_8_4_5() {
        return hf_8_4_5;
    }

    public void setHf_8_4_5(String hf_8_4_5) {
        this.hf_8_4_5 = hf_8_4_5;
    }

    public String getHf_9_2_1_1() {
        return hf_9_2_1_1;
    }

    public void setHf_9_2_1_1(String hf_9_2_1_1) {
        this.hf_9_2_1_1 = hf_9_2_1_1;
    }

    public String getHf_9_2_1_2() {
        return hf_9_2_1_2;
    }

    public void setHf_9_2_1_2(String hf_9_2_1_2) {
        this.hf_9_2_1_2 = hf_9_2_1_2;
    }

    public String getHf_9_2_2_1() {
        return hf_9_2_2_1;
    }

    public void setHf_9_2_2_1(String hf_9_2_2_1) {
        this.hf_9_2_2_1 = hf_9_2_2_1;
    }

    public Double getHf_9_2_2_2_4() {
        return hf_9_2_2_2_4;
    }

    public void setHf_9_2_2_2_4(Double hf_9_2_2_2_4) {
        this.hf_9_2_2_2_4 = hf_9_2_2_2_4;
    }

    public Double getHf_9_2_2_2_1() {
        return hf_9_2_2_2_1;
    }

    public void setHf_9_2_2_2_1(Double hf_9_2_2_2_1) {
        this.hf_9_2_2_2_1 = hf_9_2_2_2_1;
    }

    public String getHf_9_2_2_2_2() {
        return hf_9_2_2_2_2;
    }

    public void setHf_9_2_2_2_2(String hf_9_2_2_2_2) {
        this.hf_9_2_2_2_2 = hf_9_2_2_2_2;
    }

    public String getHf_9_2_2_2_3() {
        return hf_9_2_2_2_3;
    }

    public void setHf_9_2_2_2_3(String hf_9_2_2_2_3) {
        this.hf_9_2_2_2_3 = hf_9_2_2_2_3;
    }

    public String getHf_9_2_3_1() {
        return hf_9_2_3_1;
    }

    public void setHf_9_2_3_1(String hf_9_2_3_1) {
        this.hf_9_2_3_1 = hf_9_2_3_1;
    }

    public String getHf_9_2_3_2_ab() {
        return hf_9_2_3_2_ab;
    }

    public void setHf_9_2_3_2_ab(String hf_9_2_3_2_ab) {
        this.hf_9_2_3_2_ab = hf_9_2_3_2_ab;
    }

    public String getHf_9_2_3_2() {
        return hf_9_2_3_2;
    }

    public void setHf_9_2_3_2(String hf_9_2_3_2) {
        this.hf_9_2_3_2 = hf_9_2_3_2;
    }

    public String getHf_9_2_3_3() {
        return hf_9_2_3_3;
    }

    public void setHf_9_2_3_3(String hf_9_2_3_3) {
        this.hf_9_2_3_3 = hf_9_2_3_3;
    }

    public String getHf_9_2_4_1() {
        return hf_9_2_4_1;
    }

    public void setHf_9_2_4_1(String hf_9_2_4_1) {
        this.hf_9_2_4_1 = hf_9_2_4_1;
    }

    public List<String> getHf_9_2_4_2() {
        return hf_9_2_4_2;
    }

    public void setHf_9_2_4_2(List<String> hf_9_2_4_2) {
        this.hf_9_2_4_2 = hf_9_2_4_2;
    }

    public Double getHf_9_2_4_2_1() {
        return hf_9_2_4_2_1;
    }

    public void setHf_9_2_4_2_1(Double hf_9_2_4_2_1) {
        this.hf_9_2_4_2_1 = hf_9_2_4_2_1;
    }

    public Double getHf_9_2_4_2_2() {
        return hf_9_2_4_2_2;
    }

    public void setHf_9_2_4_2_2(Double hf_9_2_4_2_2) {
        this.hf_9_2_4_2_2 = hf_9_2_4_2_2;
    }

    public Double getHf_9_2_4_2_3() {
        return hf_9_2_4_2_3;
    }

    public void setHf_9_2_4_2_3(Double hf_9_2_4_2_3) {
        this.hf_9_2_4_2_3 = hf_9_2_4_2_3;
    }

    public Double getHf_9_2_4_2_4() {
        return hf_9_2_4_2_4;
    }

    public void setHf_9_2_4_2_4(Double hf_9_2_4_2_4) {
        this.hf_9_2_4_2_4 = hf_9_2_4_2_4;
    }

    public Double getHf_9_2_4_2_5() {
        return hf_9_2_4_2_5;
    }

    public void setHf_9_2_4_2_5(Double hf_9_2_4_2_5) {
        this.hf_9_2_4_2_5 = hf_9_2_4_2_5;
    }

    public Double getHf_9_2_4_2_6() {
        return hf_9_2_4_2_6;
    }

    public void setHf_9_2_4_2_6(Double hf_9_2_4_2_6) {
        this.hf_9_2_4_2_6 = hf_9_2_4_2_6;
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

    public String getHf_11_4_1() {
        return hf_11_4_1;
    }

    public void setHf_11_4_1(String hf_11_4_1) {
        this.hf_11_4_1 = hf_11_4_1;
    }

    public String getHf_11_1_1() {
        return hf_11_1_1;
    }

    public void setHf_11_1_1(String hf_11_1_1) {
        this.hf_11_1_1 = hf_11_1_1;
    }

    public String getHf_11_1_2() {
        return hf_11_1_2;
    }

    public void setHf_11_1_2(String hf_11_1_2) {
        this.hf_11_1_2 = hf_11_1_2;
    }

    public Date getHf_11_1_3() {
        return hf_11_1_3;
    }

    public void setHf_11_1_3(Date hf_11_1_3) {
        this.hf_11_1_3 = hf_11_1_3;
    }

    public String getHf_11_1_4_1() {
        return hf_11_1_4_1;
    }

    public void setHf_11_1_4_1(String hf_11_1_4_1) {
        this.hf_11_1_4_1 = hf_11_1_4_1;
    }

    public String getHf_11_1_4_2() {
        return hf_11_1_4_2;
    }

    public void setHf_11_1_4_2(String hf_11_1_4_2) {
        this.hf_11_1_4_2 = hf_11_1_4_2;
    }

    public Double getHf_11_1_4_3() {
        return hf_11_1_4_3;
    }

    public void setHf_11_1_4_3(Double hf_11_1_4_3) {
        this.hf_11_1_4_3 = hf_11_1_4_3;
    }

    public String getHf_11_5_1() {
        return hf_11_5_1;
    }

    public void setHf_11_5_1(String hf_11_5_1) {
        this.hf_11_5_1 = hf_11_5_1;
    }

    public String getHf_11_5_2() {
        return hf_11_5_2;
    }

    public void setHf_11_5_2(String hf_11_5_2) {
        this.hf_11_5_2 = hf_11_5_2;
    }

    public String getHf_11_5_4() {
        return hf_11_5_4;
    }

    public void setHf_11_5_4(String hf_11_5_4) {
        this.hf_11_5_4 = hf_11_5_4;
    }

    public String getHf_11_5_3() {
        return hf_11_5_3;
    }

    public void setHf_11_5_3(String hf_11_5_3) {
        this.hf_11_5_3 = hf_11_5_3;
    }

    public String getHf_11_5_3_1() {
        return hf_11_5_3_1;
    }

    public void setHf_11_5_3_1(String hf_11_5_3_1) {
        this.hf_11_5_3_1 = hf_11_5_3_1;
    }

    public String getHf_11_5_3_2() {
        return hf_11_5_3_2;
    }

    public void setHf_11_5_3_2(String hf_11_5_3_2) {
        this.hf_11_5_3_2 = hf_11_5_3_2;
    }

    public String getHf_11_2_2() {
        return hf_11_2_2;
    }

    public void setHf_11_2_2(String hf_11_2_2) {
        this.hf_11_2_2 = hf_11_2_2;
    }

    public Date getHf_11_2_3() {
        return hf_11_2_3;
    }

    public void setHf_11_2_3(Date hf_11_2_3) {
        this.hf_11_2_3 = hf_11_2_3;
    }

    public String getHf_11_2_4_1() {
        return hf_11_2_4_1;
    }

    public void setHf_11_2_4_1(String hf_11_2_4_1) {
        this.hf_11_2_4_1 = hf_11_2_4_1;
    }

    public String getHf_11_2_4_2() {
        return hf_11_2_4_2;
    }

    public void setHf_11_2_4_2(String hf_11_2_4_2) {
        this.hf_11_2_4_2 = hf_11_2_4_2;
    }

    public Double getHf_11_2_5() {
        return hf_11_2_5;
    }

    public void setHf_11_2_5(Double hf_11_2_5) {
        this.hf_11_2_5 = hf_11_2_5;
    }

    public String getHf_11_3_1() {
        return hf_11_3_1;
    }

    public void setHf_11_3_1(String hf_11_3_1) {
        this.hf_11_3_1 = hf_11_3_1;
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
