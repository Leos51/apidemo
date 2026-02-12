package training.afpa.cda24060.apidemo.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import training.afpa.cda24060.apidemo.model.Person;
import training.afpa.cda24060.apidemo.repository.PersonRepository;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Optional<Person> getPerson(Integer id){
        return personRepository.findById(id);
    }

    public Iterable<Person> getPersons(){
        return personRepository.findAll();
    }

    public void deletePerson(Integer id){
        personRepository.deleteById(id);
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }
}
