package com.itea.lesson;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("it")
@SpringBootTest(classes = LessonApplication.class)
public class LessonApplicationTest {

    @Test
    void contextLoads() {

    }
}
