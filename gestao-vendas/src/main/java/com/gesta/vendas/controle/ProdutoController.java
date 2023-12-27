package com.gesta.vendas.controle;

import com.gesta.vendas.model.Produtos;
import com.gesta.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;
    @PostMapping("/cadastrarProduto")
    private void cadastrarProduto(@RequestBody Produtos produtos){
        produtoRepository.save(produtos);
    }
    @GetMapping("/listarTodosProdutos")
    private List<Produtos> listarProdutos(){
        return produtoRepository.findAll();
    }
    @DeleteMapping("/{id}")
    private void deletarProduto(@PathVariable("id") Integer id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}/{qtdNova}")
    private void atualizarEstoque(@PathVariable("id") Integer id, @PathVariable("qtdNova") int qtdNova){
            produtoRepository.updateProduto(id, qtdNova);
    }

}
