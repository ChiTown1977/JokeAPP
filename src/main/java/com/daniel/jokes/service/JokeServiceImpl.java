package com.daniel.jokes.service;

import com.daniel.jokes.java.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Daniel Tominov on 12/4/2017
 */
@Service
public class JokeServiceImpl implements JokeService {

    @Autowired
    public Joke  joke;

    @Override
    public Joke getJoke() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        joke.setJoke(quotes.getRandomQuote());
        return joke;
    }
}
