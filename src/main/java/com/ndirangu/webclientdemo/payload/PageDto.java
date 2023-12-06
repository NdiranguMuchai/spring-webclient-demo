package com.ndirangu.webclientdemo.payload;

import lombok.Data;

import java.util.List;

@Data
public class PageDto {
    private InfoDto info;
    private List<CharacterDto> results;
}
