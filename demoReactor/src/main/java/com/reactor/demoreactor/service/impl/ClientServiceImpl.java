package com.reactor.demoreactor.service.impl;

import com.reactor.demoreactor.model.Client;
import com.reactor.demoreactor.repo.IClientRepo;
import com.reactor.demoreactor.repo.IGenericRepo;
import com.reactor.demoreactor.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl extends CRUDImpl<Client,Integer> implements IClientService {

    private final IClientRepo repo;

    @Override
    protected IGenericRepo<Client, Integer> getRepo() {
        return repo;
    }
}
