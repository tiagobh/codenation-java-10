package com.challenge.service.impl;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import com.challenge.service.interfaces.SubmissionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SubmissionServiceImpl implements SubmissionServiceInterface {
    private SubmissionRepository repository;

    @Autowired
    public SubmissionServiceImpl(SubmissionRepository repository) {
        this.repository = repository;
    }

    @Override
    public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
        return repository.findHigherScoreByChallengeId(challengeId);
    }

    @Override
    public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
        return repository.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
    }

    @Override
    public Submission save(Submission object) {
        return repository.save(object);
    }
}
