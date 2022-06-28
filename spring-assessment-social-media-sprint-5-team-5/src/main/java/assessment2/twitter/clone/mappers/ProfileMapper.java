package assessment2.twitter.clone.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import assessment2.twitter.clone.dtos.ProfileDto;
import assessment2.twitter.clone.entities.Profile;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
	ProfileDto entityToDto(Profile entity);
	List<ProfileDto> entitiesToDtos(List<Profile> entities);
}
