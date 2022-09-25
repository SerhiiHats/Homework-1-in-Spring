package modelProperties.iml;

import modelProperties.Quest;

public class QuestEasyImpl implements Quest {

    @Override
    public void move() {
        System.out.println("QuestEasyImpl void move(): Рыцарь передвигается пешком");
    }

    @Override
    public void fight() {
        System.out.println("QuestEasyImpl void fight(): Рыцарь дерется на мечах");
    }

    @Override
    public void amulet() {
        System.out.println("QuestEasyImpl void amulet(): Рыцарь одет в повседневную одежду");
    }

    @Override
    public void hunt() {
        System.out.println("QuestEasyImpl void amulet(): Рыцарь охотится на зайца");
    }
}
