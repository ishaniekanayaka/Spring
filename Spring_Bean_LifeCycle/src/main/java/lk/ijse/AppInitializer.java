package lk.ijse;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.TestBean1;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

      /*  TestBean1 ref1 = context.getBean(TestBean1.class);
        System.out.println(ref1);
        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        MyConnection myConnection2 = context.getBean(MyConnection.class);

        System.out.println(myConnection1);
        System.out.println(myConnection2);*/
        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println("---------------------------");
        MyConnection myConnection1 = context.getBean(MyConnection.class);
        context.registerShutdownHook(); //meka comment kroth destroy eka print wenne na
    }
}
