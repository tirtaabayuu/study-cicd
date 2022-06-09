package com.projectbackend.backendcicd.controller;

import com.projectbackend.backendcicd.model.Product;
import com.projectbackend.backendcicd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "")
    public List<Product> getAllProduct () {
        try {
            return service.getAllProduct();
        }catch (Exception e) {
            throw e;
        }
    }

    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable Long id) {
        try {
            return service.getProductById(id);
        }catch (Exception e) {
            throw e;
        }
    }

    @PostMapping (value = "")
    public Product addNewProduct(@RequestBody Product request) {
        try {
            return service.addNewProduct(request);
        }catch (Exception e) {
            throw e;
        }
    }

    @PatchMapping (value = "/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product request) {
        try {
            return service.updateProduct(id, request);
        }catch (Exception e) {
            throw e;
        }
    }

    @DeleteMapping(value = "/{id}")
    public Product deleteProduct(@PathVariable Long id) {
        try {
            return service.deleteProduct(id);
        }catch (Exception e) {
            throw e;
        }
    }
}
