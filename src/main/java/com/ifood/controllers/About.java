package com.ifood.controllers;

import com.ifood.TemperaturaClient;
import com.ifood.model.Informacoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/about")
public class About {


    @Autowired //cria uma instancia do objeto
    private TemperaturaClient temperaturaClient;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public Informacoes get() {
        return temperaturaClient.getInformacoes();
    }

}
