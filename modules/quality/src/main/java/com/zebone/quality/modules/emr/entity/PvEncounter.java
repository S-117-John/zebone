/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.zebone.quality.modules.emr.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 就诊记录Entity
 * @author lijin
 * @version 2021-01-06
 */
@Table(name="pv_encounter", alias="a", columns={
		@Column(name="pk_pv", attrName="pkPv", label="pk_pv", isPK=true),
		@Column(name="pk_org", attrName="pkOrg", label="pk_org"),
		@Column(name="pk_pi", attrName="pkPi", label="pk_pi"),
		@Column(name="code_pv", attrName="codePv", label="code_pv"),
		@Column(name="eu_pvtype", attrName="euPvtype", label="eu_pvtype"),
		@Column(name="date_begin", attrName="dateBegin", label="date_begin"),
		@Column(name="date_end", attrName="dateEnd", label="date_end"),
		@Column(name="eu_status", attrName="euStatus", label="eu_status"),
		@Column(name="flag_in", attrName="flagIn", label="flag_in"),
		@Column(name="flag_settle", attrName="flagSettle", label="flag_settle"),
		@Column(name="name_pi", attrName="namePi", label="name_pi"),
		@Column(name="dt_sex", attrName="dtSex", label="dt_sex"),
		@Column(name="age_pv", attrName="agePv", label="age_pv"),
		@Column(name="address", attrName="address", label="address"),
		@Column(name="dt_marry", attrName="dtMarry", label="dt_marry"),
		@Column(name="pk_dept", attrName="pkDept", label="pk_dept"),
		@Column(name="pk_dept_ns", attrName="pkDeptNs", label="pk_dept_ns"),
		@Column(name="date_clinic", attrName="dateClinic", label="date_clinic"),
		@Column(name="date_admit", attrName="dateAdmit", label="date_admit"),
		@Column(name="pk_wg", attrName="pkWg", label="pk_wg"),
		@Column(name="bed_no", attrName="bedNo", label="bed_no"),
		@Column(name="pk_emp_tre", attrName="pkEmpTre", label="pk_emp_tre"),
		@Column(name="name_emp_tre", attrName="nameEmpTre", label="name_emp_tre"),
		@Column(name="pk_emp_phy", attrName="pkEmpPhy", label="pk_emp_phy"),
		@Column(name="name_emp_phy", attrName="nameEmpPhy", label="name_emp_phy"),
		@Column(name="pk_emp_ns", attrName="pkEmpNs", label="pk_emp_ns"),
		@Column(name="name_emp_ns", attrName="nameEmpNs", label="name_emp_ns"),
		@Column(name="pk_insu", attrName="pkInsu", label="pk_insu"),
		@Column(name="pk_picate", attrName="pkPicate", label="pk_picate"),
		@Column(name="pk_emp_reg", attrName="pkEmpReg", label="pk_emp_reg"),
		@Column(name="name_emp_reg", attrName="nameEmpReg", label="name_emp_reg"),
		@Column(name="date_reg", attrName="dateReg", label="date_reg"),
		@Column(name="flag_cancel", attrName="flagCancel", label="flag_cancel"),
		@Column(name="pk_emp_cancel", attrName="pkEmpCancel", label="pk_emp_cancel"),
		@Column(name="name_emp_cancel", attrName="nameEmpCancel", label="name_emp_cancel"),
		@Column(name="date_cancel", attrName="dateCancel", label="date_cancel"),
		@Column(name="eu_status_fp", attrName="euStatusFp", label="eu_status_fp"),
		@Column(name="creator", attrName="creator", label="creator"),
		@Column(name="create_time", attrName="createTime", label="create_time"),
		@Column(name="modifier", attrName="modifier", label="modifier"),
		@Column(name="modity_time", attrName="modityTime", label="modity_time"),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
		@Column(name="height", attrName="height", label="height"),
		@Column(name="weight", attrName="weight", label="weight"),
		@Column(name="ts", attrName="ts", label="ts"),
		@Column(name="addrcode_regi", attrName="addrcodeRegi", label="addrcode_regi"),
		@Column(name="addr_regi", attrName="addrRegi", label="addr_regi"),
		@Column(name="addr_regi_dt", attrName="addrRegiDt", label="addr_regi_dt"),
		@Column(name="postcode_regi", attrName="postcodeRegi", label="postcode_regi"),
		@Column(name="addrcode_cur", attrName="addrcodeCur", label="addrcode_cur"),
		@Column(name="addr_cur", attrName="addrCur", label="addr_cur"),
		@Column(name="addr_cur_dt", attrName="addrCurDt", label="addr_cur_dt"),
		@Column(name="postcode_cur", attrName="postcodeCur", label="postcode_cur"),
		@Column(name="unit_work", attrName="unitWork", label="unit_work"),
		@Column(name="tel_work", attrName="telWork", label="tel_work"),
		@Column(name="postcode_work", attrName="postcodeWork", label="postcode_work"),
		@Column(name="name_rel", attrName="nameRel", label="name_rel"),
		@Column(name="dt_ralation", attrName="dtRalation", label="dt_ralation"),
		@Column(name="tel_rel", attrName="telRel", label="tel_rel"),
		@Column(name="addr_rel", attrName="addrRel", label="addr_rel"),
		@Column(name="dt_pvsource", attrName="dtPvsource", label="dt_pvsource"),
		@Column(name="eu_pvmode", attrName="euPvmode", label="eu_pvmode"),
		@Column(name="dt_hprealtype", attrName="dtHprealtype", label="dt_hprealtype"),
		@Column(name="dt_specunit", attrName="dtSpecunit", label="dt_specunit"),
		@Column(name="flag_spec", attrName="flagSpec", label="flag_spec"),
		@Column(name="eu_locked", attrName="euLocked", label="eu_locked"),
		@Column(name="note", attrName="note", label="note"),
		@Column(name="eu_disetype", attrName="euDisetype", label="eu_disetype"),
		@Column(name="dt_idtype_rel", attrName="dtIdtypeRel", label="dt_idtype_rel"),
		@Column(name="idno_rel", attrName="idnoRel", label="idno_rel"),
		@Column(name="flag_mi", attrName="flagMi", label="flag_mi"),
		@Column(name="name_spouse", attrName="nameSpouse", label="name_spouse"),
		@Column(name="idno_spouse", attrName="idnoSpouse", label="idno_spouse"),
		@Column(name="desc_symp", attrName="descSymp", label="desc_symp"),
		@Column(name="desc_epid", attrName="descEpid", label="desc_epid"),
		@Column(name="desc_treat", attrName="descTreat", label="desc_treat"),
		@Column(name="pk_dept_dist", attrName="pkDeptDist", label="pk_dept_dist"),
		@Column(name="dt_spcdtype", attrName="dtSpcdtype", label="dt_spcdtype"),
		@Column(name="reason_cancel", attrName="reasonCancel", label="reason_cancel"),
		@Column(name="tel_agent", attrName="telAgent", label="tel_agent"),
		@Column(name="idno_agent", attrName="idnoAgent", label="idno_agent"),
		@Column(name="name_agent", attrName="nameAgent", label="name_agent"),
		@Column(name="addr_agent", attrName="addrAgent", label="addr_agent"),
		@Column(name="flag_card_chk", attrName="flagCardChk", label="flag_card_chk"),
		@Column(name="dt_disease", attrName="dtDisease", label="dt_disease"),
		@Column(name="pk_dept_area", attrName="pkDeptArea", label="pk_dept_area"),
	}, orderBy="a.pk_pv DESC"
)
public class PvEncounter extends DataEntity<PvEncounter> {
	
