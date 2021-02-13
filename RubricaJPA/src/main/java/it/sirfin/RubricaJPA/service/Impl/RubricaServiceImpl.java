/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.RubricaJPA.service.Impl;

import it.sirfin.RubricaJPA.model.ContattoJPA;
import it.sirfin.RubricaJPA.repository.RubricaRepository;
import it.sirfin.RubricaJPA.service.RubricaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marco
 */
@Service
public class RubricaServiceImpl implements RubricaService {

    @Autowired
    RubricaRepository rubricaRepository;

    @Override
    public void inserisciContatto(ContattoJPA c) {
        rubricaRepository.save(c);
    }

    @Override
    public void cancellaContatto(ContattoJPA p) {
        rubricaRepository.delete(p);
    }

    @Override
    public void svuotaRubrica() {
        rubricaRepository.deleteAllInBatch();
    }

    @Override
    public List<ContattoJPA> recuperaContatti() {
        return rubricaRepository.findAll();
    }

}
