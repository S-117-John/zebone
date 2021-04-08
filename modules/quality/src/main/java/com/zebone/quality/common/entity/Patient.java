package com.zebone.quality.common.entity;

import lombok.Data;

@Data
public class Patient {

    private String name;

    private String patNo;

    private String opCode;

    private String inHosDays;

    private String age;
}
