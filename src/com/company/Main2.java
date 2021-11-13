package com.company;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {

        HashSet<User> userSet = new HashSet<>();
        User bot1 = new User("Oleg", 25, "09877654332");
        User bot2 = new User("Oleg", 25, "09877654332");
        User bot3 = new User("Oleg", 25, "09999999999");

        userSet.add(bot1);
        userSet.add(bot2);
        userSet.add(bot3);

        for (User user : userSet) {
            System.out.println(user.name + " " + user.phone + " " + user.old);
        }
    }
}
