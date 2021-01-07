package com.zebone.quality.common.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author lijin
 * http请求工具类
 */
public class RestTemplateUtil {


    private static class SingletonHolder{
        private static RestTemplateUtil instance = new RestTemplateUtil();
    }


    public RestTemplateUtil() {
    }

    public static RestTemplateUtil getInstance(){
        return SingletonHolder.instance;
    }

    public String postForString(String requestBody,String url){
        String httpPostAddr = url;
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> converterList = restTemplate.getMessageConverters();
        converterList.remove(1);    //移除StringHttpMessageConverter
        HttpMessageConverter<?> converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        converterList.add(1, converter);    //convert顺序错误会导致失败
        restTemplate.setMessageConverters(converterList);
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        HttpEntity<String> formEntity = new HttpEntity<String>(requestBody, headers);
        String body = restTemplate.postForObject(httpPostAddr,formEntity,String.class);
        return body;
    }


//    public String post(String requestBody) throws IOException {
//        String httpPostAddr = ApplicationUtils.getPropertyValue("msg.address", "");
//        RestTemplate restTemplate = new RestTemplate();
//
//        List<HttpMessageConverter<?>> converterList = restTemplate.getMessageConverters();
//        converterList.remove(1);    //移除StringHttpMessageConverter
//        HttpMessageConverter<?> converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
//        converterList.add(1, converter);    //convert顺序错误会导致失败
//
//        restTemplate.setMessageConverters(converterList);
//
//        HttpHeaders headers = new HttpHeaders();
//        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//        headers.setContentType(type);
//        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
//        HttpEntity<String> formEntity = new HttpEntity<String>(requestBody, headers);
//        String body = restTemplate.postForObject(httpPostAddr,formEntity,String.class);
//        return body;
//    }



}
