package com.gesta.vendas.controle;

import com.gesta.vendas.model.Produtos;
import com.gesta.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;
    @PostMapping("/cadastrarProduto")
    private void cadastrarProduto(@RequestBody Produtos produtos){
        produtoRepository.save(produtos);
    }
}
