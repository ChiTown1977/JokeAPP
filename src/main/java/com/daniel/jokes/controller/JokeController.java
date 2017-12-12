package com.daniel.jokes.controller;

import com.daniel.jokes.java.Joke;
import com.daniel.jokes.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @author Daniel Tominov on 12/6/2017
 */
@Controller
public class JokeController {
   public JokeService jokeService;

   @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String jokes(Model model){
        ArrayList<Joke> jokes = new ArrayList<Joke>();
        jokes.add(jokeService.getJoke());
        model.addAttribute("jokes", jokes);
        return "jokes";
    }
}
