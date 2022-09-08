package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.ProductEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InfrastuctureProductMapper {

    public List<ProductEntity> modelsToEntities(List<Product> products) {
        List<ProductEntity> productEntities = new ArrayList<>();
        products.forEach(product -> {
            ProductEntity productEntity = modelToEntity(product);
            productEntities.add(productEntity);
        });
        return productEntities;
    }

    public List<Product> entitiesToModels(List<ProductEntity> productEntities) {
        List<Product> products = new ArrayList<>();
        productEntities.forEach(productEntity -> {
            Product product = entityToModel(productEntity);
            products.add(product);
        });
        return products;
    }

    public ProductEntity modelToEntity(Product product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(product.getId());
        productEntity.setName(product.getName());
        productEntity.setDescription(product.getDescription());
        productEntity.setCategory(product.getCategory());
        productEntity.setQuantity(product.getQuantity());
        productEntity.setDiscountType(product.getDiscountType());
        productEntity.setImage(product.getImage());
        productEntity.setPrice(product.getPrice());
        return productEntity;
    }

    public Product entityToModel(ProductEntity productEntity) {
        Product product = new Product();
        product.setId(productEntity.getId());
        product.setName(productEntity.getName());
        product.setDescription(productEntity.getDescription());
        product.setCategory(productEntity.getCategory());
        product.setQuantity(productEntity.getQuantity());
        product.setDiscountType(productEntity.getDiscountType());
        product.setPrice(productEntity.getPrice());
        product.setImage(productEntity.getImage());
        return product;
    }

}