	private static final long serialVersionUID = 1L;
	private String pkPv;		// pk_pv
	private String pkOrg;		// pk_org
	private String pkPi;		// pk_pi
	private String codePv;		// code_pv
	private String euPvtype;		// eu_pvtype
	private Date dateBegin;		// date_begin
	private Date dateEnd;		// date_end
	private String euStatus;		// eu_status
	private String flagIn;		// flag_in
	private String flagSettle;		// flag_settle
	private String namePi;		// name_pi
	private String dtSex;		// dt_sex
	private String agePv;		// age_pv
	private String address;		// address
	private String dtMarry;		// dt_marry
	private String pkDept;		// pk_dept
	private String pkDeptNs;		// pk_dept_ns
	private Date dateClinic;		// date_clinic
	private Date dateAdmit;		// date_admit
	private String pkWg;		// pk_wg
	private String bedNo;		// bed_no
	private String pkEmpTre;		// pk_emp_tre
	private String nameEmpTre;		// name_emp_tre
	private String pkEmpPhy;		// pk_emp_phy
	private String nameEmpPhy;		// name_emp_phy
	private String pkEmpNs;		// pk_emp_ns
	private String nameEmpNs;		// name_emp_ns
	private String pkInsu;		// pk_insu
	private String pkPicate;		// pk_picate
	private String pkEmpReg;		// pk_emp_reg
	private String nameEmpReg;		// name_emp_reg
	private Date dateReg;		// date_reg
	private String flagCancel;		// flag_cancel
	private String pkEmpCancel;		// pk_emp_cancel
	private String nameEmpCancel;		// name_emp_cancel
	private Date dateCancel;		// date_cancel
	private String euStatusFp;		// eu_status_fp
	private String creator;		// creator
	private Date createTime;		// create_time
	private String modifier;		// modifier
	private Date modityTime;		// modity_time
	private String delFlag;		// del_flag
	private Double height;		// height
	private Double weight;		// weight
	private Date ts;		// ts
	private String addrcodeRegi;		// addrcode_regi
	private String addrRegi;		// addr_regi
	private String addrRegiDt;		// addr_regi_dt
	private String postcodeRegi;		// postcode_regi
	private String addrcodeCur;		// addrcode_cur
	private String addrCur;		// addr_cur
	private String addrCurDt;		// addr_cur_dt
	private String postcodeCur;		// postcode_cur
	private String unitWork;		// unit_work
	private String telWork;		// tel_work
	private String postcodeWork;		// postcode_work
	private String nameRel;		// name_rel
	private String dtRalation;		// dt_ralation
	private String telRel;		// tel_rel
	private String addrRel;		// addr_rel
	private String dtPvsource;		// dt_pvsource
	private String euPvmode;		// eu_pvmode
	private String dtHprealtype;		// dt_hprealtype
	private String dtSpecunit;		// dt_specunit
	private String flagSpec;		// flag_spec
	private String euLocked;		// eu_locked
	private String note;		// note
	private String euDisetype;		// eu_disetype
	private String dtIdtypeRel;		// dt_idtype_rel
	private String idnoRel;		// idno_rel
	private String flagMi;		// flag_mi
	private String nameSpouse;		// name_spouse
	private String idnoSpouse;		// idno_spouse
	private String descSymp;		// desc_symp
	private String descEpid;		// desc_epid
	private String descTreat;		// desc_treat
	private String pkDeptDist;		// pk_dept_dist
	private String dtSpcdtype;		// dt_spcdtype
	private String reasonCancel;		// reason_cancel
	private String telAgent;		// tel_agent
	private String idnoAgent;		// idno_agent
	private String nameAgent;		// name_agent
	private String addrAgent;		// addr_agent
	private String flagCardChk;		// flag_card_chk
	private String dtDisease;		// dt_disease
	private String pkDeptArea;		// pk_dept_area
	
