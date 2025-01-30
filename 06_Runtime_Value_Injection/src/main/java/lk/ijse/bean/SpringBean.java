package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("Ishuu")
    private String name;

    public SpringBean(){
        System.out.println("Spring bean Constructor");
        System.out.println(name); //me welwedi mek satisfied karala na eky methndi ek nowenne =populate properties
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println(name);
    }
   /* @Autowired(required = false)
    public SpringBean(@Value("Ishani") String name, @Value("5") int id,@Value("true") boolean b){

        System.out.println("Spring bean");
        System.out.println(name);
        System.out.println(id);
        System.out.println(b);
    }

    @Autowired(required = false)
    public SpringBean(@Value("Ishani") String name,@Value("true") boolean b){

        System.out.println("Spring bean");
        System.out.println(name);

        System.out.println(b);
    }*/



}
