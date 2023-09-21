package com.example.api.domain.channels.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.api.domain.channels.model.Channel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChannelDomainService {

    public Channel create(Channel channel){
        // TODO: ユーザからは登録用のIDを受け取らない仕様のため、DB内にあるIDの最大値+1を新しいチャンネルのIDとする。
        Optional<Integer> currentMaxId = Optional.of(1);

        var newid = currentMaxId.orElse(0) + 1;
        channel.setId(newid);

        // TODO: DBに永続化する。

        return channel;
    }

    public List<Channel> findAll(){
        return Collections.emptyList();
    }

}
