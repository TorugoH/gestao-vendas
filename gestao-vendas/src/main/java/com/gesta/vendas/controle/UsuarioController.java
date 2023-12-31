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
    private String registrarUser(@RequestBody Usuario usuario){

        if(usuarioRepository.findUsuarioByEmailandSenha(usuario.getEmail(), usuario.getSenha())==null){
            usuarioRepository.save(usuario);
        }else {
            return "Usaurio ja cadastrado";
        }
        return null;
    }

    @DeleteMapping("{id}")
    private void excluirConta(@PathVariable("id")Integer id){
        usuarioRepository.deleteById(id);
    }
   @GetMapping("{email}/{senha}")
    private Usuario verificarUsaurioExistente(@PathVariable("email") String email, @PathVariable("senha") String senha){
        return usuarioRepository.findUsuarioByEmailandSenha(email,senha);
   }

    @PutMapping("{email}/{cpf}/{novaSenha}")
    private void alteraSenha(@PathVariable("email") String email, @PathVariable("cpf") String cpf, @PathVariable("novaSenha") String novaSenha){
        Usuario usuarioTrocarSenha = usuarioRepository.findUsuarioByEmailandCpf(email,cpf);
        if (usuarioTrocarSenha !=null){
            usuarioTrocarSenha.setSenha(novaSenha);
            usuarioRepository.save(usuarioTrocarSenha);
        }
    }

}
