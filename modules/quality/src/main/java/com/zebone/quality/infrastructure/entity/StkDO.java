package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 卡卡西
 */
@Entity
@Table(name = "QUALITY_STK")
@Data
public class StkDO extends DataEntity{


    @Column(columnDefinition = "varchar(64) COMMENT '质控医师'")
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
    @Column(columnDefinition = "varchar(64) COMMENT '其他主要手术操作栏中提取ICD-9-CM-3四位亚目编码与名称'")
    private String stk_0_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要手术操作栏中提取ICD-9-CM-3六位临床扩展编码与名称'")
    private String cm_0_1_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院后31天内重复住院'")
    private String cm_0_1_5;
    @Column(columnDefinition = "datetime COMMENT '出生日期'")
    private Date cm_0_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '患者性别'")
    private String cm_0_2_1_2;
    @Column(columnDefinition = "double COMMENT '患者体重（kg）'")
    private Double cm_0_2_1_3;
    @Column(columnDefinition = "double COMMENT '患者身高（cm）'")
    private Double cm_0_2_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '发病日期时间是否无法确定或无记录'")
    private String cm_0_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '发病日期时间'")
    private Date cm_0_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到达本院急诊或者门诊日期时间是否无法确定或无记录'")
    private String cm_0_2_3_1;
    @Column(columnDefinition = "datetime COMMENT '到达本院急诊或者门诊日期时间'")
    private Date cm_0_2_3_2;
    @Column(columnDefinition = "datetime COMMENT '入院日期时间'")
    private Date cm_0_2_4_1;
    @Column(columnDefinition = "datetime COMMENT '出院日期时间'")
    private Date cm_0_2_4_2;
    @Column(columnDefinition = "datetime COMMENT '入住卒中中心/ICU日期时间'")
    private Date cm_0_2_5_1;
    @Column(columnDefinition = "datetime COMMENT '离开卒中中心/ICU日期时间'")
    private Date cm_0_2_5_2;
    @Column(columnDefinition = "datetime COMMENT '手术/介入开始（切皮）日期时间'")
    private Date cm_0_2_6_1;
    @Column(columnDefinition = "datetime COMMENT '手术/介入结束（缝皮结束）日期时间'")
    private Date cm_0_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '费用支付方式'")
    private String cm_0_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '收入住院途径'")
    private String cm_0_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '到院交通工具'")
    private String cm_0_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '现场评估生命体征，施行急救'")
    private String stk_0_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '到达现场后10分钟内完成院前卒中评分'")
    private String stk_0_4_2;
    @Column(columnDefinition = "varchar(64) COMMENT '现场急救维持生命体征稳定'")
    private String stk_0_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '利用车载信息系统、微信、彩信等多种形式传输心电图等院前信息至目标医院'")
    private String stk_0_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊医师接诊日期时间是否确定'")
    private String stk_1_1_1_1;
    @Column(columnDefinition = "datetime COMMENT '急诊医师接诊日期时间'")
    private Date stk_1_1_1_2;
    @Column(columnDefinition = "double COMMENT '呼吸(次/分)'")
    private Double stk_1_1_4;
    @Column(columnDefinition = "double COMMENT '脉搏(次/分)'")
    private Double stk_1_1_5;
    @Column(columnDefinition = "double COMMENT '收缩压(mmHg)'")
    private Double stk_1_1_6;
    @Column(columnDefinition = "double COMMENT '舒张压(mmHg)'")
    private Double stk_1_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊后首次评估还是入院后首次评估'")
    private String stk_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊首次实施神经功能缺损NIHSS评估'")
    private String stk_1_2_1_1;
    @Column(columnDefinition = "datetime COMMENT '急诊首次评估日期时间'")
    private Date stk_1_2_1_2_1;
    @Column(columnDefinition = "double COMMENT '实施神经功能缺损NIHSS评估分值'")
    private Double stk_1_2_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后首次实施神经功能缺损NIHSS评估'")
    private String stk_1_2_2_1;
    @Column(columnDefinition = "datetime COMMENT '入院后首次评估日期时间'")
    private Date stk_1_2_2_2_1;
    @Column(columnDefinition = "double COMMENT '实施神经功能缺损NIHSS评估分值'")
    private Double stk_1_2_2_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施首次头部影像学检查'")
    private String stk_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头部影像学检查项目'")
    private String stk_1_3_2;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date stk_1_3_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '头部影像学检查评估的选择'")
    private String stk_2_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他头部影像学检查'")
    private String stk_2_1_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '全血细胞计数'")
    private String stk_1_4_1;
    @Column(columnDefinition = "double COMMENT '红血球计数RBC检测值'")
    private Double stk_1_4_1_3;
    @Column(columnDefinition = "double COMMENT '白细胞计数WBC检测值'")
    private Double stk_1_4_1_4;
    @Column(columnDefinition = "double COMMENT '血小板PLT检测值(10E9/L)'")
    private Double stk_1_4_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊或入院后首次全血细胞计数报告日期时间'")
    private String stk_1_4_1_2;
    @Column(columnDefinition = "datetime COMMENT '急诊或入院后首次全血细胞计数报告日期时间'")
    private Date stk_1_4_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '凝血功能检查项目'")
    private String stk_1_4_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间是否确定'")
    private String stk_1_4_2_3;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date stk_1_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '生化检验项目'")
    private String stk_1_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '报告日期时间是否确定'")
    private String stk_1_4_3_3;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date stk_1_4_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊/入院后24小时内首次临床检验检查'")
    private String stk_1_4_2;
    @Column(columnDefinition = "double COMMENT 'C-反应蛋白:检测值(mg/L)'")
    private Double stk_1_4_2_4;
    @Column(columnDefinition = "double COMMENT '同型半胱氨酸（HCY）:检测值(μmol/L)'")
    private Double stk_1_4_2_5;
    @Column(columnDefinition = "double COMMENT '空腹血糖:检测值(mmol/l)'")
    private Double stk_1_4_2_6;
    @Column(columnDefinition = "double COMMENT '血清肌酐:检测值(μmol/l)'")
    private Double stk_1_4_2_7;
    @Column(columnDefinition = "double COMMENT '血清尿素氮:检测值(mmol/l)'")
    private Double stk_1_4_2_8;
    @Column(columnDefinition = "double COMMENT '尿酸:检测值(μmol/l)'")
    private Double stk_1_4_2_9;
    @Column(columnDefinition = "varchar(64) COMMENT '急诊或入院后是否首次实施心电图（ECG）检查'")
    private String stk_1_5_1;
    @Column(columnDefinition = "datetime COMMENT '报告日期时间'")
    private Date stk_1_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '心电图（ECG）检查结果'")
    private String stk_1_5_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他心电图（ECG）检查结果'")
    private String stk_1_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '发病→到达急诊“绿色通道”时间是否确定'")
    private String stk_2_1_1_1;
    @Column(columnDefinition = "double COMMENT '发病→到达急诊“绿色通道”时间(小时)'")
    private Double stk_2_1_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '发病→到达急诊“绿色通道”时间评估结论'")
    private String stk_2_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有溶栓禁忌症'")
    private String stk_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓禁忌症选择'")
    private String stk_2_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他临床医师认定的其他禁忌症'")
    private String stk_2_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '发病时段适应证'")
    private String stk_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓适应证的选择'")
    private String stk_2_3_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓的评估结论的选择'")
    private String stk_2_3_2;
    @Column(columnDefinition = "datetime COMMENT '溶栓开始日期时间'")
    private Date stk_2_4_1_1_1;
    @Column(columnDefinition = "datetime COMMENT '溶栓终止日期时间'")
    private Date stk_2_4_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓药选择'")
    private String stk_2_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '实施溶栓（治疗性操作）途径'")
    private String stk_2_4_4;
    @Column(columnDefinition = "double COMMENT '溶栓药物使用时机 DTN(Door-To-Needle)'")
    private Double stk_2_4_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施介入治疗'")
    private String stk_15_1_0;
    @Column(columnDefinition = "datetime COMMENT '介入治疗日期时间'")
    private Date stk_15_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '介入治疗时机'")
    private String stk_15_2;
    @Column(columnDefinition = "varchar(64) COMMENT '决定适应证医师职称'")
    private String stk_15_3;
    @Column(columnDefinition = "varchar(64) COMMENT '介入主刀医师职称'")
    private String stk_15_4;
    @Column(columnDefinition = "varchar(64) COMMENT '大血管闭塞重症患者实施血管内适应证选择'")
    private String stk_15_6;
    @Column(columnDefinition = "varchar(64) COMMENT '其它适应证'")
    private String stk_15_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血管内介入治疗术式选择'")
    private String stk_15_5_1;
    @Column(columnDefinition = "double COMMENT '血管内介入治疗完成时间 DTN时间（分）'")
    private Double stk_15_8;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓治疗院内延误时间超过1小时主要原因的选择'")
    private String stk_2_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓治疗医嘱未能执行主要原因的'")
    private String stk_2_6_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施影像学评估血管再通分级（mTICI评分）'")
    private String stk_15_7;
    @Column(columnDefinition = "varchar(64) COMMENT '血管再通分级（mTICI评分标准）'")
    private String stk_15_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施溶栓后72小时NIHSS评估'")
    private String stk_2_5_1_1;
    @Column(columnDefinition = "double COMMENT '溶栓后2小时分值'")
    private Double stk_2_5_1_2_1;
    @Column(columnDefinition = "double COMMENT '溶栓后24小时分值'")
    private Double stk_2_5_1_3_1;
    @Column(columnDefinition = "double COMMENT '溶栓后48小时分值'")
    private Double stk_2_5_1_4_1;
    @Column(columnDefinition = "double COMMENT '溶栓后72小时分值'")
    private Double stk_2_5_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施溶栓（治疗性操作）后72小时影像学复查评估'")
    private String stk_2_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '溶栓后72小时影像学复查项目'")
    private String stk_2_5_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出现溶栓治疗并发症'")
    private String stk_2_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '并发症严重程度'")
    private String stk_2_5_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否为房颤患者脑卒中'")
    private String stk_3_1_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否实施房颤患者脑卒中风险评估'")
    private String stk_3_1_1;
    @Column(columnDefinition = "double COMMENT '房颤患者脑卒中风险评估分值'")
    private Double stk_3_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT 'CHA2DS2-VASc评分大于2分'")
    private String stk_3_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有使用抗凝药物的禁忌证'")
    private String stk_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '使用抗凝药物的禁忌症'")
    private String stk_3_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用抗凝药物'")
    private String stk_3_3_1;
    @Column(columnDefinition = "datetime COMMENT '首剂用药日期时间'")
    private Date stk_3_3_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '抗凝药物选择'")
    private String stk_3_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否使用阿司匹林禁忌证'")
    private String stk_4_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '阿司匹林禁忌症'")
    private String stk_4_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '患者类别选择'")
    private String stk_4_2_3;
    @Column(columnDefinition = "datetime COMMENT '首剂用药日期时间'")
    private Date stk_4_2_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '药物选择'")
    private String stk_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗血小板药物'")
    private String stk_4_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血脂评价时间的选择'")
    private String stk_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血脂评价结果'")
    private String stk_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有他汀药物禁忌症'")
    private String stk_5_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '他汀类药物禁忌证的选择'")
    private String stk_5_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有用药长期医嘱-他汀类药物'")
    private String stk_5_4;
    @Column(columnDefinition = "varchar(64) COMMENT '他汀类常用药物选择'")
    private String stk_5_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否糖尿病患者'")
    private String stk_5_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择降糖药物的类别'")
    private String stk_5_5_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降糖药物'")
    private String stk_5_5_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否高血压患者'")
    private String stk_5_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择降压药物的类别'")
    private String stk_5_7_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它降压药物'")
    private String stk_5_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院时是否正常进食与饮水'")
    private String stk_6_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否进行吞咽评估'")
    private String stk_6_2_0;
    @Column(columnDefinition = "datetime COMMENT '首次吞咽困难评估日期时间'")
    private Date stk_6_2_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '评价方法选择'")
    private String stk_6_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他评价方法填写'")
    private String stk_6_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '未进行吞咽困难评价的原因'")
    private String stk_6_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '其它未进行吞咽困难评价的原因'")
    private String stk_6_3_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院后病情判定'")
    private String stk_7_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否需要做预防DVT治疗'")
    private String stk_7_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '禁忌证选择'")
    private String stk_7_2_2;
    @Column(columnDefinition = "datetime COMMENT '预防DVT治疗医嘱下达日期时间'")
    private Date stk_7_2_3_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '预防DVT治疗方法'")
    private String stk_7_3_1_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他预防DVT治疗药物'")
    private String stk_7_3_1_5;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时继续使用抗血小扳聚集治疗药物'")
    private String stk_8_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他抗血小板聚集治疗药物'")
    private String stk_8_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时使用选择他汀类药物'")
    private String stk_8_2;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时使用抗凝药物'")
    private String stk_8_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时使用降糖药物的类别'")
    private String stk_8_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降糖药物'")
    private String stk_8_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否出院时有高血压'")
    private String stk_8_5_0;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时有高血压患者选择降压药物的类别'")
    private String stk_8_5;
    @Column(columnDefinition = "varchar(64) COMMENT '其他降压药物'")
    private String stk_8_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '入院时是否有重点护理评估记录'")
    private String stk_9_1;
    @Column(columnDefinition = "varchar(64) COMMENT '行走评估结果'")
    private String stk_9_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '呼吸评估结果'")
    private String stk_9_1_2;
    @Column(columnDefinition = "varchar(64) COMMENT '饮食评估结果'")
    private String stk_9_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '吞咽评估结果'")
    private String stk_9_1_4;
    @Column(columnDefinition = "double COMMENT '压疮评估（Braden评分值）分值'")
    private Double stk_9_1_5_1;
    @Column(columnDefinition = "varchar(64) COMMENT '压疮评估结果选择'")
    private String stk_9_1_6;
    @Column(columnDefinition = "varchar(64) COMMENT '预防压疮告知'")
    private String stk_9_1_7;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟史'")
    private String stk_9_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '吸烟程度评估'")
    private String stk_9_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '接受戒烟的建议或者戒烟治疗'")
    private String stk_9_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '是否提供早期康复医疗服务'")
    private String stk_13_1_1;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有功能障碍'")
    private String stk_13_0;
    @Column(columnDefinition = "varchar(64) COMMENT '功能障碍评价'")
    private String stk_13_1;
    @Column(columnDefinition = "varchar(64) COMMENT '康复治疗适宜性评估结果'")
    private String stk_13_2;
    @Column(columnDefinition = "varchar(64) COMMENT '康复实施人员资质选择'")
    private String stk_13_3;
    @Column(columnDefinition = "datetime COMMENT '首次实施康复治疗时间'")
    private Date stk_13_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '选择未能进行康复原因'")
    private String stk_13_5;
    @Column(columnDefinition = "varchar(64) COMMENT '血管功能评估时间'")
    private String stk_10_1;
    @Column(columnDefinition = "varchar(64) COMMENT '血管功能评估方法'")
    private String stk_10_2;
    @Column(columnDefinition = "varchar(64) COMMENT '实施卒中健康教育有记录'")
    private String stk_12_1_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时Essen卒中风险评分'")
    private String stk_12_1_1;
    @Column(columnDefinition = "double COMMENT 'Essen卒中风险评分值'")
    private Double stk_12_1_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '主要风险因素(住院病历既往史记录)评估'")
    private String stk_12_2_1;
    @Column(columnDefinition = "varchar(64) COMMENT '其他风险因素(住院病历既往史记录)评估'")
    private String stk_12_2_2;
    @Column(columnDefinition = "varchar(64) COMMENT '是否有出院时mRS评分'")
    private String stk_12_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时mRS评分'")
    private String stk_12_4_2;
    @Column(columnDefinition = "double COMMENT '出院时mRS评分'")
    private Double stk_12_4_3;
    @Column(columnDefinition = "varchar(64) COMMENT '发病的主要原因'")
    private String stk_12_4_4;
    @Column(columnDefinition = "varchar(64) COMMENT '其他发病的主要原因'")
    private String stk_12_4_4_1;
    @Column(columnDefinition = "varchar(64) COMMENT '交与患者“出院小结”的副本告知患者出院时风险因素'")
    private String stk_12_3_1;
    @Column(columnDefinition = "varchar(64) COMMENT '出院带药'")
    private String stk_12_3_2;
    @Column(columnDefinition = "varchar(64) COMMENT '告知何为风险因素与紧急情况'")
    private String stk_12_3_5;
    @Column(columnDefinition = "varchar(64) COMMENT '告知发生紧急情况时求援救治途径'")
    private String stk_12_3_3;
    @Column(columnDefinition = "varchar(64) COMMENT '出院时教育与随访'")
    private String stk_12_3_4;
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
