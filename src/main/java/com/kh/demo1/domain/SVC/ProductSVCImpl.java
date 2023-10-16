package com.kh.demo1.domain.SVC;

import com.kh.demo1.domain.DAO.Product;
import com.kh.demo1.domain.DAO.ProductDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductSVCImpl implements ProductSVC {
    private final ProductDAO productDAO;

    @Override
    public Long save(Product product){
        return productDAO.save(product);
    }

    @Override
    public Optional<Product> findById(Long productId){
        return productDAO.findById(productId);
    }

    @Override
    public List<Product> findAll(){
        return productDAO.findAll();
    }

    @Override
    public  int deleteById(Long productId){
        return productDAO.deleteById(productId);
    }

    @Override
    public int updatedById(Long productId, Product product) {
        return productDAO.updateById(productId, product);
    }
}
