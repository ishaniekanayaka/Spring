package lk.ijse;

import lk.ijse.bean.*;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();
/*
       *//* SpringBean springBean = new SpringBean();  === mema dammoth constructor ek 2sarayak cl wenw. component annotation ek nis thmy ema wenne*//*
        SpringBean springBean = context.getBean(SpringBean.class);
        springBean.sayHello();

        System.out.println(springBean);
        *//*TestBean1 testBean1 = new TestBean1();*//*
        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1);

        TestBean2 testBean2 = context.getBean(TestBean2.class);
        System.out.println(testBean2);

*//*
        Runtime.getRuntime().addShutdownHook(new Thread(){

            public void run() {
                System.out.println("shutting down...");
                context.close();
            }
        });*//*
        context.registerShutdownHook();
        TestBean3 testBean3 = context.getBean(TestBean3.class);
        System.out.println(testBean3);*/

     /*   *//*=====bean ekak request karana akara==============*//*
       // Object bean = context.getBean("springBean"); //springbean== bean eke id eka. cls eke name eken request karata first letter eka simple wenn oni
        Object bean = context.getBean("bean"); //anotation eke dapu eka danna oni
        System.out.println(bean);

        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1");
        System.out.println(testBean1);

        TestBean2 testBean2 =context.getBean("testBean2", TestBean2.class);
        System.out.println(testBean2);
*/

      //  MyConnection connection = context.getBean("bean2", MyConnection.class);
        /*MyConnection connection = (MyConnection) context.getBean("getConnection"); //bean eke id eka wens krnwnm attribute ekk wiidyt bean ekt wtenn pni nama dnn oni

        System.out.println(connection);
        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1");
        System.out.println(testBean1);*/


        //singlton behavioour ekk pennw. ekama address eka print wenw
        //bean eka bydefault singlton
        TestBean1 ref1 = context.getBean(TestBean1.class);
        System.out.println(ref1);
        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);
        TestBean1 ref3 = context.getBean(TestBean1.class);
        System.out.println(ref3);

        MyConnection ref4 = context.getBean(MyConnection.class);
        System.out.println(ref4);
        MyConnection ref5 = context.getBean(MyConnection.class);
        System.out.println(ref5);

        context.registerShutdownHook();
    }
}
