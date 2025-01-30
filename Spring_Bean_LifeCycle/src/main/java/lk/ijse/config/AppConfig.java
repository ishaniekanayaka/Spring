package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //destroy method ek cl wenne na
   // @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //destroy method ek cl wenw
    public MyConnection myConnection(){
        return new MyConnection();
    }
}
