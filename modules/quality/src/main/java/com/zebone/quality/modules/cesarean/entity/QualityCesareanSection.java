/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.cesarean.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 剖宫产Entity
 * @author lijin
 * @version 2021-01-04
 */
@Table(name="quality_cesarean_section", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="quality_physician", attrName="qualityPhysician", label="质控医师"),
		@Column(name="quality_nurse", attrName="qualityNurse", label="质控护士"),
		@Column(name="attending_physician", attrName="attendingPhysician", label="主治医师"),
		@Column(name="rsponsible_nurse", attrName="rsponsibleNurse", label="责任护士"),
		@Column(name="report_dept", attrName="reportDept", label="上报科室"),
		@Column(name="patient_case_number", attrName="patientCaseNumber", label="患者病案号"),
		@Column(name="suborder_code", attrName="suborderCode", label="出院诊断ICD-10四位亚目编码与名称"),
		@Column(name="clinical_ext_code", attrName="clinicalExtCode", label="出院诊断ICD-10六位临床扩展编码与名称"),
		@Column(name="main_operation", attrName="mainOperation", label="主要手术操作 国家临床版ICD-9.CM-3编码与手术名称"),
		@Column(name="repeat_hospital", attrName="repeatHospital", label="是否出院后31天内重复住院"),
		@Column(name="birth", attrName="birth", label="出生日期"),
		@Column(name="weight", attrName="weight", label="患者体重", comment="患者体重（kg）"),
		@Column(name="height", attrName="height", label="患者身高", comment="患者身高（cm）"),
		@Column(name="infant_weight", attrName="infantWeight", label="新生儿出生体重", comment="新生儿出生体重（克）"),
		@Column(name="last_menstruation_determine", attrName="lastMenstruationDetermine", label="末次月经日期是否确定"),
		@Column(name="last_menstruation", attrName="lastMenstruation", label="末次月经日期"),
		@Column(name="arrivals_time_determine", attrName="arrivalsTimeDetermine", label="到达本院急诊或者门诊日期时间是否确定"),
		@Column(name="arrivals_time", attrName="arrivalsTime", label="到达本院急诊或者门诊日期时间"),
		@Column(name="admission_time", attrName="admissionTime", label="入院日期时间"),
		@Column(name="discharge_time", attrName="dischargeTime", label="出院日期时间"),
		@Column(name="operation_started_time", attrName="operationStartedTime", label="手术开始", comment="手术开始（切皮）日期时间"),
		@Column(name="operation_end_time", attrName="operationEndTime", label="手术结束", comment="手术结束（缝皮结束）日期时间"),
		@Column(name="payment_method", attrName="paymentMethod", label="费用支付方式"),
		@Column(name="hospitalization", attrName="hospitalization", label="收入住院途径"),
		@Column(name="transportation", attrName="transportation", label="到院交通工具"),
		@Column(name="pregnancy_times", attrName="pregnancyTimes", label="产次"),
		@Column(name="labor_mode", attrName="laborMode", label="临产方式"),
		@Column(name="gestational_week", attrName="gestationalWeek", label="孕周"),
		@Column(name="fetal_position", attrName="fetalPosition", label="胎位"),
		@Column(name="fetuses_number", attrName="fetusesNumber", label="胎儿数量"),
		@Column(name="robson_classification", attrName="robsonClassification", label="Robson分类法组别"),
		@Column(name="pre_operation_risk_items", attrName="preOperationRiskItems", label="手术前风险评估的检查项目"),
		@Column(name="informed_before_surgery", attrName="informedBeforeSurgery", label="手术前知情告知"),
		@Column(name="informed_before_anesthesia", attrName="informedBeforeAnesthesia", label="麻醉前知情告知"),
		@Column(name="anesthesia", attrName="anesthesia", label="麻醉方式"),
		@Column(name="indications", attrName="indications", label="剖宫产指征"),
		@Column(name="surgical_methods", attrName="surgicalMethods", label="手术方式选择"),
		@Column(name="fetus_delivery", attrName="fetusDelivery", label="胎儿娩出日期时间"),
		@Column(name="antibacterial_drugs", attrName="antibacterialDrugs", label="是否使用预防性抗菌药物"),
		@Column(name="apgar_score", attrName="apgarScore", label="是否实施新生儿Apgar评分"),
		@Column(name="postoperative_bleeding", attrName="postoperativeBleeding", label="术后24小时内出血量"),
		@Column(name="bleeding", attrName="bleeding", label="剖宫产产后出血可能的原因"),
		@Column(name="blood_transfusion", attrName="bloodTransfusion", label="术后24小时内输血量"),
		@Column(name="hemostasis", attrName="hemostasis", label="止血干预措施的选择"),
		@Column(name="complication", attrName="complication", label="是否有剖宫产并发症"),
		@Column(name="reoperation", attrName="reoperation", label="是否再次手术"),
		@Column(name="influence_level", attrName="influenceLevel", label="影响程度的选择"),
		@Column(name="birth_injury", attrName="birthInjury", label="是否有新生儿产伤"),
		@Column(name="deformity", attrName="deformity", label="新生儿是否有先天性畸形、变形和染色体异常"),
		@Column(name="contraindications", attrName="contraindications", label="母乳喂养禁忌症选择"),
		@Column(name="health_education_before", attrName="healthEducationBefore", label="住院期间为产妇提供术前健康教育"),
		@Column(name="health_education_after", attrName="healthEducationAfter", label="提供产后康复健康教育"),
		@Column(name="analgesia", attrName="analgesia", label="是否提供术后镇痛"),
		@Column(name="risk_factors", attrName="riskFactors", label="交与患者“出院小结”的副本告知患者出院时风险因素"),
		@Column(name="breastfeeding", attrName="breastfeeding", label="母乳喂养与出院带药"),
		@Column(name="concerns", attrName="concerns", label="告知出院关注事项"),
		@Column(name="education", attrName="education", label="出院时教育"),
		@Column(name="follow_up", attrName="followUp", label="告知随访"),
		@Column(name="wild_skin", attrName="wildSkin", label="手术野皮肤准备常用方法的选择"),
		@Column(name="suture", attrName="suture", label="使用含抗菌剂", comment="使用含抗菌剂（三氯生）缝线"),
		@Column(name="cut_category", attrName="cutCategory", label="手术切口类别的选择"),
		@Column(name="incision_healing", attrName="incisionHealing", label="手术切口愈合情况的选择"),
		@Column(name="days_in_hospital", attrName="daysInHospital", label="住院天数"),
		@Column(name="days_in_hospital_after_surgery", attrName="daysInHospitalAfterSurgery", label="其中", comment="其中:术后住院天数"),
		@Column(name="leaving_hospital_way", attrName="leavingHospitalWay", label="离院方式选择"),
		@Column(name="patient_evaluation", attrName="patientEvaluation", label="患者是否对服务的体验与评价"),
		@Column(name="overall_hospital_rating", attrName="overallHospitalRating", label="整体医院评级"),
		@Column(name="patient_recommendation", attrName="patientRecommendation", label="患者推荐"),
		@Column(name="cleanliness", attrName="cleanliness", label="病房、床单元和卫生间清洁度"),
		@Column(name="noise", attrName="noise", label="病房与周边噪音"),
		@Column(name="doctor_communication", attrName="doctorCommunication", label="医生沟通"),
		@Column(name="nurse_communication", attrName="nurseCommunication", label="护士沟通"),
		@Column(name="pharmacist_communication", attrName="pharmacistCommunication", label="药师沟通"),
		@Column(name="rehabilitation_plan", attrName="rehabilitationPlan", label="康复计划"),
		@Column(name="informed_notification_discharge", attrName="informedNotificationDischarge", label="出院时的知情告知"),
		@Column(name="dietary_evaluation", attrName="dietaryEvaluation", label="膳食评价"),
		@Column(name="hepatitisbvirus", attrName="hepatitisbvirus", label="体内乙肝病毒检测是否阳性孕妇"),
		@Column(name="total_cost", attrName="totalCost", label="住院总费用"),
		@Column(name="out_of_pocket_amount", attrName="outOfPocketAmount", label="住院总费用其中自付金额"),
		@Column(name="medical_service_fee", attrName="medicalServiceFee", label="一般医疗服务费"),
		@Column(name="treatment_operation_fee", attrName="treatmentOperationFee", label="一般治疗操作费"),
		@Column(name="nursing_fee", attrName="nursingFee", label="护理费"),
		@Column(name="comprehensive_cost", attrName="comprehensiveCost", label="综合医疗服务类其他费用"),
		@Column(name="pathological_diagnosis_fee", attrName="pathologicalDiagnosisFee", label="病理诊断费"),
		@Column(name="laboratory_diagnosis_fee", attrName="laboratoryDiagnosisFee", label="实验室诊断费"),
		@Column(name="imaging_diagnosis_fee", attrName="imagingDiagnosisFee", label="影像学诊断费"),
		@Column(name="clinical_diagnosis_project_fee", attrName="clinicalDiagnosisProjectFee", label="临床诊断项目费"),
		@Column(name="non_surgical_treatment_project_fee", attrName="nonSurgicalTreatmentProjectFee", label="非手术治疗项目费"),
		@Column(name="clinical_physical_therapy_fee", attrName="clinicalPhysicalTherapyFee", label="其中", comment="其中：临床物理治疗费"),
		@Column(name="surgical_treatment_fee", attrName="surgicalTreatmentFee", label="手术治疗费"),
		@Column(name="anesthesia_fee", attrName="anesthesiaFee", label="其中", comment="其中：麻醉费"),
		@Column(name="surgical_fees", attrName="surgicalFees", label="其中", comment="其中：手术费"),
		@Column(name="rehabilitation_fee", attrName="rehabilitationFee", label="康复费"),
		@Column(name="tcm_treatment_fee", attrName="tcmTreatmentFee", label="中医治疗费"),
		@Column(name="western_medicine_fee", attrName="westernMedicineFee", label="西药费"),
		@Column(name="antimicrobial_fees", attrName="antimicrobialFees", label="其中", comment="其中：抗菌药物费"),
		@Column(name="patent_medicine_fee", attrName="patentMedicineFee", label="中成药费"),
		@Column(name="herbal_medicine_fee", attrName="herbalMedicineFee", label="中草药费"),
		@Column(name="blood_fee", attrName="bloodFee", label="血费"),
		@Column(name="albumin_product_fee", attrName="albuminProductFee", label="白蛋白类制品费"),
		@Column(name="globulin_products_fee", attrName="globulinProductsFee", label="球蛋白类制品费"),
		@Column(name="coagulation_factor_product_fee", attrName="coagulationFactorProductFee", label="凝血因子类制品费"),
		@Column(name="cytokine_product_fee", attrName="cytokineProductFee", label="细胞因子类制品费"),
		@Column(name="inspection_one_time_materials_fee", attrName="inspectionOneTimeMaterialsFee", label="检查用一次性医用材料费"),
		@Column(name="treatment_one_time_materials_fee", attrName="treatmentOneTimeMaterialsFee", label="治疗用一次性医用材料费"),
		@Column(name="surgery_one_time_materials_fee", attrName="surgeryOneTimeMaterialsFee", label="手术用一次性医用材料费"),
		@Column(name="other_fees", attrName="otherFees", label="其他费"),
	}, orderBy="a.id DESC"
)
public class QualityCesareanSection extends DataEntity<QualityCesareanSection> {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 质控医师
	 */
	private String qualityPhysician;
	/**
	 * 质控护士
	 */
	private String qualityNurse;
	/**
	 * 主治医师
	 */
	private String attendingPhysician;
	/**
	 * 责任护士
	 */
	private String rsponsibleNurse;
	private String reportDept;		// 上报科室
	/**
	 * 患者病案号
	 */
	private String patientCaseNumber;
	private String suborderCode;		// 出院诊断ICD-10四位亚目编码与名称
	private String clinicalExtCode;		// 出院诊断ICD-10六位临床扩展编码与名称
	private String mainOperation;		// 主要手术操作 国家临床版ICD-9.CM-3编码与手术名称
	private String repeatHospital;		// 是否出院后31天内重复住院
	private Date birth;		// 出生日期
	private Long weight;		// 患者体重（kg）
	private Long height;		// 患者身高（cm）
	private Long infantWeight;		// 新生儿出生体重（克）
	private String lastMenstruationDetermine;		// 末次月经日期是否确定
	private Date lastMenstruation;		// 末次月经日期
	private String arrivalsTimeDetermine;		// 到达本院急诊或者门诊日期时间是否确定
	private Date arrivalsTime;		// 到达本院急诊或者门诊日期时间
	private Date admissionTime;		// 入院日期时间
	private Date dischargeTime;		// 出院日期时间
	private Date operationStartedTime;		// 手术开始（切皮）日期时间
	private Date operationEndTime;		// 手术结束（缝皮结束）日期时间
	private String paymentMethod;		// 费用支付方式
	private String hospitalization;		// 收入住院途径
	private String transportation;		// 到院交通工具
	private String pregnancyTimes;		// 产次
	private String laborMode;		// 临产方式
	private String gestationalWeek;		// 孕周
	private String fetalPosition;		// 胎位
	private String fetusesNumber;		// 胎儿数量
	private String robsonClassification;		// Robson分类法组别
	private String preOperationRiskItems;		// 手术前风险评估的检查项目
	private String informedBeforeSurgery;		// 手术前知情告知
	private String informedBeforeAnesthesia;		// 麻醉前知情告知
	private String anesthesia;		// 麻醉方式
	private String indications;		// 剖宫产指征
	private String surgicalMethods;		// 手术方式选择
	private Date fetusDelivery;		// 胎儿娩出日期时间
	private String antibacterialDrugs;		// 是否使用预防性抗菌药物
	private String apgarScore;		// 是否实施新生儿Apgar评分
	private String postoperativeBleeding;		// 术后24小时内出血量
	private String bleeding;		// 剖宫产产后出血可能的原因
	private String bloodTransfusion;		// 术后24小时内输血量
	private String hemostasis;		// 止血干预措施的选择
	private String complication;		// 是否有剖宫产并发症
	private String reoperation;		// 是否再次手术
	private String influenceLevel;		// 影响程度的选择
	private String birthInjury;		// 是否有新生儿产伤
	private String deformity;		// 新生儿是否有先天性畸形、变形和染色体异常
	private String contraindications;		// 母乳喂养禁忌症选择
	private String healthEducationBefore;		// 住院期间为产妇提供术前健康教育
	private String healthEducationAfter;		// 提供产后康复健康教育
	private String analgesia;		// 是否提供术后镇痛
	private String riskFactors;		// 交与患者“出院小结”的副本告知患者出院时风险因素
	private String breastfeeding;		// 母乳喂养与出院带药
	private String concerns;		// 告知出院关注事项
	private String education;		// 出院时教育
	private String followUp;		// 告知随访
	private String wildSkin;		// 手术野皮肤准备常用方法的选择
	private String suture;		// 使用含抗菌剂（三氯生）缝线
	private String cutCategory;		// 手术切口类别的选择
	private String incisionHealing;		// 手术切口愈合情况的选择
	private String daysInHospital;		// 住院天数
	private String daysInHospitalAfterSurgery;		// 其中:术后住院天数
	private String leavingHospitalWay;		// 离院方式选择
	private String patientEvaluation;		// 患者是否对服务的体验与评价
	private String overallHospitalRating;		// 整体医院评级
	private String patientRecommendation;		// 患者推荐
	private String cleanliness;		// 病房、床单元和卫生间清洁度
	private String noise;		// 病房与周边噪音
	private String doctorCommunication;		// 医生沟通
	private String nurseCommunication;		// 护士沟通
	private String pharmacistCommunication;		// 药师沟通
	private String rehabilitationPlan;		// 康复计划
	private String informedNotificationDischarge;		// 出院时的知情告知
	private String dietaryEvaluation;		// 膳食评价
	private String hepatitisbvirus;		// 体内乙肝病毒检测是否阳性孕妇
	private Double totalCost;		// 住院总费用
	private Double outOfPocketAmount;		// 住院总费用其中自付金额
	private Double medicalServiceFee;		// 一般医疗服务费
	private Double treatmentOperationFee;		// 一般治疗操作费
	private Double nursingFee;		// 护理费
	private Double comprehensiveCost;		// 综合医疗服务类其他费用
	private Double pathologicalDiagnosisFee;		// 病理诊断费
	private Double laboratoryDiagnosisFee;		// 实验室诊断费
	private Double imagingDiagnosisFee;		// 影像学诊断费
	private Double clinicalDiagnosisProjectFee;		// 临床诊断项目费
	private Double nonSurgicalTreatmentProjectFee;		// 非手术治疗项目费
	private Double clinicalPhysicalTherapyFee;		// 其中：临床物理治疗费
	private Double surgicalTreatmentFee;		// 手术治疗费
	private Double anesthesiaFee;		// 其中：麻醉费
	private Double surgicalFees;		// 其中：手术费
	private Double rehabilitationFee;		// 康复费
	private Double tcmTreatmentFee;		// 中医治疗费
	private Double westernMedicineFee;		// 西药费
	private Double antimicrobialFees;		// 其中：抗菌药物费
	private Double patentMedicineFee;		// 中成药费
	private Double herbalMedicineFee;		// 中草药费
	private Double bloodFee;		// 血费
	private Double albuminProductFee;		// 白蛋白类制品费
	private Double globulinProductsFee;		// 球蛋白类制品费
	private Double coagulationFactorProductFee;		// 凝血因子类制品费
	private Double cytokineProductFee;		// 细胞因子类制品费
	private Double inspectionOneTimeMaterialsFee;		// 检查用一次性医用材料费
	private Double treatmentOneTimeMaterialsFee;		// 治疗用一次性医用材料费
	private Double surgeryOneTimeMaterialsFee;		// 手术用一次性医用材料费
	private Double otherFees;		// 其他费
	
