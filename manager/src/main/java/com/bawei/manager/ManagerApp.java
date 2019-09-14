package com.bawei.manager;

import com.bawei.swagger.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EntityScan({"com.bawei.entity"})
@Import(SwaggerConfiguration.class)
public class ManagerApp {

    public static void main(String[] args) {
        SpringApplication.run(ManagerApp.class,args);
    }
}
