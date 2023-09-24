package com.springreact.controller;

import com.springreact.CharacterResponse;
import com.springreact.RickAndMortyClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/webclient")
@AllArgsConstructor
public class RickAndMortyController {

    RickAndMortyClient rickAndMortyClient;

    @GetMapping(value = "/character/{id}")
    Mono<CharacterResponse> findById(@PathVariable String id){
        return rickAndMortyClient.findCharacterById(id);
    }
}
