package assessment2.twitter.clone.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import assessment2.twitter.clone.dtos.HashtagDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.entities.Hashtag;

@Mapper(componentModel = "spring")
public interface HashtagMapper {
	HashtagDto entityToDto(Hashtag entity);
	List<HashtagDto> entitiesToDtos(List<Hashtag> entities);
}
