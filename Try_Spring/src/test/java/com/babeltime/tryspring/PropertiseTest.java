package com.babeltime.tryspring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiseTest {
    @Value("${babeltime.title}")
    private String title;

    @Test
    public void testSingle(){
        Assert.assertEquals(title,"巴别时代");
    }
}
