package com.gesta.vendas.controle;

import com.gesta.vendas.model.Pedido;
import com.gesta.vendas.model.Produtos;
import com.gesta.vendas.repository.PedidosRepository;
import com.gesta.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidosController {
    @Autowired
    PedidosRepository pedidosRepository;
    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping()
    private void cadastrarVenda(@RequestBody Pedido pedido){
        //pedido.setId(null);
        Pedido novoPedido = pedidosRepository.save(pedido);
        salvarProdutos(novoPedido,pedido.getProduto());

    }
    private void salvarProdutos(Pedido pedido, List<Produtos> produtos){
        produtos.forEach(produtos1 -> produtos1.setPedido(pedido) );
        produtoRepository.saveAll(produtos);

    }


}
