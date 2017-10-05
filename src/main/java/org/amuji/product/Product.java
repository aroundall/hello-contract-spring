package org.amuji.product;

/**
 * Xiangrong Yang
 * 04/10/2017
 */
public class Product {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public Product setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }
}
