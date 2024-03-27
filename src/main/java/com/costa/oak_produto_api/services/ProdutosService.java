package com.costa.oak_produto_api.services;

import com.costa.oak_produto_api.DTOs.ProdutosDTO;
import com.costa.oak_produto_api.models.Produtos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutosService {

    private static final List<Produtos> produtos = new ArrayList<>();

    public List<Produtos> insertProdutos(ProdutosDTO produtosDTO){
        Produtos produto = new Produtos(produtosDTO);
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produtosDTO.nomeDoProduto());
        return new ArrayList<>(produtos);
    }

    public List<Produtos> getProdutos(){
        return new ArrayList<>(produtos);
    }
}
