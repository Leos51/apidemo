package training.afpa.cda24060.apidemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import training.afpa.cda24060.apidemo.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
