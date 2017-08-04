
    /**
     * @api {get} http://localhost:8080/we_shop/api/customer/shop/getTitile 获取店铺标题
     * @apiName getTitile
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 店铺首页
     *
     * @apiParam {String} shopId  not_null | 店铺ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:{
     *      titleImg:"api/title/01img.png"
     *      }
     * page:{
     *      numberPerPage:0,
     *      currentPage:0,
     *      totalNumber:0,
     *      totalPage:0
     *      }
     * }
     * @apiSuccessExample {json} Error-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * token:null,
     * data:null,
     * page:null
     * }
     *
     */

    /**
     * @api {get} http://localhost:8080/we_shop/api/customer/shop/getNavigation 获取导航栏
     * @apiName getNavigation
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 店铺首页
     *
     * @apiParam {String} shopId  not_null | 店铺ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data(List):{
     *      navigationId:1,
     *      name:"首页"
     *      }
     * page:{
     *      numberPerPage:0,
     *      currentPage:0,
     *      totalNumber:0,
     *      totalPage:0
     *      }
     * }
     * @apiSuccessExample {json} Error-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * token:null,
     * data:null,
     * page:null
     * }
     *
     */

    /**
     * @api {get} http://localhost:8080/we_shop/api/customer/shop/getSlideshow 获取轮播区
     * @apiName getSlideshow
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 店铺首页
     *
     * @apiParam {String} shopId  not_null | 店铺ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data(List):{
     *      slideId:1
     *      slideImg:"api/slide/01img.png"
     *      }
     * page:{
     *      numberPerPage:0,
     *      currentPage:0,
     *      totalNumber:0,
     *      totalPage:0
     *      }
     * }
     * @apiSuccessExample {json} Error-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * token:null,
     * data:null,
     * page:null
     * }
     *
     */

    /**
     * @api {get} http://localhost:8080/we_shop/api/customer/shop/getDisplay 获取展示区
     * @apiName getDisplay
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 店铺首页
     *
     * @apiParam {String} navigationId  not_null | 展示区ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data(List):{
     *      displayId:1
     *      displayImg:"api/display/01img.png"
     *      goods:{
     *           goodsId:1
     *           title:""
     *           introduction:""
     *           price:""
     *           }
     *      }
     * page:{
     *      numberPerPage:0,
     *      currentPage:0,
     *      totalNumber:0,
     *      totalPage:0
     *      }
     * }
     * @apiSuccessExample {json} Error-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * token:null,
     * data:null,
     * page:null
     * }
     *
     */

    /**
     * @api {get} http://localhost:8080/we_shop/api/customer/shop/getGoodsColumn 获取商品栏位
     * @apiName getGoodsColumn
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 店铺首页
     *
     * @apiParam {String} shopId  not_null | 店铺ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data(List):{
     *      goodsColumnId:1
     *      name:"当季"
     *      goods(List):{
     *           goodsId:1
     *           name:""
     *           coverImg:""
     *           price:""
     *           }
     *      }
     * page:{
     *      numberPerPage:0,
     *      currentPage:0,
     *      totalNumber:0,
     *      totalPage:0
     *      }
     * }
     * @apiSuccessExample {json} Error-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * token:null,
     * data:null,
     * page:null
     * }
     *
     */

    /**
     * @api {get} http://localhost:8080/we_shop/api/customer/shop/getNvgGoods 获取导航分页商品
     * @apiName getNvgGoods
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 店铺首页
     *
     * @apiParam {String} shopId  not_null | 店铺ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data(List):{
     *           goodsId:1
     *           title:""
     *           introduction:""
     *           coverImg:""
     *           privce:""
     *           displayType:1(展示方式-1大图显示,2小图显示)
     *      }
     * page:{
     *      numberPerPage:0,
     *      currentPage:0,
     *      totalNumber:0,
     *      totalPage:0
     *      }
     * }
     * @apiSuccessExample {json} Error-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"FAILED",
     * errorCode:"Error",
     * token:null,
     * data:null,
     * page:null
     * }
     *
     */

