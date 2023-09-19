package com.example.api.domain.channels.model;

import lombok.Data;

@Data
public class Channel {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
