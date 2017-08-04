package com.ws.http.mvc.controller.customer;

import com.ws.common.response.DataWrapper;
import com.ws.common.response.Page;
import com.ws.http.mvc.pojo.OrderPojo;
import com.ws.http.mvc.service.OrderService;
import com.ws.http.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Jo on 2017/7/19.
 */
@RequestMapping("api/customer/order")
@Controller
public class CsOrderController {
    @Autowired
    OrderService orderService;

    /**
     * @param param openId 微信用户id
     *              orderState 订单状态
     *              startTime 起始时间
     *              endTime 结束时间
     *              pageSize 每页项数
     *              currentPage 当前页
     * @return 用户订单列表
     */
    @RequestMapping(value = "query", method = RequestMethod.GET)
    @ResponseBody
    public DataWrapper<List<OrderPojo>> query(
            @RequestParam Map<String, String> param,
            @ModelAttribute Page page

    ) {
        return orderService.query(param,page);
    }

}
