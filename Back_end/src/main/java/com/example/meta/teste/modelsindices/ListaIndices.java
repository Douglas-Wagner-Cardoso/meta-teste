package com.example.meta.teste.modelsindices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListaIndices {
    @JsonProperty(value="page")
    private Long pagina;
    @JsonProperty(value="pages")
    private long paginas;
    @JsonProperty(value="per_page")
    private long por_pagina;
    @JsonProperty(value="total")
    private long total;
    @JsonProperty(value="sourceid")
    private long sourceid;
    @JsonProperty(value="lastupdated")
    private String lastupdated;
    @JsonProperty(value="xmlns:wb")
    private String xmlnsWb;
    @JsonProperty(value="wb:data")
    private List<Indice> listaindice;
}
