package com.bawei.seller.service;

import com.bawei.api.ProductRpc;
import com.bawei.api.domian.ProductRpcReq;
import com.bawei.entity.Product;
import com.bawei.entity.enums.ProductStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * ProductRpcService$
 *
 * @author NanGua
 * @date 2019/9/14$
 */
@Service
@Slf4j
public class ProductRpcService {


    @Autowired
    private ProductRpc productRpc;

    /**
     * 查询全部
     */

    public List<Product> findAll(){
        ProductRpcReq productRpcReq = new ProductRpcReq();
        List<String> status = new ArrayList();
        status.add(ProductStatus.IN_SELL.name());
        productRpcReq.setStatusList(status);
        log.info("rep，查询全部商品请求"+productRpcReq);
        List<Product> products = productRpc.queryAll(productRpcReq);
        log.info("rpc查询全部结果",products);
        return products;
    }

}
