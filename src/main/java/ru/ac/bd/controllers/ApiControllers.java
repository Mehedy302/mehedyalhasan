package ru.ac.bd.controllers;

import ru.ac.bd.models.ApiModels;
import ru.ac.bd.repositories.ApiModelsRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/allstudent")

public class ApiControllers {
	
	@Autowired
	private ApiModelsRepository repository;
	
	@RequestMapping(value = "/getstudents", method = RequestMethod.GET)
	  public List<ApiModels> getAllPets() {
	    return repository.findAll();
	  }

	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public ApiModels getPetById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }
	
	
	@RequestMapping(value = "/setstudent", method = RequestMethod.POST)
	  public ApiModels createPet(@Valid @RequestBody ApiModels student) {
		student.set_id(ObjectId.get());
	    repository.save(student);
	    return student;
	  }
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody ApiModels student) {
		student.set_id(id);
	    repository.save(student);
	  }
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deletePet(@PathVariable ObjectId id) {
	    repository.delete(repository.findBy_id(id));
	  }
	

}
