package com.oreilly.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistenceApplicationTests {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private ApplicationContext context;

    @Test
    public void contextLoads() {
        log.info("App name: " + context.getApplicationName());
        log.info("context.getDisplayName() " + context.getDisplayName());

        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
