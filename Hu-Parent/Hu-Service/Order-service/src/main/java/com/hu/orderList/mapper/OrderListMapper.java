package com.hu.orderList.mapper;

import com.hu.orderList.model.OrderListResponseBean;

import java.util.List;

/**
 * @author huxiongjun
 */
public interface OrderListMapper {
    /**
     *  根据orderId 查询订单
     */
    List<OrderListResponseBean> queryOrderListByOrderId(String orderId);
}
