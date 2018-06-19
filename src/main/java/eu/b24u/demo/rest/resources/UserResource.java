package eu.b24u.demo.rest.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.b24u.demo.rest.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Profile("prd")
@RestController
@RequestMapping("/rest/user/")
@Api(value = "User Resource REST Endpoint, show users")
public class UserResource {

	@ApiOperation(value = "Returns users")
	// @formatter:off
	@ApiResponses(
			value = {
					@ApiResponse(code=200, message = "Successful"),
					@ApiResponse(code=500, message = "Error")
			}
	)
	// @formatter:on
	@GetMapping
	public List<User> getUsers() {
		return Arrays.asList(new User("Jan"), new User("Anna"));
	}

	@ApiOperation(value = "Add user")
	// @formatter:off
	@ApiResponses(
			value = {
					@ApiResponse(code=200, message = "Successful"),
					@ApiResponse(code=500, message = "Error")
			}
	)
	// @formatter:on
	@PostMapping("/post")
	public ResponseEntity<User> postUser(@RequestBody
	User user) {
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@ApiOperation(value = "Update user")
	// @formatter:off
	@ApiResponses(
			value = {
					@ApiResponse(code=200, message = "Successful"),
					@ApiResponse(code=500, message = "Error")
			}
	)
	// @formatter:on
	@PutMapping("/put")
	public ResponseEntity<User> putUser(@RequestBody
	User user) {
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
