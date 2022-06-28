package assessment2.twitter.clone.mappers;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import assessment2.twitter.clone.dtos.UserRequestDto;
import assessment2.twitter.clone.dtos.UserResponseDto;
import assessment2.twitter.clone.entities.User;

@Mapper(componentModel = "spring", uses = { ProfileMapper.class, CredentialsMapper.class })
public interface UserMapper {
	@Mapping(target = "username", source = "credentials.username")
	UserResponseDto entityToDto(User entity);
	List<UserResponseDto> entitiesToDtos(List<User> entities);
	List<UserResponseDto> entitiesToResponseDtos(Set<User> set);
	User requestDtoToEntity(UserRequestDto userRequestDto);
}
