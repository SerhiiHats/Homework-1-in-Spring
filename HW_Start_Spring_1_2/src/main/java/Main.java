import models.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        String[] allQuestImpl = {"questEasy", "questMiddle", "questHeavy"};

        for (String levelQuest : allQuestImpl) {
            System.out.println("Knight: " + levelQuest);
            Knight knight = ctx.getBean(levelQuest, Knight.class);
            knight.getQuest().move();
            knight.getQuest().amulet();
            knight.getQuest().fight();
            knight.getQuest().hunt();
        }

    }
}
