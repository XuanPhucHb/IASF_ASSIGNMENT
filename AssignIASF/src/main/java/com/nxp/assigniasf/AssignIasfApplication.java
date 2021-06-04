package com.nxp.assigniasf;

import com.nxp.assigniasf.Utils.Migrate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class AssignIasfApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AssignIasfApplication.class, args);
        Migrate migrate = ctx.getBean(Migrate.class);
        migrate.dataSeeding();
    }

}
