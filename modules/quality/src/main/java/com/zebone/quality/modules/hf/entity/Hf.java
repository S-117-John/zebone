package com.zebone.quality.modules.hf.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.jeesite.common.web.annotation.JsonField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
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
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-1-1")
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
    private String hf_1_4_4;
    @JSONField(name="HF-1-4-4-1")
    private String hf_1_4_4_1;
    @JSONField(name="HF-1-5-1-1")
    private String hf_1_5_1_1;
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "HF-1-5-1-2")
    private Date hf_1_5_1_2;
    @JSONField(name="HF-1-5-3")
    private String hf_1_5_3;
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
    private String hf_3_2_1;
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
    private String hf_4_1_2;
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
    private String hf_5_1_2;
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
    private String hf_8_1_2;
    @JSONField(name="HF-8-1-3")
    private String hf_8_1_3;
    @JSONField(name="HF-8-2-1-A")
    private String hf_8_2_1_a;
    @JSONField(name="HF-8-2-1-B")
    private String hf_8_2_1_b;
    @JSONField(name="HF-8-2-2")
    private String hf_8_2_2;
    @JSONField(name="HF-8-3")
    private String hf_8_3;
    @JSONField(name="HF-8-4-1")
    private String hf_8_4_1;
    @JSONField(name="HF-8-4-2")
    private String hf_8_4_2;
    @JSONField(name="HF-8-4-3")
    private String hf_8_4_3;
    @JSONField(name="HF-8-4-4")
    private String hf_8_4_4;
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
    private String hf_9_2_4_2;
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


}
