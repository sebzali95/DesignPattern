package org.example.factory;

public class Main {
    public static void main(String[] args) {
        var userFactory = new UserFactory();
        User user = userFactory.createUser(UserType.TEACHER);
        user.save("İlkin");

        User user2 = userFactory.createUser(UserType.STUDENT);
        user2.save("Səbzalı");

    }
}
