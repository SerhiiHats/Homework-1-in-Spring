package with_Spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import with_Spring.models.impl.UserImpl;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        UserImpl user1 = ctx.getBean("sergey", UserImpl.class);
        System.out.println("name user: " + user1.getName());
        System.out.println("address: " + user1.getAddress().getTown() + " " + user1.getAddress().getStreet() + " " + user1.getAddress().getBuilding());
        System.out.println("wife: " + user1.getWife().getName());
        System.out.println("child: " + user1.getChild().getName());

        System.out.println();

        UserImpl user2 = ctx.getBean("oleg", UserImpl.class);
        System.out.println("name user: " + user2.getName());
        System.out.println("address: " + user2.getAddress().getTown() + " " + user2.getAddress().getStreet() + " " + user2.getAddress().getBuilding());
        System.out.println("wife: " + user2.getWife().getName());
        System.out.println("child: " + user2.getChild().getName());

    }
}
