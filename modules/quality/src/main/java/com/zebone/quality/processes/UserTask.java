package com.zebone.quality.processes;

import lombok.Data;

import java.util.Date;

/**
 * @author 卡卡西
 */
@Data
public class UserTask {

    private String processInstanceId;

    private String formKey;

    private String taskId;

    private String taskName;

    private Date createDate;
}
