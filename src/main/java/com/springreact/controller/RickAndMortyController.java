package com.springreact.controller;

import com.springreact.response.CharacterResponse;
import com.springreact.client.RickAndMortyClient;
import com.springreact.response.EpisodeResponse;
import com.springreact.response.LocationResponse;
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

    @GetMapping(value = "/location/{id}")
    Mono<LocationResponse> findLocationById(@PathVariable String id){
        return rickAndMortyClient.findLocationById(id);
    }

    @GetMapping(value = "/episode/{id}")
    Mono<EpisodeResponse> findEpisodeById(@PathVariable String id){
        return rickAndMortyClient.findEpisodeById(id);
    }
}
