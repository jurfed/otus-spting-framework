package homework1.service;

import homework1.dao.TestDao;
import homework1.user.SimpleUser;
import homework1.user.UserDao;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service("myService1")
public class SimpleService implements ServiceInterface {

//    @Autowired
    TestDao testDao;

    String name;

    UserDao userDao;

    @Autowired
    public void bla_bla_bla(TestDao testDao){
        this.testDao = testDao;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public TestDao getTestDao() {
        return testDao;
    }

    public void enterYouName() throws IOException {
        System.out.println("Please enter your name\n");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        userDao = new SimpleUser(name);
        System.out.println("Hello! " + name);
    }

    public void startTests() {
        userDao.setCorrectQuestions(0);
        List<String[]> testSize = testDao.getTests();

        testSize.forEach(strings -> {
            System.out.println("вопрос номер " + strings[0]);
            System.out.println(strings[1]);
            System.out.print(strings[2] + ", " + strings[3] + ", " + strings[4] + " \n");
            Scanner scanner = new Scanner(System.in);
            String markedQuestion = scanner.nextLine();
            checkQuestion(markedQuestion, strings[4]);
        });

        System.out.println("Dear " + userDao.getName() + "!");
        System.out.println("Your result is: " + userDao.getCorrectQuestions() +" correct answers");

    }

    public void checkQuestion(String a, String b){
        if(a.equals(b)){
            userDao.setCorrectQuestions(userDao.getCorrectQuestions()+1);
        }
    }

}
