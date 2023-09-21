package com.example.api.infrastructure.channels;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.api.domain.channels.model.Channel;

@Mapper
public interface ChannelMapper {

    void insert(Channel channel);

    List<Channel> findAll();

    Optional<Integer> getMaxId();
}
