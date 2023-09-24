package com.springreact.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class LocationResponse {
    private String id;
    private String name;
    private String type;
    private String dimension;
    private List<String> residents;
    private String url;
}
