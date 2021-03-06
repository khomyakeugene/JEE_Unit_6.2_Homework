package com.company.restaurant.application.data.list;

import com.company.restaurant.model.OrderView;
import com.company.util.Util;

import java.util.List;

/**
 * Created by Yevhen on 28.05.2016.
 */
public class OpenOrderTableList extends OrderTableList implements ObjectTableList<OrderView> {
    private static final String OPEN_ORDERS_HAVE_NOT_BEEN_FOUND_MESSAGE = "Open orders have not been found";


    @Override
    public List<OrderView> prepareObjectList() {
        return orderController.findAllOpenOrders();
    }

    @Override
    protected void listDataHasNotBeenFoundMessage() {
        Util.printMessage(OPEN_ORDERS_HAVE_NOT_BEEN_FOUND_MESSAGE);
    }
}
