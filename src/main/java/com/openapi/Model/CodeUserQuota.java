package com.openapi.Model;

import java.util.Date;
import java.util.UUID;

import lombok.Data;


@Data
public class CodeUserQuota {
    private String id = UUID.randomUUID().toString().replace("-","");

    private Integer deleteflg = 0;

    private Date updatetime = new Date();

    private String openid;

    private int cnt;//使用次数

    private int maxcnt;//最大使用次数


}