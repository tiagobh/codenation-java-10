package com.challenge.service.impl;

import com.challenge.entity.Challenge;
import com.challenge.repository.ChallengeRepository;
import com.challenge.service.interfaces.ChallengeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeServiceImpl implements ChallengeServiceInterface {
    private ChallengeRepository repository;

    @Autowired
    public ChallengeServiceImpl(ChallengeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId) {
        return repository.findByAccelerationIdAndUserId(accelerationId, userId);
    }

    @Override
    public Challenge save(Challenge object) {
        return repository.save(object);
    }
}
