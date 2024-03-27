package com.costa.oak_produto_api.repository;

import com.costa.oak_produto_api.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepo extends JpaRepository<Produtos, Long> {
}
