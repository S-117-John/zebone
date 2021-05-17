# 病种设置
alter table quality_disease
    add icd9 varchar(300) null;

alter table quality_disease
    add age varchar(32) null comment '年龄';

alter table quality_disease
    add ageCondition varchar(32) null comment '年龄条件';

alter table quality_disease
    add dayCondition varchar(32) null comment '住院天数条件';

alter table quality_disease
    add day varchar(32) null comment '住院天数';

alter table quality_disease
  add icd10 varchar(300) null comment '主要诊断ICD-10编码';

alter table quality_cap
  add idcard varchar(64) null comment '患儿身份证号';

alter table quality_cap
  change cap_3_4_1 cap_3_4_4 varchar(64) null comment '是否进行实验室检查';

alter table quality_cap
  add cap_1_1_1_1 varchar(64) null comment '其他高危因素';