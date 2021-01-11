package com.zebone.quality.modules.cesarean.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.SerializedName;
import com.jeesite.common.lang.DateUtils;
import lombok.Data;
import org.apache.commons.beanutils.converters.StringArrayConverter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class CesareanSection {

    @SerializedName("caseId")
    private String caseId;		// 患者病案号
    @SerializedName("CM-0-1-1-1")
    private String cm0111;		// 质控医师
    @SerializedName("CM-0-1-1-2")
    private String cm0112;		// 质控护士
    @SerializedName("CM-0-1-1-3")
    private String cm0113;		// 主治医师
    @SerializedName("CM-0-1-1-4")
    private String cm0114;		// 责任护士
    @SerializedName("CM-0-1-1-5")
    private String cm0115;		// 上报科室
    @SerializedName("CM-0-1-3-1")
    private String cm0131;		// 出院诊断ICD-10四位亚目编码与名称
    @SerializedName("CM-0-1-3-2")
    private String cm0132;		// 出院诊断ICD-10六位临床扩展编码与名称
    @SerializedName("CM-0-1-4-1")
    private String cm0141;		// 主要手术操作 国家临床版ICD-9.CM-3编码与手术名称
    @SerializedName("CM-0-1-5")
    private String cm015;		// 是否出院后31天内重复住院



    private transient Date cm0211;		// 出生日期

    @SerializedName("CM-0-2-1-3")
    private Double cm0213;		// 患者体重（kg）
    @SerializedName("CM-0-2-1-5")
    private Double cm0215;		// 患者身高（cm）
    @SerializedName("CM-0-2-1-6")
    private Double cm0216;		// 新生儿出生体重（克）

    private transient String cm0231;		// 到达本院急诊或者门诊日期时间是否确定

    /**
     * 到达本院急诊或者门诊日期时间
     */
    private transient Date cm0232;



    private transient Date cm0241;		// 入院日期时间



    private transient Date cm0242;		// 出院日期时间



    private transient Date cm0261;		// 手术开始（切皮）日期时间


    private transient Date cm0262;		// 手术结束（缝皮结束）日期时间

    @SerializedName("CM-0-3-1")
    private String cm031;		// 费用支付方式
    @SerializedName("CM-0-3-2")
    private String cm032;		// 收入住院途径
    @SerializedName("CM-0-3-3")
    private String cm033;		// 到院交通工具
    @SerializedName("CM-1-1-1")
    private String cm111;		// 是否使用预防性抗菌药物
    @SerializedName("CM-1-2-1-2")
    private String cm1212;		// 预防性抗菌药物选择
    @SerializedName("CM-1-2-2-1")
    private String cm1221;		// 其他特殊使用级抗菌药物名称

    @SerializedName("CM-1-2-2-2")
    private String cm1222;		// 选择碳青霉烯类及替加环素等特殊使用级抗菌药物

    @SerializedName("CM-1-3-1-1")
    private String cm1311;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写

    @SerializedName("CM-1-3-1-2")
    private String cm1312;		// 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素

    @SerializedName("CM-1-4-1")
    private String cm141;		// 使用首剂抗菌药物起始时间

    @SerializedName("CM-1-5-1")
    private String cm151;		// 手术时间是否≥3小时

    @SerializedName("CM-1-5-2")
    private String cm152;		// 是否术中追加抗菌药物

    @SerializedName("CM-1-5-3")
    private String cm153;		// 术中出血量是否≥1500ml

    @SerializedName("CM-1-5-4")
    private String cm154;		// 是否术中追加抗菌药物

    @SerializedName("CM-1-6-1")
    private String cm161;		// 术后抗菌药物停止使用时间

    @SerializedName("CM-1-6-2")
    private String cm162;		// 使用抗菌药物时间使用时间分层

    @SerializedName("CM-1-6-3-2")
    private String cm1632;		// 术后48小时之后继续使用的原因

    @SerializedName("CM-3-1")
    private String cm31;		// 手术野皮肤准备常用方法的选择

    @SerializedName("CM-3-2")
    private String cm32;		// 使用含抗菌剂（三氯生）缝线

    @SerializedName("CM-3-2-1")
    private String cm321;		// 其他含抗菌剂缝线填写

    @SerializedName("CM-3-3")
    private String cm33;		// 手术切口类别的选择

    @SerializedName("CM-3-4")
    private String cm34;		// 手术切口愈合情况的选择

    @SerializedName("CM-4-3")
    private String cm43;		// 离院方式选择

    @SerializedName("CM-4-4-1")
    private String cm441;		// 其他非医嘱离院因素填写

    @SerializedName("CM-4-5")
    private String cm45;		// 非医嘱离院可能涉及因素

    @SerializedName("CM-4-6")
    private String cm46;		// 死亡可能涉及因素

    @SerializedName("CM-5-1")
    private String cm51;		// 患者是否对服务的体验与评价

    @SerializedName("CM-5-2-1")
    private String cm521;		// 整体医院评级

    @SerializedName("CM-5-2-2")
    private String cm522;		// 患者推荐

    @SerializedName("CM-5-2-3")
    private String cm523;		// 病房、床单元和卫生间清洁度

    @SerializedName("CM-5-2-5")
    private String cm525;		// 病房与周边噪音

    @SerializedName("CM-5-2-6")
    private String cm526;		// 医生沟通

    @SerializedName("CM-5-2-7")
    private String cm527;		// 护士沟通

    @SerializedName("CM-5-2-8")
    private String cm528;		// 药师沟通

    @SerializedName("CM-5-2-9")
    private String cm529;		// 康复计划

    @SerializedName("CM-6-1")
    private Double cm61;		// 住院总费用

    @SerializedName("CM-6-2")
    private Double cm62;		// 住院总费用其中自付金额

    @SerializedName("CM-6-3")
    private Double cm63;		// 一般医疗服务费

    @SerializedName("CM-6-4")
    private Double cm64;		// 一般治疗操作费

    @SerializedName("CM-6-5")
    private Double cm65;		// 护理费

    @SerializedName("CM-6-6")
    private Double cm66;		// 综合医疗服务类其他费用

    @SerializedName("CM-6-7")
    private Double cm67;		// 病理诊断费

    @SerializedName("CM-6-8")
    private Double cm68;		// 实验室诊断费

    @SerializedName("CM-6-9")
    private Double cm69;		// 影像学诊断费


    private transient String cm721;		// 交与患者“出院小结”的副本告知患者出院时风险因素

    /**
     * 母乳喂养与出院带药
     */
    private transient String cm722;

    /**
     * 告知出院关注事项
     */
    private transient String cm723;

    @SerializedName("CM-7-2-4")
    private String cm724;		// 出院时教育

    @SerializedName("CM-5-2-10")
    private String cm521$0;		// 出院时的知情告知


    private transient String cm725;		// 告知随访

    @SerializedName("CM-5-2-11")
    private String cm521$1;		// 膳食评价

    @SerializedName("CM-6-10")
    private Double cm61$0;		// 临床诊断项目费

    @SerializedName("CM-6-11")
    private Double cm61$1;		// 非手术治疗项目费

    @SerializedName("CM-6-12")
    private Double cm61$2;		// 其中：临床物理治疗费

    @SerializedName("CM-6-13")
    private Double cm61$3;		// 手术治疗费

    @SerializedName("CM-6-14")
    private Double cm61$4;		// 其中：麻醉费

    @SerializedName("CM-6-15")
    private Double cm61$5;		// 其中：手术费

    @SerializedName("CM-6-16")
    private Double cm61$6;		// 康复费

    @SerializedName("CM-6-17")
    private Double cm61$7;		// 中医治疗费

    @SerializedName("CM-6-18")
    private Double cm61$8;		// 西药费

    @SerializedName("CM-6-19")
    private Double cm61$9;		// 其中：抗菌药物费

    @SerializedName("CM-6-20")
    private Double cm62$0;		// 中成药费

    @SerializedName("CM-6-21")
    private Double cm62$1;		// 中草药费

    @SerializedName("CM-6-22")
    private Double cm62$2;		// 血费

    @SerializedName("CM-6-23")
    private Double cm62$3;		// 白蛋白类制品费

    @SerializedName("CM-6-24")
    private Double cm62$4;		// 球蛋白类制品费

    @SerializedName("CM-6-25")
    private Double cm62$5;		// 凝血因子类制品费

    @SerializedName("CM-6-26")
    private Double cm62$6;		// 细胞因子类制品费

    @SerializedName("CM-6-27")
    private Double cm62$7;		// 检查用一次性医用材料费

    @SerializedName("CM-6-28")
    private Double cm62$8;		// 治疗用一次性医用材料费

    @SerializedName("CM-6-29")
    private Double cm62$9;		// 手术用一次性医用材料费

    @SerializedName("CM-6-30")
    private Double cm63$0;		// 其他费

    @SerializedName("CS-2-22")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cs022;		// 末次月经日期


    private transient String cs0221;		// 末次月经日期是否确定

    @SerializedName("CS-1-1-1")
    private String cs111;		// 产次

    @SerializedName("CS-1-1-1-1")
    private String cs1111;		// 剖宮产史

    @SerializedName("CS-1-1-3")
    private String cs113;		// 临产方式

    @SerializedName("CS-1-1-4")
    private String cs114;		// 孕周

    @SerializedName("CS-1-1-5")
    private String cs115;		// 胎位

    @SerializedName("CS-1-1-6")
    private String cs116;		// 胎儿数量


    private transient String cs121;		// 手术前风险评估的检查项目


    private transient String cs122;		// 手术前知情告知

    @SerializedName("CS-1-2-4")
    private String cs124;		// 麻醉方式

    @SerializedName("CS-1-2-5")
    private String cs125;		// 特殊感染评估

    @SerializedName("CS-1-2-6")
    private String cs126;		// 孕妇伴有特殊感染ICD.10编码及诊断名称

    @SerializedName("CS-2-1-1")
    private String cs211;		// 符合医学指征

    @SerializedName("CS-2-1-1-1")
    private String cs2111;		// 剖宫产指征

    @SerializedName("CS-2-1-1-a")
    private String cs211a;		// 胎儿窘迫

    @SerializedName("CS-2-1-1-b")
    private String cs211b;		// 头盆不称

    @SerializedName("CS-2-1-1-c")
    private String cs211c;		// 瘢痕子宫

    @SerializedName("CS-2-1-1-d")
    private String cs211d;		// 胎位异常

    @SerializedName("CS-2-1-1-e")
    private String cs211e;		// 前置胎盘及前置血管

    @SerializedName("CS-2-1-1-f")
    private String cs211f;		// 双胎或多胎妊娠

    @SerializedName("CS-2-1-1-g")
    private String cs211g;		// 脐带脱垂

    @SerializedName("CS-2-1-1-h")
    private String cs211h;		// 胎盘早剥

    @SerializedName("CS-2-1-1-i")
    private String cs211i;		// 孕妇存在严重合并症和并发症

    @SerializedName("CS-2-1-1-j")
    private String cs211j;		// 妊娠巨大儿者

    @SerializedName("CS-2-1-1-k")
    private String cs211k;		// 产道畸形

    @SerializedName("CS-2-1-1-l")
    private String cs211l;		// 外阴疾病

    @SerializedName("CS-2-1-1-m")
    private String cs211m;		// 生殖道严重的感染性疾病

    @SerializedName("CS-2-1-1-n")
    private String cs211n;		// 妊娠合并肿瘤

    @SerializedName("CS-2-1-1-o")
    private String cs211o;		// 剖宫产+伴绝育手术

    @SerializedName("CS-2-1-1-p")
    private String cs211p;		// 其他病理状态

    @SerializedName("CS-2-1-1-q")
    private String cs211q;		// 高龄初产妇

    @SerializedName("CS-2-1-1-r")
    private String cs211r;		// 符合DRGs编码的 剖宫产,伴重要合并症与伴隨病

    @SerializedName("CS-2-2-1")
    private String cs221;		// 孕妇要求剖宫产的评估

    @SerializedName("CS-2-3-1")
    private String cs231;		// 手术方式选择




    private transient Date cs242;		// 胎儿娩出日期时间

    @SerializedName("CS-4-1")
    private String cs41;		// 是否实施新生儿Apgar评分

    @SerializedName("CS-4-2")
    private String cs42;		// 新生儿出生后1、5、10min,Apgar评分值

    @SerializedName("CS-4-3-1")
    private String cs431;		// 出生后1min,Apgar评分值

    @SerializedName("CS-4-3-2")
    private String cs432;		// 出生后5min,Apgar评分值

    @SerializedName("CS-4-3-3")
    private String cs433;		// 出生后10min,Apgar评分值

    @SerializedName("CS-5-1")
    private String cs51;		// 术后24小时内出血量

    @SerializedName("CS-5-1-1")
    private String cs511;		// 术后24小时内实际出血量（ml）


    private transient String cs521;		// 剖宫产产后出血可能的原因

    @SerializedName("CS-5-3")
    private String cs53;		// 术后24小时内输血量

    @SerializedName("CS-5-4")
    private String cs54;		// 术后24小时内实际输血量（ml）


    private transient String cs55;		// 止血干预措施的选择

    @SerializedName("CS-6-1-1")
    private String cs611;		// 是否有剖宫产并发症

    @SerializedName("CS-6-1-2-1")
    private String cs6121;		// 剖宫产并发症ICD.10编码

    @SerializedName("CS-6-1-2-1-a")
    private String cs6121a;		// 产后出血

    @SerializedName("CS-6-1-2-1-b")
    private String cs6121b;		// 产褥期感染

    @SerializedName("CS-6-1-2-1-c")
    private String cs6121c;		// 产科栓塞

    @SerializedName("CS-6-1-2-1-d")
    private String cs6121d;		// 栓塞病

    @SerializedName("CS-6-1-2-1-e")
    private String cs6121e;		// 胎盘和胎膜滞留不伴有出血

    @SerializedName("CS-6-1-2-1-f")
    private String cs6121f;		// 产科手术伤口的感染

    @SerializedName("CS-6-1-2-1-g")
    private String cs6121g;		// 产科伤口裂开

    @SerializedName("CS-6-1-2-1-h")
    private String cs6121h;		// 其他并发症

    @SerializedName("CS-6-2")
    private String cs62;		// 是否再次手术

    @SerializedName("CS-6-3")
    private String cs63;		// 再次手术原因

    @SerializedName("CS-6-3-1")
    private String cs631;		// 其他再次手术原因

    @SerializedName("CS-6-4")
    private String cs64;		// 影响程度的选择

    @SerializedName("CS-7-1")
    private String cs71;		// 是否有新生儿产伤

    @SerializedName("CS-7-2")
    private String cs72;		// 产程和分娩期间并发症所列的名称及ICD.10编码

    @SerializedName("CS-7-2-a")
    private String cs72a;		// ICD-10：P10产伤引起的颅内撕裂和出血

    @SerializedName("CS-7-2-b")
    private String cs72b;		// ICD-10：P11产伤致新生儿脑伤

    @SerializedName("CS-7-2-c")
    private String cs72c;		// ICD-10：P12头皮产伤

    @SerializedName("CS-7-2-d")
    private String cs72d;		// ICD-10：P13颅骨产伤

    @SerializedName("CS-7-2-e")
    private String cs72e;		// ICD-10：P14神经产伤

    @SerializedName("CS-7-2-f")
    private String cs72f;		// ICD-10：P15其他产伤

    @SerializedName("CS-7-2-g")
    private String cs72g;		// ICD-10：P20子宫内低氧症

    @SerializedName("CS-7-2-h")
    private String cs72h;		// ICD-10：P21出生窒息

    @SerializedName("CS-7-3")
    private String cs73;		// 新生儿是否有先天性畸形、变形和染色体异常

    @SerializedName("CS-7-4")
    private String cs74;		// 新生儿：先天性畸形、变形和染色体异常的名称及ICD.10编码

    @SerializedName("CS-8-1-1")
    private String cs811;		// 母乳喂养禁忌症选择

    @SerializedName("CS-8-2")
    private String cs82;		// 提供母乳喂养


    private transient String cs911;		// 住院期间为产妇提供术前健康教育


    private transient String cs912;		// 提供产后康复健康教育

    @SerializedName("CS-9-1-3")
    private String cs913;		// 是否提供术后镇痛

    @SerializedName("CS-9-1-4")
    private String cs914;		// 药物选择

    @SerializedName("CS-9-4-1")
    private String cs9141;		// 其他镇痛药物

    @SerializedName("CS-12-1")
    private String cs1$21;		// 体内乙肝病毒检测是否阳性孕妇

    @SerializedName("CS-12-2")
    private String cs1$22;		// 孕妇体内乙肝病毒含量风险评估

    @SerializedName("CS-12-3")
    private String cs1$23;		// 高风险孕妇孕期使用核苷类抗病毒药物

    @SerializedName("CS-12-3-1")
    private String cs1$231;		// 高风险孕妇孕期使用核苷类抗病毒药物

    @SerializedName("CS-12-3-2")
    private String cs1$232;		// 其他核苷类抗病毒药物

    @SerializedName("CS-12-4")
    private String cs1$24;		// 产时降低传播的措施

    @SerializedName("CS-12-5")
    private String cs1$25;		// HBsAg阳性母亲的新生儿，出生后注射乙肝免疫球蛋白(HBIG)情况


    private transient String cs123$1;		// 麻醉前知情告知

    @SerializedName("CM-7-2-1")
    private List<String> cm721List;

    @SerializedName("CM-7-2-2")
    private List<String> cm722List;

    @SerializedName("CM-7-2-3")
    private List<String> cm723List;

    @SerializedName("CM-0-2-6-2")
    private String cm0262String;

    @SerializedName("CM-0-2-3-2")
    private String cm0232String;

    @SerializedName("CM-0-2-4-1")
    private String cm0241String;

    @SerializedName("CM-0-2-3-1")
    private List<String> cm0231List;

    @SerializedName("CM-0-2-6-1")
    private String cm0261String;

    @SerializedName("CS-2-4-2")
    private String cs242String;

    @SerializedName("CS-9-1-1")
    private List<String> cs911List;

    @SerializedName("CM-0-2-4-2")
    private String cm0242String;

    @SerializedName("CS-9-1-2")
    private List<String> cs912List;

    @SerializedName("CM-7-2-5")
    private List<String> cm725List;

    @SerializedName("CM-0-2-1-1")
    private String cm0211String;

    @SerializedName("CS-1-2-1")
    private List<String> cs121List;

    @SerializedName("CS-1-2-2")
    private List<String> cs122List;

    @SerializedName("CS-5-5")
    private List<String> cs55List;

    @SerializedName("CS-5-2-1")
    private List<String> cs521List;

    @SerializedName("CS-1-2-31")
    private List<String> cs123$1List;

    @SerializedName("CS-0-2-2-1")
    private List<String> cs0221List;

    public void setCs0221(String cs0221) {
        this.cs0221 = cs0221;
        List<String> list = new ArrayList<>();
        list.add(cs0221);
        cs0221List = list;
    }

    public void setCs123$1(String cs123$1) {
        this.cs123$1 = cs123$1;
        List<String> list = new ArrayList<>();
        String[] strings = cs123$1.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cs123$1List = list;
    }

    public void setCs521(String cs521) {
        this.cs521 = cs521;
        List<String> list = new ArrayList<>();
        String[] strings = cs521.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cs521List = list;
    }

    public void setCs55(String cs55) {
        this.cs55 = cs55;
        List<String> list = new ArrayList<>();
        String[] strings = cs55.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cs55List = list;
    }

    public void setCs122(String cs122) {
        this.cs122 = cs122;
        List<String> list = new ArrayList<>();
        String[] strings = cs122.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cs122List = list;
    }

    public void setCs121(String cs121) {
        this.cs121 = cs121;
        List<String> list = new ArrayList<>();
        String[] strings = cs121.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cs121List = list;
    }

    public void setCm0211(Date cm0211) {
        this.cm0211 = cm0211;
        this.cm0211String = DateUtils.formatDate(cm0211,"yyyy-MM-dd");
    }

    public void setCm725(String cm725) {
        this.cm725 = cm725;
        List<String> list = new ArrayList<>();
        String[] strings = cm725.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cm725List = list;
    }

    public void setCs912(String cs912) {
        this.cs912 = cs912;
        List<String> list = new ArrayList<>();
        String[] strings = cs912.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cs912List = list;
    }

    public void setCm0242(Date cm0242) {
        this.cm0242 = cm0242;
        this.cm0242String = DateUtils.formatDate(cm0242,"yyyy-MM-dd HH:mm");
    }

    public void setCs911(String cs911) {
        this.cs911 = cs911;
        List<String> list = new ArrayList<>();
        String[] strings = cs911.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cs911List = list;
    }

    public void setCs242(Date cs242) {
        this.cs242 = cs242;
        this.cs242String = DateUtils.formatDate(cs242,"yyyy-MM-dd HH:mm");
    }

    public void setCm0261(Date cm0261) {
        this.cm0261 = cm0261;
        this.cm0261String = DateUtils.formatDate(cm0261,"yyyy-MM-dd HH:mm");
    }

    public void setCm0241(Date cm0241) {
        this.cm0241 = cm0241;
        this.cm0241String = DateUtils.formatDate(cm0241,"yyyy-MM-dd HH:mm");
    }

    public void setCm721(String cm721) {
        this.cm721 = cm721;
        List<String> list = new ArrayList<>();
        String[] strings = cm721.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cm721List = list;
    }

    public void setCm722(String cm722) {
        this.cm722 = cm722;
        List<String> list = new ArrayList<>();
        String[] strings = cm722.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cm722List = list;
    }

    public void setCm723(String cm723) {
        this.cm723 = cm723;
        List<String> list = new ArrayList<>();
        String[] strings = cm723.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cm723List = list;
    }

    public void setCm0231(String cm0231) {
        this.cm0231 = cm0231;
        List<String> list = new ArrayList<>();
        String[] strings = cm0231.split(",");
        for (String s : strings) {
            list.add(s);
        }
        cm0231List = list;
    }

    public void setCm0262(Date cm0262) {
        this.cm0262 = cm0262;
        this.cm0262String = DateUtils.formatDate(cm0262,"yyyy-MM-dd HH:mm");
    }

    public void setCm0232(Date cm0232) {
        this.cm0232 = cm0232;
        this.cm0232String = DateUtils.formatDate(cm0232,"yyyy-MM-dd HH:mm");
    }
}
