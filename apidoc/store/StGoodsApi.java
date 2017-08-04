
    /**
     * @api {post} http://localhost:8080/we_shop/api/store/goods/add 添加商品
     * @apiName add
     * @apiGroup Goods
     * @apiVersion 0.1.0
     * @apiDescription 商品管理-添加商品
     *
     * @apiParam {String} token         not_null | 身份验证
     * @apiParam {String} shopId        not_null | 商店ID
     * @apiParam {String} title         not_null | 商品标题
     * @apiParam {String} introduction  nullable | 商品简介
     * @apiParam {String} goodsSort     not_null | 商品所属类别
     * @apiParam {String} goodsKinds    not_null | 商品规格(JSON数组的String格式. 子项-kind:规格名称,price:价格. 例:JSON.stringfy([{kind:"蓝色",price:"12.00"},{kind:"红色",price:"10.00"}]))
     * @apiParam {File}   coverImg      not_null | 封面图片
     * @apiParam {File}   displayImg    nullable | 展示图片(支持多个上传)
     * @apiParam {String} descirbes     nullable | 商品描述(JSON数组的String格式. 子项-kind:内容类型 1标题 2文本 3图片,content:内容. 例:JSON.stringfy([{kind:1,content:"正面展示"},{kind:3,content:"../img/01.png"})
     * @apiParam {File}   descirbeImg   nullable | 描述图片(支持多个上传)
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
     * @api {post} http://localhost:8080/we_shop/api/store/goods/update 编辑商品
     * @apiName update
     * @apiGroup Goods
     * @apiVersion 0.1.0
     * @apiDescription 商品管理-编辑商品
     *
     * @apiParam {String} token         not_null | 身份验证
     * @apiParam {String} goodsId       not_null | 商品ID
     * @apiParam {String} title         nullable | 商品标题
     * @apiParam {String} introduction  nullable | 商品简介
     * @apiParam {String} goodsSort     nullable | 商品所属类别
     * @apiParam {String} goodsKinds    nullable | 商品规格(JSON数组的String格式. 子项-kind:规格名称,price:价格. 例:JSON.stringfy([{kind:"蓝色",price:"12.00"},{kind:"红色",price:"10.00"}]))
     * @apiParam {File}   coverImg      nullable | 封面图片
     * @apiParam {File}   displayImg    nullable | 展示图片(支持多个上传)
     * @apiParam {String} descirbes     nullable | 商品描述(JSON数组的String格式. 子项-kind:内容类型 1标题 2文本 3图片,content:内容. 例:JSON.stringfy([{kind:1,content:"正面展示"},{kind:3,content:"../img/01.png"})
     * @apiParam {File}   descirbeImg   nullable | 描述图片(支持多个上传)
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
     * @api {post} http://localhost:8080/we_shop/api/store/goods/delete 删除商品
     * @apiName delete
     * @apiGroup Goods
     * @apiVersion 0.1.0
     * @apiDescription 商品管理-删除商品
     *
     * @apiParam {String} token     not_null | 身份验证
     * @apiParam {String} goodsId   not_null | 商品ID
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
