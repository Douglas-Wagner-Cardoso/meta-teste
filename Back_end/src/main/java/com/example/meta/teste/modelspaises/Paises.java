package com.example.meta.teste.modelspaises;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paises {
    @JsonProperty(value="wb:countries")
    private ListaPaises paises;
}
