package com.fourseasons.edu.uco.fourseasonsapi.application.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationProductMapper {

    public List<Product> dtosToDomains(List<ProductDTO> productsDtos) {
        List<Product> products = new ArrayList<>();
        productsDtos.forEach(productDTO -> {
            Product product = dtoToDomain(productDTO);
            products.add(product);
        });
        return products;
    }

    public List<ProductDTO> domainsToDtos(List<Product> products){
        List<ProductDTO> productDTOS = new ArrayList<>();
        products.forEach(product -> {
            ProductDTO productDTO = domainToDto(product);
            productDTOS.add(productDTO);
        });
        return productDTOS;
    }
    public Product dtoToDomain(ProductDTO productDTO) {
        return Product.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .discountType(productDTO.getDiscountType())
                .category(productDTO.getCategory())
                .image(productDTO.getImage())
                .quantity(productDTO.getQuantity())
                .build();
    }

    public ProductDTO domainToDto(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .discountType(product.getDiscountType())
                .category(product.getCategory())
                .image(product.getImage())
                .quantity(product.getQuantity())
                .build();
    }
}
