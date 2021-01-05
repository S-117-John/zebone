/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.emr.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 病案Entity
 * @author lijin
 * @version 2021-01-04
 */
@Table(name="emr_home_page", alias="a", columns={
		@Column(name="pk_page", attrName="pkPage", label="pk_page", isPK=true),
		@Column(name="pk_org", attrName="pkOrg", label="pk_org"),
		@Column(name="pk_pi", attrName="pkPi", label="pk_pi"),
		@Column(name="times", attrName="times", label="times"),
		@Column(name="pk_pv", attrName="pkPv", label="pk_pv"),
		@Column(name="med_org_code", attrName="medOrgCode", label="med_org_code"),
		@Column(name="med_org_name", attrName="medOrgName", label="med_org_name", queryType=QueryType.LIKE),
		@Column(name="health_card_no", attrName="healthCardNo", label="health_card_no"),
		@Column(name="med_pay_mode", attrName="medPayMode", label="med_pay_mode"),
		@Column(name="pat_no", attrName="patNo", label="pat_no"),
		@Column(name="name", attrName="name", label="name", queryType=QueryType.LIKE),
		@Column(name="dt_sex", attrName="dtSex", label="dt_sex"),
		@Column(name="birth_date", attrName="birthDate", label="birth_date"),
		@Column(name="age_year", attrName="ageYear", label="age_year"),
		@Column(name="age_month", attrName="ageMonth", label="age_month"),
		@Column(name="age_txt", attrName="ageTxt", label="age_txt"),
		@Column(name="newborn_weight", attrName="newbornWeight", label="newborn_weight"),
		@Column(name="newborn_in_weight", attrName="newbornInWeight", label="newborn_in_weight"),
		@Column(name="birth_addr_prov", attrName="birthAddrProv", label="birth_addr_prov"),
		@Column(name="birth_addr_city", attrName="birthAddrCity", label="birth_addr_city"),
		@Column(name="birth_addr_county", attrName="birthAddrCounty", label="birth_addr_county"),
		@Column(name="origin_addr_prov", attrName="originAddrProv", label="origin_addr_prov"),
		@Column(name="origin_addr_city", attrName="originAddrCity", label="origin_addr_city"),
		@Column(name="country_code", attrName="countryCode", label="country_code"),
		@Column(name="country_name", attrName="countryName", label="country_name", queryType=QueryType.LIKE),
		@Column(name="nation_code", attrName="nationCode", label="nation_code"),
		@Column(name="nation_name", attrName="nationName", label="nation_name", queryType=QueryType.LIKE),
		@Column(name="id_type", attrName="idType", label="id_type"),
		@Column(name="id_no", attrName="idNo", label="id_no"),
		@Column(name="occup_code", attrName="occupCode", label="occup_code"),
		@Column(name="occup_name", attrName="occupName", label="occup_name", queryType=QueryType.LIKE),
		@Column(name="marry_code", attrName="marryCode", label="marry_code"),
		@Column(name="marry_name", attrName="marryName", label="marry_name", queryType=QueryType.LIKE),
		@Column(name="curr_addr_prov", attrName="currAddrProv", label="curr_addr_prov"),
		@Column(name="curr_addr_city", attrName="currAddrCity", label="curr_addr_city"),
		@Column(name="curr_addr_county", attrName="currAddrCounty", label="curr_addr_county"),
		@Column(name="curr_phone", attrName="currPhone", label="curr_phone"),
		@Column(name="curr_zip_code", attrName="currZipCode", label="curr_zip_code"),
		@Column(name="work_unit", attrName="workUnit", label="work_unit"),
		@Column(name="work_unit_phone", attrName="workUnitPhone", label="work_unit_phone"),
		@Column(name="reside_addr_prov", attrName="resideAddrProv", label="reside_addr_prov"),
		@Column(name="reside_addr_city", attrName="resideAddrCity", label="reside_addr_city"),
		@Column(name="reside_addr_county", attrName="resideAddrCounty", label="reside_addr_county"),
		@Column(name="reside_zip_code", attrName="resideZipCode", label="reside_zip_code"),
		@Column(name="work_unit_zip_code", attrName="workUnitZipCode", label="work_unit_zip_code"),
		@Column(name="contact_name", attrName="contactName", label="contact_name", queryType=QueryType.LIKE),
		@Column(name="contact_relat_code", attrName="contactRelatCode", label="contact_relat_code"),
		@Column(name="contact_relat_name", attrName="contactRelatName", label="contact_relat_name", queryType=QueryType.LIKE),
		@Column(name="contact_addr", attrName="contactAddr", label="contact_addr"),
		@Column(name="contact_phone", attrName="contactPhone", label="contact_phone"),
		@Column(name="admit_path_code", attrName="admitPathCode", label="admit_path_code"),
		@Column(name="admit_path_name", attrName="admitPathName", label="admit_path_name", queryType=QueryType.LIKE),
		@Column(name="admit_time", attrName="admitTime", label="admit_time"),
		@Column(name="pk_admit_dept", attrName="pkAdmitDept", label="pk_admit_dept"),
		@Column(name="admit_dept_name", attrName="admitDeptName", label="admit_dept_name", queryType=QueryType.LIKE),
		@Column(name="admit_ward_name", attrName="admitWardName", label="admit_ward_name", queryType=QueryType.LIKE),
		@Column(name="trans_dept_names", attrName="transDeptNames", label="trans_dept_names", queryType=QueryType.LIKE),
		@Column(name="dis_time", attrName="disTime", label="dis_time"),
		@Column(name="pk_dept_dis", attrName="pkDeptDis", label="pk_dept_dis"),
		@Column(name="dis_dept_name", attrName="disDeptName", label="dis_dept_name", queryType=QueryType.LIKE),
		@Column(name="pk_ward_dis", attrName="pkWardDis", label="pk_ward_dis"),
		@Column(name="dis_ward_name", attrName="disWardName", label="dis_ward_name", queryType=QueryType.LIKE),
		@Column(name="pk_diag_clinic", attrName="pkDiagClinic", label="pk_diag_clinic"),
		@Column(name="in_hos_days", attrName="inHosDays", label="in_hos_days"),
		@Column(name="diag_code_clinic", attrName="diagCodeClinic", label="diag_code_clinic"),
		@Column(name="pk_diag_dis", attrName="pkDiagDis", label="pk_diag_dis"),
		@Column(name="diag_name_clinic", attrName="diagNameClinic", label="diag_name_clinic", queryType=QueryType.LIKE),
		@Column(name="diag_code_dis", attrName="diagCodeDis", label="diag_code_dis"),
		@Column(name="pk_diag_extc_ip", attrName="pkDiagExtcIp", label="pk_diag_extc_ip"),
		@Column(name="diag_name_dis", attrName="diagNameDis", label="diag_name_dis", queryType=QueryType.LIKE),
		@Column(name="med_rec_type", attrName="medRecType", label="med_rec_type"),
		@Column(name="flag_cp", attrName="flagCp", label="flag_cp"),
		@Column(name="num_res", attrName="numRes", label="num_res"),
		@Column(name="num_succ", attrName="numSucc", label="num_succ"),
		@Column(name="diag_code_extc_ip", attrName="diagCodeExtcIp", label="diag_code_extc_ip"),
		@Column(name="pk_diag_patho", attrName="pkDiagPatho", label="pk_diag_patho"),
		@Column(name="diag_name_extc_ip", attrName="diagNameExtcIp", label="diag_name_extc_ip", queryType=QueryType.LIKE),
		@Column(name="diag_code_patho", attrName="diagCodePatho", label="diag_code_patho"),
		@Column(name="diag_name_patho", attrName="diagNamePatho", label="diag_name_patho", queryType=QueryType.LIKE),
		@Column(name="patho_no", attrName="pathoNo", label="patho_no"),
		@Column(name="flag_drug_allergy", attrName="flagDrugAllergy", label="flag_drug_allergy"),
		@Column(name="allergic_drug", attrName="allergicDrug", label="allergic_drug"),
		@Column(name="flag_autopsy", attrName="flagAutopsy", label="flag_autopsy"),
		@Column(name="blood_code_abo", attrName="bloodCodeAbo", label="blood_code_abo"),
		@Column(name="blood_name_abo", attrName="bloodNameAbo", label="blood_name_abo", queryType=QueryType.LIKE),
		@Column(name="blood_code_rh", attrName="bloodCodeRh", label="blood_code_rh"),
		@Column(name="blood_name_rh", attrName="bloodNameRh", label="blood_name_rh", queryType=QueryType.LIKE),
		@Column(name="pk_emp_director", attrName="pkEmpDirector", label="pk_emp_director"),
		@Column(name="director_name", attrName="directorName", label="director_name", queryType=QueryType.LIKE),
		@Column(name="pk_emp_consult", attrName="pkEmpConsult", label="pk_emp_consult"),
		@Column(name="consult_name", attrName="consultName", label="consult_name", queryType=QueryType.LIKE),
		@Column(name="pk_emp_refer", attrName="pkEmpRefer", label="pk_emp_refer"),
		@Column(name="refer_name", attrName="referName", label="refer_name", queryType=QueryType.LIKE),
		@Column(name="pk_emp_nurse", attrName="pkEmpNurse", label="pk_emp_nurse"),
		@Column(name="nurse_name", attrName="nurseName", label="nurse_name", queryType=QueryType.LIKE),
		@Column(name="pk_emp_learn", attrName="pkEmpLearn", label="pk_emp_learn"),
		@Column(name="learn_name", attrName="learnName", label="learn_name", queryType=QueryType.LIKE),
		@Column(name="pk_emp_intern", attrName="pkEmpIntern", label="pk_emp_intern"),
		@Column(name="intern_name", attrName="internName", label="intern_name", queryType=QueryType.LIKE),
		@Column(name="pk_emp_coder", attrName="pkEmpCoder", label="pk_emp_coder"),
		@Column(name="coder_name", attrName="coderName", label="coder_name", queryType=QueryType.LIKE),
		@Column(name="quality_code", attrName="qualityCode", label="quality_code"),
		@Column(name="quality_name", attrName="qualityName", label="quality_name", queryType=QueryType.LIKE),
		@Column(name="pk_emp_qc_doc", attrName="pkEmpQcDoc", label="pk_emp_qc_doc"),
		@Column(name="qc_doc_name", attrName="qcDocName", label="qc_doc_name", queryType=QueryType.LIKE),
		@Column(name="pk_emp_qc_nurse", attrName="pkEmpQcNurse", label="pk_emp_qc_nurse"),
		@Column(name="qc_nurse_name", attrName="qcNurseName", label="qc_nurse_name", queryType=QueryType.LIKE),
		@Column(name="qc_date", attrName="qcDate", label="qc_date"),
		@Column(name="leave_hos_code", attrName="leaveHosCode", label="leave_hos_code"),
		@Column(name="leave_hos_name", attrName="leaveHosName", label="leave_hos_name", queryType=QueryType.LIKE),
		@Column(name="receive_org_code", attrName="receiveOrgCode", label="receive_org_code"),
		@Column(name="receive_org_name", attrName="receiveOrgName", label="receive_org_name", queryType=QueryType.LIKE),
		@Column(name="flag_readmit", attrName="flagReadmit", label="flag_readmit"),
		@Column(name="readmit_purp", attrName="readmitPurp", label="readmit_purp"),
		@Column(name="coma_day_bef", attrName="comaDayBef", label="coma_day_bef"),
		@Column(name="coma_hour_bef", attrName="comaHourBef", label="coma_hour_bef"),
		@Column(name="coma_min_bef", attrName="comaMinBef", label="coma_min_bef"),
		@Column(name="coma_day_after", attrName="comaDayAfter", label="coma_day_after"),
		@Column(name="coma_hour_after", attrName="comaHourAfter", label="coma_hour_after"),
		@Column(name="coma_min_after", attrName="comaMinAfter", label="coma_min_after"),
		@Column(name="total_cost", attrName="totalCost", label="total_cost"),
		@Column(name="self_cost", attrName="selfCost", label="self_cost"),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
		@Column(name="remark", attrName="remark", label="remark"),
		@Column(name="creator", attrName="creator", label="creator"),
		@Column(name="create_time", attrName="createTime", label="create_time"),
		@Column(name="pk_admit_ward", attrName="pkAdmitWard", label="pk_admit_ward"),
		@Column(name="pk_emp_chief", attrName="pkEmpChief", label="pk_emp_chief"),
		@Column(name="chief_name", attrName="chiefName", label="chief_name", queryType=QueryType.LIKE),
		@Column(name="ts", attrName="ts", label="ts"),
		@Column(name="pk_emp_clinic", attrName="pkEmpClinic", label="pk_emp_clinic"),
		@Column(name="clinic_name", attrName="clinicName", label="clinic_name", queryType=QueryType.LIKE),
		@Column(name="curr_addr", attrName="currAddr", label="curr_addr"),
		@Column(name="reside_addr", attrName="resideAddr", label="reside_addr"),
		@Column(name="admit_cond_code", attrName="admitCondCode", label="admit_cond_code"),
		@Column(name="admit_cond_name", attrName="admitCondName", label="admit_cond_name", queryType=QueryType.LIKE),
		@Column(name="birth_addr", attrName="birthAddr", label="birth_addr"),
		@Column(name="origin_addr", attrName="originAddr", label="origin_addr"),
		@Column(name="curr_addr_dt", attrName="currAddrDt", label="curr_addr_dt"),
		@Column(name="reside_addr_dt", attrName="resideAddrDt", label="reside_addr_dt"),
		@Column(name="diag_fit_code_oi", attrName="diagFitCodeOi", label="diag_fit_code_oi"),
		@Column(name="diag_fit_code_cp", attrName="diagFitCodeCp", label="diag_fit_code_cp"),
		@Column(name="diag_code_clinic_icd", attrName="diagCodeClinicIcd", label="diag_code_clinic_icd"),
		@Column(name="diag_name_clinic_icd", attrName="diagNameClinicIcd", label="diag_name_clinic_icd", queryType=QueryType.LIKE),
		@Column(name="diag_code_extc_ip_icd", attrName="diagCodeExtcIpIcd", label="diag_code_extc_ip_icd"),
		@Column(name="diag_name_extc_ip_icd", attrName="diagNameExtcIpIcd", label="diag_name_extc_ip_icd", queryType=QueryType.LIKE),
		@Column(name="diag_code_patho_icd", attrName="diagCodePathoIcd", label="diag_code_patho_icd"),
		@Column(name="diag_name_patho_icd", attrName="diagNamePathoIcd", label="diag_name_patho_icd", queryType=QueryType.LIKE),
		@Column(name="patho_no_icd", attrName="pathoNoIcd", label="patho_no_icd"),
		@Column(name="flag_drug_allergy_icd", attrName="flagDrugAllergyIcd", label="flag_drug_allergy_icd"),
		@Column(name="allergic_drug_icd", attrName="allergicDrugIcd", label="allergic_drug_icd"),
		@Column(name="part_disease", attrName="partDisease", label="part_disease"),
		@Column(name="pat_source", attrName="patSource", label="pat_source"),
		@Column(name="curr_addr_code", attrName="currAddrCode", label="curr_addr_code"),
		@Column(name="birth_addr_code", attrName="birthAddrCode", label="birth_addr_code"),
		@Column(name="origin_addr_code", attrName="originAddrCode", label="origin_addr_code"),
		@Column(name="reside_addr_code", attrName="resideAddrCode", label="reside_addr_code"),
		@Column(name="diag_fit_ops", attrName="diagFitOps", label="diag_fit_ops"),
		@Column(name="curr_addr_icd", attrName="currAddrIcd", label="curr_addr_icd"),
		@Column(name="code_pv", attrName="codePv", label="code_pv"),
		@Column(name="coded_not_cnfrm", attrName="codedNotCnfrm", label="coded_not_cnfrm"),
	}, orderBy="a.pk_page DESC"
)
public class EmrHomePage extends DataEntity<EmrHomePage> {
	
