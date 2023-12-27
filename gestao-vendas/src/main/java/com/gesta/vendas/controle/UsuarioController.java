package com.gesta.vendas.controle;

import com.gesta.vendas.model.Usuario;
import com.gesta.vendas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;
    @GetMapping("ListarTodosUsuarios")
    private List<Usuario> listarUsuario(){
        return usuarioRepository.findAll();

    }
    @PostMapping("RegistrarUsuario")
    private  void registrarUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @DeleteMapping("{id}")
    private void excluirConta(@PathVariable("id")Integer id){
        usuarioRepository.deleteById(id);
    }
   @GetMapping("{nome}/{senha}")
    private Usuario verificarUsaurioExistente(@PathVariable("nome") String nome, @PathVariable("senha") String senha){
        return usuarioRepository.findUsuarioByNomeandSenha(nome,senha);
   }



}
