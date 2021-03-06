/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.RubricaJPA.controller;

import it.sirfin.RubricaJPA.model.ContattoJPA;
import it.sirfin.RubricaJPA.service.RubricaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/init")
    //crea e inserisce i contatti
    public void init() {
        List<ContattoJPA> contatto = new ArrayList<>();
        contatto.add(new ContattoJPA("Francesco", "Lillo", "3318074583"));
        contatto.add(new ContattoJPA("Alessandro", "Urbani", "3913283951"));
        contatto.add(new ContattoJPA("Marco", "Bonaccorso", "3282365019"));
        contatto.add(new ContattoJPA("Valeria", "Comitogianni", "3922147475"));

        // svuota la rubrica
        rubricaService.svuotaRubrica();

        //recupera i contatti appena cancellati
        contatto.forEach((t) -> {
            rubricaService.inserisciContatto(t);
        });
        List<ContattoJPA> lista = rubricaService.recuperaContatti();
        lista.forEach((t) -> System.out.println(t));
    }
}
