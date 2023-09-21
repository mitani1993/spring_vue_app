package com.example.api.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.domain.messages.model.Message;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/channels/{channelId}/messages")
@RequiredArgsConstructor
@CrossOrigin
public class MessageController {
    @PostMapping
    public Message post(@PathVariable int channelId, @RequestBody Message message) {
        message.setChannelId(channelId);
        // TODO: Service作成後に修正する。
        return message;
    }
}
