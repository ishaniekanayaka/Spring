package lk.ijse.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //constructor aye aye cl wenn gannw mema damma
public class TestBean1 {
    public TestBean1(){
        System.out.println("testbean1 constructor");
    }
}
