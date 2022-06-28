package assessment2.twitter.clone.services;

import assessment2.twitter.clone.dtos.CredentialsDto;
import assessment2.twitter.clone.dtos.HashtagDto;
import assessment2.twitter.clone.dtos.TweetRequestDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.dtos.UserResponseDto;

import java.util.*;


public interface TweetService {

	List<TweetResponseDto> getAllTweets();
	
	TweetResponseDto createTweet(TweetRequestDto tweetRequestDto);

	List<TweetResponseDto> getTweetReplies(Long id);

	List<UserResponseDto> getMentionedUsersInTweet(Long id);

	List<UserResponseDto> getUsersOfLikedTweet(Long id);

	List<HashtagDto> getTweetTags(Long id);

	List<TweetResponseDto> getTweetReposts(Long id);

	TweetResponseDto getTweetById(Long id);

	
	
	
}
