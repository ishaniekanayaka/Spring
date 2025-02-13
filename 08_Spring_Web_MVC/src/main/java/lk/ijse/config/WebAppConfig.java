package lk.ijse.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// ====================child context ===========

//Spring container එකට spring beans(POJOs) වැටෙන්න ඕන විදිය කියන class එකක්.
//(Bean definition වලට source එකක්)
@Configuration
@EnableWebMvc
//configuration class එකට Beans scan කරන්න ඕන path එක කොහෙද කියල කියනො.
@ComponentScan(basePackages = {"lk.ijse.controller", "lk.ijse.bean"})


public class WebAppConfig implements WebMvcConfigurer {
    @Bean

    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp"); // methana dena file warge nama denna oni jsp ekak nam .jsp kiyaa
        viewResolver.setOrder(2);
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/views/**")
                .addResourceLocations("/WEB-INF/views/");
    }
}
