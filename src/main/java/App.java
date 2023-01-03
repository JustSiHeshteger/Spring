import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanFirst =
                applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld beanSecond =
                applicationContext.getBean("helloworld", HelloWorld.class);
        Cat catFirst =
                applicationContext.getBean("cat", Cat.class);
        Cat catSecond =
                applicationContext.getBean("cat", Cat.class);

        System.out.println(beanFirst == beanSecond); //true
        System.out.println(catFirst == catSecond);   //false

        System.out.println(beanFirst.getMessage());
    }
}