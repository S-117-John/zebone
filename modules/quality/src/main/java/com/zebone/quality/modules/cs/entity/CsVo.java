package com.zebone.quality.modules.cs.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CsVo implements Serializable {

    @JSONField(name="CM-0-1-1-1")
    private String cm_0_1_1_1;		// 质控医师
    @JSONField(name="CM-0-1-1-2")
    private String cm_0_1_1_2;		// 质控护士
    @JSONField(name="CM-0-1-1-3")
    private String cm_0_1_1_3;		// 主治医师
    @JSONField(name="CM-0-1-1-4")
    private String cm_0_1_1_4;		// 责任护士
    @JSONField(name="CM-0-1-1-5")
    private String cm_0_1_1_5;		// 上报科室
    @JSONField(name="caseId")
    private String caseid;		// 患者病案号
    @JSONField(name="IDCard")
    private String idcard;		// 患者身份证号
    @JSONField(name="CM-0-1-3-1")
    private String cm_0_1_3_1;		// 出院诊断ICD-10四位亚目编码与名称
    @JSONField(name="CM-0-1-3-2")
    private String cm_0_1_3_2;		// 出院诊断ICD-10六位临床扩展编码与名称
    @JSONField(name="CM-0-1-4-1")
    private String cm_0_1_4_1;		// 主要手术操作 国家临床版ICD-9.CM-3编码与手术名称
    @JSONField(name="CM-0-1-5")
    private String cm_0_1_5;		// 是否出院后31天内重复住院
    @JSONField(format = "yyyy-MM-dd",name = "CM-0-2-1-1")
    private Date cm_0_2_1_1;		// 出生日期
    @JSONField(name="CM-0-2-1-3")
    private Double cm_0_2_1_3;		// 患者体重（kg）
    @JSONField(name="CM-0-2-1-5")
    private Double cm_0_2_1_5;		// 患者身高（cm）
    @JSONField(name="CM-0-2-1-6")
    private Double cm_0_2_1_6;		// 新生儿出生体重（克）
    @JSONField(name="cs-0-2-2-1")
    private String cs_0_2_2_1;		// 末次月经日期是否确定
    @JSONField(format = "yyyy-MM-dd",name = "CS-0-2-2")
    private Date cs_0_2_2;		// 末次月经日期
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-3-1")
    private String cm_0_2_3_1;		// 到达本院急诊或者门诊日期时间是否确定
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-3-2")
    private Date cm_0_2_3_2;		// 到达本院急诊或者门诊日期时间
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-4-1")
    private Date cm_0_2_4_1;		// 入院日期时间
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-4-2")
    private Date cm_0_2_4_2;		// 出院日期时间
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-6-1")
    private Date cm_0_2_6_1;		// 手术开始（切皮）日期时间
    @JSONField(format = "yyyy-MM-dd HH:mm",name = "CM-0-2-6-2")
    private Date cm_0_2_6_2;		// 手术结束（缝皮结束）日期时间
    @JSONField(name="CM-0-3-1")
    private String cm_0_3_1;		// 费用支付方式
    @JSONField(name="CM-0-3-2")
    private String cm_0_3_2;		// 收入住院途径
    @JSONField(name="CM-0-3-3")
    private String cm_0_3_3;		// 到院交通工具
    @JSONField(name="CM-1-1-1")
    private String cs_1_1_1;		// 产次
    @JSONField(name="CS-1-1-1-1")
    private String cs_1_1_1_1;		// 剖宮产史
    @JSONField(name="CS-1-1-3")
    private String cs_1_1_3;		// 临产方式
    @JSONField(name="CS-1-1-4")
    private String cs_1_1_4;		// 孕周
    @JSONField(name="CS-1-1-5")
    private String cs_1_1_5;		// 胎位
    @JSONField(name="CS-1-1-6")
    private String cs_1_1_6;		// 胎儿数量
    @JSONField(name="CS-1-2-1")
    private List<String> cs_1_2_1;		// 手术前风险评估的检查项目
    @JSONField(name="CS-1-2-2")
    private List<String> cs_1_2_2;		// 手术前知情告知
    @JSONField(name="CS-1-2-31")
    private List<String> cs_1_2_31;		// 麻醉前知情告知
    @JSONField(name="CS-1-2-4")
    private String cs_1_2_4;		// 麻醉方式
    @JSONField(name="CS-1-2-5")
    private String cs_1_2_5;		// 特殊感染评估
    @JSONField(name="CS-1-2-6")
    private String cs_1_2_6;		// 孕妇伴有特殊感染ICD.10编码及诊断名称
    @JSONField(name="CS-2-1-1-1")
    private String cs_2_1_1_1;		// 剖宫产指征
    @JSONField(name="CS-2-5-1")
    private List<String> cs_2_5_1;		// 符合医学指征
    @JSONField(name="CS-2-1-1-a")
    private String cs_2_1_1_a;		// 胎儿窘迫
    @JSONField(name="CS-2-1-1-b")
    private String cs_2_1_1_b;		// 头盆不称
    @JSONField(name="CS-2-1-1-c")
    private String cs_2_1_1_c;		// 瘢痕子宫
    @JSONField(name="CS-2-1-1-d")
    private String cs_2_1_1_d;		// 胎位异常
    @JSONField(name="CS-2-1-1-e")
    private String cs_2_1_1_e;		// 前置胎盘及前置血管
    @JSONField(name="CS-2-1-1-f")
    private String cs_2_1_1_f;		// 双胎或多胎妊娠
    @JSONField(name="CS-2-1-1-g")
    private String cs_2_1_1_g;		// 脐带脱垂
    @JSONField(name="CS-2-1-1-h")
    private String cs_2_1_1_h;		// 胎盘早剥
    @JSONField(name="CS-2-1-1-i")
    private String cs_2_1_1_i;		// 孕妇存在严重合并症和并发症
    @JSONField(name="CS-2-1-1-j")
    private String cs_2_1_1_j;		// 妊娠巨大儿者
    @JSONField(name="CS-2-1-1-k")
    private String cs_2_1_1_k;		// 产道畸形
    @JSONField(name="CS-2-1-1-l")
    private String cs_2_1_1_l;		// 外阴疾病
    @JSONField(name="CS-2-1-1-n")
    private String cs_2_1_1_n;		// 妊娠合并肿瘤
    @JSONField(name="CS-2-1-1-m")
    private String cs_2_1_1_m;		// 生殖道严重的感染性疾病
    @JSONField(name="CS-2-1-1-o")
    private String cs_2_1_1_o;		// 剖宫产+伴绝育手术
    @JSONField(name="CS-2-1-1-p")
    private String cs_2_1_1_p;		// 其他病理状态
    @JSONField(name="CS-2-1-1-q")
    private String cs_2_1_1_q;		// 高龄初产妇
    @JSONField(name="CS-2-1-1-r")
    private String cs_2_1_1_r;		// 符合DRGs编码的 剖宫产,伴重要合并症与伴隨病
    @JSONField(name="CS-2-2-1")
    private String cs_2_2_1;		// 孕妇要求剖宫产的评估
    @JSONField(name="CS-2-3-1")
    private String cs_2_3_1;		// 手术方式选择
    @JSONField(name="CS-2-4-2",format = "yyyy-MM-dd HH:mm")
    private Date cs_2_4_2;		// 胎儿娩出日期时间
    @JSONField(name="CS-1-1-1")
    private String cm_1_1_1;		// 是否使用预防性抗菌药物
    @JSONField(name="CM-1-2-1-2")
    private List<String> cm_1_2_1_2;		// 预防性抗菌药物选择
    @JSONField(name="CM-1-2-2-2")
    private List<String> cm_1_2_2_2;		// 选择碳青霉烯类及替加环素等特殊使用级抗菌药物
    @JSONField(name="CM-1-2-2-1")
    private String cm_1_2_2_1;		// 其他特殊使用级抗菌药物名称
    @JSONField(name="CM-1-3-1-2")
    private List<String> cm_1_3_1_2;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素
    @JSONField(name="CM-1-3-1-1")
    private String cm_1_3_1_1;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写
    @JSONField(name="CM-1-4-1",format = "yyyy-MM-dd HH:mm")
    private Date cm_1_4_1;		// 使用首剂抗菌药物起始时间
    @JSONField(name="CM-1-5-1")
    private String cm_1_5_1;		// 手术时间是否≥3小时
    @JSONField(name="CM-1-5-2")
    private String cm_1_5_2;		// 是否术中追加抗菌药物
    @JSONField(name="CM-1-5-3")
    private String cm_1_5_3;		// 术中出血量是否≥1500ml
    @JSONField(name="CM-1-5-4")
    private String cm_1_5_4;		// 是否术中追加抗菌药物
    @JSONField(name="CM-1-6-1",format = "yyyy-MM-dd HH:mm")
    private Date cm_1_6_1;		// 术后抗菌药物停止使用时间
    @JSONField(name="CM-1-6-2")
    private String cm_1_6_2;		// 使用抗菌药物时间使用时间分层
    @JSONField(name="CM-1-6-3-2")
    private String cm_1_6_3_2;		// 术后48小时之后继续使用的原因
    @JSONField(name="CS-4-1")
    private String cs_4_1;		// 是否实施新生儿Apgar评分
    @JSONField(name="CS-4-2")
    private List<String> cs_4_2;		// 新生儿出生后1、5、10min,Apgar评分值
    @JSONField(name="CS-4-3-1")
    private Double cs_4_3_1;		// 出生后1min,Apgar评分值
    @JSONField(name="CS-4-3-2")
    private Double cs_4_3_2;		// 出生后5min,Apgar评分值
    @JSONField(name="CS-4-3-3")
    private Double cs_4_3_3;		// 出生后10min,Apgar评分值
    @JSONField(name="CS-5-1")
    private String cs_5_1;		// 术后24小时内出血量
    @JSONField(name="CS-5-1-1")
    private Double cs_5_1_1;		// 术后24小时内实际出血量（ml）
    @JSONField(name="CS-5-2-1")
    private List<String> cs_5_2_1;		// 剖宫产产后出血可能的原因
    @JSONField(name="CS-5-3")
    private String cs_5_3;		// 术后24小时内输血量
    @JSONField(name="CS-5-4")
    private Double cs_5_4;		// 术后24小时内实际输血量（ml）
    @JSONField(name="CS-5-5")
    private List<String> cs_5_5;		// 止血干预措施的选择
    @JSONField(name="CS-6-1-1")
    private String cs_6_1_1;		// 是否有剖宫产并发症
    @JSONField(name="CS-6-1-2-1")
    private String cs_6_1_2_1;		// 剖宫产并发症ICD.10编码
    @JSONField(name="CS-6-1-2-1-a")
    private String cs_6_1_2_1_a;		// 产后出血
    @JSONField(name="CS-6-1-2-1-b")
    private String cs_6_1_2_1_b;		// 产褥期感染
    @JSONField(name="CS-6-1-2-1-c")
    private String cs_6_1_2_1_c;		// 产科栓塞
    @JSONField(name="CS-6-1-2-1-d")
    private String cs_6_1_2_1_d;		// 栓塞病
    @JSONField(name="CS-6-1-2-1-e")
    private String cs_6_1_2_1_e;		// 胎盘和胎膜滞留不伴有出血
    @JSONField(name="CS-6-1-2-1-f")
    private String cs_6_1_2_1_f;		// 产科手术伤口的感染
    @JSONField(name="CS-6-1-2-1-g")
    private String cs_6_1_2_1_g;		// 产科伤口裂开
    @JSONField(name="CS-6-1-2-1-h")
    private String cs_6_1_2_1_h;		// 其他并发症
    @JSONField(name="CS-6-2")
    private String cs_6_2;		// 是否再次手术
    @JSONField(name="CS-6-3")
    private String cs_6_3;		// 再次手术原因
    @JSONField(name="CS-6-3-1")
    private String cs_6_3_1;		// 其他再次手术原因
    @JSONField(name="CS-6-4")
    private String cs_6_4;		// 影响程度的选择
    @JSONField(name="CS-7-1")
    private String cs_7_1;		// 是否有新生儿产伤
    @JSONField(name="CS-7-2")
    private String cs_7_2;		// 产程和分娩期间并发症所列的名称及ICD.10编码
    @JSONField(name="CS-7-2-a")
    private String cs_7_2_a;		// ICD-10：P10产伤引起的颅内撕裂和出血
    @JSONField(name="CS-7-2-b")
    private String cs_7_2_b;		// ICD-10：P11产伤致新生儿脑伤
    @JSONField(name="CS-7-2-c")
    private String cs_7_2_c;		// ICD-10：P12头皮产伤
    @JSONField(name="CS-7-2-d")
    private String cs_7_2_d;		// ICD-10：P13颅骨产伤
    @JSONField(name="CS-7-2-e")
    private String cs_7_2_e;		// ICD-10：P14神经产伤
    @JSONField(name="CS-7-2-f")
    private String cs_7_2_f;		// ICD-10：P15其他产伤
    @JSONField(name="CS-7-2-g")
    private String cs_7_2_g;		// ICD-10：P20子宫内低氧症
    @JSONField(name="CS-7-2-h")
    private String cs_7_2_h;		// ICD-10：P21出生窒息
    @JSONField(name="CS-7-3")
    private String cs_7_3;		// 新生儿是否有先天性畸形、变形和染色体异常
    @JSONField(name="CS-7-4")
    private String cs_7_4;		// 新生儿：先天性畸形、变形和染色体异常的名称及ICD.10编码
    @JSONField(name="CS-8-2-1")
    private String cs_8_2_1;		// 是否有母乳喂养禁忌证
    @JSONField(name="CS-8-1-1")
    private String cs_8_1_1;		// 母乳喂养禁忌证选择
    @JSONField(name="CS-8-2")
    private String cs_8_2;		// 提供母乳喂养
    @JSONField(name="CS-9-1-1")
    private List<String> cs_9_1_1;		// 住院期间为产妇提供术前健康教育
    @JSONField(name="CS-9-1-2")
    private List<String> cs_9_1_2;		// 提供产后康复健康教育
    @JSONField(name="CS-9-1-3")
    private String cs_9_1_3;		// 是否提供术后镇痛
    @JSONField(name="CS-9-1-4")
    private List<String> cs_9_1_4;		// 药物选择
    @JSONField(name="CS-9-1-4-1")
    private String cs_9_1_4_1;		// 其他镇痛药物
    @JSONField(name="CM-7-2-1")
    private List<String> cm_7_2_1;		// 交与患者“出院小结”的副本告知患者出院时风险因素
    @JSONField(name="CM-7-2-2")
    private List<String> cm_7_2_2;		// 母乳喂养与出院带药
    @JSONField(name="CM-7-2-3")
    private List<String> cm_7_2_3;		// 告知 出院关注事项
    @JSONField(name="CM-7-2-4")
    private List<String> cm_7_2_4;		// 出院时教育
    @JSONField(name="CM-7-2-5")
    private List<String> cm_7_2_5;		// 告知随访
    @JSONField(name="CM-3-1")
    private String cm_3_1;		// 手术野皮肤准备常用方法的选择
    @JSONField(name="CM-3-2")
    private String cm_3_2;		// 使用含抗菌剂（三氯生）缝线
    @JSONField(name="CM-3-2—1")
    private String cm_3_2_1;		// 其他含抗菌剂缝线填写
    @JSONField(name="CM-3-3")
    private String cm_3_3;		// 手术切口类别的选择
    @JSONField(name="CM-3-4")
    private String cm_3_4;		// 手术切口愈合情况的选择
    @JSONField(name="CM-4-3")
    private String cm_4_3;		// 离院方式选择
    @JSONField(name="CM-4-5")
    private String cm_4_5;		// 非医嘱离院可能涉及因素
    @JSONField(name="CM-4-4-1")
    private String cm_4_4_1;		// 其他非医嘱离院因素填写
    @JSONField(name="CM-4-6")
    private String cm_4_6;		// 死亡可能涉及因素
    @JSONField(name="CM-5-1")
    private String cm_5_1;		// 患者是否对服务的体验与评价
    @JSONField(name="CM-5-2-1")
    private String cm_5_2_1;		// 整体医院评级
    @JSONField(name="CM-5-2-2")
    private String cm_5_2_2;		// 患者推荐
    @JSONField(name="CM-5-2-3")
    private String cm_5_2_3;		// 病房、床单元和卫生间清洁度
    @JSONField(name="CM-5-2-5")
    private String cm_5_2_5;		// 病房与周边噪音
    @JSONField(name="CM-5-2-6")
    private String cm_5_2_6;		// 医生沟通
    @JSONField(name="CM-5-2-7")
    private String cm_5_2_7;		// 护士沟通
    @JSONField(name="CM-5-2-8")
    private String cm_5_2_8;		// 药师沟通
    @JSONField(name="CM-5-2-9")
    private String cm_5_2_9;		// 康复计划
    @JSONField(name="CM-5-2-10")
    private String cm_5_2_10;		// 出院时的知情告知
    @JSONField(name="CM-5-2-11")
    private String cm_5_2_11;		// 膳食评价
    @JSONField(name="CM-6-1")
    private Double cm_6_1;		// 住院总费用
    @JSONField(name="CM-6-2")
    private Double cm_6_2;		// 住院总费用其中自付金额
    @JSONField(name="CM-6-3")
    private Double cm_6_3;		// 一般医疗服务费
    @JSONField(name="CM-6-4")
    private Double cm_6_4;		// 一般治疗操作费
    @JSONField(name="CM-6-5")
    private Double cm_6_5;		// 护理费
    @JSONField(name="CM-6-6")
    private Double cm_6_6;		// 综合医疗服务类其他费用
    @JSONField(name="CM-6-7")
    private Double cm_6_7;		// 病理诊断费
    @JSONField(name="CM-6-8")
    private Double cm_6_8;		// 实验室诊断费
    @JSONField(name="CM-6-9")
    private Double cm_6_9;		// 影像学诊断费
    @JSONField(name="CM-6-10")
    private Double cm_6_10;		// 临床诊断项目费
    @JSONField(name="CM-6-11")
    private Double cm_6_11;		// 非手术治疗项目费
    @JSONField(name="CM-6-12")
    private Double cm_6_12;		// 其中：临床物理治疗费
    @JSONField(name="CM-6-13")
    private Double cm_6_13;		// 手术治疗费
    @JSONField(name="CM-6-14")
    private Double cm_6_14;		// 其中：麻醉费
    @JSONField(name="CM-6-15")
    private Double cm_6_15;		// 其中：手术费
    @JSONField(name="CM-6-16")
    private Double cm_6_16;		// 康复费
    @JSONField(name="CM-6-17")
    private Double cm_6_17;		// 中医治疗费
    @JSONField(name="CM-6-18")
    private Double cm_6_18;		// 西药费
    @JSONField(name="CM-6-19")
    private Double cm_6_19;		// 其中：抗菌药物费
    @JSONField(name="CM-6-20")
    private Double cm_6_20;		// 中成药费
    @JSONField(name="CM-6-21")
    private Double cm_6_21;		// 中草药费
    @JSONField(name="CM-6-22")
    private Double cm_6_22;		// 血费
    @JSONField(name="CM-6-23")
    private Double cm_6_23;		// 白蛋白类制品费
    @JSONField(name="CM-6-24")
    private Double cm_6_24;		// 球蛋白类制品费
    @JSONField(name="CM-6-25")
    private Double cm_6_25;		// 凝血因子类制品费
    @JSONField(name="CM-6-26")
    private Double cm_6_26;		// 细胞因子类制品费
    @JSONField(name="CM-6-27")
    private Double cm_6_27;		// 检查用一次性医用材料费
    @JSONField(name="CM-6-28")
    private Double cm_6_28;		// 治疗用一次性医用材料费
    @JSONField(name="CM-6-29")
    private Double cm_6_29;		// 手术用一次性医用材料费
    @JSONField(name="CM-6-30")
    private Double cm_6_30;		// 其他费


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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
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

    public Double getCm_0_2_1_6() {
        return cm_0_2_1_6;
    }

    public void setCm_0_2_1_6(Double cm_0_2_1_6) {
        this.cm_0_2_1_6 = cm_0_2_1_6;
    }

    public String getCs_0_2_2_1() {
        return cs_0_2_2_1;
    }

    public void setCs_0_2_2_1(String cs_0_2_2_1) {
        this.cs_0_2_2_1 = cs_0_2_2_1;
    }

    public Date getCs_0_2_2() {
        return cs_0_2_2;
    }

    public void setCs_0_2_2(Date cs_0_2_2) {
        this.cs_0_2_2 = cs_0_2_2;
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

    public String getCs_1_1_1() {
        return cs_1_1_1;
    }

    public void setCs_1_1_1(String cs_1_1_1) {
        this.cs_1_1_1 = cs_1_1_1;
    }

    public String getCs_1_1_1_1() {
        return cs_1_1_1_1;
    }

    public void setCs_1_1_1_1(String cs_1_1_1_1) {
        this.cs_1_1_1_1 = cs_1_1_1_1;
    }

    public String getCs_1_1_3() {
        return cs_1_1_3;
    }

    public void setCs_1_1_3(String cs_1_1_3) {
        this.cs_1_1_3 = cs_1_1_3;
    }

    public String getCs_1_1_4() {
        return cs_1_1_4;
    }

    public void setCs_1_1_4(String cs_1_1_4) {
        this.cs_1_1_4 = cs_1_1_4;
    }

    public String getCs_1_1_5() {
        return cs_1_1_5;
    }

    public void setCs_1_1_5(String cs_1_1_5) {
        this.cs_1_1_5 = cs_1_1_5;
    }

    public String getCs_1_1_6() {
        return cs_1_1_6;
    }

    public void setCs_1_1_6(String cs_1_1_6) {
        this.cs_1_1_6 = cs_1_1_6;
    }

    public List<String> getCs_1_2_1() {
        return cs_1_2_1;
    }

    public void setCs_1_2_1(List<String> cs_1_2_1) {
        this.cs_1_2_1 = cs_1_2_1;
    }

    public List<String> getCs_1_2_2() {
        return cs_1_2_2;
    }

    public void setCs_1_2_2(List<String> cs_1_2_2) {
        this.cs_1_2_2 = cs_1_2_2;
    }

    public List<String> getCs_1_2_31() {
        return cs_1_2_31;
    }

    public void setCs_1_2_31(List<String> cs_1_2_31) {
        this.cs_1_2_31 = cs_1_2_31;
    }

    public String getCs_1_2_4() {
        return cs_1_2_4;
    }

    public void setCs_1_2_4(String cs_1_2_4) {
        this.cs_1_2_4 = cs_1_2_4;
    }

    public String getCs_1_2_5() {
        return cs_1_2_5;
    }

    public void setCs_1_2_5(String cs_1_2_5) {
        this.cs_1_2_5 = cs_1_2_5;
    }

    public String getCs_1_2_6() {
        return cs_1_2_6;
    }

    public void setCs_1_2_6(String cs_1_2_6) {
        this.cs_1_2_6 = cs_1_2_6;
    }

    public String getCs_2_1_1_1() {
        return cs_2_1_1_1;
    }

    public void setCs_2_1_1_1(String cs_2_1_1_1) {
        this.cs_2_1_1_1 = cs_2_1_1_1;
    }

    public List<String> getCs_2_5_1() {
        return cs_2_5_1;
    }

    public void setCs_2_5_1(List<String> cs_2_5_1) {
        this.cs_2_5_1 = cs_2_5_1;
    }

    public String getCs_2_1_1_a() {
        return cs_2_1_1_a;
    }

    public void setCs_2_1_1_a(String cs_2_1_1_a) {
        this.cs_2_1_1_a = cs_2_1_1_a;
    }

    public String getCs_2_1_1_b() {
        return cs_2_1_1_b;
    }

    public void setCs_2_1_1_b(String cs_2_1_1_b) {
        this.cs_2_1_1_b = cs_2_1_1_b;
    }

    public String getCs_2_1_1_c() {
        return cs_2_1_1_c;
    }

    public void setCs_2_1_1_c(String cs_2_1_1_c) {
        this.cs_2_1_1_c = cs_2_1_1_c;
    }

    public String getCs_2_1_1_d() {
        return cs_2_1_1_d;
    }

    public void setCs_2_1_1_d(String cs_2_1_1_d) {
        this.cs_2_1_1_d = cs_2_1_1_d;
    }

    public String getCs_2_1_1_e() {
        return cs_2_1_1_e;
    }

    public void setCs_2_1_1_e(String cs_2_1_1_e) {
        this.cs_2_1_1_e = cs_2_1_1_e;
    }

    public String getCs_2_1_1_f() {
        return cs_2_1_1_f;
    }

    public void setCs_2_1_1_f(String cs_2_1_1_f) {
        this.cs_2_1_1_f = cs_2_1_1_f;
    }

    public String getCs_2_1_1_g() {
        return cs_2_1_1_g;
    }

    public void setCs_2_1_1_g(String cs_2_1_1_g) {
        this.cs_2_1_1_g = cs_2_1_1_g;
    }

    public String getCs_2_1_1_h() {
        return cs_2_1_1_h;
    }

    public void setCs_2_1_1_h(String cs_2_1_1_h) {
        this.cs_2_1_1_h = cs_2_1_1_h;
    }

    public String getCs_2_1_1_i() {
        return cs_2_1_1_i;
    }

    public void setCs_2_1_1_i(String cs_2_1_1_i) {
        this.cs_2_1_1_i = cs_2_1_1_i;
    }

    public String getCs_2_1_1_j() {
        return cs_2_1_1_j;
    }

    public void setCs_2_1_1_j(String cs_2_1_1_j) {
        this.cs_2_1_1_j = cs_2_1_1_j;
    }

    public String getCs_2_1_1_k() {
        return cs_2_1_1_k;
    }

    public void setCs_2_1_1_k(String cs_2_1_1_k) {
        this.cs_2_1_1_k = cs_2_1_1_k;
    }

    public String getCs_2_1_1_l() {
        return cs_2_1_1_l;
    }

    public void setCs_2_1_1_l(String cs_2_1_1_l) {
        this.cs_2_1_1_l = cs_2_1_1_l;
    }

    public String getCs_2_1_1_n() {
        return cs_2_1_1_n;
    }

    public void setCs_2_1_1_n(String cs_2_1_1_n) {
        this.cs_2_1_1_n = cs_2_1_1_n;
    }

    public String getCs_2_1_1_m() {
        return cs_2_1_1_m;
    }

    public void setCs_2_1_1_m(String cs_2_1_1_m) {
        this.cs_2_1_1_m = cs_2_1_1_m;
    }

    public String getCs_2_1_1_o() {
        return cs_2_1_1_o;
    }

    public void setCs_2_1_1_o(String cs_2_1_1_o) {
        this.cs_2_1_1_o = cs_2_1_1_o;
    }

    public String getCs_2_1_1_p() {
        return cs_2_1_1_p;
    }

    public void setCs_2_1_1_p(String cs_2_1_1_p) {
        this.cs_2_1_1_p = cs_2_1_1_p;
    }

    public String getCs_2_1_1_q() {
        return cs_2_1_1_q;
    }

    public void setCs_2_1_1_q(String cs_2_1_1_q) {
        this.cs_2_1_1_q = cs_2_1_1_q;
    }

    public String getCs_2_1_1_r() {
        return cs_2_1_1_r;
    }

    public void setCs_2_1_1_r(String cs_2_1_1_r) {
        this.cs_2_1_1_r = cs_2_1_1_r;
    }

    public String getCs_2_2_1() {
        return cs_2_2_1;
    }

    public void setCs_2_2_1(String cs_2_2_1) {
        this.cs_2_2_1 = cs_2_2_1;
    }

    public String getCs_2_3_1() {
        return cs_2_3_1;
    }

    public void setCs_2_3_1(String cs_2_3_1) {
        this.cs_2_3_1 = cs_2_3_1;
    }

    public Date getCs_2_4_2() {
        return cs_2_4_2;
    }

    public void setCs_2_4_2(Date cs_2_4_2) {
        this.cs_2_4_2 = cs_2_4_2;
    }

    public String getCm_1_1_1() {
        return cm_1_1_1;
    }

    public void setCm_1_1_1(String cm_1_1_1) {
        this.cm_1_1_1 = cm_1_1_1;
    }

    public List<String> getCm_1_2_1_2() {
        return cm_1_2_1_2;
    }

    public void setCm_1_2_1_2(List<String> cm_1_2_1_2) {
        this.cm_1_2_1_2 = cm_1_2_1_2;
    }

    public List<String> getCm_1_2_2_2() {
        return cm_1_2_2_2;
    }

    public void setCm_1_2_2_2(List<String> cm_1_2_2_2) {
        this.cm_1_2_2_2 = cm_1_2_2_2;
    }

    public String getCm_1_2_2_1() {
        return cm_1_2_2_1;
    }

    public void setCm_1_2_2_1(String cm_1_2_2_1) {
        this.cm_1_2_2_1 = cm_1_2_2_1;
    }

    public List<String> getCm_1_3_1_2() {
        return cm_1_3_1_2;
    }

    public void setCm_1_3_1_2(List<String> cm_1_3_1_2) {
        this.cm_1_3_1_2 = cm_1_3_1_2;
    }

    public String getCm_1_3_1_1() {
        return cm_1_3_1_1;
    }

    public void setCm_1_3_1_1(String cm_1_3_1_1) {
        this.cm_1_3_1_1 = cm_1_3_1_1;
    }

    public Date getCm_1_4_1() {
        return cm_1_4_1;
    }

    public void setCm_1_4_1(Date cm_1_4_1) {
        this.cm_1_4_1 = cm_1_4_1;
    }

    public String getCm_1_5_1() {
        return cm_1_5_1;
    }

    public void setCm_1_5_1(String cm_1_5_1) {
        this.cm_1_5_1 = cm_1_5_1;
    }

    public String getCm_1_5_2() {
        return cm_1_5_2;
    }

    public void setCm_1_5_2(String cm_1_5_2) {
        this.cm_1_5_2 = cm_1_5_2;
    }

    public String getCm_1_5_3() {
        return cm_1_5_3;
    }

    public void setCm_1_5_3(String cm_1_5_3) {
        this.cm_1_5_3 = cm_1_5_3;
    }

    public String getCm_1_5_4() {
        return cm_1_5_4;
    }

    public void setCm_1_5_4(String cm_1_5_4) {
        this.cm_1_5_4 = cm_1_5_4;
    }

    public Date getCm_1_6_1() {
        return cm_1_6_1;
    }

    public void setCm_1_6_1(Date cm_1_6_1) {
        this.cm_1_6_1 = cm_1_6_1;
    }

    public String getCm_1_6_2() {
        return cm_1_6_2;
    }

    public void setCm_1_6_2(String cm_1_6_2) {
        this.cm_1_6_2 = cm_1_6_2;
    }

    public String getCm_1_6_3_2() {
        return cm_1_6_3_2;
    }

    public void setCm_1_6_3_2(String cm_1_6_3_2) {
        this.cm_1_6_3_2 = cm_1_6_3_2;
    }

    public String getCs_4_1() {
        return cs_4_1;
    }

    public void setCs_4_1(String cs_4_1) {
        this.cs_4_1 = cs_4_1;
    }

    public List<String> getCs_4_2() {
        return cs_4_2;
    }

    public void setCs_4_2(List<String> cs_4_2) {
        this.cs_4_2 = cs_4_2;
    }

    public Double getCs_4_3_1() {
        return cs_4_3_1;
    }

    public void setCs_4_3_1(Double cs_4_3_1) {
        this.cs_4_3_1 = cs_4_3_1;
    }

    public Double getCs_4_3_2() {
        return cs_4_3_2;
    }

    public void setCs_4_3_2(Double cs_4_3_2) {
        this.cs_4_3_2 = cs_4_3_2;
    }

    public Double getCs_4_3_3() {
        return cs_4_3_3;
    }

    public void setCs_4_3_3(Double cs_4_3_3) {
        this.cs_4_3_3 = cs_4_3_3;
    }

    public String getCs_5_1() {
        return cs_5_1;
    }

    public void setCs_5_1(String cs_5_1) {
        this.cs_5_1 = cs_5_1;
    }

    public Double getCs_5_1_1() {
        return cs_5_1_1;
    }

    public void setCs_5_1_1(Double cs_5_1_1) {
        this.cs_5_1_1 = cs_5_1_1;
    }

    public List<String> getCs_5_2_1() {
        return cs_5_2_1;
    }

    public void setCs_5_2_1(List<String> cs_5_2_1) {
        this.cs_5_2_1 = cs_5_2_1;
    }

    public String getCs_5_3() {
        return cs_5_3;
    }

    public void setCs_5_3(String cs_5_3) {
        this.cs_5_3 = cs_5_3;
    }

    public Double getCs_5_4() {
        return cs_5_4;
    }

    public void setCs_5_4(Double cs_5_4) {
        this.cs_5_4 = cs_5_4;
    }

    public List<String> getCs_5_5() {
        return cs_5_5;
    }

    public void setCs_5_5(List<String> cs_5_5) {
        this.cs_5_5 = cs_5_5;
    }

    public String getCs_6_1_1() {
        return cs_6_1_1;
    }

    public void setCs_6_1_1(String cs_6_1_1) {
        this.cs_6_1_1 = cs_6_1_1;
    }

    public String getCs_6_1_2_1() {
        return cs_6_1_2_1;
    }

    public void setCs_6_1_2_1(String cs_6_1_2_1) {
        this.cs_6_1_2_1 = cs_6_1_2_1;
    }

    public String getCs_6_1_2_1_a() {
        return cs_6_1_2_1_a;
    }

    public void setCs_6_1_2_1_a(String cs_6_1_2_1_a) {
        this.cs_6_1_2_1_a = cs_6_1_2_1_a;
    }

    public String getCs_6_1_2_1_b() {
        return cs_6_1_2_1_b;
    }

    public void setCs_6_1_2_1_b(String cs_6_1_2_1_b) {
        this.cs_6_1_2_1_b = cs_6_1_2_1_b;
    }

    public String getCs_6_1_2_1_c() {
        return cs_6_1_2_1_c;
    }

    public void setCs_6_1_2_1_c(String cs_6_1_2_1_c) {
        this.cs_6_1_2_1_c = cs_6_1_2_1_c;
    }

    public String getCs_6_1_2_1_d() {
        return cs_6_1_2_1_d;
    }

    public void setCs_6_1_2_1_d(String cs_6_1_2_1_d) {
        this.cs_6_1_2_1_d = cs_6_1_2_1_d;
    }

    public String getCs_6_1_2_1_e() {
        return cs_6_1_2_1_e;
    }

    public void setCs_6_1_2_1_e(String cs_6_1_2_1_e) {
        this.cs_6_1_2_1_e = cs_6_1_2_1_e;
    }

    public String getCs_6_1_2_1_f() {
        return cs_6_1_2_1_f;
    }

    public void setCs_6_1_2_1_f(String cs_6_1_2_1_f) {
        this.cs_6_1_2_1_f = cs_6_1_2_1_f;
    }

    public String getCs_6_1_2_1_g() {
        return cs_6_1_2_1_g;
    }

    public void setCs_6_1_2_1_g(String cs_6_1_2_1_g) {
        this.cs_6_1_2_1_g = cs_6_1_2_1_g;
    }

    public String getCs_6_1_2_1_h() {
        return cs_6_1_2_1_h;
    }

    public void setCs_6_1_2_1_h(String cs_6_1_2_1_h) {
        this.cs_6_1_2_1_h = cs_6_1_2_1_h;
    }

    public String getCs_6_2() {
        return cs_6_2;
    }

    public void setCs_6_2(String cs_6_2) {
        this.cs_6_2 = cs_6_2;
    }

    public String getCs_6_3() {
        return cs_6_3;
    }

    public void setCs_6_3(String cs_6_3) {
        this.cs_6_3 = cs_6_3;
    }

    public String getCs_6_3_1() {
        return cs_6_3_1;
    }

    public void setCs_6_3_1(String cs_6_3_1) {
        this.cs_6_3_1 = cs_6_3_1;
    }

    public String getCs_6_4() {
        return cs_6_4;
    }

    public void setCs_6_4(String cs_6_4) {
        this.cs_6_4 = cs_6_4;
    }

    public String getCs_7_1() {
        return cs_7_1;
    }

    public void setCs_7_1(String cs_7_1) {
        this.cs_7_1 = cs_7_1;
    }

    public String getCs_7_2() {
        return cs_7_2;
    }

    public void setCs_7_2(String cs_7_2) {
        this.cs_7_2 = cs_7_2;
    }

    public String getCs_7_2_a() {
        return cs_7_2_a;
    }

    public void setCs_7_2_a(String cs_7_2_a) {
        this.cs_7_2_a = cs_7_2_a;
    }

    public String getCs_7_2_b() {
        return cs_7_2_b;
    }

    public void setCs_7_2_b(String cs_7_2_b) {
        this.cs_7_2_b = cs_7_2_b;
    }

    public String getCs_7_2_c() {
        return cs_7_2_c;
    }

    public void setCs_7_2_c(String cs_7_2_c) {
        this.cs_7_2_c = cs_7_2_c;
    }

    public String getCs_7_2_d() {
        return cs_7_2_d;
    }

    public void setCs_7_2_d(String cs_7_2_d) {
        this.cs_7_2_d = cs_7_2_d;
    }

    public String getCs_7_2_e() {
        return cs_7_2_e;
    }

    public void setCs_7_2_e(String cs_7_2_e) {
        this.cs_7_2_e = cs_7_2_e;
    }

    public String getCs_7_2_f() {
        return cs_7_2_f;
    }

    public void setCs_7_2_f(String cs_7_2_f) {
        this.cs_7_2_f = cs_7_2_f;
    }

    public String getCs_7_2_g() {
        return cs_7_2_g;
    }

    public void setCs_7_2_g(String cs_7_2_g) {
        this.cs_7_2_g = cs_7_2_g;
    }

    public String getCs_7_2_h() {
        return cs_7_2_h;
    }

    public void setCs_7_2_h(String cs_7_2_h) {
        this.cs_7_2_h = cs_7_2_h;
    }

    public String getCs_7_3() {
        return cs_7_3;
    }

    public void setCs_7_3(String cs_7_3) {
        this.cs_7_3 = cs_7_3;
    }

    public String getCs_7_4() {
        return cs_7_4;
    }

    public void setCs_7_4(String cs_7_4) {
        this.cs_7_4 = cs_7_4;
    }

    public String getCs_8_2_1() {
        return cs_8_2_1;
    }

    public void setCs_8_2_1(String cs_8_2_1) {
        this.cs_8_2_1 = cs_8_2_1;
    }

    public String getCs_8_1_1() {
        return cs_8_1_1;
    }

    public void setCs_8_1_1(String cs_8_1_1) {
        this.cs_8_1_1 = cs_8_1_1;
    }

    public String getCs_8_2() {
        return cs_8_2;
    }

    public void setCs_8_2(String cs_8_2) {
        this.cs_8_2 = cs_8_2;
    }

    public List<String> getCs_9_1_1() {
        return cs_9_1_1;
    }

    public void setCs_9_1_1(List<String> cs_9_1_1) {
        this.cs_9_1_1 = cs_9_1_1;
    }

    public List<String> getCs_9_1_2() {
        return cs_9_1_2;
    }

    public void setCs_9_1_2(List<String> cs_9_1_2) {
        this.cs_9_1_2 = cs_9_1_2;
    }

    public String getCs_9_1_3() {
        return cs_9_1_3;
    }

    public void setCs_9_1_3(String cs_9_1_3) {
        this.cs_9_1_3 = cs_9_1_3;
    }

    public List<String> getCs_9_1_4() {
        return cs_9_1_4;
    }

    public void setCs_9_1_4(List<String> cs_9_1_4) {
        this.cs_9_1_4 = cs_9_1_4;
    }

    public String getCs_9_1_4_1() {
        return cs_9_1_4_1;
    }

    public void setCs_9_1_4_1(String cs_9_1_4_1) {
        this.cs_9_1_4_1 = cs_9_1_4_1;
    }

    public List<String> getCm_7_2_1() {
        return cm_7_2_1;
    }

    public void setCm_7_2_1(List<String> cm_7_2_1) {
        this.cm_7_2_1 = cm_7_2_1;
    }

    public List<String> getCm_7_2_2() {
        return cm_7_2_2;
    }

    public void setCm_7_2_2(List<String> cm_7_2_2) {
        this.cm_7_2_2 = cm_7_2_2;
    }

    public List<String> getCm_7_2_3() {
        return cm_7_2_3;
    }

    public void setCm_7_2_3(List<String> cm_7_2_3) {
        this.cm_7_2_3 = cm_7_2_3;
    }

    public List<String> getCm_7_2_4() {
        return cm_7_2_4;
    }

    public void setCm_7_2_4(List<String> cm_7_2_4) {
        this.cm_7_2_4 = cm_7_2_4;
    }

    public List<String> getCm_7_2_5() {
        return cm_7_2_5;
    }

    public void setCm_7_2_5(List<String> cm_7_2_5) {
        this.cm_7_2_5 = cm_7_2_5;
    }

    public String getCm_3_1() {
        return cm_3_1;
    }

    public void setCm_3_1(String cm_3_1) {
        this.cm_3_1 = cm_3_1;
    }

    public String getCm_3_2() {
        return cm_3_2;
    }

    public void setCm_3_2(String cm_3_2) {
        this.cm_3_2 = cm_3_2;
    }

    public String getCm_3_2_1() {
        return cm_3_2_1;
    }

    public void setCm_3_2_1(String cm_3_2_1) {
        this.cm_3_2_1 = cm_3_2_1;
    }

    public String getCm_3_3() {
        return cm_3_3;
    }

    public void setCm_3_3(String cm_3_3) {
        this.cm_3_3 = cm_3_3;
    }

    public String getCm_3_4() {
        return cm_3_4;
    }

    public void setCm_3_4(String cm_3_4) {
        this.cm_3_4 = cm_3_4;
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
