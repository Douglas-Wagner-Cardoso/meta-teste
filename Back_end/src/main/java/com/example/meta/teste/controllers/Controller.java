package com.example.meta.teste.controllers;

import com.example.meta.teste.modelsindices.Indices;
import com.example.meta.teste.modelspaises.Paises;
import com.example.meta.teste.services.WorldBankService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Api(value="Api do World Bank")
public class Controller {

    @Autowired
    WorldBankService service;

    @CrossOrigin("*")
    @GetMapping("/{pagina}")
    @ApiOperation(value="Busca todos os códigos de paises")
    public Paises buscarCodigosPaises(@PathVariable int pagina) {
        return service.buscarCodigosPaises(pagina);
    }

    @CrossOrigin("*")
    @GetMapping("/codigo/{cod}")
    @ApiOperation(value="Busca os indices anuais de paises especificos")
    public Indices buscarIndicesPaises(@RequestParam int pagina, @PathVariable String cod){
        return service.buscarIndicesPaises(pagina, cod);
    }
}