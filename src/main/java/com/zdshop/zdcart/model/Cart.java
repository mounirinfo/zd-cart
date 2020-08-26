package com.zdshop.zdcart.model;
import lombok.*;
import java.util.List;

@Builder
@Getter
public class Cart {
    private String id;
    private List<CartItem> cartItems;
}
