package org.amuji.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Xiangrong Yang
 * 04/10/2017
 */
@RestController
@RequestMapping("products")
public class ProductController {
    @GetMapping("{id}")
    public Product get(@PathVariable Long id) {
        return new Product().setId(id).setName("Dummy Product");
    }
}
