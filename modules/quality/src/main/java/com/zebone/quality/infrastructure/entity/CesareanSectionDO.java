package com.zebone.quality.infrastructure.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 剖宫产
 * @author 卡卡西
 */
@Entity
@Data
@Table(name = "QUALITY_CESAREAN_SECTION")
public class CesareanSectionDO extends BaseEntity{






    /**
     * 新生儿出生体重（克）
     */
    private Double cm0216;

    /**
     * 末次月经期是否确定
     */
    @Column(length = 32)
    private String cs0221;

    /**
     * 末次月经日期
     */
    private Date cs022;

    /**
     * 到达本院急诊或者门诊日期时间是否确定
     */
    @Column(length = 32)
    private String cm0231;









    /**
     * 手术开始（切皮）日期时间：
     */
    private Date cm0261;

    /**
     * 手术结束（缝皮结束）日期时间：
     */
    private Date cm0262;







    /**
     * 产次
     */
    @Column(length = 32)
    private String cs111;

    /**
     * 剖宮产史
     */
    @Column(length = 32)
    private String cs1111;

    /**
     * 临产方式：
     */
    @Column(length = 32)
    private String cs113;

    /**
     *孕周
     */
    @Column(length = 32)
    private String cs114;

    /**
     * 胎位
     */
    @Column(length = 32)
    private String cs115;

    /**
     * 胎儿数量：
     */
    @Column(length = 32)
    private String cs116;



    /**
     * 手术前风险评估的检查项目：
     */
    @Column(length = 32)
    private String cs121;

    /**
     * 手术前知情告知
     */
    @Column(length = 32)
    private String cs122;

    /**
     * 麻醉前知情告知
     */
    @Column(length = 32,name = "CS_1_2_31")
    private String cs_1_2_3$1;

    /**
     * 麻醉方式
     */
    @Column(length = 32)
    private String cs124;

    /**
     * 特殊感染评估
     */
    @Column(length = 32)
    private String cs125;

    /**
     * 孕妇伴有特殊感染ICD.10编码及诊断名称
     */
    @Column(length = 32)
    private String cs126;

    /**
     * 剖宫产指征：
     */
    @Column(length = 32)
    private String cs2111;


    /**
     * 符合医学指征
     */
    @Column(length = 32)
    private String cs211;

    /**
     * 胎儿窘迫
     */
    @Column(length = 32)
    private String cs211a;

    /**
     * 头盆不称
     */
    @Column(length = 32)
    private String cs211b;

    /**
     * 瘢痕子宫
     */
    @Column(length = 32)
    private String cs211c;

    /**
     * 胎位异常
     */
    @Column(length = 32)
    private String cs211d;

    /**
     * 前置胎盘及前置血管
     */
    @Column(length = 32)
    private String cs211e;

    /**
     * 双胎或多胎妊娠
     */
    @Column(length = 32)
    private String cs211f;

    /**
     * 脐带脱垂
     */
    @Column(length = 32)
    private String cs211g;

    /**
     * 胎盘早剥
     */
    @Column(length = 32)
    private String cs211h;


    /**
     *孕妇存在严重合并症和并发症
     */
    @Column(length = 32)
    private String cs211i;


    /**
     * 妊娠巨大儿者
     */
    @Column(length = 32)
    private String cs211j;


    /**
     * 产道畸形
     */
    @Column(length = 32)
    private String cs211k;

    /**
     * 外阴疾病
     */
    @Column(length = 32)
    private String cs211l;


    /**
     * 妊娠合并肿瘤
     */
    @Column(length = 32)
    private String cs211n;


    /**
     * 生殖道严重的感染性疾病
     */
    @Column(length = 32)
    private String cs211m;




    /**
     * 剖宫产+伴绝育手术
     */
    @Column(length = 32)
    private String cs211o;


    /**
     * 其他病理状态
     */
    @Column(length = 32)
    private String cs211p;

    /**
     * 高龄初产妇
     */
    @Column(length = 32)
    private String cs211q;


    /**
     * 符合DRGs编码的 剖宫产,伴重要合并症与伴隨病
     */
    @Column(length = 32)
    private String cs211r;

    /**
     * 孕妇要求剖宫产的评估
     */
    @Column(length = 32)
    private String cs221;

    /**
     * 手术方式选择
     */
    @Column(length = 32)
    private String cs231;

