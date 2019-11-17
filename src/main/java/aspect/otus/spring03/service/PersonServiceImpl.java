package aspect.otus.spring03.service;

import org.springframework.stereotype.Service;
import aspect.otus.spring03.dao.PersonDao;
import aspect.otus.spring03.domain.Person;

import javax.xml.bind.annotation.XmlAnyElement;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

@XmlAnyElement
    public Person getByName(String name) throws Exception {
//        dao.findByName2(name);
        return dao.findByName(name);
    }

    @Override
    public Long findById(Long id) throws Exception {
        dao.findById(id);
        System.out.println(id);
        return id;
    }
}
