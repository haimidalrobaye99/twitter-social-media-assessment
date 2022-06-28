package assessment2.twitter.clone.services.impl;

import java.util.List;
import java.util.Optional;

import assessment2.twitter.clone.dtos.UserRequestDto;
import assessment2.twitter.clone.dtos.UserResponseDto;
import assessment2.twitter.clone.entities.User;
import assessment2.twitter.clone.exceptions.BadRequestException;
import assessment2.twitter.clone.mappers.UserMapper;
import assessment2.twitter.clone.repositories.UserRepository;
import assessment2.twitter.clone.services.*;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	
	private final UserMapper userMapper;
	private final UserRepository userRepository;
	
	
	@Override
	public List<UserResponseDto> getAllUsers() {
		return userMapper.entitiesToDtos(userRepository.findAll());
	}

	@Override
	public List<UserResponseDto> getFollowing(User user) {
		// TODO Auto-generated method stub'
		return userMapper.entitiesToDtos(user.getFollowing());
	}

	@Override
	public List<UserResponseDto> getFollowers(User user) {
		// TODO Auto-generated method stub
		return userMapper.entitiesToDtos(user.getFollowers());
	}

	@Override
	public UserResponseDto createUser(UserRequestDto userRequestDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
