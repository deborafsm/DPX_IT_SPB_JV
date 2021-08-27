package com.projeto.projetospring.repository;


import com.projeto.projetospring.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostSpringRepository extends JpaRepository<Post, Long> {

}
