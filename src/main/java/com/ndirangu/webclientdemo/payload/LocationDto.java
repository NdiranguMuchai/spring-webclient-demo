package com.ndirangu.webclientdemo.payload;

import lombok.Data;

import java.util.List;

@Data
public class LocationDto {
    private Long id;
    private String name;
    private String type;
    private String dimension;
    private List<String> residents;
    private String url;
    private String created;
}
