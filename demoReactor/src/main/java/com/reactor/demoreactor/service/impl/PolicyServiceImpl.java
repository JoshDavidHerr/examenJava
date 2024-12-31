package com.reactor.demoreactor.service.impl;

import com.reactor.demoreactor.model.Policy;
import com.reactor.demoreactor.repo.IGenericRepo;
import com.reactor.demoreactor.repo.IPolicyRepo;
import com.reactor.demoreactor.service.IPolicyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PolicyServiceImpl extends  CRUDImpl<Policy,Integer> implements IPolicyService {

    private final IPolicyRepo repo;

    @Override
    protected IGenericRepo<Policy, Integer> getRepo() {
        return repo;
    }
}
