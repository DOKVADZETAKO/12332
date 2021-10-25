package DataObject;

import com.github.javafaker.Faker;

public interface RegisterPageData {
    Faker faker = new Faker();

    String
            firstName = "tako",
            lastName = "Dokvadze",
            phoneNumber = "568818998",
            password = "test",
            birthDay = faker.number().digits(1),
            birthMonth = "Dec",
            birthYear = "19" + faker.number().digits(2),
            selectPronoun = "She: \"Wish her a happy birthday!\"";

}
