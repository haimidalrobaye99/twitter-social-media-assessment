package assessment2.twitter.clone.services;

import assessment2.twitter.clone.dtos.UserRequestDto;
import assessment2.twitter.clone.dtos.UserResponseDto;
import assessment2.twitter.clone.entities.User;

import java.util.*;

public interface UserService {

	List<UserResponseDto> getAllUsers();
	
//	UserResponseDto createUser(UserRequestDto userRequestDto);

	List<UserResponseDto> getFollowing(User user);

	List<UserResponseDto> getFollowers(User user);

	UserResponseDto createUser(UserRequestDto userRequestDto);
	
}
