package com.chat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<User>();
        String name;
        int age;
        for (int i = 1; i < 6; i++) {
            System.out.println("Введите имя " + i + "-го пользователя");
            name = in.nextLine();

            System.out.println("Введите возраст " + i + "-го пользователя");
            age = Integer.parseInt(in.nextLine());

            users.add(new User(name, age));
        }
        Comparator<User> ageComparator = (user1, user2) -> {
            return user1.getAge() - user2.getAge();
        };
        users.sort(ageComparator);

        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