    /**
     * 胎儿娩出日期时间
     */
    private Date cs242;

    /**
     * 是否使用预防性抗菌药物
     */
    @Column(length = 32)
    private String cm111;

    /**
     * 预防性抗菌药物选择
     */
    @Column(length = 32)
    private String cm1212;

    /**
     * 选择碳青霉烯类及替加环素等特殊使用级抗菌药物
     */
    @Column(length = 32)
    private String cm1222;

    /**
     * 其他特殊使用级抗菌药物名称
     */
    @Column(length = 32)
    private String cm1221;

    /**
     * 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素
     */
    @Column(length = 32)
    private String cm1312;


    /**
     * 选用“特殊使用级抗菌药物”或者其他类抗菌药物的因素填写
     */
    @Column(length = 32)
    private String cm1311;


    /**
     * 使用首剂抗菌药物起始时间
     */
    @Column(length = 32)
    private String cm141;

    /**
     * 手术时间是否≥3小时
     */
    @Column(length = 32)
    private String cm151;

    /**
     * 是否术中追加抗菌药物
     */
    @Column(length = 32)
    private String cm152;

    /**
     * 术中出血量是否≥1500ml
     */
    @Column(length = 32)
    private String cm153;

    /**
     * 是否术中追加抗菌药物
     */
    @Column(length = 32)
    private String cm154;

    /**
     * 术后抗菌药物停止使用时间
     */
    @Column(length = 32)
    private String cm161;

    /**
     * 使用抗菌药物时间使用时间分层
     */
    @Column(length = 32)
    private String cm162;


    /**
     * 术后48小时之后继续使用的原因
     */
    @Column(length = 32)
    private String cm1632;

    /**
     * 是否实施新生儿Apgar评分
     */
    @Column(length = 32)
    private String cs41;

    /**
     * 新生儿出生后1、5、10min,Apgar评分值
     */
    @Column(length = 32)
    private String cs42;

    /**
     * 出生后1min,Apgar评分值
     */
    @Column(length = 32)
    private String cs431;

    /**
     * 出生后5min,Apgar评分值
     */
    @Column(length = 32)
    private String cs432;

    /**
     * 出生后10min,Apgar评分值
     */
    @Column(length = 32)
    private String cs433;

    /**
     * 术后24小时内出血量
     */
    @Column(length = 32)
    private String cs51;

    /**
     * 术后24小时内实际出血量（ml）
     */
    @Column(length = 32)
    private String cs511;

    /**
     * 剖宫产产后出血可能的原因
     */
    @Column(length = 32)
    private String cs521;

    /**
     * 术后24小时内输血量
     */
    @Column(length = 32)
    private String cs53;

    /**
     * 术后24小时内实际输血量（ml）
     */
    @Column(length = 32)
    private String cs54;

    /**
     * 止血干预措施的选择
     */
    @Column(length = 32)
    private String cs55;

    /**
     * 是否有剖宫产并发症
     */
    @Column(length = 32)
    private String cs611;

    /**
     * 剖宫产并发症ICD.10编码
     */
    @Column(length = 32)
    private String cs6121;

    /**
     * 产后出血
     */
    @Column(length = 32)
    private String cs6121a;

    /**
     * 产褥期感染
     */
    @Column(length = 32)
    private String cs6121b;

    /**
     * 产科栓塞
     */
    @Column(length = 32)
    private String cs6121c;


    /**
     * 栓塞病
     */
    @Column(length = 32)
    private String cs6121d;


    /**
     * 胎盘和胎膜滞留不伴有出血
     */
    @Column(length = 32)
    private String cs6121e;

    /**
     * 产科手术伤口的感染
     */
    @Column(length = 32)
    private String cs6121f;


    /**
     * 产科伤口裂开
     */
    @Column(length = 32)
    private String cs6121g;


    /**
     * 其他并发症
     */
    @Column(length = 32)
    private String cs6121h;


    /**
     * 是否再次手术
     */
    @Column(length = 32)
    private String cs62;

    /**
     * 再次手术原因
     */
    @Column(length = 32)
    private String cs63;


    /**
     * 其他再次手术原因
     */
    @Column(length = 32)
    private String cs631;

    /**
     * 影响程度的选择
     */
    @Column(length = 32)
    private String cs64;

