package com.bawei.seller.configuration;

import com.bawei.api.ProductRpc;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * RpcConfiguration$
 *
 * @author NanGua
 * @date 2019/9/13$
 */
@Configuration
@Slf4j
@ComponentScan(basePackageClasses = {ProductRpc.class})
public class RpcConfiguration {


    @Bean
    public AutoJsonRpcClientProxyCreator rpcClientProxyCreator(@Value("${rpc.manager.url}") String url){
        AutoJsonRpcClientProxyCreator creator = new AutoJsonRpcClientProxyCreator();
        try {
            creator.setBaseUrl(new URL(url));
        } catch (MalformedURLException e) {
            log.error("创建rpc服务地址错误，", e);
            e.printStackTrace();
        }
        creator.setScanPackage(ProductRpc.class.getPackage().getName());
        return creator;
    }


}
