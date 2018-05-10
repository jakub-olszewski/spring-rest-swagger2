package eu.b24u.demo.rest.domain;

import io.swagger.annotations.ApiModelProperty;

public class User {

	@ApiModelProperty(notes = "name of the User")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}

}
