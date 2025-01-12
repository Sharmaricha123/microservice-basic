package com.richa.ecommerce.inventory.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "ORDER-SERVICE",path="/orders")
public interface OrdersFeignClient {

    @GetMapping("/core/helloOrders")
    String helloOrders();

}
