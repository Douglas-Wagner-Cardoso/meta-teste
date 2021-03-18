package com.example.meta.teste.modelspaises;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AplicabiliadeEmprestimo {
    private String id;
    private String iso2code;
    private String content;

}
