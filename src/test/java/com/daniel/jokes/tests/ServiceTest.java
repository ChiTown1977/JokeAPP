package com.daniel.jokes.tests;

import com.daniel.jokes.service.JokeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * @author Daniel Tominov on 12/11/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceTest.class);

    @Autowired
    private JokeService jokeService;

    @Test
    public void jokeServiceTest() {
        String joke = jokeService.getJoke().getJoke();
        Assert.notNull(joke, "joke");
        LOGGER.info("jokeServiceTest was completed");
    }
}
