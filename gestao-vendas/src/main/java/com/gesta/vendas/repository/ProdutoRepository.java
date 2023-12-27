package com.gesta.vendas.repository;

import com.gesta.vendas.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface ProdutoRepository extends JpaRepository<Produtos,Integer> {
    @Query("UPDATE produtos SET qtdEstoque=?2 WHERE id =?1")
    public default void updateProduto(@Param("id") Integer id, @Param("qtdNova") int qtdNova) {

    }

}
