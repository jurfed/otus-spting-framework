package aspect.otus.spring03.service;

import aspect.otus.spring03.domain.Person;

public interface PersonService {

    Person getByName(String name) throws Exception;
    Long findById(Long id) throws Exception;

}