	public QualityCesareanSection() {
		this(null);
	}

	public QualityCesareanSection(String id){
		super(id);
	}
	
	@NotBlank(message="质控医师不能为空")
	@Length(min=0, max=255, message="质控医师长度不能超过 255 个字符")
	public String getQualityPhysician() {
		return qualityPhysician;
	}

	public void setQualityPhysician(String qualityPhysician) {
		this.qualityPhysician = qualityPhysician;
	}
	
	@NotBlank(message="质控护士不能为空")
	@Length(min=0, max=255, message="质控护士长度不能超过 255 个字符")
	public String getQualityNurse() {
		return qualityNurse;
	}

	public void setQualityNurse(String qualityNurse) {
		this.qualityNurse = qualityNurse;
	}
	
	@NotBlank(message="主治医师不能为空")
	@Length(min=0, max=255, message="主治医师长度不能超过 255 个字符")
	public String getAttendingPhysician() {
		return attendingPhysician;
	}

	public void setAttendingPhysician(String attendingPhysician) {
		this.attendingPhysician = attendingPhysician;
	}
	
	@NotBlank(message="责任护士不能为空")
	@Length(min=0, max=255, message="责任护士长度不能超过 255 个字符")
	public String getRsponsibleNurse() {
		return rsponsibleNurse;
	}

