/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.RubricaJPA.service;


import it.sirfin.RubricaJPA.model.ContattoJPA;
import java.util.List;

/**
 *
 * @author marco
 */
public interface RubricaService {
    void inserisciContatto(ContattoJPA c);
    void cancellaContatto(ContattoJPA p);
    void svuotaRubrica();
    List<ContattoJPA> recuperaContatti();
}
