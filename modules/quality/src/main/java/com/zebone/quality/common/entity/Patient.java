package com.zebone.quality.common.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Patient {

    private String name;

    private String patNo;

    private String opCode;

    private String inHosDays;

    private String age;

    private Date birth;
}
