
    /**
     * @api {get} http://localhost:8080/we_shop/api/customer/order/getQuery 查询订单列表
     * @apiName query
     * @apiGroup Order
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-全部订单/待付款/配送中/已完成/售后服务
     *
     * @apiParam {String} openid        not_null | 微信用户ID
     * @apiParam {String} orderState    not_null | 订单状态(全部订单:0 待付款:1 配送中:2 已完成:3,5 售后服务:4)
     * @apiParam {String} startTime     nullable | 起始时间(格式 "yyyy-MM-dd HH:mm:ss")
     * @apiParam {String} endTime       nullable | 结束时间(格式 "yyyy-MM-dd HH:mm:ss")
     * @apiParam {String} pageSize      nullable | 每页项数
     * @apiParam {String} currentPage   nullable | 当前页码
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data(List):{
     *      orderId:1 (订单ID),
     *      code:"" (订单编号),
     *      state:1 (1:未付款 2:已付款未收货 3:已收货未售后 4:售后处理中 5:订单结束 6:已删除),
     *      payTime:1499919609000 (下单时间 以付款时间为准),
     *      size:1 (商品总数),
     *      price:100.00 (订单总价 含运费),
     *      freight:10.00 (运费),
     *
     *      orderDetail(List):{
     *      orderDetailId:1 (子订单ID),
     *      state:1 (1:未申请售后 2:申请售后-商家未确认 3:已确认售后-售后未完成 4:已完成售后),
     *      img:"api/goods/01img.png",
     *      }
     * }
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