    /**
     * 是否有新生儿产伤
     */
    @Column(length = 32)
    private String cs71;

    /**
     * 产程和分娩期间并发症所列的名称及ICD.10编码
     */
    @Column(length = 32)
    private String cs72;


    /**
     * ICD-10：P10产伤引起的颅内撕裂和出血
     */
    @Column(length = 32)
    private String cs72a;


    /**
     * ICD-10：P11产伤致新生儿脑伤
     */
    @Column(length = 32)
    private String cs72b;


    /**
     * ICD-10：P12头皮产伤
     */
    @Column(length = 32)
    private String cs72c;


    /**
     * ICD-10：P13颅骨产伤
     */
    @Column(length = 32)
    private String cs72d;


    /**
     * ICD-10：P14神经产伤
     */
    @Column(length = 32)
    private String cs72e;


    /**
     * ICD-10：P15其他产伤
     */
    @Column(length = 32)
    private String cs72f;


    /**
     * ICD-10：P20子宫内低氧症
     */
    @Column(length = 32)
    private String cs72g;

    /**
     * ICD-10：P21出生窒息
     */
    @Column(length = 32)
    private String cs72h;

    /**
     * 新生儿是否有先天性畸形、变形和染色体异常
     */
    @Column(length = 32)
    private String cs73;

    /**
     * 新生儿：先天性畸形、变形和染色体异常的名称及ICD.10编码
     */
    @Column(length = 32)
    private String cs74;


    /**
     * 母乳喂养禁忌症选择
     */
    @Column(length = 32)
    private String cs811;

    /**
     * 提供母乳喂养
     */
    @Column(length = 32)
    private String cs82;

    /**
     * 住院期间为产妇提供术前健康教育
     */
    @Column(length = 32)
    private String cs911;

    /**
     * 提供产后康复健康教育
     */
    @Column(length = 32)
    private String cs912;

    /**
     * 是否提供术后镇痛
     */
    @Column(length = 32)
    private String cs913;

    /**
     * 药物选择
     */
    @Column(length = 32)
    private String cs914;


    /**
     * 其他镇痛药物
     */
    @Column(length = 32)
    private String cs9141;



    /**
     * 交与患者“出院小结”的副本告知患者出院时风险因素
     */
    @Column(length = 32)
    private String cm721;

    /**
     * 母乳喂养与出院带药
     */
    @Column(length = 32)
    private String cm722;

    /**
     * 告知 出院关注事项
     */
    @Column(length = 32)
    private String cm723;

    /**
     * 出院时教育
     */
    @Column(length = 32)
    private String cm724;

    /**
     * 告知随访
     */
    @Column(length = 32)
    private String cm725;

    /**
     * 手术野皮肤准备常用方法的选择
     */
    @Column(length = 32)
    private String cm31;

    /**
     * 使用含抗菌剂（三氯生）缝线
     */
    @Column(length = 32)
    private String cm32;


    /**
     * 其他含抗菌剂缝线填写
     */
    @Column(length = 32)
    private String cm321;


    /**
     * 手术切口类别的选择
     */
    @Column(length = 32)
    private String cm33;

    /**
     * 手术切口愈合情况的选择
     */
    @Column(length = 32)
    private String cm34;

































    /**
     * 体内乙肝病毒检测是否阳性孕妇
     */
    @Column(length = 32,name = "cs_12_1")
    private String cs_1$2_1;

    /**
     * 孕妇体内乙肝病毒含量风险评估
     */
    @Column(length = 32,name = "CS_12_2")
    private String cs_1$2_2;

    /**
     * 高风险孕妇孕期使用核苷类抗病毒药物
     */
    @Column(length = 32)
    private String cs_12_3;

    /**
     * 高风险孕妇孕期使用核苷类抗病毒药物
     */
    @Column(length = 32)
    private String cs_12_3_1;


    /**
     * 其他核苷类抗病毒药物
     */
    @Column(length = 32)
    private String cs_12_3_2;


    /**
     * 产时降低传播的措施
     */
    @Column(length = 32,name = "CS_12_4")
    private String cs_1$2_4;


    /**
     * HBsAg阳性母亲的新生儿，出生后注射乙肝免疫球蛋白(HBIG)情况
     */
    @Column(length = 32,name = "CS_12_5")
    private String cs_1$2_5;

















}
