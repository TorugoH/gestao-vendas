package com.gesta.vendas.repository;

import com.gesta.vendas.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProdutoRepository extends JpaRepository<Produtos,Integer> {


}