	private static final long serialVersionUID = 1L;
	private String pkPage;		// pk_page
	private String pkOrg;		// pk_org
	private String pkPi;		// pk_pi
	private Integer times;		// times
	private String pkPv;		// pk_pv
	private String medOrgCode;		// med_org_code
	private String medOrgName;		// med_org_name
	private String healthCardNo;		// health_card_no
	private String medPayMode;		// med_pay_mode
	private String patNo;		// pat_no
	private String name;		// name
	private String dtSex;		// dt_sex
	private Date birthDate;		// birth_date
	private Integer ageYear;		// age_year
	private String ageMonth;		// age_month
	private String ageTxt;		// age_txt
	private Integer newbornWeight;		// newborn_weight
	private Integer newbornInWeight;		// newborn_in_weight
	private String birthAddrProv;		// birth_addr_prov
	private String birthAddrCity;		// birth_addr_city
	private String birthAddrCounty;		// birth_addr_county
	private String originAddrProv;		// origin_addr_prov
	private String originAddrCity;		// origin_addr_city
	private String countryCode;		// country_code
	private String countryName;		// country_name
	private String nationCode;		// nation_code
	private String nationName;		// nation_name
	private String idType;		// id_type
	private String idNo;		// id_no
	private String occupCode;		// occup_code
	private String occupName;		// occup_name
	private String marryCode;		// marry_code
	private String marryName;		// marry_name
	private String currAddrProv;		// curr_addr_prov
	private String currAddrCity;		// curr_addr_city
	private String currAddrCounty;		// curr_addr_county
	private String currPhone;		// curr_phone
	private String currZipCode;		// curr_zip_code
	private String workUnit;		// work_unit
	private String workUnitPhone;		// work_unit_phone
	private String resideAddrProv;		// reside_addr_prov
	private String resideAddrCity;		// reside_addr_city
	private String resideAddrCounty;		// reside_addr_county
	private String resideZipCode;		// reside_zip_code
	private String workUnitZipCode;		// work_unit_zip_code
	private String contactName;		// contact_name
	private String contactRelatCode;		// contact_relat_code
	private String contactRelatName;		// contact_relat_name
	private String contactAddr;		// contact_addr
	private String contactPhone;		// contact_phone
	private String admitPathCode;		// admit_path_code
	private String admitPathName;		// admit_path_name
	private Date admitTime;		// admit_time
	private String pkAdmitDept;		// pk_admit_dept
	private String admitDeptName;		// admit_dept_name
	private String admitWardName;		// admit_ward_name
	private String transDeptNames;		// trans_dept_names
	private Date disTime;		// dis_time
	private String pkDeptDis;		// pk_dept_dis
	private String disDeptName;		// dis_dept_name
	private String pkWardDis;		// pk_ward_dis
	private String disWardName;		// dis_ward_name
	private String pkDiagClinic;		// pk_diag_clinic
	private Integer inHosDays;		// in_hos_days
	private String diagCodeClinic;		// diag_code_clinic
	private String pkDiagDis;		// pk_diag_dis
	private String diagNameClinic;		// diag_name_clinic
	private String diagCodeDis;		// diag_code_dis
	private String pkDiagExtcIp;		// pk_diag_extc_ip
	private String diagNameDis;		// diag_name_dis
	private String medRecType;		// med_rec_type
	private String flagCp;		// flag_cp
	private Integer numRes;		// num_res
	private Integer numSucc;		// num_succ
	private String diagCodeExtcIp;		// diag_code_extc_ip
	private String pkDiagPatho;		// pk_diag_patho
	private String diagNameExtcIp;		// diag_name_extc_ip
	private String diagCodePatho;		// diag_code_patho
	private String diagNamePatho;		// diag_name_patho
	private String pathoNo;		// patho_no
	private String flagDrugAllergy;		// flag_drug_allergy
	private String allergicDrug;		// allergic_drug
	private String flagAutopsy;		// flag_autopsy
	private String bloodCodeAbo;		// blood_code_abo
	private String bloodNameAbo;		// blood_name_abo
	private String bloodCodeRh;		// blood_code_rh
	private String bloodNameRh;		// blood_name_rh
	private String pkEmpDirector;		// pk_emp_director
	private String directorName;		// director_name
	private String pkEmpConsult;		// pk_emp_consult
	/**
	 * 主治医师
	 */
	private String consultName;
	private String pkEmpRefer;		// pk_emp_refer
	private String referName;		// refer_name
	private String pkEmpNurse;		// pk_emp_nurse
	/**
	 * 责任护士
	 */
	private String nurseName;		// nurse_name
	private String pkEmpLearn;		// pk_emp_learn
	private String learnName;		// learn_name
	private String pkEmpIntern;		// pk_emp_intern
	private String internName;		// intern_name
	private String pkEmpCoder;		// pk_emp_coder
	private String coderName;		// coder_name
	private String qualityCode;		// quality_code
	private String qualityName;		// quality_name
	private String pkEmpQcDoc;		// pk_emp_qc_doc
	/**
	 * 质控医师
	 */
	private String qcDocName;
	private String pkEmpQcNurse;		// pk_emp_qc_nurse
	/**
	 * 质控护士
	 */
	private String qcNurseName;
	private Date qcDate;		// qc_date
	private String leaveHosCode;		// leave_hos_code
	private String leaveHosName;		// leave_hos_name
	private String receiveOrgCode;		// receive_org_code
	private String receiveOrgName;		// receive_org_name
	private String flagReadmit;		// flag_readmit
	private String readmitPurp;		// readmit_purp
	private Integer comaDayBef;		// coma_day_bef
	private Integer comaHourBef;		// coma_hour_bef
	private Integer comaMinBef;		// coma_min_bef
	private Integer comaDayAfter;		// coma_day_after
	private Integer comaHourAfter;		// coma_hour_after
	private Integer comaMinAfter;		// coma_min_after
	private Double totalCost;		// total_cost
	private Double selfCost;		// self_cost
	private String delFlag;		// del_flag
	private String remark;		// remark
	private String creator;		// creator
	private Date createTime;		// create_time
	private String pkAdmitWard;		// pk_admit_ward
	private String pkEmpChief;		// pk_emp_chief
	private String chiefName;		// chief_name
	private Date ts;		// ts
	private String pkEmpClinic;		// pk_emp_clinic
	private String clinicName;		// clinic_name
	private String currAddr;		// curr_addr
	private String resideAddr;		// reside_addr
	private String admitCondCode;		// admit_cond_code
	private String admitCondName;		// admit_cond_name
	private String birthAddr;		// birth_addr
	private String originAddr;		// origin_addr
	private String currAddrDt;		// curr_addr_dt
	private String resideAddrDt;		// reside_addr_dt
	private String diagFitCodeOi;		// diag_fit_code_oi
	private String diagFitCodeCp;		// diag_fit_code_cp
	private String diagCodeClinicIcd;		// diag_code_clinic_icd
	private String diagNameClinicIcd;		// diag_name_clinic_icd
	private String diagCodeExtcIpIcd;		// diag_code_extc_ip_icd
	private String diagNameExtcIpIcd;		// diag_name_extc_ip_icd
	private String diagCodePathoIcd;		// diag_code_patho_icd
	private String diagNamePathoIcd;		// diag_name_patho_icd
	private String pathoNoIcd;		// patho_no_icd
	private String flagDrugAllergyIcd;		// flag_drug_allergy_icd
	private String allergicDrugIcd;		// allergic_drug_icd
	private String partDisease;		// part_disease
	private String patSource;		// pat_source
	private String currAddrCode;		// curr_addr_code
	private String birthAddrCode;		// birth_addr_code
	private String originAddrCode;		// origin_addr_code
	private String resideAddrCode;		// reside_addr_code
	private String diagFitOps;		// diag_fit_ops
	private String currAddrIcd;		// curr_addr_icd
	private String codePv;		// code_pv
	private String codedNotCnfrm;		// coded_not_cnfrm
	
