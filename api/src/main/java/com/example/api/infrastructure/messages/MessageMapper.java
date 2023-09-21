package com.example.api.infrastructure.messages;

import org.apache.ibatis.annotations.Mapper;

import com.example.api.domain.messages.model.Message;

@Mapper
public interface MessageMapper {
    void insert(Message message);
}
