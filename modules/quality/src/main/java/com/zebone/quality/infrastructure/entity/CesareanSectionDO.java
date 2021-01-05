package com.zebone.quality.infrastructure.entity;

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
     * 出生日期
     */
    private Date birth;

    /**
     * 体重
     */
    private Integer weight;

    /**
     * 身高
     */
    private Integer height;


    /**
     * 新生儿体重
     */
    private Integer infantWeight;

    /**
     * 末次月经期是否确定
     */
    @Column(length = 32)
    private String lastMenstruationDetermine;

    /**
     * 末次月经日期
     */
    private Date lastMenstruation;

    /**
     * 到达本院急诊或者门诊日期时间是否确定
     */
    @Column(length = 32)
    private String arrivalsTimeDetermine;

    /**
     * 到达本院急诊或者门诊日期时间：
     */
    private Date arrivalsTime;

    /**
     * 入院日期时间：
     */
    private Date admissionTime;


    /**
     * 出院日期时间
     */
    private Date dischargeTime;


    /**
     * 手术开始（切皮）日期时间：
     */
    private Date operationStartedTime;

    /**
     * 手术结束（缝皮结束）日期时间：
     */
    private Date operationEndTime;

    /**
     * 费用支付方式：
     */
    @Column(length = 32)
    private String paymentMethod;

    /**
     * 收入住院途径：
     */
    @Column(length = 32)
    private String hospitalization;

    /**
     * 到院交通工具：
     */
    @Column(length = 32)
    private String transportation;

    /**
     * 产次
     */
    @Column(length = 32)
    private String pregnancyTimes;

    /**
     * 临产方式：
     */
    @Column(length = 32)
    private String laborMode;

    /**
     *孕周
     */
    @Column(length = 32)
    private String gestationalWeek;

    /**
     * 胎位
     */
    @Column(length = 32)
    private String fetalPosition;

    /**
     * 胎儿数量：
     */
    @Column(length = 32)
    private String fetusesNumber;

    /**
     * Robson分类法组别：
     */
    @Column(length = 32)
    private String robsonClassification;

    /**
     * 手术前风险评估的检查项目：
     */
    @Column(length = 32)
    private String preOperationRiskItems;

    /**
     * 手术前知情告知
     */
    @Column(length = 32)
    private String informedBeforeSurgery;

    /**
     * 麻醉前知情告知
     */
    @Column(length = 32)
    private String informedBeforeAnesthesia;

    /**
     * 麻醉方式
     */
    @Column(length = 32)
    private String anesthesia;

    /**
     * 剖宫产指征：
     */
    @Column(length = 32)
    private String indications;


    /**
     * 手术方式选择
     */
    @Column(length = 32)
    private String surgicalMethods;

    /**
     * 胎儿娩出日期时间
     */
    private Date fetusDelivery;

    /**
     * 是否使用预防性抗菌药物
     */
    @Column(length = 32)
    private String antibacterialDrugs;

    /**
     * 是否实施新生儿Apgar评分：
     */
    @Column(length = 32)
    private String apgarScore;

    /**
     * 剖宫产产后出血可能的原因
     */
    @Column(length = 32)
    private String bleeding;

    /**
     * 术后24小时内输血量
     */
    @Column(length = 32)
    private String bloodTransfusion;


    /**
     * 止血干预措施的选择
     */
    @Column(length = 32)
    private String hemostasis;

    /**
     * 是否有剖宫产并发症
     */
    @Column(length = 32)
    private String complication;

    /**
     * 是否再次手术
     */
    @Column(length = 32)
    private String reoperation;

    /**
     * 影响程度
     */
    @Column(length = 32)
    private String influenceLevel;

    /**
     * 是否有新生儿产伤
     */
    @Column(length = 32)
    private String birthInjury;

    /**
     * 新生儿是否有先天性畸形、变形和染色体异常
     */
    @Column(length = 32)
    private String deformity;

    /**
     * 母乳喂养禁忌症选择
     */
    @Column(length = 32)
    private String contraindications;

    /**
     * 住院期间为产妇提供术前健康教育
     */
    @Column(length = 32)
    private String healthEducationBefore;

    /**
     * 提供产后康复健康教育
     */
    @Column(length = 32)
    private String healthEducationAfter;

    /**
     * 是否提供术后镇痛
     */
    @Column(length = 32)
    private String analgesia;

    /**
     * 交与患者“出院小结”的副本告知患者出院时风险因素：
     */
    @Column(length = 32)
    private String riskFactors;

    /**
     * 母乳喂养与出院带药：
     */
    @Column(length = 32)
    private String breastfeeding;

    /**
     * 告知 出院关注事项
     */
    @Column(length = 32)
    private String concerns;

    /**
     * 出院时教育
     */
    @Column(length = 32)
    private String education;

    /**
     * 告知随访
     */
    @Column(length = 32)
    private String followUp;

    /**
     * 手术野皮肤准备常用方法的选择
     */
    @Column(length = 32)
    private String wildSkin;

    /**
     * 使用含抗菌剂（三氯生）缝线
     */
    @Column(length = 32)
    private String suture;

    /**
     * 手术切口类别的选择
     */
    @Column(length = 32)
    private String cutCategory;

    /**
     * 手术切口愈合情况的选择
     */
    @Column(length = 32)
    private String incisionHealing;

    /**
     * 住院天数
     */
    @Column(length = 32)
    private String daysInHospital;

    /**
     * 术后24小时内出血量
     */
    @Column(length = 32)
    private String postoperativeBleeding;

    /**
     * 术后住院天数
     */
    @Column(length = 32)
    private String daysInHospitalAfterSurgery;

    /**
     * 离院方式选择
     */
    @Column(length = 32)
    private String leavingHospitalWay;

    /**
     * 患者是否对服务的体验与评价
     */
    @Column(length = 32)
    private String patientEvaluation;

    /**
     * 医院整体评级
     */
    @Column(length = 32)
    private String overallHospitalRating;

    /**
     * 患者推荐
     */
    @Column(length = 32)
    private String patientRecommendation;

    /**
     * 病房、床单元和卫生间清洁度
     */
    @Column(length = 32)
    private String cleanliness;

    /**
     * 病房与周边噪音
     */
    @Column(length = 32)
    private String noise;

    /**
     * 医生沟通
     */
    @Column(length = 32)
    private String doctorCommunication;

    /**
     * 护士沟通
     */
    @Column(length = 32)
    private String nurseCommunication;

    /**
     * 体内乙肝病毒检测是否阳性孕妇
     */
    @Column(length = 32)
    private String hepatitisBVirus;

    /**
     * 药师沟通
     */
    @Column(length = 32)
    private String pharmacistCommunication;

    /**
     * 康复计划
     */
    @Column(length = 32)
    private String rehabilitationPlan;

    /**
     * 出院时的知情告知
     */
    @Column(length = 32)
    private String informedNotificationDischarge;

    /**
     * 膳食评价
     */
    @Column(length = 32)
    private String dietaryEvaluation;

    /**
     *住院总费用
     */
    private Double totalCost;

    /**
     * 住院总费用其中自付金额
     */
    private Double outOfPocketAmount;

    /**
     *一般医疗服务费
     */
    private Double medicalServiceFee;

    /**
     * 一般治疗操作费
     */
    private Double treatmentOperationFee;

    /**
     * 护理费
     */
    private Double nursingFee;

    /**
     * 综合医疗服务类其他费用
     */
    private Double comprehensiveCost;

    /**
     * 病理诊断费
     */
    private Double pathologicalDiagnosisFee;

    /**
     * 实验室诊断费
     */
    private Double laboratoryDiagnosisFee;

    /**
     * 影像学诊断费
     */
    private Double imagingDiagnosisFee;

    /**
     * 临床诊断项目费
     */
    private Double clinicalDiagnosisProjectFee;

    /**
     * 非手术治疗项目费
     */
    private Double nonSurgicalTreatmentProjectFee;

    /**
     * 临床物理治疗费
     */
    private Double clinicalPhysicalTherapyFee;

    /**
     * 手术治疗费
     */
    private Double surgicalTreatmentFee;

    /**
     * 麻醉费
     */
    private Double anesthesiaFee;

    /**
     * 手术费
     */
    private Double surgicalFees;

    /**
     * 康复费
     */
    private Double rehabilitationFee;

    /**
     * 中医治疗费
     */
    private Double tcmTreatmentFee;

    /**
     * 西药费
     */
    private Double westernMedicineFee;

    /**
     * 抗菌药物费
     */
    private Double antimicrobialFees;

    /**
     * 中成药费
     */
    private Double patentMedicineFee;

    /**
     * 中草药费
     */
    private Double herbalMedicineFee;

    /**
     * 血费
     */
    private Double bloodFee;

    /**
     * 白蛋白类制品费
     */
    private Double albuminProductFee;

    /**
     * 球蛋白类制品费
     */
    private Double globulinProductsFee;

    /**
     *凝血因子类制品费
     */
    private Double coagulationFactorProductFee;

    /**
     * 细胞因子类制品费
     */
    private Double cytokineProductFee;

    /**
     * 检查用一次性医用材料费
     */
    private Double inspectionOneTimeMaterialsFee;

    /**
     * 治疗用一次性医用材料费
     */
    private Double treatmentOneTimeMaterialsFee;


    /**
     * 手术用一次性医用材料费
     */
    private Double surgeryOneTimeMaterialsFee;

    /**
     * 其他费
     */
    private Double otherFees;
}
