/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.RubricaJPA.controller;

import it.sirfin.RubricaJPA.service.RubricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marco
 */
@CrossOrigin("*")
@RestController
public class RubricaControllerJPA {

    @Autowired
    RubricaService rubricaService;

    public void init() {
    }

}
