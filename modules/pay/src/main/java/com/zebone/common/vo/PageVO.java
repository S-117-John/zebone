package com.zebone.common.vo;


import lombok.Data;

import java.util.List;

@Data
public class PageVO<T>{

    private int pageNo;

    private int first;

    private int next;

    private int pageSize;

    private int last;

    private int count;

    private List<T> list;


    private int prev;

}
