package com.daniel.jokes.java;

import org.springframework.stereotype.Component;

/**
 * @author Daniel Tominov on 12/4/2017
 */
@Component
public class Joke {
    private String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
