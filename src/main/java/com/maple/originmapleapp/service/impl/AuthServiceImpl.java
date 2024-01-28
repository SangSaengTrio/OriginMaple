package com.maple.originmapleapp.service.impl;

import com.maple.originmapleapp.entity.MemberEntity;
import com.maple.originmapleapp.repository.AuthRepository;
import com.maple.originmapleapp.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthRepository authRepository;

    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public Optional<MemberEntity> login(String memberEmail) {
        return authRepository.findBymemberEmail(memberEmail);
    };

    public MemberEntity signup (MemberEntity memberEntity){
        return authRepository.save(memberEntity);
    }
}
