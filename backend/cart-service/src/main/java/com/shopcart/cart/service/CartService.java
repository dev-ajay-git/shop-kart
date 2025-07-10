package com.shopcart.cart.service;

import com.shopcart.cart.model.CartItem;
import com.shopcart.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<CartItem> getCartItemsByUser(String userId) {
        return cartRepository.findByUserId(userId);
    }

    public CartItem addToCart(CartItem item) {
        return cartRepository.save(item);
    }

    public void removeFromCart(String id) {
        cartRepository.deleteById(id);
    }

    public void clearCartByUser(String userId) {
        List<CartItem> items = cartRepository.findByUserId(userId);
        cartRepository.deleteAll(items);
    }

    public Optional<CartItem> getCartItem(String id) {
        return cartRepository.findById(id);
    }
}
