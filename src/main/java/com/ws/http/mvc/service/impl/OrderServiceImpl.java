package com.ws.http.mvc.service.impl;

import com.ws.common.response.DataWrapper;
import com.ws.common.response.Page;
import com.ws.http.mvc.pojo.OrderPojo;
import com.ws.http.mvc.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Jo on 2017/7/24.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public DataWrapper<List<OrderPojo>> query(Map<String, String> param, Page page) {
        DataWrapper<List<OrderPojo>> dataWrapper = new DataWrapper<List<OrderPojo>>();
        return dataWrapper;
    }
}
