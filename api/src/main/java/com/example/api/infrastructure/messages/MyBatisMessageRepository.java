package com.example.api.infrastructure.messages;

import org.springframework.stereotype.Repository;

import com.example.api.domain.messages.model.Message;
import com.example.api.domain.messages.service.MessageRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyBatisMessageRepository implements MessageRepository {

    private final MessageMapper messageMapper;

    @Override
    public void insert(Message message) {
        messageMapper.insert(message);
    }
}
