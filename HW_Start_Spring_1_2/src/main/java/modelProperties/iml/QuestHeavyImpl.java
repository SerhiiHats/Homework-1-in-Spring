package modelProperties.iml;

import modelProperties.Quest;

public class QuestHeavyImpl implements Quest {

    @Override
    public void move() {
        System.out.println("QuestHeavyImpl void move(): Рыцарь передвигается на коне и колеснице");
    }

    @Override
    public void fight() {
        System.out.println("QuestHeavyImpl void fight(): Рыцарь дерется на мечах, копьях и владеет арбалетом");
    }

    @Override
    public void amulet() {
        System.out.println("QuestHeavyImpl void amulet(): Рыцарь одет в металлические доспехи");
    }

    @Override
    public void hunt() {
        System.out.println("QuestHeavyImpl void amulet(): Рыцарь охотится на оленя");
    }
}
