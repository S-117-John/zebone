package com.zebone.quality.infrastructure.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author 卡卡西
 */
@MappedSuperclass
@Data
public class DataEntity {

    @Id
    private String id;

    @Column(columnDefinition = "char(1) COMMENT '状态（0正常 1删除 2停用 3冻结 4审核 5驳回 9草稿）'")
    private String status;

    @Column(name = "create_by",columnDefinition = "varchar(64) COMMENT '状态（0正常 1删除 2停用 3冻结 4审核 5驳回 9草稿）'")
    private String createBy;

    @Column(name = "update_by",columnDefinition = "varchar(64) COMMENT '更新者'")
    private String updateBy;

    @Column(name = "update_date",columnDefinition = "datetime COMMENT '更新时间'")
    private Date updateDate;

    @Column(name = "create_date",columnDefinition = "datetime COMMENT '创建时间'")
    private Date createDate;

    @Column(name = "remarks",columnDefinition = "nvarchar(500) COMMENT '备注'")
    private String remarks;


}
