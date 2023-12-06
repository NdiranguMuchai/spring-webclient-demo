package com.ndirangu.webclientdemo.controller;

import com.ndirangu.webclientdemo.payload.CharacterDto;
import com.ndirangu.webclientdemo.payload.PageDto;
import com.ndirangu.webclientdemo.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/{id}")
    Mono<CharacterDto> findById(@PathVariable Long id){
        return clientService.findById(id);
    }

    @GetMapping("/mortys")
    Mono<PageDto> findLivingMortys(){
        return clientService.findLivingMortys();
    }
}
