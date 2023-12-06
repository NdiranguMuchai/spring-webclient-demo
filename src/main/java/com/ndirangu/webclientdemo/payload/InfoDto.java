package com.ndirangu.webclientdemo.payload;

import lombok.Data;

@Data
public class InfoDto {
    private Integer count;
    private Integer pages;
    private String next;
    private String prev;
}
