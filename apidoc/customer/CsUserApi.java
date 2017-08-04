
    /**
     * @api {post} http://localhost:8080/we_shop/api/customer/user/addAddress 添加地址
     * @apiName addAddress
     * @apiGroup User
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-添加地址,提交订单-选择地址-添加地址
     *
     * @apiParam {String} openid        not_null | 微信用户ID
     * @apiParam {String} areaId        not_null | 城区ID
     * @apiParam {String} describes     not_null | 地址描述
     * @apiParam {String} phone         not_null | 手机号
     * @apiParam {String} name          not_null | 收货人
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