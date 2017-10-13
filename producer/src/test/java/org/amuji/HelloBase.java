package org.amuji;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.amuji.product.ProductController;
import org.junit.Before;

/**
 * Xiangrong Yang
 * 04/10/2017
 */
public class HelloBase {
    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new ProductController());
    }
}
