package aspect.otus.spring03.dao;

import org.springframework.stereotype.Repository;
import aspect.otus.spring03.domain.Person;

@Repository
public class PersonDaoSimple implements PersonDao {


    public Person findByName(String name) {
        return new Person(name, 18);
    }

    @Override
    public Long findById(Long id) throws Exception {
        return id;
    }

    public Person findByName2(String name) throws Exception {
       throw new Exception();
    }

}
