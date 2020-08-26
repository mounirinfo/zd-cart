package com.zdshop.zdcart.controllers;

import com.zdshop.zdcart.model.Cart;
import com.zdshop.zdcart.model.CartItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mono<Cart> find(@PathVariable String id){

        logger.info("looking cart with id : " + id);
        List<CartItem> returnList = new ArrayList();
        returnList.add(new CartItem("001", "005", 4));
        return Mono.just(
                Cart.builder()
                .id("001")
                        .cartItems(returnList)
                .build()
        );
    }

    @RequestMapping(value="/addItem/{cartId}",method = RequestMethod.POST)
    public Mono<Cart> addItem(@PathVariable String cartId, @RequestBody CartItem pCartItem){
        if(pCartItem != null) {
            logger.info(" adding product " + pCartItem.getProductId() + " , with quantity : " + pCartItem.getQuantity() + " , for cart  : " + cartId);
        }else{
            logger.info("empty body");
        }
        List<CartItem> returnList = new ArrayList();
        if(pCartItem != null) {
            returnList.add(new CartItem("001", pCartItem.getProductId(), pCartItem.getQuantity()));
        }
        return Mono.just(
                Cart.builder()
                        .id(cartId)
                        .cartItems(returnList)
                        .build()
        );
    }


}
