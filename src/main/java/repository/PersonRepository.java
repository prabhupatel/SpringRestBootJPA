package repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	public Person findByName(String name);
	public Person findByDateOfBirth(Date dob);
	public Person findByAge(Integer age);

}
