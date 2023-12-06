package com.ndirangu.webclientdemo.service;

import com.ndirangu.webclientdemo.config.Urls;
import com.ndirangu.webclientdemo.payload.CharacterDto;
import com.ndirangu.webclientdemo.payload.PageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    private final WebClient webClient;
    private final Urls urls;
    @Override
    public Mono<CharacterDto> findById(Long id) {
        return webClient.get()
                .uri(urls.getCharacterUrl()+id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(CharacterDto.class);
    }


    @Override
    public Mono<PageDto> findLivingMortys() {
       return webClient.get()
                .uri(urls.getCharacterUrl() + "?name=morty&status=alive")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(PageDto.class);


    }
}
