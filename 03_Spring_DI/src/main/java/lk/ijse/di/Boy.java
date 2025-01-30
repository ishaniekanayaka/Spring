package lk.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope*/
@Component
public class Boy implements DI {
   // @Autowired
    Aggrement girl;

    //@Autowired
    /*public Boy(Aggrement girl){
        this.girl = girl;
    }*/

    @Autowired // setter method walata mee anotation eka naiwren dnn oni.
    public void  setter(Aggrement girl){
        this.girl = girl;
    }

    public void chatWithGirl(){
        girl.Chat();
    }

    @Autowired
    @Override
    public void inject(Aggrement aggrement) {
        this.girl = aggrement;
    }
}
