package com.ws.http.mvc.service.impl;

import com.ws.common.response.DataWrapper;
import com.ws.common.response.ErrorCodeEnum;
import com.ws.common.utils.FileUtil;
import com.ws.http.mvc.dao.ShopDao;
import com.ws.http.mvc.service.DecorateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 * Created by Jo on 2017/7/25.
 */
@Service
public class DecorateServiceImpl implements DecorateService {
    private final
    ShopDao shopDao;

    @Autowired
    public DecorateServiceImpl(ShopDao shopDao) {
        this.shopDao = shopDao;
    }

    @Override
    public DataWrapper<Void> updateTitle(HttpServletRequest request, String shopId, CommonsMultipartFile titleImg) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        String name = titleImg.getOriginalFilename();
        String suffix = name.substring(name.lastIndexOf("."), name.length());
        try {
            String path = request.getServletContext().getRealPath("/resources/") + "/img/store/store_" + shopId + "/main/";
            Map<String, String> title = shopDao.getTitle(shopId);
            FileUtil.deleteFile(title.get("img"));
            FileUtil.upload(titleImg, path, "title" + suffix);
            int i = shopDao.updateTitle(shopId, "/resources/img/store/store_" + shopId + "/main/" + "title" + suffix);
            if (i != 1) dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        } catch (IOException e) {
            e.printStackTrace();
            dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> addNavigation(Map<String, String> navigation) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = shopDao.addNavigation(navigation);
        if (i != 1) dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> updateNavigation(Map<String, String> navigation) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = shopDao.updateNavigation(navigation);
        if (i != 1) dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> deleteNavigation(String navigationId) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = shopDao.deleteNavigation(navigationId);
        if (i != 1) dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> updateGoodsToNvg(Map<String, String> nvgContent) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = shopDao.updateGoodsToNvg(nvgContent);
        if (i != 1) dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> addSlideshow(HttpServletRequest request, String shopId, CommonsMultipartFile[] slideImg) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        long time = new Date().getTime();
        String path = request.getServletContext().getRealPath("/resources/") + "/img/store/store_" + shopId + "/main/";
        for (int i = 0; i < slideImg.length; i++) {
            String name = slideImg[i].getOriginalFilename();
            String suffix = name.substring(name.lastIndexOf("."), name.length());
            try {
                FileUtil.upload(slideImg[i], path, "slideshow" + time + suffix);
                int j = shopDao.addSlideshow(shopId, "/resources/img/store/store_" + shopId + "/main/" + "slideshow" + time + i + suffix);
                if (j != 1) dataWrapper.setErrorCode(ErrorCodeEnum.Error);
            } catch (IOException e) {
                e.printStackTrace();
                dataWrapper.setErrorCode(ErrorCodeEnum.Error);
            }
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> updateSlideshow(HttpServletRequest request, String slideshowId, CommonsMultipartFile slideImg) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        String name = slideImg.getOriginalFilename();
        String suffix = name.substring(name.lastIndexOf("."), name.length());
        long time = new Date().getTime();
        int shopId = shopDao.getShopIdBySlideshow(slideshowId);
        String path = request.getServletContext().getRealPath("/resources/") + "/img/store/store_" + shopId + "/main/";
        try {
            FileUtil.upload(slideImg, path, "slideshow" + time + suffix);
            int i = shopDao.updateSlideshow(slideshowId, "/resources/img/store/store_" + shopId + "/main/" + "slideshow" + time + 0 + suffix);
            if (i != 1) dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        } catch (IOException e) {
            e.printStackTrace();
            dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return dataWrapper;
    }
}
