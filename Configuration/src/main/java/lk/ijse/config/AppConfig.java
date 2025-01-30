package lk.ijse.config;


import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(basePackages = "lk.ijse.bean") //bean komada context ekata wtenne kiyala methanin kiyanne
@Import(AppConfig1.class)

//--------root---
//@ImportResource("classPath:abc.xml")//xml based conf cls eka root ekenm thiyenne cls path kiyl denn puluwn
//---------if not root-----
//@ImportResource("file:absolute-path-of-abc.xml")//xml based conf cls eka root eke newenm thiynn
public class AppConfig {
    @Bean
    public SpringBean getSpringBean(){
        return new SpringBean();
    }

    //eka conf cls ekak athulin thawa configuration cls ekak invoke karanna puluwn
    //ekata api @Inport use krnw
}
