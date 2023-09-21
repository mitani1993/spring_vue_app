package com.example.api.domain.channels.service;

import java.util.List;
import java.util.Optional;

import com.example.api.domain.channels.model.Channel;

public interface ChannelRepository {

    void insert(Channel channel);

    List<Channel> findAll();

    Optional<Integer> getMaxId();
}
