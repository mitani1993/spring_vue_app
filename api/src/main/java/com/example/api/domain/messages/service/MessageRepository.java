package com.example.api.domain.messages.service;

import com.example.api.domain.messages.model.Message;

public interface MessageRepository {
    void insert(Message message);
}
