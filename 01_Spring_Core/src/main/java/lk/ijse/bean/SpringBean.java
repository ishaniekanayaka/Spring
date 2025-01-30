package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component("bean")
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring bean Constructor");
    }

    public void sayHello(){
        System.out.println("Hello from Spring Bean");
    }
}
