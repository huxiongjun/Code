package com.hu.orderList.service.impl;

import com.hu.orderList.mapper.OrderListMapper;
import com.hu.orderList.model.OrderListResponseBean;
import com.hu.orderList.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huxiongjun
 */

@Service
public class OrderListServiceImpl implements OrderListService {
    @Autowired
    private OrderListMapper orderListMapper;


    @Override
    public List<OrderListResponseBean> queryOrderListByOrderId(String orderId) {
        return orderListMapper.queryOrderListByOrderId(orderId);
    }
}
