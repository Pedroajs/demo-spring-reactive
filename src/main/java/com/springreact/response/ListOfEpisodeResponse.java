package com.springreact.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class ListOfEpisodeResponse {
    private List<EpisodeResponse> results;
}
