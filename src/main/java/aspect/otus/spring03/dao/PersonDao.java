package aspect.otus.spring03.dao;

import aspect.otus.spring03.domain.Person;


public interface PersonDao {

    Person findByName(String name);
    Long findById(Long id) throws Exception;
}
