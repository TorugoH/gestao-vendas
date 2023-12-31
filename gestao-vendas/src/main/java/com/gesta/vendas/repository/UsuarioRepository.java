package com.gesta.vendas.repository;

import com.gesta.vendas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

        /***
         * IMPORTANTEEEE*
         Na query o nome do banco e a entidade do  objeto
         * **/
        @Query("Select u from Usuario u where email=?1 and senha=?2")
        Usuario findUsuarioByEmailandSenha(@Param("email") String email, @Param("senha") String senha);

        @Query("Select u from Usuario u where email=?1 and cpf=?2")
        Usuario findUsuarioByEmailandCpf(@Param("email")String email, @Param("cpf") String cpf);

}