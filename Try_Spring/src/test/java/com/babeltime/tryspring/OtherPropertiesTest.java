package com.babeltime.tryspring;

import com.babeltime.tryspring.comm.OtherProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes=TryspringApplication.class)
@RunWith(SpringRunner.class)

public class OtherPropertiesTest {

    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testOther() throws Exception {
        System.out.println("title:"+otherProperties.getTitle());
        System.out.println("description:"+otherProperties.getDescription());
    }


}
