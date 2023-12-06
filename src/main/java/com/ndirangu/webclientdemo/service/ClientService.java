package com.ndirangu.webclientdemo.service;

import com.ndirangu.webclientdemo.payload.CharacterDto;
import com.ndirangu.webclientdemo.payload.PageDto;
import reactor.core.publisher.Mono;

public interface ClientService {
    Mono<CharacterDto> findById(Long id);

    Mono<PageDto> findLivingMortys();
}
