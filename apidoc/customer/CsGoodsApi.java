
    /**
     * @api {get} http://localhost:8080/we_shop/api/customer/goods/getQuery 获取查询商品
     * @apiName getQuery
     * @apiGroup Goods
     * @apiVersion 0.1.0
     * @apiDescription 全部商品,查询商品
     *
     * @apiParam {String} shopId        not_null | 店铺ID
     * @apiParam {String} goodsSort     nullable | 商品类别
     * @apiParam {String} title         nullable | 商品名称
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data(List):{
     *      goodsId:1
     *      goodsSort:1
     *      title:""
     *      introduction:""
     *      coverImg:""
     *      price:""
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
     * @api {get} http://localhost:8080/we_shop/api/customer/goods/getDetail 获取商品详情
     * @apiName getDetail
     * @apiGroup Goods
     * @apiVersion 0.1.0
     * @apiDescription 商品详情页
     *
     * @apiParam {String} goodsId  nullable | 商品ID
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED",
     * errorCode:"No_Error",
     * token:null,
     * data:{
     *      goodsId:1
     *      goodsSort:1
     *      title:""
     *      introduction:""
     *      coverImg:""
     *      displayImg(List):""
     *      goodsKinds(List):{
     *          kind:""
     *          price:""
     *          }
     *      describes(List):{
     *          kind:1
     *          content:""
     *          }
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