	public PvEncounter() {
		this(null);
	}

	public PvEncounter(String id){
		super(id);
	}
	
	public String getPkPv() {
		return pkPv;
	}

	public void setPkPv(String pkPv) {
		this.pkPv = pkPv;
	}
	
	@Length(min=0, max=32, message="pk_org长度不能超过 32 个字符")
	public String getPkOrg() {
		return pkOrg;
	}

	public void setPkOrg(String pkOrg) {
		this.pkOrg = pkOrg;
	}
	
	@NotBlank(message="pk_pi不能为空")
	@Length(min=0, max=32, message="pk_pi长度不能超过 32 个字符")
	public String getPkPi() {
		return pkPi;
	}

	public void setPkPi(String pkPi) {
		this.pkPi = pkPi;
	}
	
	@Length(min=0, max=16, message="code_pv长度不能超过 16 个字符")
	public String getCodePv() {
		return codePv;
	}

	public void setCodePv(String codePv) {
		this.codePv = codePv;
	}
	
	@Length(min=0, max=3, message="eu_pvtype长度不能超过 3 个字符")
	public String getEuPvtype() {
		return euPvtype;
	}

	public void setEuPvtype(String euPvtype) {
		this.euPvtype = euPvtype;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	
	@Length(min=0, max=3, message="eu_status长度不能超过 3 个字符")
	public String getEuStatus() {
		return euStatus;
	}

	public void setEuStatus(String euStatus) {
		this.euStatus = euStatus;
	}
	
	@Length(min=0, max=1, message="flag_in长度不能超过 1 个字符")
	public String getFlagIn() {
		return flagIn;
	}

	public void setFlagIn(String flagIn) {
		this.flagIn = flagIn;
	}
	
	@Length(min=0, max=1, message="flag_settle长度不能超过 1 个字符")
	public String getFlagSettle() {
		return flagSettle;
	}

	public void setFlagSettle(String flagSettle) {
		this.flagSettle = flagSettle;
	}
	
	@Length(min=0, max=40, message="name_pi长度不能超过 40 个字符")
	public String getNamePi() {
		return namePi;
	}

	public void setNamePi(String namePi) {
		this.namePi = namePi;
	}
	
	@Length(min=0, max=20, message="dt_sex长度不能超过 20 个字符")
	public String getDtSex() {
		return dtSex;
	}

	public void setDtSex(String dtSex) {
		this.dtSex = dtSex;
	}
	
	@Length(min=0, max=256, message="age_pv长度不能超过 256 个字符")
	public String getAgePv() {
		return agePv;
	}

	public void setAgePv(String agePv) {
		this.agePv = agePv;
	}
	
	@Length(min=0, max=256, message="address长度不能超过 256 个字符")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Length(min=0, max=20, message="dt_marry长度不能超过 20 个字符")
	public String getDtMarry() {
		return dtMarry;
	}

	public void setDtMarry(String dtMarry) {
		this.dtMarry = dtMarry;
	}
	
	@Length(min=0, max=32, message="pk_dept长度不能超过 32 个字符")
	public String getPkDept() {
		return pkDept;
	}

	public void setPkDept(String pkDept) {
		this.pkDept = pkDept;
	}
	
	@Length(min=0, max=32, message="pk_dept_ns长度不能超过 32 个字符")
	public String getPkDeptNs() {
		return pkDeptNs;
	}

	public void setPkDeptNs(String pkDeptNs) {
		this.pkDeptNs = pkDeptNs;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDateClinic() {
		return dateClinic;
	}

	public void setDateClinic(Date dateClinic) {
		this.dateClinic = dateClinic;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDateAdmit() {
		return dateAdmit;
	}

	public void setDateAdmit(Date dateAdmit) {
		this.dateAdmit = dateAdmit;
	}
	
	@Length(min=0, max=32, message="pk_wg长度不能超过 32 个字符")
	public String getPkWg() {
		return pkWg;
	}

	public void setPkWg(String pkWg) {
		this.pkWg = pkWg;
	}
	
	@Length(min=0, max=30, message="bed_no长度不能超过 30 个字符")
	public String getBedNo() {
		return bedNo;
	}

	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}
	
	@Length(min=0, max=32, message="pk_emp_tre长度不能超过 32 个字符")
	public String getPkEmpTre() {
		return pkEmpTre;
	}

	public void setPkEmpTre(String pkEmpTre) {
		this.pkEmpTre = pkEmpTre;
	}
	
	@Length(min=0, max=40, message="name_emp_tre长度不能超过 40 个字符")
	public String getNameEmpTre() {
		return nameEmpTre;
	}

	public void setNameEmpTre(String nameEmpTre) {
		this.nameEmpTre = nameEmpTre;
	}
	
	@Length(min=0, max=32, message="pk_emp_phy长度不能超过 32 个字符")
	public String getPkEmpPhy() {
		return pkEmpPhy;
	}

	public void setPkEmpPhy(String pkEmpPhy) {
		this.pkEmpPhy = pkEmpPhy;
	}
	
	@Length(min=0, max=40, message="name_emp_phy长度不能超过 40 个字符")
	public String getNameEmpPhy() {
		return nameEmpPhy;
	}

	public void setNameEmpPhy(String nameEmpPhy) {
		this.nameEmpPhy = nameEmpPhy;
	}
	
	@Length(min=0, max=32, message="pk_emp_ns长度不能超过 32 个字符")
	public String getPkEmpNs() {
		return pkEmpNs;
	}

	public void setPkEmpNs(String pkEmpNs) {
		this.pkEmpNs = pkEmpNs;
	}
	
	@Length(min=0, max=40, message="name_emp_ns长度不能超过 40 个字符")
	public String getNameEmpNs() {
		return nameEmpNs;
	}

	public void setNameEmpNs(String nameEmpNs) {
		this.nameEmpNs = nameEmpNs;
	}
	
	@Length(min=0, max=32, message="pk_insu长度不能超过 32 个字符")
	public String getPkInsu() {
		return pkInsu;
	}

	public void setPkInsu(String pkInsu) {
		this.pkInsu = pkInsu;
	}
	
	@Length(min=0, max=32, message="pk_picate长度不能超过 32 个字符")
	public String getPkPicate() {
		return pkPicate;
	}

	public void setPkPicate(String pkPicate) {
		this.pkPicate = pkPicate;
	}
	
	@Length(min=0, max=32, message="pk_emp_reg长度不能超过 32 个字符")
	public String getPkEmpReg() {
		return pkEmpReg;
	}

	public void setPkEmpReg(String pkEmpReg) {
		this.pkEmpReg = pkEmpReg;
	}
	
	@Length(min=0, max=32, message="name_emp_reg长度不能超过 32 个字符")
	public String getNameEmpReg() {
		return nameEmpReg;
	}

	public void setNameEmpReg(String nameEmpReg) {
		this.nameEmpReg = nameEmpReg;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDateReg() {
		return dateReg;
	}

	public void setDateReg(Date dateReg) {
		this.dateReg = dateReg;
	}
	
	@Length(min=0, max=1, message="flag_cancel长度不能超过 1 个字符")
	public String getFlagCancel() {
		return flagCancel;
	}

	public void setFlagCancel(String flagCancel) {
		this.flagCancel = flagCancel;
	}
	
	@Length(min=0, max=32, message="pk_emp_cancel长度不能超过 32 个字符")
	public String getPkEmpCancel() {
		return pkEmpCancel;
	}

	public void setPkEmpCancel(String pkEmpCancel) {
		this.pkEmpCancel = pkEmpCancel;
	}
	
	@Length(min=0, max=32, message="name_emp_cancel长度不能超过 32 个字符")
	public String getNameEmpCancel() {
		return nameEmpCancel;
	}

	public void setNameEmpCancel(String nameEmpCancel) {
		this.nameEmpCancel = nameEmpCancel;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDateCancel() {
		return dateCancel;
	}

	public void setDateCancel(Date dateCancel) {
		this.dateCancel = dateCancel;
	}
	
	@Length(min=0, max=3, message="eu_status_fp长度不能超过 3 个字符")
	public String getEuStatusFp() {
		return euStatusFp;
	}

	public void setEuStatusFp(String euStatusFp) {
		this.euStatusFp = euStatusFp;
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
	
	@Length(min=0, max=32, message="modifier长度不能超过 32 个字符")
	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getModityTime() {
		return modityTime;
	}

	public void setModityTime(Date modityTime) {
		this.modityTime = modityTime;
	}
	
	@Length(min=0, max=1, message="del_flag长度不能超过 1 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}
	
	@Length(min=0, max=30, message="addrcode_regi长度不能超过 30 个字符")
	public String getAddrcodeRegi() {
		return addrcodeRegi;
	}

	public void setAddrcodeRegi(String addrcodeRegi) {
		this.addrcodeRegi = addrcodeRegi;
	}
	
	@Length(min=0, max=256, message="addr_regi长度不能超过 256 个字符")
	public String getAddrRegi() {
		return addrRegi;
	}

	public void setAddrRegi(String addrRegi) {
		this.addrRegi = addrRegi;
	}
	
	@Length(min=0, max=256, message="addr_regi_dt长度不能超过 256 个字符")
	public String getAddrRegiDt() {
		return addrRegiDt;
	}

	public void setAddrRegiDt(String addrRegiDt) {
		this.addrRegiDt = addrRegiDt;
	}
	
	@Length(min=0, max=30, message="postcode_regi长度不能超过 30 个字符")
	public String getPostcodeRegi() {
		return postcodeRegi;
	}

	public void setPostcodeRegi(String postcodeRegi) {
		this.postcodeRegi = postcodeRegi;
	}
	
	@Length(min=0, max=30, message="addrcode_cur长度不能超过 30 个字符")
	public String getAddrcodeCur() {
		return addrcodeCur;
	}

	public void setAddrcodeCur(String addrcodeCur) {
		this.addrcodeCur = addrcodeCur;
	}
	
	@Length(min=0, max=256, message="addr_cur长度不能超过 256 个字符")
	public String getAddrCur() {
		return addrCur;
	}

	public void setAddrCur(String addrCur) {
		this.addrCur = addrCur;
	}
	
	@Length(min=0, max=256, message="addr_cur_dt长度不能超过 256 个字符")
	public String getAddrCurDt() {
		return addrCurDt;
	}

	public void setAddrCurDt(String addrCurDt) {
		this.addrCurDt = addrCurDt;
	}
	
	@Length(min=0, max=30, message="postcode_cur长度不能超过 30 个字符")
	public String getPostcodeCur() {
		return postcodeCur;
	}

	public void setPostcodeCur(String postcodeCur) {
		this.postcodeCur = postcodeCur;
	}
	
	@Length(min=0, max=256, message="unit_work长度不能超过 256 个字符")
	public String getUnitWork() {
		return unitWork;
	}

	public void setUnitWork(String unitWork) {
		this.unitWork = unitWork;
	}
	
	@Length(min=0, max=30, message="tel_work长度不能超过 30 个字符")
	public String getTelWork() {
		return telWork;
	}

	public void setTelWork(String telWork) {
		this.telWork = telWork;
	}
	
	@Length(min=0, max=30, message="postcode_work长度不能超过 30 个字符")
	public String getPostcodeWork() {
		return postcodeWork;
	}

	public void setPostcodeWork(String postcodeWork) {
		this.postcodeWork = postcodeWork;
	}
	
	@Length(min=0, max=40, message="name_rel长度不能超过 40 个字符")
	public String getNameRel() {
		return nameRel;
	}

	public void setNameRel(String nameRel) {
		this.nameRel = nameRel;
	}
	
	@Length(min=0, max=30, message="dt_ralation长度不能超过 30 个字符")
	public String getDtRalation() {
		return dtRalation;
	}

	public void setDtRalation(String dtRalation) {
		this.dtRalation = dtRalation;
	}
	
	@Length(min=0, max=30, message="tel_rel长度不能超过 30 个字符")
	public String getTelRel() {
		return telRel;
	}

	public void setTelRel(String telRel) {
		this.telRel = telRel;
	}
	
	@Length(min=0, max=256, message="addr_rel长度不能超过 256 个字符")
	public String getAddrRel() {
		return addrRel;
	}

	public void setAddrRel(String addrRel) {
		this.addrRel = addrRel;
	}
	
	@Length(min=0, max=30, message="dt_pvsource长度不能超过 30 个字符")
	public String getDtPvsource() {
		return dtPvsource;
	}

	public void setDtPvsource(String dtPvsource) {
		this.dtPvsource = dtPvsource;
	}
	
	@Length(min=0, max=2, message="eu_pvmode长度不能超过 2 个字符")
	public String getEuPvmode() {
		return euPvmode;
	}

	public void setEuPvmode(String euPvmode) {
		this.euPvmode = euPvmode;
	}
	
	@Length(min=0, max=2, message="dt_hprealtype长度不能超过 2 个字符")
	public String getDtHprealtype() {
		return dtHprealtype;
	}

	public void setDtHprealtype(String dtHprealtype) {
		this.dtHprealtype = dtHprealtype;
	}
	
	@Length(min=0, max=30, message="dt_specunit长度不能超过 30 个字符")
	public String getDtSpecunit() {
		return dtSpecunit;
	}

	public void setDtSpecunit(String dtSpecunit) {
		this.dtSpecunit = dtSpecunit;
	}
	
	@Length(min=0, max=1, message="flag_spec长度不能超过 1 个字符")
	public String getFlagSpec() {
		return flagSpec;
	}

	public void setFlagSpec(String flagSpec) {
		this.flagSpec = flagSpec;
	}
	
	@Length(min=0, max=2, message="eu_locked长度不能超过 2 个字符")
	public String getEuLocked() {
		return euLocked;
	}

	public void setEuLocked(String euLocked) {
		this.euLocked = euLocked;
	}
	
	@Length(min=0, max=1280, message="note长度不能超过 1280 个字符")
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	@Length(min=0, max=2, message="eu_disetype长度不能超过 2 个字符")
	public String getEuDisetype() {
		return euDisetype;
	}

	public void setEuDisetype(String euDisetype) {
		this.euDisetype = euDisetype;
	}
	
	@Length(min=0, max=30, message="dt_idtype_rel长度不能超过 30 个字符")
	public String getDtIdtypeRel() {
		return dtIdtypeRel;
	}

	public void setDtIdtypeRel(String dtIdtypeRel) {
		this.dtIdtypeRel = dtIdtypeRel;
	}
	
	@Length(min=0, max=30, message="idno_rel长度不能超过 30 个字符")
	public String getIdnoRel() {
		return idnoRel;
	}

	public void setIdnoRel(String idnoRel) {
		this.idnoRel = idnoRel;
	}
	
	@Length(min=0, max=1, message="flag_mi长度不能超过 1 个字符")
	public String getFlagMi() {
		return flagMi;
	}

	public void setFlagMi(String flagMi) {
		this.flagMi = flagMi;
	}
	
	@Length(min=0, max=40, message="name_spouse长度不能超过 40 个字符")
	public String getNameSpouse() {
		return nameSpouse;
	}

	public void setNameSpouse(String nameSpouse) {
		this.nameSpouse = nameSpouse;
	}
	
	@Length(min=0, max=30, message="idno_spouse长度不能超过 30 个字符")
	public String getIdnoSpouse() {
		return idnoSpouse;
	}

	public void setIdnoSpouse(String idnoSpouse) {
		this.idnoSpouse = idnoSpouse;
	}
	
	@Length(min=0, max=256, message="desc_symp长度不能超过 256 个字符")
	public String getDescSymp() {
		return descSymp;
	}

	public void setDescSymp(String descSymp) {
		this.descSymp = descSymp;
	}
	
	@Length(min=0, max=256, message="desc_epid长度不能超过 256 个字符")
	public String getDescEpid() {
		return descEpid;
	}

	public void setDescEpid(String descEpid) {
		this.descEpid = descEpid;
	}
	
	@Length(min=0, max=256, message="desc_treat长度不能超过 256 个字符")
	public String getDescTreat() {
		return descTreat;
	}

	public void setDescTreat(String descTreat) {
		this.descTreat = descTreat;
	}
	
	@Length(min=0, max=32, message="pk_dept_dist长度不能超过 32 个字符")
	public String getPkDeptDist() {
		return pkDeptDist;
	}

	public void setPkDeptDist(String pkDeptDist) {
		this.pkDeptDist = pkDeptDist;
	}
	
	@Length(min=0, max=30, message="dt_spcdtype长度不能超过 30 个字符")
	public String getDtSpcdtype() {
		return dtSpcdtype;
	}

	public void setDtSpcdtype(String dtSpcdtype) {
		this.dtSpcdtype = dtSpcdtype;
	}
	
	@Length(min=0, max=128, message="reason_cancel长度不能超过 128 个字符")
	public String getReasonCancel() {
		return reasonCancel;
	}

	public void setReasonCancel(String reasonCancel) {
		this.reasonCancel = reasonCancel;
	}
	
	@Length(min=0, max=30, message="tel_agent长度不能超过 30 个字符")
	public String getTelAgent() {
		return telAgent;
	}

	public void setTelAgent(String telAgent) {
		this.telAgent = telAgent;
	}
	
	@Length(min=0, max=30, message="idno_agent长度不能超过 30 个字符")
	public String getIdnoAgent() {
		return idnoAgent;
	}

	public void setIdnoAgent(String idnoAgent) {
		this.idnoAgent = idnoAgent;
	}
	
	@Length(min=0, max=120, message="name_agent长度不能超过 120 个字符")
	public String getNameAgent() {
		return nameAgent;
	}

	public void setNameAgent(String nameAgent) {
		this.nameAgent = nameAgent;
	}
	
	@Length(min=0, max=128, message="addr_agent长度不能超过 128 个字符")
	public String getAddrAgent() {
		return addrAgent;
	}

	public void setAddrAgent(String addrAgent) {
		this.addrAgent = addrAgent;
	}
	
	@Length(min=0, max=1, message="flag_card_chk长度不能超过 1 个字符")
	public String getFlagCardChk() {
		return flagCardChk;
	}

	public void setFlagCardChk(String flagCardChk) {
		this.flagCardChk = flagCardChk;
	}
	
	@Length(min=0, max=30, message="dt_disease长度不能超过 30 个字符")
	public String getDtDisease() {
		return dtDisease;
	}

	public void setDtDisease(String dtDisease) {
		this.dtDisease = dtDisease;
	}
	
	@Length(min=0, max=32, message="pk_dept_area长度不能超过 32 个字符")
	public String getPkDeptArea() {
		return pkDeptArea;
	}

	public void setPkDeptArea(String pkDeptArea) {
		this.pkDeptArea = pkDeptArea;
	}
	
}