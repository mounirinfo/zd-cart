package com.zdshop.zdcart.model;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
public class CartItem {
    private String id;
    private String productId;
    private Integer quantity;
}
