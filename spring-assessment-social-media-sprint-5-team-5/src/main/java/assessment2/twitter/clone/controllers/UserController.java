package assessment2.twitter.clone.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import assessment2.twitter.clone.dtos.UserRequestDto;
import assessment2.twitter.clone.dtos.UserResponseDto;
import assessment2.twitter.clone.entities.User;
import assessment2.twitter.clone.services.UserService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	
	@GetMapping
	public List<UserResponseDto> getAllUsers() {
		return userService.getAllUsers();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UserResponseDto createUser(@RequestBody UserRequestDto userRequestDto) {
		return userService.createUser(userRequestDto);
	}
	
	@GetMapping("/@{username}/following")
	public List<UserResponseDto> getFollowing(@PathVariable(name="username") User user) {
		return userService.getFollowing(user);
	}
	
	@GetMapping("/@{username}/followers")
	public List<UserResponseDto> getFollowers(@PathVariable(name="username") User user) {
		return userService.getFollowers(user);
	}
}
