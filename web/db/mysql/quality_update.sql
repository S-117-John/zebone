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