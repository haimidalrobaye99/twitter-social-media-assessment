package assessment2.twitter.clone.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import assessment2.twitter.clone.dtos.CredentialsDto;
import assessment2.twitter.clone.entities.Credentials;

@Mapper(componentModel = "spring")
public interface CredentialsMapper {
	CredentialsDto entityToDto(Credentials entity);
	List<CredentialsDto> entitiesToDtos(List<Credentials> entities);
}
