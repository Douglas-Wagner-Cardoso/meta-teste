package com.example.meta.teste.modelsindices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Indice {
    @JsonProperty(value="wb:indicator")
    private Indicador indicador;
    @JsonProperty(value="wb:country")
    private Pais pais;
    @JsonProperty(value="wb:countryiso3code")
    private String countryiso3code;
    @JsonProperty(value="wb:date")
    private String date;
    @JsonProperty(value="wb:value")
    private String value;
    @JsonProperty(value="wb:unit")
    private String unit;
    @JsonProperty(value="wb:obs_status")
    private String obs_status;
    @JsonProperty(value="wb:decimal")
    private String decimal;
}
