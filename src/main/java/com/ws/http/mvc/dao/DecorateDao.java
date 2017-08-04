package com.ws.http.mvc.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 *
 * Created by Jo on 2017/7/25.
 */
@Repository
public interface DecorateDao {
    int updateTitle(String shopId, String URI);

    int addNavigation(Map<String, String> navigation);

    int updateNavigation(Map<String, String> navigation);

    int deleteNavigation(String navigationId);

    int addGoodsToNvg(Map<String, String> nvgContent);
}