	public void setRsponsibleNurse(String rsponsibleNurse) {
		this.rsponsibleNurse = rsponsibleNurse;
	}
	
	@NotBlank(message="上报科室不能为空")
	@Length(min=0, max=255, message="上报科室长度不能超过 255 个字符")
	public String getReportDept() {
		return reportDept;
	}

	public void setReportDept(String reportDept) {
		this.reportDept = reportDept;
	}
	
	@NotBlank(message="患者病案号不能为空")
	@Length(min=0, max=255, message="患者病案号长度不能超过 255 个字符")
	public String getPatientCaseNumber() {
		return patientCaseNumber;
	}

	public void setPatientCaseNumber(String patientCaseNumber) {
		this.patientCaseNumber = patientCaseNumber;
	}
	
	@NotBlank(message="出院诊断ICD-10四位亚目编码与名称不能为空")
	@Length(min=0, max=255, message="出院诊断ICD-10四位亚目编码与名称长度不能超过 255 个字符")
	public String getSuborderCode() {
		return suborderCode;
	}

	public void setSuborderCode(String suborderCode) {
		this.suborderCode = suborderCode;
	}
	
	@NotBlank(message="出院诊断ICD-10六位临床扩展编码与名称不能为空")
	@Length(min=0, max=255, message="出院诊断ICD-10六位临床扩展编码与名称长度不能超过 255 个字符")
	public String getClinicalExtCode() {
		return clinicalExtCode;
	}