	public EmrHomePage() {
		this(null);
	}

	public EmrHomePage(String id){
		super(id);
	}
	
	public String getPkPage() {
		return pkPage;
	}

	public void setPkPage(String pkPage) {
		this.pkPage = pkPage;
	}
	
	@Length(min=0, max=32, message="pk_org长度不能超过 32 个字符")
	public String getPkOrg() {
		return pkOrg;
	}

	public void setPkOrg(String pkOrg) {
		this.pkOrg = pkOrg;
	}
	
	@Length(min=0, max=32, message="pk_pi长度不能超过 32 个字符")
	public String getPkPi() {
		return pkPi;
	}

	public void setPkPi(String pkPi) {
		this.pkPi = pkPi;
	}
	
	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}
	
	@Length(min=0, max=32, message="pk_pv长度不能超过 32 个字符")
	public String getPkPv() {
		return pkPv;
	}

	public void setPkPv(String pkPv) {
		this.pkPv = pkPv;
	}
	
	@Length(min=0, max=30, message="med_org_code长度不能超过 30 个字符")
	public String getMedOrgCode() {
		return medOrgCode;
	}

	public void setMedOrgCode(String medOrgCode) {
		this.medOrgCode = medOrgCode;
	}
	
	@Length(min=0, max=64, message="med_org_name长度不能超过 64 个字符")
	public String getMedOrgName() {
		return medOrgName;
	}

	public void setMedOrgName(String medOrgName) {
		this.medOrgName = medOrgName;
	}
	
	@Length(min=0, max=20, message="health_card_no长度不能超过 20 个字符")
	public String getHealthCardNo() {
		return healthCardNo;
	}

	public void setHealthCardNo(String healthCardNo) {
		this.healthCardNo = healthCardNo;
	}
	
	@Length(min=0, max=12, message="med_pay_mode长度不能超过 12 个字符")
	public String getMedPayMode() {
		return medPayMode;
	}

	public void setMedPayMode(String medPayMode) {
		this.medPayMode = medPayMode;
	}
	
	@Length(min=0, max=20, message="pat_no长度不能超过 20 个字符")
	public String getPatNo() {
		return patNo;
	}

	public void setPatNo(String patNo) {
		this.patNo = patNo;
	}
	
	@Length(min=0, max=32, message="name长度不能超过 32 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=8, message="dt_sex长度不能超过 8 个字符")
	public String getDtSex() {
		return dtSex;
	}

	public void setDtSex(String dtSex) {
		this.dtSex = dtSex;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Integer getAgeYear() {
		return ageYear;
	}

	public void setAgeYear(Integer ageYear) {
		this.ageYear = ageYear;
	}
	
	@Length(min=0, max=8, message="age_month长度不能超过 8 个字符")
	public String getAgeMonth() {
		return ageMonth;
	}

	public void setAgeMonth(String ageMonth) {
		this.ageMonth = ageMonth;
	}
	
	@Length(min=0, max=20, message="age_txt长度不能超过 20 个字符")
	public String getAgeTxt() {
		return ageTxt;
	}

	public void setAgeTxt(String ageTxt) {
		this.ageTxt = ageTxt;
	}
	
	public Integer getNewbornWeight() {
		return newbornWeight;
	}

	public void setNewbornWeight(Integer newbornWeight) {
		this.newbornWeight = newbornWeight;
	}
	
	public Integer getNewbornInWeight() {
		return newbornInWeight;
	}

	public void setNewbornInWeight(Integer newbornInWeight) {
		this.newbornInWeight = newbornInWeight;
	}
	
	@Length(min=0, max=64, message="birth_addr_prov长度不能超过 64 个字符")
	public String getBirthAddrProv() {
		return birthAddrProv;
	}

	public void setBirthAddrProv(String birthAddrProv) {
		this.birthAddrProv = birthAddrProv;
	}
	
	@Length(min=0, max=64, message="birth_addr_city长度不能超过 64 个字符")
	public String getBirthAddrCity() {
		return birthAddrCity;
	}

	public void setBirthAddrCity(String birthAddrCity) {
		this.birthAddrCity = birthAddrCity;
	}
	
	@Length(min=0, max=64, message="birth_addr_county长度不能超过 64 个字符")
	public String getBirthAddrCounty() {
		return birthAddrCounty;
	}

	public void setBirthAddrCounty(String birthAddrCounty) {
		this.birthAddrCounty = birthAddrCounty;
	}
	
	@Length(min=0, max=64, message="origin_addr_prov长度不能超过 64 个字符")
	public String getOriginAddrProv() {
		return originAddrProv;
	}

	public void setOriginAddrProv(String originAddrProv) {
		this.originAddrProv = originAddrProv;
	}
	
	@Length(min=0, max=64, message="origin_addr_city长度不能超过 64 个字符")
	public String getOriginAddrCity() {
		return originAddrCity;
	}

	public void setOriginAddrCity(String originAddrCity) {
		this.originAddrCity = originAddrCity;
	}
	
	@Length(min=0, max=20, message="country_code长度不能超过 20 个字符")
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	@Length(min=0, max=32, message="country_name长度不能超过 32 个字符")
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	@Length(min=0, max=20, message="nation_code长度不能超过 20 个字符")
	public String getNationCode() {
		return nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}
	
	@Length(min=0, max=32, message="nation_name长度不能超过 32 个字符")
	public String getNationName() {
		return nationName;
	}

	public void setNationName(String nationName) {
		this.nationName = nationName;
	}
	
	@Length(min=0, max=2, message="id_type长度不能超过 2 个字符")
	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}
	
	@Length(min=0, max=20, message="id_no长度不能超过 20 个字符")
	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	@Length(min=0, max=20, message="occup_code长度不能超过 20 个字符")
	public String getOccupCode() {
		return occupCode;
	}

	public void setOccupCode(String occupCode) {
		this.occupCode = occupCode;
	}
	
	@Length(min=0, max=64, message="occup_name长度不能超过 64 个字符")
	public String getOccupName() {
		return occupName;
	}

	public void setOccupName(String occupName) {
		this.occupName = occupName;
	}
	
	@Length(min=0, max=2, message="marry_code长度不能超过 2 个字符")
	public String getMarryCode() {
		return marryCode;
	}

	public void setMarryCode(String marryCode) {
		this.marryCode = marryCode;
	}
	
	@Length(min=0, max=32, message="marry_name长度不能超过 32 个字符")
	public String getMarryName() {
		return marryName;
	}

	public void setMarryName(String marryName) {
		this.marryName = marryName;
	}
	
	@Length(min=0, max=64, message="curr_addr_prov长度不能超过 64 个字符")
	public String getCurrAddrProv() {
		return currAddrProv;
	}

	public void setCurrAddrProv(String currAddrProv) {
		this.currAddrProv = currAddrProv;
	}
	
	@Length(min=0, max=64, message="curr_addr_city长度不能超过 64 个字符")
	public String getCurrAddrCity() {
		return currAddrCity;
	}

	public void setCurrAddrCity(String currAddrCity) {
		this.currAddrCity = currAddrCity;
	}
	
	@Length(min=0, max=64, message="curr_addr_county长度不能超过 64 个字符")
	public String getCurrAddrCounty() {
		return currAddrCounty;
	}

	public void setCurrAddrCounty(String currAddrCounty) {
		this.currAddrCounty = currAddrCounty;
	}
	
	@Length(min=0, max=20, message="curr_phone长度不能超过 20 个字符")
	public String getCurrPhone() {
		return currPhone;
	}

	public void setCurrPhone(String currPhone) {
		this.currPhone = currPhone;
	}
	
	@Length(min=0, max=10, message="curr_zip_code长度不能超过 10 个字符")
	public String getCurrZipCode() {
		return currZipCode;
	}

	public void setCurrZipCode(String currZipCode) {
		this.currZipCode = currZipCode;
	}
	
	@Length(min=0, max=64, message="work_unit长度不能超过 64 个字符")
	public String getWorkUnit() {
		return workUnit;
	}

	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}
	
	@Length(min=0, max=20, message="work_unit_phone长度不能超过 20 个字符")
	public String getWorkUnitPhone() {
		return workUnitPhone;
	}

	public void setWorkUnitPhone(String workUnitPhone) {
		this.workUnitPhone = workUnitPhone;
	}
	
	@Length(min=0, max=64, message="reside_addr_prov长度不能超过 64 个字符")
	public String getResideAddrProv() {
		return resideAddrProv;
	}

	public void setResideAddrProv(String resideAddrProv) {
		this.resideAddrProv = resideAddrProv;
	}
	
	@Length(min=0, max=64, message="reside_addr_city长度不能超过 64 个字符")
	public String getResideAddrCity() {
		return resideAddrCity;
	}

	public void setResideAddrCity(String resideAddrCity) {
		this.resideAddrCity = resideAddrCity;
	}
	
	@Length(min=0, max=64, message="reside_addr_county长度不能超过 64 个字符")
	public String getResideAddrCounty() {
		return resideAddrCounty;
	}

	public void setResideAddrCounty(String resideAddrCounty) {
		this.resideAddrCounty = resideAddrCounty;
	}
	
	@Length(min=0, max=10, message="reside_zip_code长度不能超过 10 个字符")
	public String getResideZipCode() {
		return resideZipCode;
	}

	public void setResideZipCode(String resideZipCode) {
		this.resideZipCode = resideZipCode;
	}
	
	@Length(min=0, max=6, message="work_unit_zip_code长度不能超过 6 个字符")
	public String getWorkUnitZipCode() {
		return workUnitZipCode;
	}

	public void setWorkUnitZipCode(String workUnitZipCode) {
		this.workUnitZipCode = workUnitZipCode;
	}
	
	@Length(min=0, max=32, message="contact_name长度不能超过 32 个字符")
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	@Length(min=0, max=2, message="contact_relat_code长度不能超过 2 个字符")
	public String getContactRelatCode() {
		return contactRelatCode;
	}

	public void setContactRelatCode(String contactRelatCode) {
		this.contactRelatCode = contactRelatCode;
	}
	
	@Length(min=0, max=32, message="contact_relat_name长度不能超过 32 个字符")
	public String getContactRelatName() {
		return contactRelatName;
	}

	public void setContactRelatName(String contactRelatName) {
		this.contactRelatName = contactRelatName;
	}
	
	@Length(min=0, max=64, message="contact_addr长度不能超过 64 个字符")
	public String getContactAddr() {
		return contactAddr;
	}

	public void setContactAddr(String contactAddr) {
		this.contactAddr = contactAddr;
	}
	
	@Length(min=0, max=20, message="contact_phone长度不能超过 20 个字符")
	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
	@Length(min=0, max=2, message="admit_path_code长度不能超过 2 个字符")
	public String getAdmitPathCode() {
		return admitPathCode;
	}

	public void setAdmitPathCode(String admitPathCode) {
		this.admitPathCode = admitPathCode;
	}
	
	@Length(min=0, max=32, message="admit_path_name长度不能超过 32 个字符")
	public String getAdmitPathName() {
		return admitPathName;
	}

	public void setAdmitPathName(String admitPathName) {
		this.admitPathName = admitPathName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getAdmitTime() {
		return admitTime;
	}

	public void setAdmitTime(Date admitTime) {
		this.admitTime = admitTime;
	}
	
	@Length(min=0, max=32, message="pk_admit_dept长度不能超过 32 个字符")
	public String getPkAdmitDept() {
		return pkAdmitDept;
	}

	public void setPkAdmitDept(String pkAdmitDept) {
		this.pkAdmitDept = pkAdmitDept;
	}
	
	@Length(min=0, max=64, message="admit_dept_name长度不能超过 64 个字符")
	public String getAdmitDeptName() {
		return admitDeptName;
	}

	public void setAdmitDeptName(String admitDeptName) {
		this.admitDeptName = admitDeptName;
	}
	
	@Length(min=0, max=64, message="admit_ward_name长度不能超过 64 个字符")
	public String getAdmitWardName() {
		return admitWardName;
	}

	public void setAdmitWardName(String admitWardName) {
		this.admitWardName = admitWardName;
	}
	
	@Length(min=0, max=64, message="trans_dept_names长度不能超过 64 个字符")
	public String getTransDeptNames() {
		return transDeptNames;
	}

	public void setTransDeptNames(String transDeptNames) {
		this.transDeptNames = transDeptNames;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDisTime() {
		return disTime;
	}

	public void setDisTime(Date disTime) {
		this.disTime = disTime;
	}
	
	@Length(min=0, max=32, message="pk_dept_dis长度不能超过 32 个字符")
	public String getPkDeptDis() {
		return pkDeptDis;
	}

	public void setPkDeptDis(String pkDeptDis) {
		this.pkDeptDis = pkDeptDis;
	}
	
	@Length(min=0, max=64, message="dis_dept_name长度不能超过 64 个字符")
	public String getDisDeptName() {
		return disDeptName;
	}

	public void setDisDeptName(String disDeptName) {
		this.disDeptName = disDeptName;
	}
	
	@Length(min=0, max=32, message="pk_ward_dis长度不能超过 32 个字符")
	public String getPkWardDis() {
		return pkWardDis;
	}

	public void setPkWardDis(String pkWardDis) {
		this.pkWardDis = pkWardDis;
	}
	
	@Length(min=0, max=64, message="dis_ward_name长度不能超过 64 个字符")
	public String getDisWardName() {
		return disWardName;
	}

	public void setDisWardName(String disWardName) {
		this.disWardName = disWardName;
	}
	
	@Length(min=0, max=32, message="pk_diag_clinic长度不能超过 32 个字符")
	public String getPkDiagClinic() {
		return pkDiagClinic;
	}

	public void setPkDiagClinic(String pkDiagClinic) {
		this.pkDiagClinic = pkDiagClinic;
	}
	
	public Integer getInHosDays() {
		return inHosDays;
	}

	public void setInHosDays(Integer inHosDays) {
		this.inHosDays = inHosDays;
	}
	
	@Length(min=0, max=20, message="diag_code_clinic长度不能超过 20 个字符")
	public String getDiagCodeClinic() {
		return diagCodeClinic;
	}

	public void setDiagCodeClinic(String diagCodeClinic) {
		this.diagCodeClinic = diagCodeClinic;
	}
	
	@Length(min=0, max=32, message="pk_diag_dis长度不能超过 32 个字符")
	public String getPkDiagDis() {
		return pkDiagDis;
	}

	public void setPkDiagDis(String pkDiagDis) {
		this.pkDiagDis = pkDiagDis;
	}
	
	@Length(min=0, max=64, message="diag_name_clinic长度不能超过 64 个字符")
	public String getDiagNameClinic() {
		return diagNameClinic;
	}

	public void setDiagNameClinic(String diagNameClinic) {
		this.diagNameClinic = diagNameClinic;
	}
	
	@Length(min=0, max=20, message="diag_code_dis长度不能超过 20 个字符")
	public String getDiagCodeDis() {
		return diagCodeDis;
	}

	public void setDiagCodeDis(String diagCodeDis) {
		this.diagCodeDis = diagCodeDis;
	}
	
	@Length(min=0, max=32, message="pk_diag_extc_ip长度不能超过 32 个字符")
	public String getPkDiagExtcIp() {
		return pkDiagExtcIp;
	}

	public void setPkDiagExtcIp(String pkDiagExtcIp) {
		this.pkDiagExtcIp = pkDiagExtcIp;
	}
	
	@Length(min=0, max=64, message="diag_name_dis长度不能超过 64 个字符")
	public String getDiagNameDis() {
		return diagNameDis;
	}

	public void setDiagNameDis(String diagNameDis) {
		this.diagNameDis = diagNameDis;
	}
	
	@Length(min=0, max=1, message="med_rec_type长度不能超过 1 个字符")
	public String getMedRecType() {
		return medRecType;
	}

	public void setMedRecType(String medRecType) {
		this.medRecType = medRecType;
	}
	
	@Length(min=0, max=1, message="flag_cp长度不能超过 1 个字符")
	public String getFlagCp() {
		return flagCp;
	}

	public void setFlagCp(String flagCp) {
		this.flagCp = flagCp;
	}
	
	public Integer getNumRes() {
		return numRes;
	}

	public void setNumRes(Integer numRes) {
		this.numRes = numRes;
	}
	
	public Integer getNumSucc() {
		return numSucc;
	}

	public void setNumSucc(Integer numSucc) {
		this.numSucc = numSucc;
	}
	
	@Length(min=0, max=20, message="diag_code_extc_ip长度不能超过 20 个字符")
	public String getDiagCodeExtcIp() {
		return diagCodeExtcIp;
	}

	public void setDiagCodeExtcIp(String diagCodeExtcIp) {
		this.diagCodeExtcIp = diagCodeExtcIp;
	}
	
	@Length(min=0, max=32, message="pk_diag_patho长度不能超过 32 个字符")
	public String getPkDiagPatho() {
		return pkDiagPatho;
	}

	public void setPkDiagPatho(String pkDiagPatho) {
		this.pkDiagPatho = pkDiagPatho;
	}
	
	@Length(min=0, max=64, message="diag_name_extc_ip长度不能超过 64 个字符")
	public String getDiagNameExtcIp() {
		return diagNameExtcIp;
	}

	public void setDiagNameExtcIp(String diagNameExtcIp) {
		this.diagNameExtcIp = diagNameExtcIp;
	}
	
	@Length(min=0, max=20, message="diag_code_patho长度不能超过 20 个字符")
	public String getDiagCodePatho() {
		return diagCodePatho;
	}

	public void setDiagCodePatho(String diagCodePatho) {
		this.diagCodePatho = diagCodePatho;
	}
	
	@Length(min=0, max=64, message="diag_name_patho长度不能超过 64 个字符")
	public String getDiagNamePatho() {
		return diagNamePatho;
	}

	public void setDiagNamePatho(String diagNamePatho) {
		this.diagNamePatho = diagNamePatho;
	}
	
	@Length(min=0, max=20, message="patho_no长度不能超过 20 个字符")
	public String getPathoNo() {
		return pathoNo;
	}

	public void setPathoNo(String pathoNo) {
		this.pathoNo = pathoNo;
	}
	
	@Length(min=0, max=1, message="flag_drug_allergy长度不能超过 1 个字符")
	public String getFlagDrugAllergy() {
		return flagDrugAllergy;
	}

	public void setFlagDrugAllergy(String flagDrugAllergy) {
		this.flagDrugAllergy = flagDrugAllergy;
	}
	
	@Length(min=0, max=256, message="allergic_drug长度不能超过 256 个字符")
	public String getAllergicDrug() {
		return allergicDrug;
	}

	public void setAllergicDrug(String allergicDrug) {
		this.allergicDrug = allergicDrug;
	}
	
	@Length(min=0, max=1, message="flag_autopsy长度不能超过 1 个字符")
	public String getFlagAutopsy() {
		return flagAutopsy;
	}

	public void setFlagAutopsy(String flagAutopsy) {
		this.flagAutopsy = flagAutopsy;
	}
	
	@Length(min=0, max=8, message="blood_code_abo长度不能超过 8 个字符")
	public String getBloodCodeAbo() {
		return bloodCodeAbo;
	}

	public void setBloodCodeAbo(String bloodCodeAbo) {
		this.bloodCodeAbo = bloodCodeAbo;
	}
	
	@Length(min=0, max=32, message="blood_name_abo长度不能超过 32 个字符")
	public String getBloodNameAbo() {
		return bloodNameAbo;
	}

	public void setBloodNameAbo(String bloodNameAbo) {
		this.bloodNameAbo = bloodNameAbo;
	}
	
	@Length(min=0, max=8, message="blood_code_rh长度不能超过 8 个字符")
	public String getBloodCodeRh() {
		return bloodCodeRh;
	}

	public void setBloodCodeRh(String bloodCodeRh) {
		this.bloodCodeRh = bloodCodeRh;
	}
	
	@Length(min=0, max=32, message="blood_name_rh长度不能超过 32 个字符")
	public String getBloodNameRh() {
		return bloodNameRh;
	}

	public void setBloodNameRh(String bloodNameRh) {
		this.bloodNameRh = bloodNameRh;
	}
	
	@Length(min=0, max=32, message="pk_emp_director长度不能超过 32 个字符")
	public String getPkEmpDirector() {
		return pkEmpDirector;
	}

	public void setPkEmpDirector(String pkEmpDirector) {
		this.pkEmpDirector = pkEmpDirector;
	}
	
	@Length(min=0, max=32, message="director_name长度不能超过 32 个字符")
	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	
	@Length(min=0, max=32, message="pk_emp_consult长度不能超过 32 个字符")
	public String getPkEmpConsult() {
		return pkEmpConsult;
	}

	public void setPkEmpConsult(String pkEmpConsult) {
		this.pkEmpConsult = pkEmpConsult;
	}
	
	@Length(min=0, max=32, message="consult_name长度不能超过 32 个字符")
	public String getConsultName() {
		return consultName;
	}

	public void setConsultName(String consultName) {
		this.consultName = consultName;
	}
	
	@Length(min=0, max=32, message="pk_emp_refer长度不能超过 32 个字符")
	public String getPkEmpRefer() {
		return pkEmpRefer;
	}

	public void setPkEmpRefer(String pkEmpRefer) {
		this.pkEmpRefer = pkEmpRefer;
	}
	
	@Length(min=0, max=32, message="refer_name长度不能超过 32 个字符")
	public String getReferName() {
		return referName;
	}

	public void setReferName(String referName) {
		this.referName = referName;
	}
	
	@Length(min=0, max=32, message="pk_emp_nurse长度不能超过 32 个字符")
	public String getPkEmpNurse() {
		return pkEmpNurse;
	}

	public void setPkEmpNurse(String pkEmpNurse) {
		this.pkEmpNurse = pkEmpNurse;
	}
	
	@Length(min=0, max=32, message="nurse_name长度不能超过 32 个字符")
	public String getNurseName() {
		return nurseName;
	}

	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}
	
	@Length(min=0, max=32, message="pk_emp_learn长度不能超过 32 个字符")
	public String getPkEmpLearn() {
		return pkEmpLearn;
	}

	public void setPkEmpLearn(String pkEmpLearn) {
		this.pkEmpLearn = pkEmpLearn;
	}
	
	@Length(min=0, max=32, message="learn_name长度不能超过 32 个字符")
	public String getLearnName() {
		return learnName;
	}

	public void setLearnName(String learnName) {
		this.learnName = learnName;
	}
	
	@Length(min=0, max=32, message="pk_emp_intern长度不能超过 32 个字符")
	public String getPkEmpIntern() {
		return pkEmpIntern;
	}

	public void setPkEmpIntern(String pkEmpIntern) {
		this.pkEmpIntern = pkEmpIntern;
	}
	
	@Length(min=0, max=32, message="intern_name长度不能超过 32 个字符")
	public String getInternName() {
		return internName;
	}

	public void setInternName(String internName) {
		this.internName = internName;
	}
	
	@Length(min=0, max=32, message="pk_emp_coder长度不能超过 32 个字符")
	public String getPkEmpCoder() {
		return pkEmpCoder;
	}

	public void setPkEmpCoder(String pkEmpCoder) {
		this.pkEmpCoder = pkEmpCoder;
	}
	
	@Length(min=0, max=32, message="coder_name长度不能超过 32 个字符")
	public String getCoderName() {
		return coderName;
	}

	public void setCoderName(String coderName) {
		this.coderName = coderName;
	}
	
	@Length(min=0, max=1, message="quality_code长度不能超过 1 个字符")
	public String getQualityCode() {
		return qualityCode;
	}

	public void setQualityCode(String qualityCode) {
		this.qualityCode = qualityCode;
	}
	
	@Length(min=0, max=16, message="quality_name长度不能超过 16 个字符")
	public String getQualityName() {
		return qualityName;
	}

	public void setQualityName(String qualityName) {
		this.qualityName = qualityName;
	}
	
	@Length(min=0, max=32, message="pk_emp_qc_doc长度不能超过 32 个字符")
	public String getPkEmpQcDoc() {
		return pkEmpQcDoc;
	}

	public void setPkEmpQcDoc(String pkEmpQcDoc) {
		this.pkEmpQcDoc = pkEmpQcDoc;
	}
	
	@Length(min=0, max=32, message="qc_doc_name长度不能超过 32 个字符")
	public String getQcDocName() {
		return qcDocName;
	}

	public void setQcDocName(String qcDocName) {
		this.qcDocName = qcDocName;
	}
	
	@Length(min=0, max=32, message="pk_emp_qc_nurse长度不能超过 32 个字符")
	public String getPkEmpQcNurse() {
		return pkEmpQcNurse;
	}

	public void setPkEmpQcNurse(String pkEmpQcNurse) {
		this.pkEmpQcNurse = pkEmpQcNurse;
	}
	
	@Length(min=0, max=32, message="qc_nurse_name长度不能超过 32 个字符")
	public String getQcNurseName() {
		return qcNurseName;
	}

	public void setQcNurseName(String qcNurseName) {
		this.qcNurseName = qcNurseName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getQcDate() {
		return qcDate;
	}

	public void setQcDate(Date qcDate) {
		this.qcDate = qcDate;
	}
	
	@Length(min=0, max=2, message="leave_hos_code长度不能超过 2 个字符")
	public String getLeaveHosCode() {
		return leaveHosCode;
	}

	public void setLeaveHosCode(String leaveHosCode) {
		this.leaveHosCode = leaveHosCode;
	}
	
	@Length(min=0, max=32, message="leave_hos_name长度不能超过 32 个字符")
	public String getLeaveHosName() {
		return leaveHosName;
	}

	public void setLeaveHosName(String leaveHosName) {
		this.leaveHosName = leaveHosName;
	}
	
	@Length(min=0, max=20, message="receive_org_code长度不能超过 20 个字符")
	public String getReceiveOrgCode() {
		return receiveOrgCode;
	}

	public void setReceiveOrgCode(String receiveOrgCode) {
		this.receiveOrgCode = receiveOrgCode;
	}
	
	@Length(min=0, max=64, message="receive_org_name长度不能超过 64 个字符")
	public String getReceiveOrgName() {
		return receiveOrgName;
	}

	public void setReceiveOrgName(String receiveOrgName) {
		this.receiveOrgName = receiveOrgName;
	}
	
	@Length(min=0, max=1, message="flag_readmit长度不能超过 1 个字符")
	public String getFlagReadmit() {
		return flagReadmit;
	}

	public void setFlagReadmit(String flagReadmit) {
		this.flagReadmit = flagReadmit;
	}
	
	@Length(min=0, max=64, message="readmit_purp长度不能超过 64 个字符")
	public String getReadmitPurp() {
		return readmitPurp;
	}

	public void setReadmitPurp(String readmitPurp) {
		this.readmitPurp = readmitPurp;
	}
	
	public Integer getComaDayBef() {
		return comaDayBef;
	}

	public void setComaDayBef(Integer comaDayBef) {
		this.comaDayBef = comaDayBef;
	}
	
	public Integer getComaHourBef() {
		return comaHourBef;
	}

	public void setComaHourBef(Integer comaHourBef) {
		this.comaHourBef = comaHourBef;
	}
	
	public Integer getComaMinBef() {
		return comaMinBef;
	}

	public void setComaMinBef(Integer comaMinBef) {
		this.comaMinBef = comaMinBef;
	}
	
	public Integer getComaDayAfter() {
		return comaDayAfter;
	}

	public void setComaDayAfter(Integer comaDayAfter) {
		this.comaDayAfter = comaDayAfter;
	}
	
	public Integer getComaHourAfter() {
		return comaHourAfter;
	}

	public void setComaHourAfter(Integer comaHourAfter) {
		this.comaHourAfter = comaHourAfter;
	}
	
	public Integer getComaMinAfter() {
		return comaMinAfter;
	}

	public void setComaMinAfter(Integer comaMinAfter) {
		this.comaMinAfter = comaMinAfter;
	}
	
	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	
	public Double getSelfCost() {
		return selfCost;
	}

	public void setSelfCost(Double selfCost) {
		this.selfCost = selfCost;
	}
	
	@Length(min=0, max=1, message="del_flag长度不能超过 1 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
	@Length(min=0, max=64, message="remark长度不能超过 64 个字符")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Length(min=0, max=32, message="creator长度不能超过 32 个字符")
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Length(min=0, max=32, message="pk_admit_ward长度不能超过 32 个字符")
	public String getPkAdmitWard() {
		return pkAdmitWard;
	}

	public void setPkAdmitWard(String pkAdmitWard) {
		this.pkAdmitWard = pkAdmitWard;
	}
	
	@Length(min=0, max=32, message="pk_emp_chief长度不能超过 32 个字符")
	public String getPkEmpChief() {
		return pkEmpChief;
	}

	public void setPkEmpChief(String pkEmpChief) {
		this.pkEmpChief = pkEmpChief;
	}
	
	@Length(min=0, max=32, message="chief_name长度不能超过 32 个字符")
	public String getChiefName() {
		return chiefName;
	}

	public void setChiefName(String chiefName) {
		this.chiefName = chiefName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}
	
	@Length(min=0, max=32, message="pk_emp_clinic长度不能超过 32 个字符")
	public String getPkEmpClinic() {
		return pkEmpClinic;
	}

	public void setPkEmpClinic(String pkEmpClinic) {
		this.pkEmpClinic = pkEmpClinic;
	}
	
	@Length(min=0, max=32, message="clinic_name长度不能超过 32 个字符")
	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}
	
	@Length(min=0, max=128, message="curr_addr长度不能超过 128 个字符")
	public String getCurrAddr() {
		return currAddr;
	}

	public void setCurrAddr(String currAddr) {
		this.currAddr = currAddr;
	}
	
	@Length(min=0, max=128, message="reside_addr长度不能超过 128 个字符")
	public String getResideAddr() {
		return resideAddr;
	}

	public void setResideAddr(String resideAddr) {
		this.resideAddr = resideAddr;
	}
	
	@Length(min=0, max=2, message="admit_cond_code长度不能超过 2 个字符")
	public String getAdmitCondCode() {
		return admitCondCode;
	}

	public void setAdmitCondCode(String admitCondCode) {
		this.admitCondCode = admitCondCode;
	}
	
	@Length(min=0, max=32, message="admit_cond_name长度不能超过 32 个字符")
	public String getAdmitCondName() {
		return admitCondName;
	}

	public void setAdmitCondName(String admitCondName) {
		this.admitCondName = admitCondName;
	}
	
	@Length(min=0, max=128, message="birth_addr长度不能超过 128 个字符")
	public String getBirthAddr() {
		return birthAddr;
	}

	public void setBirthAddr(String birthAddr) {
		this.birthAddr = birthAddr;
	}
	
	@Length(min=0, max=128, message="origin_addr长度不能超过 128 个字符")
	public String getOriginAddr() {
		return originAddr;
	}

	public void setOriginAddr(String originAddr) {
		this.originAddr = originAddr;
	}
	
	@Length(min=0, max=128, message="curr_addr_dt长度不能超过 128 个字符")
	public String getCurrAddrDt() {
		return currAddrDt;
	}

	public void setCurrAddrDt(String currAddrDt) {
		this.currAddrDt = currAddrDt;
	}
	
	@Length(min=0, max=128, message="reside_addr_dt长度不能超过 128 个字符")
	public String getResideAddrDt() {
		return resideAddrDt;
	}

	public void setResideAddrDt(String resideAddrDt) {
		this.resideAddrDt = resideAddrDt;
	}
	
	@Length(min=0, max=2, message="diag_fit_code_oi长度不能超过 2 个字符")
	public String getDiagFitCodeOi() {
		return diagFitCodeOi;
	}

	public void setDiagFitCodeOi(String diagFitCodeOi) {
		this.diagFitCodeOi = diagFitCodeOi;
	}
	
	@Length(min=0, max=2, message="diag_fit_code_cp长度不能超过 2 个字符")
	public String getDiagFitCodeCp() {
		return diagFitCodeCp;
	}

	public void setDiagFitCodeCp(String diagFitCodeCp) {
		this.diagFitCodeCp = diagFitCodeCp;
	}
	
	@Length(min=0, max=20, message="diag_code_clinic_icd长度不能超过 20 个字符")
	public String getDiagCodeClinicIcd() {
		return diagCodeClinicIcd;
	}

	public void setDiagCodeClinicIcd(String diagCodeClinicIcd) {
		this.diagCodeClinicIcd = diagCodeClinicIcd;
	}
	
	@Length(min=0, max=64, message="diag_name_clinic_icd长度不能超过 64 个字符")
	public String getDiagNameClinicIcd() {
		return diagNameClinicIcd;
	}

	public void setDiagNameClinicIcd(String diagNameClinicIcd) {
		this.diagNameClinicIcd = diagNameClinicIcd;
	}
	
	@Length(min=0, max=20, message="diag_code_extc_ip_icd长度不能超过 20 个字符")
	public String getDiagCodeExtcIpIcd() {
		return diagCodeExtcIpIcd;
	}

	public void setDiagCodeExtcIpIcd(String diagCodeExtcIpIcd) {
		this.diagCodeExtcIpIcd = diagCodeExtcIpIcd;
	}
	
	@Length(min=0, max=64, message="diag_name_extc_ip_icd长度不能超过 64 个字符")
	public String getDiagNameExtcIpIcd() {
		return diagNameExtcIpIcd;
	}

	public void setDiagNameExtcIpIcd(String diagNameExtcIpIcd) {
		this.diagNameExtcIpIcd = diagNameExtcIpIcd;
	}
	
	@Length(min=0, max=20, message="diag_code_patho_icd长度不能超过 20 个字符")
	public String getDiagCodePathoIcd() {
		return diagCodePathoIcd;
	}

	public void setDiagCodePathoIcd(String diagCodePathoIcd) {
		this.diagCodePathoIcd = diagCodePathoIcd;
	}
	
	@Length(min=0, max=200, message="diag_name_patho_icd长度不能超过 200 个字符")
	public String getDiagNamePathoIcd() {
		return diagNamePathoIcd;
	}

	public void setDiagNamePathoIcd(String diagNamePathoIcd) {
		this.diagNamePathoIcd = diagNamePathoIcd;
	}
	
	@Length(min=0, max=20, message="patho_no_icd长度不能超过 20 个字符")
	public String getPathoNoIcd() {
		return pathoNoIcd;
	}

	public void setPathoNoIcd(String pathoNoIcd) {
		this.pathoNoIcd = pathoNoIcd;
	}
	
	@Length(min=0, max=1, message="flag_drug_allergy_icd长度不能超过 1 个字符")
	public String getFlagDrugAllergyIcd() {
		return flagDrugAllergyIcd;
	}

	public void setFlagDrugAllergyIcd(String flagDrugAllergyIcd) {
		this.flagDrugAllergyIcd = flagDrugAllergyIcd;
	}
	
	@Length(min=0, max=256, message="allergic_drug_icd长度不能超过 256 个字符")
	public String getAllergicDrugIcd() {
		return allergicDrugIcd;
	}

	public void setAllergicDrugIcd(String allergicDrugIcd) {
		this.allergicDrugIcd = allergicDrugIcd;
	}
	
	@Length(min=0, max=1, message="part_disease长度不能超过 1 个字符")
	public String getPartDisease() {
		return partDisease;
	}

	public void setPartDisease(String partDisease) {
		this.partDisease = partDisease;
	}
	
	@Length(min=0, max=2, message="pat_source长度不能超过 2 个字符")
	public String getPatSource() {
		return patSource;
	}

	public void setPatSource(String patSource) {
		this.patSource = patSource;
	}
	
	@Length(min=0, max=20, message="curr_addr_code长度不能超过 20 个字符")
	public String getCurrAddrCode() {
		return currAddrCode;
	}

	public void setCurrAddrCode(String currAddrCode) {
		this.currAddrCode = currAddrCode;
	}
	
	@Length(min=0, max=20, message="birth_addr_code长度不能超过 20 个字符")
	public String getBirthAddrCode() {
		return birthAddrCode;
	}

	public void setBirthAddrCode(String birthAddrCode) {
		this.birthAddrCode = birthAddrCode;
	}
	
	@Length(min=0, max=20, message="origin_addr_code长度不能超过 20 个字符")
	public String getOriginAddrCode() {
		return originAddrCode;
	}

	public void setOriginAddrCode(String originAddrCode) {
		this.originAddrCode = originAddrCode;
	}
	
	@Length(min=0, max=40, message="reside_addr_code长度不能超过 40 个字符")
	public String getResideAddrCode() {
		return resideAddrCode;
	}

	public void setResideAddrCode(String resideAddrCode) {
		this.resideAddrCode = resideAddrCode;
	}
	
	@Length(min=0, max=2, message="diag_fit_ops长度不能超过 2 个字符")
	public String getDiagFitOps() {
		return diagFitOps;
	}

	public void setDiagFitOps(String diagFitOps) {
		this.diagFitOps = diagFitOps;
	}
	
	@Length(min=0, max=256, message="curr_addr_icd长度不能超过 256 个字符")
	public String getCurrAddrIcd() {
		return currAddrIcd;
	}

	public void setCurrAddrIcd(String currAddrIcd) {
		this.currAddrIcd = currAddrIcd;
	}
	
	@Length(min=0, max=16, message="code_pv长度不能超过 16 个字符")
	public String getCodePv() {
		return codePv;
	}

	public void setCodePv(String codePv) {
		this.codePv = codePv;
	}
	
	@Length(min=0, max=2, message="coded_not_cnfrm长度不能超过 2 个字符")
	public String getCodedNotCnfrm() {
		return codedNotCnfrm;
	}

	public void setCodedNotCnfrm(String codedNotCnfrm) {
		this.codedNotCnfrm = codedNotCnfrm;
	}
	
}