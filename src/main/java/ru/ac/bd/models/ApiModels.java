package ru.ac.bd.models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


public class ApiModels {
	
	@Id
	public ObjectId _id;
	
	public String name;
	public String id;
	public String dept;
	
	public ApiModels() {}
	
	public ApiModels(ObjectId _id,String name,String id,String dept)
	{
		
		this._id = _id;
		this.name = name;
		this.id = id;
		this.dept = dept;
		
		
	}
	
	
	public String get_id() { return _id.toHexString(); }
	public void set_id(ObjectId _id) { this._id = _id; }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	  
	  
	  

}
