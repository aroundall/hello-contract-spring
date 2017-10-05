package org.amuji.product;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

/**
 * Xiangrong Yang
 * 04/10/2017
 */
public class MvcTest {
    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new ProductController());
    }
}
