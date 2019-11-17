package homework1.user;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Scanner;

@Component
public class SimpleUser implements UserDao{


    String name;

    public String getName() {
        return name;
    }

    int correctQuestions;

    public SimpleUser(String name) {
        this.name = name;
    }

    public int getCorrectQuestions() {
        return correctQuestions;
    }

    public void setCorrectQuestions(int correctQuestions) {
        this.correctQuestions = correctQuestions;
    }

}
