package com.ifood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //gera getters e setter a partir do lombok
@AllArgsConstructor
@NoArgsConstructor
public class Informacoes {
    private String clima; //implementacao em enum futuramente
    private String descricao;
    private Double temperatura;
    private Integer pressao;
}
