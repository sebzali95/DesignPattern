package org.example.factory;

public class UserFactory {

    public User createUser(UserType userType) {
        if (userType == UserType.TEACHER) {
            return new Teacher();
        } else if (userType == UserType.STUDENT) {
            return new Student();
        }
        return null;
    }
}
