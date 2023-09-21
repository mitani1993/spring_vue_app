package com.example.api.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.app.service.ChannelService;
import com.example.api.domain.channels.model.Channel;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/channels")
@CrossOrigin
public class ChannelController {

    private final ChannelService channelService;

    @PostMapping()
    public Channel create(@RequestBody Channel channel) {
        return channelService.create(channel);
    }

    @GetMapping()
    public List<Channel> findAll() {
        return channelService.findAll();
    }

    @PutMapping("/{id}")
    public Channel updade(@PathVariable("id") int id, @RequestBody Channel channel){
        channel.setId(id);
        // TODO: Service作成後に修正する。
        return channel;
    }
}
