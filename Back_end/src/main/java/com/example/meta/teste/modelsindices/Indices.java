package com.example.meta.teste.modelsindices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Indices {
    @JsonProperty(value="wb:data")
    private ListaIndices indices;
}
