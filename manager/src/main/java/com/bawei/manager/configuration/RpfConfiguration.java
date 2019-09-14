package com.bawei.manager.configuration;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RpfConfiguration$
 *
 * @author NanGua
 * @date 2019/9/13$
 */
@Configuration
public class RpfConfiguration {

    @Bean
    public AutoJsonRpcServiceImplExporter rpcServiceImplExporter(){
        return new AutoJsonRpcServiceImplExporter();
    }

}
