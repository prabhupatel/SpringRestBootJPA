package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.PersonService;
import domain.Person;

@RestController
public class PersonRestController {
	
	@Autowired
	PersonService personService;
	
	
	@RequestMapping("/api/persion")
	public String getPerson(){
		//return personService.findPersonByName(name);
		return "prabhu";
		
	}

}
