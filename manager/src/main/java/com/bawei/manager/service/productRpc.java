package com.bawei.manager.service;

import com.bawei.api.ProductRpc;
import com.bawei.api.domian.ProductRpcReq;
import com.bawei.entity.Product;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * productRpc$
 *
 * @author shuai
 * @date 2019/9/13$
 */
@AutoJsonRpcServiceImpl
@Service
@Slf4j
public class productRpc implements ProductRpc {

    @Autowired
    ProductService productService;


    @Override
    public List<Product> queryAll(ProductRpcReq rpc) {
        log.info("查询多个商品");
        Pageable pageable = new PageRequest(0,100, Sort.Direction.DESC,"rewardRate");
        Page<Product> query = productService.query(rpc.getIdList(), rpc.getMinRewardRate(), rpc.getMaxRewardRate(), rpc.getStatusList(), pageable);
        log.info("查询多个商品结果"+query);
        return query.getContent();
    }

    @Override
    public Product queryOne(String id) {

        log.info("查询单个商品");
        Product one = productService.findOne(id);
        log.info("查询单个商品结果"+one);
        return one;
    }
}
