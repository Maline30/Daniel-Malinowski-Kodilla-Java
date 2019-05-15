package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcess {

    private OrderRepository orderRepository;

    public OrderProcess(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;

    }

    public OrderDto run(Manufacturer manufacturer) {
        boolean isOrder = manufacturer.process();

        if(isOrder) {
            orderRepository.creatOrder(manufacturer.getClass().getSimpleName(), manufacturer.getProduct(),
                    manufacturer.getQuantity());
            return new OrderDto(manufacturer.getProduct(), manufacturer.getQuantity(), true);
        } else {
            return new OrderDto(manufacturer.getProduct(), manufacturer.getQuantity(), false);
        }
    }
}
