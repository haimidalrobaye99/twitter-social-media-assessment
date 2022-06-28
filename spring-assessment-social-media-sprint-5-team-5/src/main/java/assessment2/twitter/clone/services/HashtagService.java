package assessment2.twitter.clone.services;

import assessment2.twitter.clone.dtos.HashtagDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.entities.Hashtag;
import lombok.var;

import java.util.*;


public interface HashtagService {

	List<HashtagDto> getAllHashtags();
	
	HashtagDto createHashtag(HashtagDto hashtagDto);

	List<TweetResponseDto> getTweetsByLabel(var hashTag);

}
