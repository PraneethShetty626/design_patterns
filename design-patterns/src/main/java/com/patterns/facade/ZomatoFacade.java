package com.patterns.facade;

import com.patterns.facade.OrderFood.AssignRoute;
import com.patterns.facade.OrderFood.BookAtRestaurant;
import com.patterns.facade.OrderFood.CreateBill;
import com.patterns.facade.OrderFood.HandleDelivery;

public class ZomatoFacade {
    private AssignRoute assignRoute;
    private BookAtRestaurant bookAtRestaurant;

    private CreateBill createBill;
    private HandleDelivery handleDelivery;
    public void orderFood(){
        bookAtRestaurant.bookFood();
        createBill.createBill();
        handleDelivery.assignDeliveryAgent();
        assignRoute.getOptimalRoute();
    }
}
