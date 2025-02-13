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
@Configuration//Beans, Spring Container එකට scan කරල දෙන්නෙ configuration class එකක් හරහා

@EnableWebMvc
//configuration class එකට Beans scan කරන්න ඕන path එක කොහෙද කියල කියනො.
@ComponentScan(basePackages = "lk.ijse.controller")


public class WebAppConfig implements WebMvcConfigurer {

}
