package lk.ijse.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Girl1 implements Aggrement{

    public Girl1(){
        System.out.println("Girl Constructor");
    }

    @Override
    public void chat() {
        System.out.println("girl1 chat");
    }
}
