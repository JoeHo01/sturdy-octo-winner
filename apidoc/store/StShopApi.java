
    /**
     * @api {post} http://localhost:8080/we_shop/api/store/shop/add 添加商店
     * @apiName add
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-创建商店
     *
     * @apiParam {String} token         not_null | 商家身份验证
     * @apiParam {String} name          not_null | 商店名称
     * @apiParam {String} shopTypeId    not_null | 主营商品类型ID
     * @apiParam {String} areaId        not_null | 城区ID
     * @apiParam {String} address       not_null | 地址描述
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
     * @api {post} http://localhost:8080/we_shop/api/store/shop/delete 删除商店
     * @apiName delete
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-创建商店
     *
     * @apiParam {String} token     not_null | 商家身份验证
     * @apiParam {String} shopId    not_null | 商店ID
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
     * @api {post} http://localhost:8080/we_shop/api/store/shop/update 修改商店
     * @apiName update
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-商店列表-修改商店
     *
     * @apiParam {String} token     not_null | 商家身份验证
     * @apiParam {String} shopId    not_null | 商店ID
     * @apiParam {String} name      not_null | 商店名称
     * @apiParam {String} areaId    not_null | 城区ID
     * @apiParam {String} address   not_null | 商店地址
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
     * @api {get} http://localhost:8080/we_shop/api/store/shop/getQuery 查询商店
     * @apiName query
     * @apiGroup Shop
     * @apiVersion 0.1.0
     * @apiDescription 个人管理-商店列表
     *
     * @apiParam {String} token         not_null | 商家身份验证
     * @apiParam {String} name          nullable | 商店名称
     * @apiParam {String} areaId        nullable | 城区ID
     * @apiParam {String} pageSize      nullable | 每页项数
     * @apiParam {String} currentPage   nullable | 当前页码
     *
     * @apiSuccessExample Success-Response:
     * HTTP/1.1 200 OK
     * {
     * callStatus:"SUCCEED"
     * errorCode:"No_Error"
     * token:null
     * data:{
     *      shopId:1
     *      name:""
     *      areaId:"110101"
     *      areaName:"北京市市辖区东城区"
     *      address:""
     *      shopTypeId:1
     *      shopTypeName:""
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
     * callStatus:"FAILED"
     * errorCode:"Error"
     * token:null
     * data:null
     * page:null
     * }
     *
     */