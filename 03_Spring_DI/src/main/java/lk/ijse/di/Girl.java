package lk.ijse.di;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Aggrement{
    @Override
    public void Chat() {
        System.out.println("Girl Chat");
    }
}
