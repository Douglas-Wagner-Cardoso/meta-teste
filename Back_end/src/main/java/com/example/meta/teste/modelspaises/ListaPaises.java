package com.example.meta.teste.modelspaises;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListaPaises {
    @JsonProperty(value="page")
    private Long pagina;
    @JsonProperty(value="pages")
    private Long paginas;
    @JsonProperty(value="per_page")
    private Long por_pagina;
    @JsonProperty(value="total")
    private Long total;
    @JsonProperty(value="xmlns:wb")
    private String xmlnsWb;
    @JsonProperty(value = "wb:country")
    private List<Pais> paises;






}