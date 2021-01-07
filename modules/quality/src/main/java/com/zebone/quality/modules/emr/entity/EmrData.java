package com.zebone.quality.modules.emr.entity;

import com.jeesite.common.entity.DataEntity;
import lombok.Data;

import java.util.Date;

@Data
public class EmrData extends DataEntity<EmrData> {

    /**
     * 质控医师
     */
    private String qcDocName;


    /**
     * 质控护士
     */
    private String qcNurseName;

    /**
     * 主治医师
     */
    private String consultName;

    /**
     * 责任护士
     */
    private String nurseName;

    /**
     * 病案号
     */
    private String patNo;

    /**
     * 是否31天内重复住院
     */
    private String flagReadmit;

    /**
     * 出生日期
     */
    private Date birthDate;

    /**
     *
     */
    private String medPayMode;

    private Double weight;

    private Double height;


    private Double infWeight;

    private Date dateLast;

    /**
     * 入院日期时间
     */
    private Date cm0241;

    /**
     * 出院日期时间
     */
    private Date cm0242;

    /**
     * 收入住院途径
     */
    private String cm032;

    /**
     * 产次
     */
    private String cs111;

    /**
     * 临产方式
     */
    private String cs113;

    /**
     * 孕周
     */
    private String cs114;

    private String cs115;

    private String cs124;

    private Date cs242;
}
