/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.RubricaJPA.repository;

import it.sirfin.RubricaJPA.model.ContattoJPA;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author marco
 */
public interface RubricaRepository extends JpaRepository<ContattoJPA, Long> {

}
