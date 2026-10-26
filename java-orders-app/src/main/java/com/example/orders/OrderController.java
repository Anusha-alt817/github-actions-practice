
package com.example.orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders/total")
    public String calculateTotal() {
        int price = 100;
        int quantity = 3;
        int total = price * quantity;

        return "Order total: " + total;
    }
}
