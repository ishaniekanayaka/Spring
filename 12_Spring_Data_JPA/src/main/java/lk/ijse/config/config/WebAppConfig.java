package lk.ijse.config.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/customer/**")
                .allowedOrigins("*")//allowedOrigins("localhost:63342")///allowedOrigins("http://IshaniEkanayaka.lk")//// allowedOrigins("http://test.example.com")
                .allowCredentials(true)
                .allowedMethods("GET","POST","DELETE","PUT")
                .allowedHeaders("*");
    }

    /*@Bean

    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".html"); // methana dena file warge nama denna oni jsp ekak nam .jsp kiyaa
        viewResolver.setOrder(2);
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/views/**")
                .addResourceLocations("/WEB-INF/views/");
    }*/
}
