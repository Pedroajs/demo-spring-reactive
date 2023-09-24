package com.springreact.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class EpisodeResponse {
    private String id;
    private String name;
    private String airDate;
    private String episode;
    List<String> characters;
    private String url;
}
