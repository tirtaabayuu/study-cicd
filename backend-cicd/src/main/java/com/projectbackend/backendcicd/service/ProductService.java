package com.projectbackend.backendcicd.service;

import com.projectbackend.backendcicd.model.Product;
import com.projectbackend.backendcicd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProduct() {
        try {
            return repository.findAll();
        }catch (Exception e) {
            return null;
        }
    }

    public Product getProductById(Long id) {
        try {
            Optional<Product> product = repository.findById(id);
            if (product.isPresent()) {
                return product.get();
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public Product addNewProduct (Product request) {
        try {
            return repository.save (request);
        } catch (Exception e) {
            return null;
        }
    }
    public Product updateProduct (Long id, Product request) {
        try {
            Optional<Product> productOld = repository.findById(id);
            if (productOld.isPresent()) {
                Product productNew = productOld.get();
                productNew.setName(request.getName());
                productNew.setDescription(request.getDescription());
                productNew.setStock(request.getStock());
                productNew.setPrice(request.getPrice());
                return repository.save (productNew);
            }else {
                return null;
            }
        }catch (Exception e) {
            return null;
        }
    }
    public Product deleteProduct (Long id) {
        try {
            Optional<Product> product = repository.findById(id);
            if (product.isPresent()) {
                repository.deleteById(id);
                return null;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
