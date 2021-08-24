package com.unipampa.crudservice.implementService;

import com.unipampa.crudservice.interfaceService.IExameService;
import com.unipampa.crudservice.model.Exame;
import com.unipampa.crudservice.repository.ExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExameServiceImp implements IExameService {

    @Autowired
    private ExameRepository repository;

    @Override
    public void salvarExame(Exame exame) {
        repository.save(exame);
    }
}
