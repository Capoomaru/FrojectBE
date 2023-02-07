package com.froject.frojectbe;

import com.froject.frojectbe.dto.BigCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import utils.EnumMapperFactory;

@SpringBootApplication
public class FrojectBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrojectBeApplication.class, args);
    }

}
