package com.example.api.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.api.domain.messages.model.Message;
import com.example.api.domain.messages.service.MessageDomainService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MessageService {

    private final MessageDomainService messageDomainService;

    public Message post(Message message){
        // TODO: 8章で認証情報から取得するように修正する。
        var username = "guest";
        message.setUsername(username);
        return messageDomainService.post(message);
    }
}
