package com.richa.ecommerce.order.controller;



import com.richa.ecommerce.order.clients.InventoryOpenFeignClient;
import com.richa.ecommerce.order.dto.OrderRequestDto;
import com.richa.ecommerce.order.service.OrdersService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/core")
@RequiredArgsConstructor
@Slf4j
public class OrdersController {

    private final OrdersService orderService;

    @PostMapping("/create-order")
    public ResponseEntity<OrderRequestDto> createOrder(@RequestBody OrderRequestDto orderRequestDto) {
        OrderRequestDto orderRequestDto1 = orderService.createOrder(orderRequestDto);
        return ResponseEntity.ok(orderRequestDto1);
    }


    @GetMapping("/helloOrders")
    public String helloOrders(@RequestHeader("X-User-Id") Long userId){
        return "Hello from Orders Service,user id is :"+userId;
    }

    @GetMapping
    public ResponseEntity<List<OrderRequestDto>> getAllOrders() {
        log.info("Fetching all orders via controller");
        List<OrderRequestDto> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);  // Returns 200 OK with the list of orders
    }



    @GetMapping("/{id}")
    public ResponseEntity<OrderRequestDto> getOrderById(@PathVariable Long id) {
        log.info("Fetching order with ID: {} via controller", id);
        OrderRequestDto order = orderService.getOrderById(id);
        return ResponseEntity.ok(order);  // Returns 200 OK with the order
    }
}