	public void setClinicalExtCode(String clinicalExtCode) {
		this.clinicalExtCode = clinicalExtCode;
	}
	

	public String getMainOperation() {
		return mainOperation;
	}

	public void setMainOperation(String mainOperation) {
		this.mainOperation = mainOperation;
	}
	
	@NotBlank(message="是否出院后31天内重复住院不能为空")
	@Length(min=0, max=255, message="是否出院后31天内重复住院长度不能超过 255 个字符")
	public String getRepeatHospital() {
		return repeatHospital;
	}

	public void setRepeatHospital(String repeatHospital) {
		this.repeatHospital = repeatHospital;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="出生日期不能为空")
	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	@NotNull(message="患者体重不能为空")
	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}
	
	@NotNull(message="患者身高不能为空")
	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}
	
	@NotNull(message="新生儿出生体重不能为空")
	public Long getInfantWeight() {
		return infantWeight;
	}

	public void setInfantWeight(Long infantWeight) {
		this.infantWeight = infantWeight;
	}
	
	@NotBlank(message="末次月经日期是否确定不能为空")
	@Length(min=0, max=255, message="末次月经日期是否确定长度不能超过 255 个字符")
	public String getLastMenstruationDetermine() {
		return lastMenstruationDetermine;
	}

	public void setLastMenstruationDetermine(String lastMenstruationDetermine) {
		this.lastMenstruationDetermine = lastMenstruationDetermine;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="末次月经日期不能为空")
	public Date getLastMenstruation() {
		return lastMenstruation;
	}

	public void setLastMenstruation(Date lastMenstruation) {
		this.lastMenstruation = lastMenstruation;
	}
	
	@NotBlank(message="到达本院急诊或者门诊日期时间是否确定不能为空")
	@Length(min=0, max=255, message="到达本院急诊或者门诊日期时间是否确定长度不能超过 255 个字符")
	public String getArrivalsTimeDetermine() {
		return arrivalsTimeDetermine;
	}

	public void setArrivalsTimeDetermine(String arrivalsTimeDetermine) {
		this.arrivalsTimeDetermine = arrivalsTimeDetermine;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="到达本院急诊或者门诊日期时间不能为空")
	public Date getArrivalsTime() {
		return arrivalsTime;
	}

	public void setArrivalsTime(Date arrivalsTime) {
		this.arrivalsTime = arrivalsTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="入院日期时间不能为空")
	public Date getAdmissionTime() {
		return admissionTime;
	}

	public void setAdmissionTime(Date admissionTime) {
		this.admissionTime = admissionTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="出院日期时间不能为空")
	public Date getDischargeTime() {
		return dischargeTime;
	}

	public void setDischargeTime(Date dischargeTime) {
		this.dischargeTime = dischargeTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="手术开始不能为空")
	public Date getOperationStartedTime() {
		return operationStartedTime;
	}

	public void setOperationStartedTime(Date operationStartedTime) {
		this.operationStartedTime = operationStartedTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="手术结束不能为空")
	public Date getOperationEndTime() {
		return operationEndTime;
	}

	public void setOperationEndTime(Date operationEndTime) {
		this.operationEndTime = operationEndTime;
	}
	
	@NotBlank(message="费用支付方式不能为空")
	@Length(min=0, max=255, message="费用支付方式长度不能超过 255 个字符")
	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	@NotBlank(message="收入住院途径不能为空")
	@Length(min=0, max=255, message="收入住院途径长度不能超过 255 个字符")
	public String getHospitalization() {
		return hospitalization;
	}

	public void setHospitalization(String hospitalization) {
		this.hospitalization = hospitalization;
	}
	
	@NotBlank(message="到院交通工具不能为空")
	@Length(min=0, max=255, message="到院交通工具长度不能超过 255 个字符")
	public String getTransportation() {
		return transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	
	@NotBlank(message="产次不能为空")
	@Length(min=0, max=255, message="产次长度不能超过 255 个字符")
	public String getPregnancyTimes() {
		return pregnancyTimes;
	}

	public void setPregnancyTimes(String pregnancyTimes) {
		this.pregnancyTimes = pregnancyTimes;
	}
	
	@NotBlank(message="临产方式不能为空")
	@Length(min=0, max=255, message="临产方式长度不能超过 255 个字符")
	public String getLaborMode() {
		return laborMode;
	}

	public void setLaborMode(String laborMode) {
		this.laborMode = laborMode;
	}
	
	@NotBlank(message="孕周不能为空")
	@Length(min=0, max=255, message="孕周长度不能超过 255 个字符")
	public String getGestationalWeek() {
		return gestationalWeek;
	}

	public void setGestationalWeek(String gestationalWeek) {
		this.gestationalWeek = gestationalWeek;
	}
	
	@NotBlank(message="胎位不能为空")
	@Length(min=0, max=255, message="胎位长度不能超过 255 个字符")
	public String getFetalPosition() {
		return fetalPosition;
	}

	public void setFetalPosition(String fetalPosition) {
		this.fetalPosition = fetalPosition;
	}
	
	@NotBlank(message="胎儿数量不能为空")
	@Length(min=0, max=255, message="胎儿数量长度不能超过 255 个字符")
	public String getFetusesNumber() {
		return fetusesNumber;
	}

	public void setFetusesNumber(String fetusesNumber) {
		this.fetusesNumber = fetusesNumber;
	}
	
	@Length(min=0, max=255, message="Robson分类法组别长度不能超过 255 个字符")
	public String getRobsonClassification() {
		return robsonClassification;
	}

	public void setRobsonClassification(String robsonClassification) {
		this.robsonClassification = robsonClassification;
	}
	
	@NotBlank(message="手术前风险评估的检查项目不能为空")
	@Length(min=0, max=255, message="手术前风险评估的检查项目长度不能超过 255 个字符")
	public String getPreOperationRiskItems() {
		return preOperationRiskItems;
	}

	public void setPreOperationRiskItems(String preOperationRiskItems) {
		this.preOperationRiskItems = preOperationRiskItems;
	}
	
	@NotBlank(message="手术前知情告知不能为空")
	@Length(min=0, max=255, message="手术前知情告知长度不能超过 255 个字符")
	public String getInformedBeforeSurgery() {
		return informedBeforeSurgery;
	}

	public void setInformedBeforeSurgery(String informedBeforeSurgery) {
		this.informedBeforeSurgery = informedBeforeSurgery;
	}
	
	@NotBlank(message="麻醉前知情告知不能为空")
	@Length(min=0, max=255, message="麻醉前知情告知长度不能超过 255 个字符")
	public String getInformedBeforeAnesthesia() {
		return informedBeforeAnesthesia;
	}

	public void setInformedBeforeAnesthesia(String informedBeforeAnesthesia) {
		this.informedBeforeAnesthesia = informedBeforeAnesthesia;
	}
	
	@NotBlank(message="麻醉方式不能为空")
	@Length(min=0, max=255, message="麻醉方式长度不能超过 255 个字符")
	public String getAnesthesia() {
		return anesthesia;
	}

	public void setAnesthesia(String anesthesia) {
		this.anesthesia = anesthesia;
	}
	
	@NotBlank(message="剖宫产指征不能为空")
	@Length(min=0, max=255, message="剖宫产指征长度不能超过 255 个字符")
	public String getIndications() {
		return indications;
	}

	public void setIndications(String indications) {
		this.indications = indications;
	}
	
	@NotBlank(message="手术方式选择不能为空")
	@Length(min=0, max=255, message="手术方式选择长度不能超过 255 个字符")
	public String getSurgicalMethods() {
		return surgicalMethods;
	}

	public void setSurgicalMethods(String surgicalMethods) {
		this.surgicalMethods = surgicalMethods;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="胎儿娩出日期时间不能为空")
	public Date getFetusDelivery() {
		return fetusDelivery;
	}

	public void setFetusDelivery(Date fetusDelivery) {
		this.fetusDelivery = fetusDelivery;
	}
	
	@NotBlank(message="是否使用预防性抗菌药物不能为空")
	@Length(min=0, max=255, message="是否使用预防性抗菌药物长度不能超过 255 个字符")
	public String getAntibacterialDrugs() {
		return antibacterialDrugs;
	}

	public void setAntibacterialDrugs(String antibacterialDrugs) {
		this.antibacterialDrugs = antibacterialDrugs;
	}
	
	@NotBlank(message="是否实施新生儿Apgar评分不能为空")
	@Length(min=0, max=255, message="是否实施新生儿Apgar评分长度不能超过 255 个字符")
	public String getApgarScore() {
		return apgarScore;
	}

	public void setApgarScore(String apgarScore) {
		this.apgarScore = apgarScore;
	}
	
	@NotBlank(message="术后24小时内出血量不能为空")
	@Length(min=0, max=255, message="术后24小时内出血量长度不能超过 255 个字符")
	public String getPostoperativeBleeding() {
		return postoperativeBleeding;
	}

	public void setPostoperativeBleeding(String postoperativeBleeding) {
		this.postoperativeBleeding = postoperativeBleeding;
	}
	
	@NotBlank(message="剖宫产产后出血可能的原因不能为空")
	@Length(min=0, max=255, message="剖宫产产后出血可能的原因长度不能超过 255 个字符")
	public String getBleeding() {
		return bleeding;
	}

	public void setBleeding(String bleeding) {
		this.bleeding = bleeding;
	}
	
	@NotBlank(message="术后24小时内输血量不能为空")
	@Length(min=0, max=255, message="术后24小时内输血量长度不能超过 255 个字符")
	public String getBloodTransfusion() {
		return bloodTransfusion;
	}

	public void setBloodTransfusion(String bloodTransfusion) {
		this.bloodTransfusion = bloodTransfusion;
	}
	
	@NotBlank(message="止血干预措施的选择不能为空")
	@Length(min=0, max=255, message="止血干预措施的选择长度不能超过 255 个字符")
	public String getHemostasis() {
		return hemostasis;
	}

	public void setHemostasis(String hemostasis) {
		this.hemostasis = hemostasis;
	}
	
	@NotBlank(message="是否有剖宫产并发症不能为空")
	@Length(min=0, max=255, message="是否有剖宫产并发症长度不能超过 255 个字符")
	public String getComplication() {
		return complication;
	}

	public void setComplication(String complication) {
		this.complication = complication;
	}
	
	@NotBlank(message="是否再次手术不能为空")
	@Length(min=0, max=255, message="是否再次手术长度不能超过 255 个字符")
	public String getReoperation() {
		return reoperation;
	}

	public void setReoperation(String reoperation) {
		this.reoperation = reoperation;
	}
	
	@NotBlank(message="影响程度的选择不能为空")
	@Length(min=0, max=255, message="影响程度的选择长度不能超过 255 个字符")
	public String getInfluenceLevel() {
		return influenceLevel;
	}

	public void setInfluenceLevel(String influenceLevel) {
		this.influenceLevel = influenceLevel;
	}
	
	@NotBlank(message="是否有新生儿产伤不能为空")
	@Length(min=0, max=255, message="是否有新生儿产伤长度不能超过 255 个字符")
	public String getBirthInjury() {
		return birthInjury;
	}

	public void setBirthInjury(String birthInjury) {
		this.birthInjury = birthInjury;
	}
	
	@NotBlank(message="新生儿是否有先天性畸形、变形和染色体异常不能为空")
	@Length(min=0, max=255, message="新生儿是否有先天性畸形、变形和染色体异常长度不能超过 255 个字符")
	public String getDeformity() {
		return deformity;
	}

	public void setDeformity(String deformity) {
		this.deformity = deformity;
	}
	
	@NotBlank(message="母乳喂养禁忌症选择不能为空")
	@Length(min=0, max=255, message="母乳喂养禁忌症选择长度不能超过 255 个字符")
	public String getContraindications() {
		return contraindications;
	}

	public void setContraindications(String contraindications) {
		this.contraindications = contraindications;
	}
	
	@NotBlank(message="住院期间为产妇提供术前健康教育不能为空")
	@Length(min=0, max=255, message="住院期间为产妇提供术前健康教育长度不能超过 255 个字符")
	public String getHealthEducationBefore() {
		return healthEducationBefore;
	}

	public void setHealthEducationBefore(String healthEducationBefore) {
		this.healthEducationBefore = healthEducationBefore;
	}
	
	@NotBlank(message="提供产后康复健康教育不能为空")
	@Length(min=0, max=255, message="提供产后康复健康教育长度不能超过 255 个字符")
	public String getHealthEducationAfter() {
		return healthEducationAfter;
	}

	public void setHealthEducationAfter(String healthEducationAfter) {
		this.healthEducationAfter = healthEducationAfter;
	}
	
	@NotBlank(message="是否提供术后镇痛不能为空")
	@Length(min=0, max=255, message="是否提供术后镇痛长度不能超过 255 个字符")
	public String getAnalgesia() {
		return analgesia;
	}

	public void setAnalgesia(String analgesia) {
		this.analgesia = analgesia;
	}
	
	@NotBlank(message="交与患者“出院小结”的副本告知患者出院时风险因素不能为空")
	@Length(min=0, max=255, message="交与患者“出院小结”的副本告知患者出院时风险因素长度不能超过 255 个字符")
	public String getRiskFactors() {
		return riskFactors;
	}

	public void setRiskFactors(String riskFactors) {
		this.riskFactors = riskFactors;
	}
	
	@NotBlank(message="母乳喂养与出院带药不能为空")
	@Length(min=0, max=255, message="母乳喂养与出院带药长度不能超过 255 个字符")
	public String getBreastfeeding() {
		return breastfeeding;
	}

	public void setBreastfeeding(String breastfeeding) {
		this.breastfeeding = breastfeeding;
	}
	
	@NotBlank(message="告知出院关注事项不能为空")
	@Length(min=0, max=255, message="告知出院关注事项长度不能超过 255 个字符")
	public String getConcerns() {
		return concerns;
	}

	public void setConcerns(String concerns) {
		this.concerns = concerns;
	}
	
	@NotBlank(message="出院时教育不能为空")
	@Length(min=0, max=255, message="出院时教育长度不能超过 255 个字符")
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	@NotBlank(message="告知随访不能为空")
	@Length(min=0, max=255, message="告知随访长度不能超过 255 个字符")
	public String getFollowUp() {
		return followUp;
	}

	public void setFollowUp(String followUp) {
		this.followUp = followUp;
	}
	
	@NotBlank(message="手术野皮肤准备常用方法的选择不能为空")
	@Length(min=0, max=255, message="手术野皮肤准备常用方法的选择长度不能超过 255 个字符")
	public String getWildSkin() {
		return wildSkin;
	}

	public void setWildSkin(String wildSkin) {
		this.wildSkin = wildSkin;
	}
	
	@NotBlank(message="使用含抗菌剂不能为空")
	@Length(min=0, max=255, message="使用含抗菌剂长度不能超过 255 个字符")
	public String getSuture() {
		return suture;
	}

	public void setSuture(String suture) {
		this.suture = suture;
	}
	
	@NotBlank(message="手术切口类别的选择不能为空")
	@Length(min=0, max=255, message="手术切口类别的选择长度不能超过 255 个字符")
	public String getCutCategory() {
		return cutCategory;
	}

	public void setCutCategory(String cutCategory) {
		this.cutCategory = cutCategory;
	}
	
	@NotBlank(message="手术切口愈合情况的选择不能为空")
	@Length(min=0, max=255, message="手术切口愈合情况的选择长度不能超过 255 个字符")
	public String getIncisionHealing() {
		return incisionHealing;
	}

	public void setIncisionHealing(String incisionHealing) {
		this.incisionHealing = incisionHealing;
	}
	
	@Length(min=0, max=255, message="住院天数长度不能超过 255 个字符")
	public String getDaysInHospital() {
		return daysInHospital;
	}

	public void setDaysInHospital(String daysInHospital) {
		this.daysInHospital = daysInHospital;
	}
	
	@Length(min=0, max=255, message="其中长度不能超过 255 个字符")
	public String getDaysInHospitalAfterSurgery() {
		return daysInHospitalAfterSurgery;
	}

	public void setDaysInHospitalAfterSurgery(String daysInHospitalAfterSurgery) {
		this.daysInHospitalAfterSurgery = daysInHospitalAfterSurgery;
	}
	
	@Length(min=0, max=255, message="离院方式选择长度不能超过 255 个字符")
	public String getLeavingHospitalWay() {
		return leavingHospitalWay;
	}

	public void setLeavingHospitalWay(String leavingHospitalWay) {
		this.leavingHospitalWay = leavingHospitalWay;
	}
	
	@Length(min=0, max=255, message="患者是否对服务的体验与评价长度不能超过 255 个字符")
	public String getPatientEvaluation() {
		return patientEvaluation;
	}

	public void setPatientEvaluation(String patientEvaluation) {
		this.patientEvaluation = patientEvaluation;
	}
	
	@NotBlank(message="整体医院评级不能为空")
	@Length(min=0, max=32, message="整体医院评级长度不能超过 32 个字符")
	public String getOverallHospitalRating() {
		return overallHospitalRating;
	}

	public void setOverallHospitalRating(String overallHospitalRating) {
		this.overallHospitalRating = overallHospitalRating;
	}
	
	@NotBlank(message="患者推荐不能为空")
	@Length(min=0, max=32, message="患者推荐长度不能超过 32 个字符")
	public String getPatientRecommendation() {
		return patientRecommendation;
	}

	public void setPatientRecommendation(String patientRecommendation) {
		this.patientRecommendation = patientRecommendation;
	}
	
	@NotBlank(message="病房、床单元和卫生间清洁度不能为空")
	@Length(min=0, max=255, message="病房、床单元和卫生间清洁度长度不能超过 255 个字符")
	public String getCleanliness() {
		return cleanliness;
	}

	public void setCleanliness(String cleanliness) {
		this.cleanliness = cleanliness;
	}
	
	@NotBlank(message="病房与周边噪音不能为空")
	@Length(min=0, max=255, message="病房与周边噪音长度不能超过 255 个字符")
	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	@NotBlank(message="医生沟通不能为空")
	@Length(min=0, max=255, message="医生沟通长度不能超过 255 个字符")
	public String getDoctorCommunication() {
		return doctorCommunication;
	}

	public void setDoctorCommunication(String doctorCommunication) {
		this.doctorCommunication = doctorCommunication;
	}
	
	@NotBlank(message="护士沟通不能为空")
	@Length(min=0, max=255, message="护士沟通长度不能超过 255 个字符")
	public String getNurseCommunication() {
		return nurseCommunication;
	}

	public void setNurseCommunication(String nurseCommunication) {
		this.nurseCommunication = nurseCommunication;
	}
	
	@NotBlank(message="药师沟通不能为空")
	@Length(min=0, max=32, message="药师沟通长度不能超过 32 个字符")
	public String getPharmacistCommunication() {
		return pharmacistCommunication;
	}

	public void setPharmacistCommunication(String pharmacistCommunication) {
		this.pharmacistCommunication = pharmacistCommunication;
	}
	
	@NotBlank(message="康复计划不能为空")
	@Length(min=0, max=32, message="康复计划长度不能超过 32 个字符")
	public String getRehabilitationPlan() {
		return rehabilitationPlan;
	}

	public void setRehabilitationPlan(String rehabilitationPlan) {
		this.rehabilitationPlan = rehabilitationPlan;
	}
	
	@NotBlank(message="出院时的知情告知不能为空")
	@Length(min=0, max=255, message="出院时的知情告知长度不能超过 255 个字符")
	public String getInformedNotificationDischarge() {
		return informedNotificationDischarge;
	}

	public void setInformedNotificationDischarge(String informedNotificationDischarge) {
		this.informedNotificationDischarge = informedNotificationDischarge;
	}
	
	@NotBlank(message="膳食评价不能为空")
	@Length(min=0, max=255, message="膳食评价长度不能超过 255 个字符")
	public String getDietaryEvaluation() {
		return dietaryEvaluation;
	}

	public void setDietaryEvaluation(String dietaryEvaluation) {
		this.dietaryEvaluation = dietaryEvaluation;
	}
	
	@NotBlank(message="体内乙肝病毒检测是否阳性孕妇不能为空")
	@Length(min=0, max=255, message="体内乙肝病毒检测是否阳性孕妇长度不能超过 255 个字符")
	public String getHepatitisbvirus() {
		return hepatitisbvirus;
	}

	public void setHepatitisbvirus(String hepatitisbvirus) {
		this.hepatitisbvirus = hepatitisbvirus;
	}
	
	@NotNull(message="住院总费用不能为空")
	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	
	@NotNull(message="住院总费用其中自付金额不能为空")
	public Double getOutOfPocketAmount() {
		return outOfPocketAmount;
	}

	public void setOutOfPocketAmount(Double outOfPocketAmount) {
		this.outOfPocketAmount = outOfPocketAmount;
	}
	
	@NotNull(message="一般医疗服务费不能为空")
	public Double getMedicalServiceFee() {
		return medicalServiceFee;
	}

	public void setMedicalServiceFee(Double medicalServiceFee) {
		this.medicalServiceFee = medicalServiceFee;
	}
	
	@NotNull(message="一般治疗操作费不能为空")
	public Double getTreatmentOperationFee() {
		return treatmentOperationFee;
	}

	public void setTreatmentOperationFee(Double treatmentOperationFee) {
		this.treatmentOperationFee = treatmentOperationFee;
	}
	
	@NotNull(message="护理费不能为空")
	public Double getNursingFee() {
		return nursingFee;
	}

	public void setNursingFee(Double nursingFee) {
		this.nursingFee = nursingFee;
	}
	
	@NotNull(message="综合医疗服务类其他费用不能为空")
	public Double getComprehensiveCost() {
		return comprehensiveCost;
	}

	public void setComprehensiveCost(Double comprehensiveCost) {
		this.comprehensiveCost = comprehensiveCost;
	}
	
	@NotNull(message="病理诊断费不能为空")
	public Double getPathologicalDiagnosisFee() {
		return pathologicalDiagnosisFee;
	}

	public void setPathologicalDiagnosisFee(Double pathologicalDiagnosisFee) {
		this.pathologicalDiagnosisFee = pathologicalDiagnosisFee;
	}
	
	@NotNull(message="实验室诊断费不能为空")
	public Double getLaboratoryDiagnosisFee() {
		return laboratoryDiagnosisFee;
	}

	public void setLaboratoryDiagnosisFee(Double laboratoryDiagnosisFee) {
		this.laboratoryDiagnosisFee = laboratoryDiagnosisFee;
	}
	
	@NotNull(message="影像学诊断费不能为空")
	public Double getImagingDiagnosisFee() {
		return imagingDiagnosisFee;
	}

	public void setImagingDiagnosisFee(Double imagingDiagnosisFee) {
		this.imagingDiagnosisFee = imagingDiagnosisFee;
	}
	
	@NotNull(message="临床诊断项目费不能为空")
	public Double getClinicalDiagnosisProjectFee() {
		return clinicalDiagnosisProjectFee;
	}

	public void setClinicalDiagnosisProjectFee(Double clinicalDiagnosisProjectFee) {
		this.clinicalDiagnosisProjectFee = clinicalDiagnosisProjectFee;
	}
	
	@NotNull(message="非手术治疗项目费不能为空")
	public Double getNonSurgicalTreatmentProjectFee() {
		return nonSurgicalTreatmentProjectFee;
	}

	public void setNonSurgicalTreatmentProjectFee(Double nonSurgicalTreatmentProjectFee) {
		this.nonSurgicalTreatmentProjectFee = nonSurgicalTreatmentProjectFee;
	}
	
	@NotNull(message="其中不能为空")
	public Double getClinicalPhysicalTherapyFee() {
		return clinicalPhysicalTherapyFee;
	}

	public void setClinicalPhysicalTherapyFee(Double clinicalPhysicalTherapyFee) {
		this.clinicalPhysicalTherapyFee = clinicalPhysicalTherapyFee;
	}
	
	@NotNull(message="手术治疗费不能为空")
	public Double getSurgicalTreatmentFee() {
		return surgicalTreatmentFee;
	}

	public void setSurgicalTreatmentFee(Double surgicalTreatmentFee) {
		this.surgicalTreatmentFee = surgicalTreatmentFee;
	}
	
	@NotNull(message="其中不能为空")
	public Double getAnesthesiaFee() {
		return anesthesiaFee;
	}

	public void setAnesthesiaFee(Double anesthesiaFee) {
		this.anesthesiaFee = anesthesiaFee;
	}
	
	@NotNull(message="其中不能为空")
	public Double getSurgicalFees() {
		return surgicalFees;
	}

	public void setSurgicalFees(Double surgicalFees) {
		this.surgicalFees = surgicalFees;
	}
	
	@NotNull(message="康复费不能为空")
	public Double getRehabilitationFee() {
		return rehabilitationFee;
	}

	public void setRehabilitationFee(Double rehabilitationFee) {
		this.rehabilitationFee = rehabilitationFee;
	}
	
	@NotNull(message="中医治疗费不能为空")
	public Double getTcmTreatmentFee() {
		return tcmTreatmentFee;
	}

	public void setTcmTreatmentFee(Double tcmTreatmentFee) {
		this.tcmTreatmentFee = tcmTreatmentFee;
	}
	
	@NotNull(message="西药费不能为空")
	public Double getWesternMedicineFee() {
		return westernMedicineFee;
	}

	public void setWesternMedicineFee(Double westernMedicineFee) {
		this.westernMedicineFee = westernMedicineFee;
	}
	
	@NotNull(message="其中不能为空")
	public Double getAntimicrobialFees() {
		return antimicrobialFees;
	}

	public void setAntimicrobialFees(Double antimicrobialFees) {
		this.antimicrobialFees = antimicrobialFees;
	}
	
	@NotNull(message="中成药费不能为空")
	public Double getPatentMedicineFee() {
		return patentMedicineFee;
	}

	public void setPatentMedicineFee(Double patentMedicineFee) {
		this.patentMedicineFee = patentMedicineFee;
	}
	
	@NotNull(message="中草药费不能为空")
	public Double getHerbalMedicineFee() {
		return herbalMedicineFee;
	}

	public void setHerbalMedicineFee(Double herbalMedicineFee) {
		this.herbalMedicineFee = herbalMedicineFee;
	}
	
	@NotNull(message="血费不能为空")
	public Double getBloodFee() {
		return bloodFee;
	}

	public void setBloodFee(Double bloodFee) {
		this.bloodFee = bloodFee;
	}
	
	@NotNull(message="白蛋白类制品费不能为空")
	public Double getAlbuminProductFee() {
		return albuminProductFee;
	}

	public void setAlbuminProductFee(Double albuminProductFee) {
		this.albuminProductFee = albuminProductFee;
	}
	
	@NotNull(message="球蛋白类制品费不能为空")
	public Double getGlobulinProductsFee() {
		return globulinProductsFee;
	}

	public void setGlobulinProductsFee(Double globulinProductsFee) {
		this.globulinProductsFee = globulinProductsFee;
	}
	
	@NotNull(message="凝血因子类制品费不能为空")
	public Double getCoagulationFactorProductFee() {
		return coagulationFactorProductFee;
	}

	public void setCoagulationFactorProductFee(Double coagulationFactorProductFee) {
		this.coagulationFactorProductFee = coagulationFactorProductFee;
	}
	
	@NotNull(message="细胞因子类制品费不能为空")
	public Double getCytokineProductFee() {
		return cytokineProductFee;
	}

	public void setCytokineProductFee(Double cytokineProductFee) {
		this.cytokineProductFee = cytokineProductFee;
	}
	
	@NotNull(message="检查用一次性医用材料费不能为空")
	public Double getInspectionOneTimeMaterialsFee() {
		return inspectionOneTimeMaterialsFee;
	}

	public void setInspectionOneTimeMaterialsFee(Double inspectionOneTimeMaterialsFee) {
		this.inspectionOneTimeMaterialsFee = inspectionOneTimeMaterialsFee;
	}
	
	@NotNull(message="治疗用一次性医用材料费不能为空")
	public Double getTreatmentOneTimeMaterialsFee() {
		return treatmentOneTimeMaterialsFee;
	}

	public void setTreatmentOneTimeMaterialsFee(Double treatmentOneTimeMaterialsFee) {
		this.treatmentOneTimeMaterialsFee = treatmentOneTimeMaterialsFee;
	}
	
	@NotNull(message="手术用一次性医用材料费不能为空")
	public Double getSurgeryOneTimeMaterialsFee() {
		return surgeryOneTimeMaterialsFee;
	}

	public void setSurgeryOneTimeMaterialsFee(Double surgeryOneTimeMaterialsFee) {
		this.surgeryOneTimeMaterialsFee = surgeryOneTimeMaterialsFee;
	}
	
	@NotNull(message="其他费不能为空")
	public Double getOtherFees() {
		return otherFees;
	}

	public void setOtherFees(Double otherFees) {
		this.otherFees = otherFees;
	}
	
}