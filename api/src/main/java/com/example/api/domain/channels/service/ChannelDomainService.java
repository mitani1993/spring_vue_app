package com.example.api.domain.channels.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.api.domain.channels.model.Channel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChannelDomainService {

    private final ChannelRepository channelRepository;

    public Channel create(Channel channel){
        var currentMaxId = channelRepository.getMaxId();
        var newid = currentMaxId.orElse(0) + 1;

        channel.setId(newid);
        channelRepository.insert(channel);

        return channel;
    }

    public List<Channel> findAll(){
        return channelRepository.findAll();
    }

}
