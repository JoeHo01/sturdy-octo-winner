package com.ws.http.mvc.service;

import com.ws.common.response.DataWrapper;
import com.ws.common.response.Page;
import com.ws.http.mvc.pojo.OrderPojo;

import java.util.List;
import java.util.Map;

/**
 * Created by Jo on 2017/7/24.
 */
public interface OrderService {
    DataWrapper<List<OrderPojo>> query(Map<String, String> param, Page page);
}
