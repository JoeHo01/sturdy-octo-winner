
    /**
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/updateTitle 更新标题图片
     * @apiName updateTitle
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-更新标题栏
     *
     * @apiParam {String} token     not_null | 身份验证
     * @apiParam {String} shopId    not_null | 店铺ID
     * @apiParam {File}   titleImg  not_null | 标题图片
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/addNavigation 添加导航栏
     * @apiName addNavigation
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-添加导航栏
     *
     * @apiParam {String} token     not_null | 身份验证
     * @apiParam {String} shopId    not_null | 店铺ID
     * @apiParam {String} name      not_null | 导航栏名称
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/updateNavigation 编辑导航栏
     * @apiName updateNavigation
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-编辑导航栏
     *
     * @apiParam {String} token             not_null | 身份验证
     * @apiParam {String} navigationId      not_null | 导航栏ID
     * @apiParam {String} name              nullable | 导航栏名称
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/deleteNavigation 删除导航栏
     * @apiName deleteNavigation
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-删除导航栏
     *
     * @apiParam {String} token             not_null | 身份验证
     * @apiParam {String} navigationId      not_null | 导航栏ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/updateGoodsInNvg 更新导航栏内容
     * @apiName updateGoodsInNvg
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-添加/修改/删除导航栏内容
     *
     * @apiParam {String} token             not_null | 身份验证
     * @apiParam {String} navigationId      not_null | 导航栏ID
     * @apiParam {String} displayType       not_null | 展示方式(1大图显示, 2小图显示)
     * @apiParam {String} goodsId           not_null | 商品ID(多个以","分隔. 例: 1,2,3)
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/addSlideshow 添加轮播区图片
     * @apiName addSlideshow
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-添加轮播区图片
     *
     * @apiParam {String} token         not_null | 身份验证
     * @apiParam {String} shopId        not_null | 商店ID
     * @apiParam {File}   slideImg      not_null | 轮播图片
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/updateSlideshow 更新轮播区图片
     * @apiName updateSlideshow
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-编辑轮播区图片
     *
     * @apiParam {String} token         not_null | 身份验证
     * @apiParam {String} slideshowId   not_null | 轮播区ID
     * @apiParam {File}   slideImg      not_null | 轮播图片
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/deleteSlideshow 删除轮播区图片
     * @apiName deleteSlideshow
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-删除轮播区图片
     *
     * @apiParam {String} token         not_null | 身份验证
     * @apiParam {String} slideshowId   not_null | 轮播区ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/addDisplay 添加展示区
     * @apiName addDisplay
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-添加展示区
     *
     * @apiParam {String} token         not_null | 身份验证
     * @apiParam {String} shopId        not_null | 店铺ID
     * @apiParam {File}   displayImg    not_null | 展示图片
     * @apiParam {String} goodsId       not_null | 链接商品ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/updateDisplay 编辑展示区
     * @apiName updateDisplay
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-编辑展示区
     *
     * @apiParam {String} token         not_null | 身份验证
     * @apiParam {String} displayId     not_null | 展示区
     * @apiParam {File}   displayImg    nullable | 展示图片
     * @apiParam {String} goodsId       not_null | 链接商品ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/deleteDisplay 删除展示区
     * @apiName deleteDisplay
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-删除展示区
     *
     * @apiParam {String} token      not_null | 身份验证
     * @apiParam {String} displayId  not_null | 展示区ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/addGoodsOnMain 添加首页商品展示栏
     * @apiName addGoodsOnMain
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-添加首页商品展示栏
     *
     * @apiParam {String} token      not_null | 身份验证
     * @apiParam {String} shopId     not_null | 店铺ID
     * @apiParam {String} name       not_null | 栏位名称
     * @apiParam {String} goodsId    not_null | 商品ID(多个商品以","隔开. 例: 1,2,3)
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/updateGoodsColumn 编辑首页商品展示栏
     * @apiName updateGoodsColumn
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-编辑首页商品展示栏
     *
     * @apiParam {String} token             not_null | 身份验证
     * @apiParam {String} goodsColumnId     not_null | 栏位ID
     * @apiParam {String} name              nullable | 栏位名称
     * @apiParam {String} goodsId           nullable | 商品ID(多个商品以","隔开. 例: 1,2,3)
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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
     * @api {post} http://localhost:8080/we_shop/api/store/decorate/deleteGoodsColumn 删除首页商品展示栏
     * @apiName deleteGoodsColumn
     * @apiGroup Decorate
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-装修商店-删除首页商品展示栏
     *
     * @apiParam {String} token             not_null | 身份验证
     * @apiParam {String} goodsColumnId     not_null | 栏位ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:null,
     * page:null
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