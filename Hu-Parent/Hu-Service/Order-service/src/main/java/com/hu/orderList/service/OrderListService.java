package com.hu.orderList.service;

import com.hu.orderList.model.OrderListResponseBean;

import java.util.List;

/**
 * @author huxiongjun
 */
public interface OrderListService {
    List<OrderListResponseBean> queryOrderListByOrderId(String orderId);
}
