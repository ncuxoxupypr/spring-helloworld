import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean(Cat.class);
        Cat cat1 = (Cat) applicationContext.getBean(Cat.class);

        System.out.println("equals one " + (bean == bean1));
        System.out.println("equals two " + (cat == cat1));

        System.out.println(bean.getMessage());
    }
}