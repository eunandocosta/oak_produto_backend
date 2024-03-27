package com.costa.oak_produto_api.controllers;

import com.costa.oak_produto_api.DTOs.ProdutosDTO;
import com.costa.oak_produto_api.models.Produtos;
import com.costa.oak_produto_api.services.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProdutosController {

    @Autowired
    ProdutosService produtosService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/inserir")
    public ResponseEntity<List<Produtos>> insertProdutos(@RequestBody ProdutosDTO produtosDTO){
            List<Produtos> listaDeProdutos = produtosService.insertProdutos(produtosDTO);
            return ResponseEntity.ok(listaDeProdutos);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/receber")
    public ResponseEntity<List<Produtos>> getProdutos(){
        List<Produtos> listaDeProdutos = produtosService.getProdutos();
        return ResponseEntity.ok(listaDeProdutos);
    }
}
