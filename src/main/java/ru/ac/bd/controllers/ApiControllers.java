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
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	  public ApiModels createPet(@Valid @RequestBody ApiModels student) {
		student.set_id(ObjectId.get());
	    repository.save(student);
	    return student;
	  }

}
