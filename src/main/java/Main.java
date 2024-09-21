import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Создание контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получение бина Person
        Person person = context.getBean(Person.class);

        // Печать информации о Person
        System.out.println(person);
    }
}

