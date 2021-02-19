package com.babeltime.tryspring;

import com.babeltime.tryspring.comm.BabeltimeProperties;
import com.babeltime.tryspring.comm.EmployProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import javax.annotation.Resource;

@SpringBootTest(classes=TryspringApplication.class)
@RunWith(SpringRunner.class)

public class BabeltimePropertiesTest {

    @Resource
    private  BabeltimeProperties properties;

    @Resource
    private  EmployProperties employProperties;

    @Test
    public void testMore() throws Exception {
        System.out.println("title:"+properties.getTitle());
        System.out.println("description:"+properties.getDescription());
    }


    @Test
    public void testEmploy() throws Exception {
        System.out.println("title:"+employProperties.getTitle());
        System.out.println("description:"+employProperties.getDescription());
    }

}
