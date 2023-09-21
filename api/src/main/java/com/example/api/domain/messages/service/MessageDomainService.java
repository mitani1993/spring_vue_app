package com.example.api.domain.messages.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.api.domain.messages.model.Message;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageDomainService {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddhhmm");
    private final MessageRepository messageRepository;

    public Message post(Message message) {
        var uuid = UUID.randomUUID();
        var now = LocalDateTime.now();
        message.setId(now.format(FORMATTER) + "-" + uuid.toString());
        message.setTimestamp(now);
        messageRepository.insert(message);
        return message;
    }
}
