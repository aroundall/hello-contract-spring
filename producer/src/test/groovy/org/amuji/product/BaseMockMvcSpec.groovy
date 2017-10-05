package org.amuji.product

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import org.amuji.product.ProductController
import spock.lang.Specification

/**
 *
 * Xiangrong Yang
 * 04/10/2017
 */
abstract class BaseMockMvcSpec extends Specification{
    def setup() {
        RestAssuredMockMvc.standaloneSetup(new ProductController())
    }

    void isEmpty(String value) {
        assert value == null
    }
}
