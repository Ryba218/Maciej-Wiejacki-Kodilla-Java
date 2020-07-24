package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private DeliveryService deliveryService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, DeliveryService deliveryService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.deliveryService = deliveryService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (OrderRequest orderRequest) {
        boolean isSend = deliveryService.orderDelivery(orderRequest.getUser());

        if (isSend) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createSoldItem(orderRequest.getUser(),orderRequest.getOrder());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
