package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Qualifier("girl2")
    //Girl girl = new Girl();
   // Girl girl; //mema dunnoth nullpoint ekk enw
    @Autowired //cles eke thiyn dependancy ekk mee widiyt hdnn oni unm satisfied krnne meken (Bean factory awareveka methadi wenne
    //Girl girl; interface ekk hadapu nis dn memath ba
    Aggrement girl;


    public Boy(){
        System.out.println("boys constructor");
    }

    //tight coupling
    public void chatWithGirl(){
      //  Girl girl = new Girl();
        girl.chat();
    }
}
