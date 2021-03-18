package com.example.meta.teste.modelspaises;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pais {
    private String id;
    @JsonProperty(value= "wb:iso2Code")
    private String iso2Code;
    @JsonProperty(value= "wb:name")
    private String name;
    @JsonProperty(value= "wb:capitalCity")
    private String capitalCity;
    @JsonProperty(value= "wb:longitude")
    private String longitude;
    @JsonProperty(value= "wb:latitude")
    private String latitude;
    @JsonProperty(value="wb:region")
    private Regiao regiao;
    @JsonProperty(value="wb:adminregion")
    private RegiaoAdmin regiaoAdmin;
    @JsonProperty(value="wb:incomeLevel")
    private Renda renda;
    @JsonProperty(value="wb:lendingType")
    private AplicabiliadeEmprestimo aplicabilidadeEmprestimo;

}
