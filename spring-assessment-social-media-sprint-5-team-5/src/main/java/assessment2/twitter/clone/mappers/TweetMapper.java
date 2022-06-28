package assessment2.twitter.clone.mappers;


import java.util.List;

import assessment2.twitter.clone.dtos.TweetRequestDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.entities.Tweet;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { UserMapper.class })
public interface TweetMapper {
	TweetResponseDto entityToDto(Tweet entity);
	List<TweetResponseDto> entitiesToDtos(List<Tweet> entities);
	Tweet requestDtoToEntity(TweetRequestDto tweetRequestDto);
	List<TweetResponseDto> entitiesToResponseDtos(List<Tweet> findAll);
}
