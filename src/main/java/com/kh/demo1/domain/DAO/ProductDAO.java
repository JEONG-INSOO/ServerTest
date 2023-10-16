package com.kh.demo1.domain.DAO;

import java.util.List;
import java.util.Optional;

public interface ProductDAO {
    //등록
    Long save(Product product);

    //조회
    Optional<Product> findById(Long productId);

    //목록
    List<Product> findAll();

    //단건 삭제
    int deleteById(Long productId);

    //수정
    int updateById(Long productId, Product product);
}
