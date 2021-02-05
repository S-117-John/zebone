package com.zebone.quality.infrastructure.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

//@Entity
//@Table(name = "QUALITY_MVR")
public class MvrDO extends BaseEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '是否实施手术前的超声心动图评估'")
    private String mvr_1_1_1;
    @Column(columnDefinition = "double COMMENT '左室射血分数（LVEF）测量值(%)'")
    private Double mvr_1_1_2;
    @Column(columnDefinition = "double COMMENT '左心房前后径(mm)'")
    private Double mvr_1_1_4;
    @Column(columnDefinition = "double COMMENT '反流量(ml)'")
    private Double mvr_1_1_5;
    @Column(columnDefinition = "double COMMENT '二尖瓣口面积(cm²)'")
    private Double mvr_1_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '二尖瓣口面积分层'")
    private String mvr_1_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '是否左心耳血栓'")
    private String mvr_1_1_9;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有冠心病史，或冠心病危险因素'")
    private String mvr_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施手术前的冠状动脉造影评估'")
    private String mvr_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '冠状动脉病变数量'")
    private String mvr_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '血管病变主要位置'")
    private String mvr_1_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用SinoSCOREⅡ风险评估表进行手术前风险评估'")
    private String mvr_1_3_1;
    @Column(columnDefinition = "double COMMENT 'MVR手术风险评估（SinoSCOREⅡ）评估值'")
    private Double mvr_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果分层的选择'")
    private String mvr_1_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用欧州心血管手术危险因素评分 EuroSCORE进行手术前评估'")
    private String mvr_1_4_1;
    @Column(columnDefinition = "double COMMENT '欧州心血管手术危险因素评分 EuroSCORE值'")
    private Double mvr_0_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '评估结果分层的选择'")
    private String mvr_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '二尖瓣手术适应证'")
    private String mvr_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他二尖瓣手术适应证'")
    private String mvr_2_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施急诊二尖瓣手术'")
    private String mvr_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否人工机械瓣膜急性功能障碍'")
    private String mvr_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否同时合并其他手术'")
    private String mvr_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '合并其他手术种类'")
    private String mvr_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '手术切口的选择'")
    private String mvr_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他手术切口'")
    private String mvr_2_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '二尖瓣病变类型'")
    private String mvr_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '二尖瓣手术种类'")
    private String mvr_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '瓣膜种类'")
    private String mvr_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用体外循环辅助的二尖瓣手术'")
    private String mvr_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '体外循环起始日期时间'")
    private Date mvr_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '体外循环结朿日期时间'")
    private Date mvr_3_2_3;
    @Column(columnDefinition = "double COMMENT '体外循环持续时间(分钟)'")
    private Double mvr_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '术中是否使用TEE超声'")
    private String mvr_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'TEE返流分级'")
    private String mvr_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否围术期使用血制品'")
    private String mvr_3_4_1;
    @Column(columnDefinition = "double COMMENT '全血量(ml)'")
    private Double mvr_3_4_2;
    @Column(columnDefinition = "double COMMENT '红细胞量(ml)'")
    private Double mvr_3_4_3;
    @Column(columnDefinition = "double COMMENT '血浆量(ml)'")
    private Double mvr_3_4_4;
    @Column(columnDefinition = "double COMMENT '血小板量(ml)'")
    private Double mvr_3_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术后入住ICU/术后复苏室'")
    private String mvr_3_5_0;
    @Column(columnDefinition = "varchar(64) COMMENT '是否ICU/术后复苏室实施机械通气'")
    private String mvr_3_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '起始日期时间'")
    private Date mvr_3_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '终止日期时间'")
    private Date mvr_3_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否术后活动性出血或血肿'")
    private String mvr_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '术后活动性出血或血肿主要情况'")
    private String mvr_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否再手术'")
    private String mvr_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '再手术指征的选择'")
    private String mvr_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心脏问题再手术'")
    private String mvr_5_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非心脏问题再手术'")
    private String mvr_5_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '再手术起始日期时间'")
    private Date mvr_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否有继续使用华法林的带药医嘱'")
    private String mvr_7_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时是否有继续使用除华法林外其他抗凝药物的用药医嘱'")
    private String mvr_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗凝药物用药'")
    private String mvr_7_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗凝药物名称'")
    private String mvr_7_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行术前、术后健康教育，且有记录'")
    private String mvr_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'MVR手术术前,术后的健康教育'")
    private String mvr_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时,告知患者/家属高危因素评估结果'")
    private String mvr_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '常见高危因素的选择'")
    private String mvr_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他常见高危因素'")
    private String mvr_8_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其它特殊使用级抗菌药物填写'")
    private String mvr_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否履行出院教育与告知责任，且有记录'")
    private String mvr_8_3_1;

}
