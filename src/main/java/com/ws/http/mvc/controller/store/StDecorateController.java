package com.ws.http.mvc.controller.store;

import com.ws.common.response.DataWrapper;
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
 *
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
     *
     * @param shopId 商店ID
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
        String path = request.getServletContext().getRealPath("/resources/")+"/img/store/store#"+shopId+"/main/";
        return decorateService.updateTitle(path,titleImg,shopId);
    }

    /**
     *
     * @param navigation
     *      shopId:商店ID
     *      name:导航栏名称
     * @return null
     */
    @RequestMapping(value = "addNavigation", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addNavigation(
            @RequestParam Map<String,String> navigation
            ) {
        return decorateService.addNavigation(navigation);
    }

    /**
     *
     * @param navigation
     *      navigationId:导航栏ID
     *      name:导航栏名称
     * @return null
     */
    @RequestMapping(value = "updateNavigation", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> updateNavigation(
            @RequestParam Map<String,String> navigation
    ) {
        return decorateService.updateNavigation(navigation);
    }

    /**
     *
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
     *
     * @param nvgContent
     *      navigationId:导航栏ID
     *      goodsId:商品ID
     *      displayType:展示方式(1大图显示,2小图显示)
     * @return null
     */
    @RequestMapping(value = "addGoodsToNvg", method = RequestMethod.POST)
    @ResponseBody
    public DataWrapper<Void> addGoodsToNvg(
            @RequestParam Map<String,String> nvgContent
    ) {
        return decorateService.addGoodsToNvg(nvgContent);
    }
//
//    /**
//     *
//     * @param nvgContentId 导航栏内容子项ID
//     * @return null
//     */
//    @RequestMapping(value = "deleteGoodsInNvg", method = RequestMethod.POST)
//    @ResponseBody
//    public DataWrapper<Void> deleteGoodsInNvg(
//            @RequestParam String nvgContentId
//    ) {
//        return decorateService.deleteGoodsInNvg(nvgContentId);
//    }
//
//    /**
//     *
//     * @param slideshow
//     *      shopId:商店ID
//     *      slideImg:轮播图片
//     * @return
//     */
//    @RequestMapping(value = "addSlideshow", method = RequestMethod.POST)
//    @ResponseBody
//    public DataWrapper<Void> addSlideshow(
//            @RequestParam Map<String,String> slideshow
//    ) {
//        return decorateService.addSlideshow(slideshow);
//    }
}
