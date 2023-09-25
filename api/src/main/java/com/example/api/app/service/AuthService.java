package com.example.api.app.service;

import java.time.Instant;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {
    private final JwtEncoder encoder;

    public String issueToken(Authentication authentication) {
        Instant now = Instant.now();

        // @formatter:off
        JwtClaimsSet claims = JwtClaimsSet.builder()
        .issuer("self") // トークン発行者
        .issuedAt(now) // トークン発行日時
        // トークンの有効期限を1時間とする
        .expiresAt(now.plusSeconds(36000L)) // トークン有効期限
        .subject(authentication.getName()) // 認証ユーザーの名前
        .build();
        // @formatter:on
        return encoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }

}
