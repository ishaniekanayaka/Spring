package lk.ijse;


import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        Map<String,String> env = System.getenv();
       /* for (String key : env.keySet()) {
            System.out.println(key + " : " + env.get(key));
        }*/
        System.out.println(env.get("PROCESSOR_LEVEL"));
        context.registerShutdownHook();
    }
}
