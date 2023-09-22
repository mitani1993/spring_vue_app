package com.example.api.infrastructure.messages;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.example.api.domain.messages.model.Message;

@Mapper
public interface MessageMapper {
    void insert(Message message);

    List<Message> find(@Param("channelId") int channelId, @Param("searchWord") Optional<String> searchWord);
}
