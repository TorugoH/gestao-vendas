package com.gesta.vendas.repository;

import com.gesta.vendas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PedidosRepository  extends JpaRepository<Pedido,Integer> {
}
