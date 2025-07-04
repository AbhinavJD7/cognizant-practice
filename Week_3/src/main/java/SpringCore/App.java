
package SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
       // ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorld.class); (uncomment for Example 1)
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class); // Comment this to run Example 1

        UserService userService = context1.getBean(UserService.class); // Comment this to run Example 1
        //HelloWorld helloWorld = context.getBean(HelloWorld.class); (uncomment for Example 1)
       // helloWorld.sayHello(); (uncomment for Example 1)
        userService.displayUserMessage(); // Comment this to run Example 1
    }
}
