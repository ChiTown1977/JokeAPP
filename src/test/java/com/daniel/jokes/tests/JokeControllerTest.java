package com.daniel.jokes.tests;

import com.daniel.jokes.controller.JokeController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

/**
 * @author Daniel Tominov on 12/11/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JokeControllerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(JokeControllerTest.class);
    Model model = Mockito.mock(Model.class);
    @Autowired
    private ApplicationContext context;

    @Test
    public void jokeControllerTest() throws Exception {
        JokeController controller = (JokeController) context.getBean("jokeController");

        String returnedView = controller.jokes(model);
        Assert.assertNotNull(controller);
        //ensures that the appropriate jokes string is passed to the view resolver.
        Assert.assertEquals("jokes", returnedView);
        LOGGER.info("jokeControllerTest was completed");
    }
}
