package lk.ijse.config;


import lk.ijse.bean.SpringBeanThree;
import lk.ijse.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
   /* @Bean
    public SpringBeanTwo getSpringBeanTwo(){  //bean ekak athule thawath bean ekak inject karala - interbean
        SpringBeanThree springBeanThree = new SpringBeanThree();
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree getSpringBeanThree(){
        return new SpringBeanThree();
    }*/

    /* @Bean
    public SpringBeanTwo getSpringBeanTwo(){
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree getSpringBeanThree(){
        return new SpringBeanThree();
    }*/
}
