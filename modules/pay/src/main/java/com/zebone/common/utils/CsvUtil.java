package com.zebone.common.utils;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

public class CsvUtil {

    public static List<String[]> CSVReadAll(String fileName) throws Exception {
        File csv = new File(fileName);
        CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(csv), "GBK"));
        String [] header = reader.readNext();   //用readnext读取之后就不存在于stream中了
        for (String s : header) {
            System.out.print(s + ",");
        }
        List<String[]> list = reader.readAll(); //此时读取的已经是第二行了
        return list;
    }
}
