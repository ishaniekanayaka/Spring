package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
@ComponentScan(basePackageClasses = TestBean1.class)
public class AppConfig {
    //@Bean("bean2")
    @Bean
    public MyConnection getConnection(){
        return new MyConnection();

    }

    /*public AppConfig() {
        System.out.println("App Config Construct...");
    }*/
}
