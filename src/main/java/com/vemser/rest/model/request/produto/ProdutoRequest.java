package com.vemser.rest.model.request.produto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequest {

    private String nome;
    private Integer preco;
    private String descricao;
    private Integer quantidade;

}