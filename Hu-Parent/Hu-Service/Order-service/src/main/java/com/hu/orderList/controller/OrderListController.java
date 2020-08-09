package com.hu.orderList.controller;

import com.hu.constant.MessageConstant;
import com.hu.constant.StatusCodeConstant;
import com.hu.orderList.model.OrderListResponseBean;
import com.hu.orderList.service.OrderListService;
import com.hu.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author huxiongjun
 * <p>
 * orderList controller
 */

@RestController
@RequestMapping("/order")
public class OrderListController {
    private static final Logger logger = LoggerFactory.getLogger(OrderListController.class);

    @Autowired
    private OrderListService orderListService;

    @GetMapping("/queryOrderList/{orderId}")
    public Result<List<OrderListResponseBean>> queryOrderList(@PathVariable(required = true) String orderId, HttpServletRequest request) {
        logger.info(request.getContextPath() + " start");
        List<OrderListResponseBean> responseBean = orderListService.queryOrderListByOrderId(orderId);
        if (responseBean != null && responseBean.size() > 0) {
            return new Result<List<OrderListResponseBean>>(true, StatusCodeConstant.OK, MessageConstant.QUERY_ORDER_LIST_SUCCESS, responseBean);
        }
        if (responseBean != null && responseBean.size() == 0) {
            return new Result<List<OrderListResponseBean>>(true, StatusCodeConstant.OK, MessageConstant.QUERY_ORDER_LIST_IS_EMPTY, responseBean);
        }
        return new Result<>(false, StatusCodeConstant.NOT_OK, MessageConstant.QUERY_ORDER_LIST_FAIL, null);
    }


}
