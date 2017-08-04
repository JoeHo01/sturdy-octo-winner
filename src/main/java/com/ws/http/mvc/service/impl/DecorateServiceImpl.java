package com.ws.http.mvc.service.impl;

import com.ws.common.response.DataWrapper;
import com.ws.common.response.ErrorCodeEnum;
import com.ws.common.utils.FileUtil;
import com.ws.http.mvc.dao.DecorateDao;
import com.ws.http.mvc.service.DecorateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 *
 * Created by Jo on 2017/7/25.
 */
@Service
public class DecorateServiceImpl implements DecorateService {
    @Autowired
    DecorateDao decorateDao;

    @Override
    public DataWrapper<Void> updateTitle(String path, CommonsMultipartFile file, String shopId) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        String name = file.getOriginalFilename();
        String suffix = name.substring(name.lastIndexOf("."), name.length());
        try {
            FileUtil.upload(file, path, "title" + suffix);
            int i = decorateDao.updateTitle(shopId, path + "title" + suffix);
            if (i != 1) {
                dataWrapper.setErrorCode(ErrorCodeEnum.Error);
            }
        } catch (IOException e) {
            e.printStackTrace();
            dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> addNavigation(Map<String, String> navigation) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = decorateDao.addNavigation(navigation);
        if (i != 1){
            dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> updateNavigation(Map<String, String> navigation) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = decorateDao.updateNavigation(navigation);
        if (i != 1){
            dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> deleteNavigation(String navigationId) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = decorateDao.deleteNavigation(navigationId);
        if (i != 1){
            dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return dataWrapper;
    }

    @Override
    public DataWrapper<Void> addGoodsToNvg(Map<String, String> nvgContent) {
        DataWrapper<Void> dataWrapper = new DataWrapper<Void>();
        int i = decorateDao.addGoodsToNvg(nvgContent);
        if (i != 1){
            dataWrapper.setErrorCode(ErrorCodeEnum.Error);
        }
        return dataWrapper;
    }
}
