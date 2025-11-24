package com.dylbobuloid.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);

        // Instead of manually creating objects and injecting dependencies
        // We let the IOC container in SPRING BOOT to manage it
//        var orderService = new OrderService(new PayPalPaymentService());
        orderService.placeOrder();
	}

}
