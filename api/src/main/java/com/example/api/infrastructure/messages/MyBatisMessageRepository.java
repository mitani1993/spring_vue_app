package com.example.api.infrastructure.messages;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Message> find(int channelId, Optional<String> searchWord) {
        return messageMapper.find(channelId, searchWord);
    }
}
