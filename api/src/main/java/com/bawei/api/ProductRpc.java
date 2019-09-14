package com.bawei.api;

import com.bawei.api.domian.ProductRpcReq;
import com.bawei.entity.Product;
import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.List;

@JsonRpcService("find/product")
public interface ProductRpc {
    /*
    *
    *   查询多个产品
    * */
    List<Product> queryAll(ProductRpcReq rpc);

    /*
    *   查询单个
    *
    * */
    Product queryOne(String id);

}
