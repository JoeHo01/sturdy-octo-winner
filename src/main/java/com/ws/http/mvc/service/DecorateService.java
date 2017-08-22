package com.ws.http.mvc.service;

import com.ws.common.response.DataWrapper;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 *
 * Created by Jo on 2017/7/25.
 */
public interface DecorateService {

    DataWrapper<Void> updateTitle(HttpServletRequest request, String shopId, CommonsMultipartFile titleImg);

    DataWrapper<Void> addNavigation(Map<String, String> navigation);

    DataWrapper<Void> updateNavigation(Map<String, String> navigation);

    DataWrapper<Void> deleteNavigation(String navigationId);

    DataWrapper<Void> updateGoodsToNvg(Map<String, String> nvgContent);

    DataWrapper<Void> updateSlideshow(HttpServletRequest request, String slideshowId, CommonsMultipartFile slideImg);

    DataWrapper<Void> addSlideshow(HttpServletRequest request, String shopId, CommonsMultipartFile[] slideImg);
}
