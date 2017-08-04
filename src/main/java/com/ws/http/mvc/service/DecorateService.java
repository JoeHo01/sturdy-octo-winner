package com.ws.http.mvc.service;

import com.ws.common.response.DataWrapper;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.Map;

/**
 *
 * Created by Jo on 2017/7/25.
 */
public interface DecorateService {
    DataWrapper<Void> updateTitle(String path, CommonsMultipartFile file, String shopId);

    DataWrapper<Void> addNavigation(Map<String, String> navigation);

    DataWrapper<Void> updateNavigation(Map<String, String> navigation);

    DataWrapper<Void> deleteNavigation(String navigationId);

    DataWrapper<Void> addGoodsToNvg(Map<String, String> nvgContent);
}
