package com.ws.http.mvc.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 *
 * Created by Jo on 2017/7/25.
 */
@Repository
public interface ShopDao {
    int updateTitle(String shopId, String URL);

    int addNavigation(Map<String, String> navigation);

    int updateNavigation(Map<String, String> navigation);

    int deleteNavigation(String navigationId);

    int updateGoodsToNvg(Map<String, String> nvgContent);

    int addSlideshow(String shopId, String s);

    int updateSlideshow(String shopId, String s);

    int getShopIdBySlideshow(String slideshowId);

    Map<String,String> getTitle(String shopId);
}
