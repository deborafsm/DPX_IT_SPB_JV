package com.projeto.projetospring.service.serviceimpl;

import com.projeto.projetospring.model.Post;
import com.projeto.projetospring.repository.PostSpringRepository;
import com.projeto.projetospring.service.ProjetospringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetospringImpl implements ProjetospringService {

    @Autowired
    PostSpringRepository postSpringRepository;


    @Override
    public List<Post> findAll() {
        return postSpringRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return postSpringRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return postSpringRepository.save(post);
    }


}
