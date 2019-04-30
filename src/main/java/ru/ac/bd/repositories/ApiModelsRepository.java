package ru.ac.bd.repositories;

import ru.ac.bd.models.ApiModels;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface  ApiModelsRepository  extends MongoRepository<ApiModels, String>{
	ApiModels findBy_id(ObjectId _id);
}
