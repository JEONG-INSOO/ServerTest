package com.kh.demo1.domain.DAO;

import lombok.Data;

@Data
public class Product {
    private Long productId;     // 상품ID
    private String pname;       // 상품명
    private Long quantity;      // 상품수량
    private Long price;         // 상품가격
}
