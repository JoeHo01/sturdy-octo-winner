package com.ws.http.mvc.controller.store;

import com.ws.common.response.DataWrapper;
import com.ws.http.annotation.Logger;
import com.ws.http.mvc.service.DecorateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Jo on 2017/7/25.
 */
@RequestMapping("api/store/decorate")
@Controller
public class StDecorateController {
    private final
    DecorateService decorateService;

    @Autowired
    public StDecorateController(DecorateService decorateService) {
        this.decorateService = decorateService;
    }

    /**
     * @param shopId   商店ID
     * @param titleImg 标题图片
     * @return null
     */
    @RequestMapping(value = "updateTitle", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateTitle(
            HttpServletRequest request,
            @RequestParam("shopId") String shopId,
            @RequestParam("titleImg") CommonsMultipartFile titleImg
    ) {
        return decorateService.updateTitle(request, shopId, titleImg );
    }

    /**
     * @param navigation shopId:商店ID
     *                   name:导航栏名称
     * @return null
     */
    @RequestMapping(value = "addNavigation", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addNavigation(
            @RequestParam Map<String, String> navigation
    ) {
        return decorateService.addNavigation(navigation);
    }

    /**
     * @param navigation navigationId:导航栏ID
     *                   name:导航栏名称
     * @return null
     */
    @RequestMapping(value = "updateNavigation", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateNavigation(
            @RequestParam Map<String, String> navigation
    ) {
        return decorateService.updateNavigation(navigation);
    }

    /**
     * @param navigationId:导航栏ID
     * @return null
     */
    @RequestMapping(value = "deleteNavigation", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> deleteNavigation(
            @RequestParam("navigationId") String navigationId
    ) {
        return decorateService.deleteNavigation(navigationId);
    }

    /**
     * 添加/编辑/删除 导航栏内容
     *
     * @param nvgContent navigationId:导航栏ID
     *                   displayType:展示方式(1大图显示,2小图显示)
     *                   goodsId:商品ID
     * @return null
     */
    @RequestMapping(value = "updateGoodsToNvg", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateGoodsToNvg(
            @RequestParam Map<String, String> nvgContent
    ) {
        return decorateService.updateGoodsToNvg(nvgContent);
    }

    /**
     * @param slideshowId 轮播区ID
     * @param slideImg    轮播图片
     * @return
     */
    @RequestMapping(value = "updateSlideshow", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateSlideshow(
            HttpServletRequest request,
            @RequestParam("slideshowId") String slideshowId,
            @RequestParam("slideImg") CommonsMultipartFile slideImg
    ) {
        return decorateService.updateSlideshow(request, slideshowId, slideImg);
    }

    public DataWrapper<Void> addSlideshow(
            HttpServletRequest request,
            @RequestParam("shopId") String shopId,
            @RequestParam("slideImg") CommonsMultipartFile[] slideImg
    ){
        return decorateService.addSlideshow(request,shopId,slideImg);
    }


}
