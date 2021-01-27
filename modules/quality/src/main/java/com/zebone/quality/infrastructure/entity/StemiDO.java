package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * STEMI急性心肌梗死（ST 段抬高型，首次住院）
 * @author 卡卡西
 */
@Entity
@Data
@Table(name = "QUALITY_STEMI")
public class StemiDO extends DataEntity{



    private String cm_0_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '质控护士'")
    private String cm_0_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主治医师'")
    private String cm_0_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '责任护士'")
    private String cm_0_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '上报科室'")
    private String cm_0_1_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '患者病案号'")
    private String caseid;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10四位亚目编码与名称'")
    private String cm_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要诊断ICD-10六位临床扩展编码与名称'")
    private String cm_0_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String cm_0_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院后31天内重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间是否无法确定或无记录'")
    private String cm_0_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间'")
    private Date cm_0_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到达本院急诊或者门诊日期时间'")
    private Date cm_0_2_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '入住CCU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '离开CCU日期时间'")
    private Date cm_0_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '救护车类型'")
    private String stemi_0_4_6;
    @Column(columnDefinition = "varchar(64) COMMENT '是否现场评估生命体征，施行急救'")
    private String stemi_0_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '到达现场后10分钟内是否完成心电图检查'")
    private String stemi_0_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '现场急救维持生命体征稳定措施选择'")
    private String stemi_0_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '对持续胸痛＞15分钟和心电图ST段抬高，且无“阿斯匹林”禁忌症的患者用药'")
    private String stemi_0_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否利用救护车中车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院'")
    private String stemi_0_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否入院前在救护车上开始溶栓治疗'")
    private String stemi_0_4_7;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有症状和病史'")
    private String stemi_1_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '症状和体征选择'")
    private String stemi_1_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次采用Killip分级法评估心功能'")
    private String stemi_1_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT 'Killip分级，症状及体征选择'")
    private String stemi_1_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次心电图检查'")
    private String stemi_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '心电图检查结果确诊STEMI报告日期时间'")
    private Date stemi_1_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '心电图检查结果，具有STEMI特征性诊断标准的选择'")
    private String stemi_1_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心电图检查结果填写'")
    private String stemi_1_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有P2Y12受体拮抗剂禁忌证'")
    private String stemi_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'P2Y12受体拮抗剂禁忌证'")
    private String stemi_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他P2Y12受体拮抗剂禁忌证填写'")
    private String stemi_1_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂给予双联抗血小板药负荷剂量'")
    private String stemi_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗血小板药物填写'")
    private String stemi_1_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '用药日期时间'")
    private Date stemi_1_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次心脏标志物检测'")
    private String stemi_1_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首次心脏标志物检测结果报告日期时间'")
    private Date stemi_1_3_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首次心脏标志物检测选项和数值'")
    private String stemi_1_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '肌钙蛋白T检测选项'")
    private String stemi_1_4_1_1;
    @Column(columnDefinition = "double COMMENT '肌钙蛋白T检测值(ng/Ml)'")
    private Double stemi_1_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '肌钙蛋白T定性检测选择'")
    private String stemi_1_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '肌钙蛋白I检测选项'")
    private String stemi_1_4_2_1;
    @Column(columnDefinition = "double COMMENT '肌钙蛋白I检测值(ng/mL)'")
    private Double stemi_1_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '肌钙蛋白I定性检测选择'")
    private String stemi_1_4_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '肌酸激酶同工酶检测选项'")
    private String stemi_1_4_3_1;
    @Column(columnDefinition = "double COMMENT '肌酸激酶同工酶检测值(ng/mL)'")
    private Double stemi_1_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '肌酸激酶同工酶定性检测选择'")
    private String stemi_1_4_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '心肌肌红蛋白检测选项'")
    private String stemi_1_4_4_1;
    @Column(columnDefinition = "double COMMENT '心肌肌红蛋白检测值(ng/mL)'")
    private Double stemi_1_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '心肌肌红蛋白定性检测选择'")
    private String stemi_1_4_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'B型钠尿肽检测选项'")
    private String stemi_1_4_5_1;
    @Column(columnDefinition = "double COMMENT 'B型钠尿肽检测值(ng/L)'")
    private Double stemi_1_3_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT 'B型钠尿肽定性检测选择'")
    private String stemi_1_4_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'N端B型钠尿肽前体检测选项'")
    private String stemi_1_4_6_1;
    @Column(columnDefinition = "double COMMENT 'N端B型钠尿肽前体检测值(ng/L)'")
    private Double stemi_1_3_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT 'N端B型钠尿肽前体定性检测选择'")
    private String stemi_1_4_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次X线胸片检查'")
    private String stemi_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '首次X线胸片检查报告日期时间'")
    private Date stemi_2_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有肺淤血或肺水肿'")
    private String stemi_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次超声心动图(CDFA)检查'")
    private String stemi_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间'")
    private Date stemi_2_2_2_1;
    @Column(columnDefinition = "double COMMENT '左室射血分（LVEF）测量值(%)'")
    private Double stemi_2_2_3_1;
    @Column(columnDefinition = "double COMMENT '左室舒张末径（LVEDd）数值(mm)'")
    private Double stemi_2_2_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有左室室壁瘤'")
    private String stemi_2_2_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施GRACE危险评分评估'")
    private String stemi_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评估日期时间'")
    private Date stemi_2_3_1_2_1;
    @Column(columnDefinition = "double COMMENT '实施首次GRACE危险评分值'")
    private Double stemi_2_3_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'GRACE危险评估分层的选择'")
    private String stemi_2_3_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施TIMI危险分层评估'")
    private String stemi_2_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评估日期时间'")
    private Date stemi_2_3_2_2_1;
    @Column(columnDefinition = "double COMMENT '实施首次TIMI危险分层分值'")
    private Double stemi_2_3_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'TIMI危险分层的选择'")
    private String stemi_2_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施CRUSADE出血风险评分'")
    private String stemi_2_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评估日期时间'")
    private Date stemi_2_3_3_2_1;
    @Column(columnDefinition = "double COMMENT '实施首次CRUSADE出血风险评分值'")
    private Double stemi_2_3_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'CRUSADE出血风险评分分层的选择'")
    private String stemi_2_3_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '实施再灌注治疗的模式'")
    private String stemi_3_0_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'STEMI溶栓适应证'")
    private String stemi_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有溶栓治疗禁忌症'")
    private String stemi_3_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '绝对禁忌证选择'")
    private String stemi_3_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '相对禁忌证选择'")
    private String stemi_3_1_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施溶栓治疗'")
    private String stemi_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓药物选择'")
    private String stemi_3_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他溶栓药物'")
    private String stemi_3_1_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '输注开始日期时间'")
    private Date stemi_3_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '输注完成日期时间'")
    private Date stemi_3_1_6_1;
    @Column(columnDefinition = "double COMMENT '到达医院STEMI确诊报告日期与时间至溶栓时间（D2N）'")
    private Double stemi_3_1_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '临床评估溶栓成功(60~90 min)'")
    private String stemi_3_1_8;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓治疗并发症的选择'")
    private String stemi_3_1_9;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓治疗延迟原因'")
    private String stemi_3_1_10;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施PCI治疗'")
    private String stemi_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'PCI适应证'")
    private String stemi_3_2_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '直接PCI适应证'")
    private String stemi_3_2_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '直接PCI适应证填写'")
    private String stemi_3_2_2_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓后PCI适应证'")
    private String stemi_3_2_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有PCI禁忌证'")
    private String stemi_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'PCI禁忌证选择'")
    private String stemi_3_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'PCI导丝通过梗死相关动脉日期时间'")
    private Date stemi_3_2_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '完成时间'")
    private Date stemi_3_2_2_3_1;
    @Column(columnDefinition = "double COMMENT '确诊STEMI至PCI导丝通过梗死相关动脉（D2B）时间（分钟）'")
    private Double stemi_3_2_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗延迟原因选择'")
    private String stemi_3_2_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '主要病变血管'")
    private String stemi_3_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LAD-冠状动脉狭窄程度分级'")
    private String stemi_3_2_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LAD-术前主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT 'LCX-冠状动脉狭窄程度分级'")
    private String stemi_3_2_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'LCX-术前主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT 'RCA-冠状动脉狭窄程度分级'")
    private String stemi_3_2_3_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'RCA-术前主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-冠状动脉狭窄程度分级'")
    private String stemi_3_2_3_2_4;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-术前主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT 'PCI治疗主要靶血管'")
    private String stemi_3_2_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-PCI术后即刻主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-置入冠状动脉支架选择'")
    private String stemi_3_2_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-置入冠状动脉支架填写'")
    private String stemi_3_2_3_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LAD-PCI术后即刻主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT 'LAD-置入冠状动脉支架选择'")
    private String stemi_3_2_3_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT 'LAD-置入冠状动脉支架填写'")
    private String stemi_3_2_3_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LCX-PCI术后即刻主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT 'LCX-置入冠状动脉支架选择'")
    private String stemi_3_2_3_3_6;
    @Column(columnDefinition = "varchar(64) COMMENT 'LCX-置入冠状动脉支架填写'")
    private String stemi_3_2_3_3_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-LAD-PCI术后即刻主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_3_7;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-LAD-置入冠状动脉支架选择'")
    private String stemi_3_2_3_3_8;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-LAD-置入冠状动脉支架填写'")
    private String stemi_3_2_3_3_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-LCX-PCI术后即刻主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_9_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-LCX-置入冠状动脉支架选择'")
    private String stemi_3_2_3_3_10;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-LCX-置入冠状动脉支架填写'")
    private String stemi_3_2_3_3_10_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'RCA-PCI术后即刻主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_3_11;
    @Column(columnDefinition = "varchar(64) COMMENT 'RCA-置入冠状动脉支架选择'")
    private String stemi_3_2_3_3_12;
    @Column(columnDefinition = "varchar(64) COMMENT 'RCA-置入冠状动脉支架填写'")
    private String stemi_3_2_3_3_12_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-中间支-PCI术后即刻主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_3_13;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-中间支-置入冠状动脉支架选择'")
    private String stemi_3_2_3_3_14;
    @Column(columnDefinition = "varchar(64) COMMENT 'LM-中间支-置入冠状动脉支架填写'")
    private String stemi_3_2_3_3_14_1;
    @Column(columnDefinition = "varchar(64) COMMENT '中间支-PCI术后即刻主要靶血管TIMI血流分级的选择'")
    private String stemi_3_2_3_15_1;
    @Column(columnDefinition = "varchar(64) COMMENT '中间支-置入冠状动脉支架选择'")
    private String stemi_3_2_3_3_16;
    @Column(columnDefinition = "varchar(64) COMMENT '中间支-置入冠状动脉支架填写'")
    private String stemi_3_2_3_3_16_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'ICD-9-CM-3编码与名称'")
    private String stemi_3_2_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗血管的数量的选择'")
    private String stemi_3_2_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '置入血管支架的数量现在'")
    private String stemi_3_2_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '心脏团队讨论决策模式的选择'")
    private String stemi_3_2_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '近期主要并发症的选择'")
    private String stemi_3_2_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他近期主要并发症'")
    private String stemi_3_2_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '近期并发症治疗主要措施的选择'")
    private String stemi_3_2_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他近期并发症治疗主要措施'")
    private String stemi_3_2_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施CathPCI风险评估'")
    private String stemi_3_2_6_1;
    @Column(columnDefinition = "double COMMENT '总分值'")
    private Double stemi_3_2_6_2_1_1;
    @Column(columnDefinition = "double COMMENT '院内患者死亡风险(%)'")
    private Double stemi_3_2_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施围术期抗凝治疗'")
    private String stemi_3_2_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '肠外抗凝药物选择'")
    private String stemi_3_2_7_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他肠外抗凝药物'")
    private String stemi_3_2_7_3;
    @Column(columnDefinition = "varchar(64) COMMENT '（本院）无条件实施时，是否将患者转往有条件行PCI的医院'")
    private String stemi_3_3_0;
    @Column(columnDefinition = "varchar(64) COMMENT '医院自身原因'")
    private String stemi_3_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他医院自身原因'")
    private String stemi_3_3_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者自身原因转院'")
    private String stemi_3_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他患者自身原因'")
    private String stemi_3_3_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '转院类型及适应症'")
    private String stemi_3_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '转院日期时间'")
    private Date stemi_3_3_3_1;
    @Column(columnDefinition = "double COMMENT '到医院就诊至转出时间（分钟）'")
    private Double stemi_3_3_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '医院是否具备接受外院“转院PCI”患者的能力'")
    private String stemi_3_4;
    @Column(columnDefinition = "varchar(64) COMMENT '患者从不具备实施PCI能力医院转运到本院急诊或门诊日期'")
    private Date stemi_3_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'PCI导丝通过梗死相关动脉的时间'")
    private Date stemi_3_4_2_1;
    @Column(columnDefinition = "double COMMENT '医院转出时间至PCI导丝通过梗死相关动脉（D2B1）时间（分钟）'")
    private Double stemi_3_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '治疗延迟原因选择'")
    private String stemi_3_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有β-受体阻滞剂禁忌证'")
    private String stemi_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'β-受体阻滞剂禁忌症'")
    private String stemi_4_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他β-受体阻滞剂禁忌症'")
    private String stemi_4_1_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'β-受体阻滞剂相对禁忌症'")
    private String stemi_4_1_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他β-受体阻滞剂相对禁忌症'")
    private String stemi_4_1_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用首剂β-受体阻滞剂'")
    private String stemi_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '首剂用药日期时间'")
    private Date stemi_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '双联抗血小板药物是否有用药长期医嘱'")
    private String stemi_5_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '双联抗血小板药物品名的选择'")
    private String stemi_5_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '双联抗血小板药物品名填写'")
    private String stemi_5_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'β阻滞剂是否有用药长期医嘱'")
    private String stemi_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '长期医嘱中使用β-受体阻滞剂品名的选择'")
    private String stemi_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有ACEI抑制剂/ARB类药物禁忌症'")
    private String stemi_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'ACE抑制剂/ARB类药物禁忌症的选择'")
    private String stemi_5_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有ACEI抑制剂/ARB类药物长期医嘱'")
    private String stemi_5_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ACE抑制剂药物名称的选择'")
    private String stemi_5_3_4_a;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ACE抑制剂药物'")
    private String stemi_5_3_4_a_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ARB类药物名称的选择'")
    private String stemi_5_3_4_b;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ARB类药物'")
    private String stemi_5_3_4_b_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有他汀类药禁忌证'")
    private String stemi_5_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '他汀类药物禁忌证的选择'")
    private String stemi_5_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有用药长期医嘱'")
    private String stemi_5_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '给予他汀类药物名称的选择'")
    private String stemi_5_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他其他降脂药物'")
    private String stemi_5_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有出院带药医嘱-抗血小板药物'")
    private String stemi_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '双联抗血小板药物品名的选择'")
    private String stemi_6_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他双联抗血小板药物品'")
    private String stemi_6_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有β阻滞剂出院带药医嘱'")
    private String stemi_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '使用β-受体阻滞剂品名的选择'")
    private String stemi_6_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有出院带药医嘱-ACEI抑制剂/ARB类药物医嘱'")
    private String stemi_6_3;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ACEI抑制剂或者ARB类药物'")
    private String stemi_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ACE抑制剂药物名称的选择'")
    private String stemi_6_3_2_a;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ACE抑制剂药物'")
    private String stemi_6_3_2_a_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用ARB类药物名称的选择'")
    private String stemi_6_3_2_b;
    @Column(columnDefinition = "varchar(64) COMMENT '其他ARB类药物'")
    private String stemi_6_3_2_b_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有出院带药医嘱-他汀类药物医嘱'")
    private String stemi_6_4;
    @Column(columnDefinition = "varchar(64) COMMENT '给予他汀类药物名称的选择'")
    private String stemi_6_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降脂药物'")
    private String stemi_6_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有醛固酮受体拮抗剂药物禁忌证'")
    private String stemi_6_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '醛固酮受体拮抗剂药物禁忌证的选择'")
    private String stemi_6_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '醛固酮受体拮抗剂药物禁忌证填写'")
    private String stemi_6_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有醛固酮受体拮抗剂药物适应证'")
    private String stemi_6_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '醛固酮受体拮抗剂药物适应证的选择'")
    private String stemi_6_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有出院带药医嘱-醛固酮受体拮抗剂'")
    private String stemi_6_5_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药医嘱中使用醛固酮受体拮抗剂品名的选择'")
    private String stemi_6_5_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其他醛固酮受体拮抗剂品名'")
    private String stemi_6_5_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血脂评价时间'")
    private String stemi_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血脂评价结果'")
    private String stemi_7_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有他汀药物禁忌症'")
    private String stemi_7_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '他汀类药物禁忌证的选择'")
    private String stemi_7_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有他汀类药物长期医嘱'")
    private String stemi_7_4;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有他汀类药物出院带药医嘱'")
    private String stemi_7_5;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟史'")
    private String stemi_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟程度评估有记录'")
    private String stemi_8_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '接受戒烟的建议或者戒烟治疗有记录'")
    private String stemi_8_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '（主要）危险因素的评估'")
    private String stemi_8_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '实施针对控制危险因素评估结果的教育'")
    private String stemi_8_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '二级预防'")
    private String stemi_8_3;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String stemi_8_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String stemi_8_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String stemi_8_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String stemi_8_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String stemi_8_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时状态评估结果'")
    private String stemi_9_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他出院时状态填写'")
    private String stemi_9_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '末次GRACE危险评估是否有记录'")
    private String stemi_9_2_2_a_2;
    @Column(columnDefinition = "double COMMENT '末次GRACE危险评估'")
    private Double stemi_9_2_2_a_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'GRACE危险评估分层的选择'")
    private String stemi_9_2_2_a_3;
    @Column(columnDefinition = "varchar(64) COMMENT '离院方式选择'")
    private String cm_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '非医嘱离院可能涉及因素'")
    private String cm_4_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他非医嘱离院因素填写'")
    private String cm_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '死亡可能涉及因素'")
    private String cm_4_6;
    @Column(columnDefinition = "varchar(64) COMMENT '患者是否对服务的体验与评价'")
    private String cm_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '整体医院评级'")
    private String cm_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者推荐'")
    private String cm_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '病房、床单元和卫生间清洁度'")
    private String cm_5_2_3;
    @Column(columnDefinition = "varchar(64) COMMENT '病房与周边噪音'")
    private String cm_5_2_5;
    @Column(columnDefinition = "varchar(64) COMMENT '医生沟通'")
    private String cm_5_2_6;
    @Column(columnDefinition = "varchar(64) COMMENT '护士沟通'")
    private String cm_5_2_7;
    @Column(columnDefinition = "varchar(64) COMMENT '药师沟通'")
    private String cm_5_2_8;
    @Column(columnDefinition = "varchar(64) COMMENT '康复计划'")
    private String cm_5_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时的知情告知'")
    private String cm_5_2_10;
    @Column(columnDefinition = "varchar(64) COMMENT '膳食评价'")
    private String cm_5_2_11;
    @Column(columnDefinition = "double COMMENT '住院总费用'")
    private Double cm_6_1;
    @Column(columnDefinition = "double COMMENT '住院总费用其中自付金额'")
    private Double cm_6_2;
    @Column(columnDefinition = "double COMMENT '一般医疗服务费'")
    private Double cm_6_3;
    @Column(columnDefinition = "double COMMENT '一般治疗操作费'")
    private Double cm_6_4;
    @Column(columnDefinition = "double COMMENT '护理费'")
    private Double cm_6_5;
    @Column(columnDefinition = "double COMMENT '综合医疗服务类其他费用'")
    private Double cm_6_6;
    @Column(columnDefinition = "double COMMENT '病理诊断费'")
    private Double cm_6_7;
    @Column(columnDefinition = "double COMMENT '实验室诊断费'")
    private Double cm_6_8;
    @Column(columnDefinition = "double COMMENT '影像学诊断费'")
    private Double cm_6_9;
    @Column(columnDefinition = "double COMMENT '临床诊断项目费'")
    private Double cm_6_10;
    @Column(columnDefinition = "double COMMENT '非手术治疗项目费'")
    private Double cm_6_11;
    @Column(columnDefinition = "double COMMENT '其中：临床物理治疗费'")
    private Double cm_6_12;
    @Column(columnDefinition = "double COMMENT '手术治疗费'")
    private Double cm_6_13;
    @Column(columnDefinition = "double COMMENT '其中：麻醉费'")
    private Double cm_6_14;
    @Column(columnDefinition = "double COMMENT '其中：手术费'")
    private Double cm_6_15;
    @Column(columnDefinition = "double COMMENT '康复费'")
    private Double cm_6_16;
    @Column(columnDefinition = "double COMMENT '中医治疗费'")
    private Double cm_6_17;
    @Column(columnDefinition = "double COMMENT '西药费'")
    private Double cm_6_18;
    @Column(columnDefinition = "double COMMENT '其中：抗菌药物费'")
    private Double cm_6_19;
    @Column(columnDefinition = "double COMMENT '中成药费'")
    private Double cm_6_20;
    @Column(columnDefinition = "double COMMENT '中草药费'")
    private Double cm_6_21;
    @Column(columnDefinition = "double COMMENT '血费'")
    private Double cm_6_22;
    @Column(columnDefinition = "double COMMENT '白蛋白类制品费'")
    private Double cm_6_23;
    @Column(columnDefinition = "double COMMENT '球蛋白类制品费'")
    private Double cm_6_24;
    @Column(columnDefinition = "double COMMENT '凝血因子类制品费'")
    private Double cm_6_25;
    @Column(columnDefinition = "double COMMENT '细胞因子类制品费'")
    private Double cm_6_26;
    @Column(columnDefinition = "double COMMENT '检查用一次性医用材料费'")
    private Double cm_6_27;
    @Column(columnDefinition = "double COMMENT '治疗用一次性医用材料费'")
    private Double cm_6_28;
    @Column(columnDefinition = "double COMMENT '手术用一次性医用材料费'")
    private Double cm_6_29;
    @Column(columnDefinition = "double COMMENT '其他费'")
    private Double cm_6_30;





}
