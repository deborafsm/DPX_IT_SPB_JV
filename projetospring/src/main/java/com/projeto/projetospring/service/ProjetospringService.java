package com.projeto.projetospring.service;


import com.projeto.projetospring.model.Post;

import java.util.List;

public interface ProjetospringService {

    List<Post> findAll(); //Metodo lista  postagens
    Post findById(long id); //Metodo procura por id
    Post save(Post post); //Metodo Salva uma postagem

}
