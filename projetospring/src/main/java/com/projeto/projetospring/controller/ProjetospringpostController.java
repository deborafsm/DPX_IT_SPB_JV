package com.projeto.projetospring.controller;

import com.projeto.projetospring.model.Post;
import com.projeto.projetospring.service.ProjetospringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProjetospringpostController {
    //Ponto de injeção
    @Autowired
    ProjetospringService projetospringService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = projetospringService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }
    //Recebe um id do post e trás um post do id especifico id1 = post1
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public ModelAndView getPostDetails(@PathVariable ("id") long id){
        ModelAndView mv = new ModelAndView("posts");
        Post posts = projetospringService.findById(id);
        mv.addObject("posts" , posts);
        return mv;
    }
}
