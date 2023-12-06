package com.ndirangu.webclientdemo.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterDto {
    private Long id;
    private String name;
    private String status;
    private String type;
    private OriginDto origin;
    private LocationDto location;
    private String image;
    private List<String> episode;
    private String created;
 }
