package no_Spring;

import no_Spring.entitys.AddressUser;
import no_Spring.entitys.ChildUser;
import no_Spring.entitys.User;
import no_Spring.entitys.WifeUser;

public class Main {
    public static void main(String[] args) {
        AddressUser addressUser = new AddressUser(1, "65000", "Ukraine", "Odessa", "Arnautskaya str.", "25B", "125g");
        WifeUser wifeUser = new WifeUser(2, "Anastasiya");
        ChildUser childUser = new ChildUser(1, "Bogdan");
        User user = new User(1, "Ivan", addressUser, wifeUser, childUser);

        System.out.println("name user: " + user.getName());
        System.out.println("address: " + user.getAddress().getCountry() + " " + user.getAddress().getTown() + " " + user.getAddress().getBuilding());
        System.out.println("wife: " + user.getWife().getName());
        System.out.println("child: " + user.getChild().getName());

    }

}
