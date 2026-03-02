package car.example.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBean.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}
