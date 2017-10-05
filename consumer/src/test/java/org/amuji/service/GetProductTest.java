package org.amuji.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Xiangrong Yang
 * 04/10/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"org.amuji:http-server-producer:+:stubs:6565"}, repositoryRoot = "http://localhost:8081/repository/maven-snapshots/")
public class GetProductTest {

    @Autowired
    private GetProduct get;
    @Test
    public void getProductById() {
        String product = get.getProduct();
        assertNotNull(product);
    }
}
