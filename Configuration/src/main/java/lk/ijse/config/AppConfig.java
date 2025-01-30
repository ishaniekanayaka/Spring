package lk.ijse.config;


import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean") //bean komada context ekata wtenne kiyala methanin kiyanne
public class AppConfig {
    @Bean
    public SpringBean getSpringBean(){
        return new SpringBean();
    }
}
