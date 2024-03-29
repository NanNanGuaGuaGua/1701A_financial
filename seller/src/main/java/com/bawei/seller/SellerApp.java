package com.bawei.seller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * SellerApp$
 *
 * @author NanGua
 * @date 2019/9/13$
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SellerApp {

    public static void main(String[] args) {
        SpringApplication.run(SellerApp.class,args);
    }
}
