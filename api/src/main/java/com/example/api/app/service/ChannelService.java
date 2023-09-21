package com.example.api.app.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.api.domain.channels.model.Channel;
import com.example.api.domain.channels.service.ChannelDomainService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ChannelService {

    private final ChannelDomainService channelDomainService;

    public Channel create(Channel channel){
        return channelDomainService.create(channel);
    }

    public List<Channel> findAll(){
        return channelDomainService.findAll();
    }

    public Channel updade(Channel channel){
        return channelDomainService.update(channel);
    }
}
