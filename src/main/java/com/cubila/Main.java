package com.cubila;

import com.cubila.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;


@SpringBootApplication(scanBasePackages={"com.cubila"})
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class, DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.cubila"})
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EnableJpaRepositories(basePackages = { "com.cubila.Repository.UserRepository", "com.cubila.Service.UserService"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
