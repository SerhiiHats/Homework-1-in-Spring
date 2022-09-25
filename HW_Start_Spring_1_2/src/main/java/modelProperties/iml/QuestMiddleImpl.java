package modelProperties.iml;

import modelProperties.Quest;

public class QuestMiddleImpl implements Quest {

    @Override
    public void move() {
        System.out.println("QuestMiddleImpl void move(): Рыцарь передвигается на коне");
    }

    @Override
    public void fight() {
        System.out.println("QuestMiddleImpl void fight(): Рыцарь дерется на копьях");
    }

    @Override
    public void amulet() {
        System.out.println("QuestMiddleImpl void amulet(): Рыцарь одет в кожаные доспехи");
    }

    @Override
    public void hunt() {
        System.out.println("QuestMiddleImpl void amulet(): Рыцарь охотится на кабана");
    }
}
