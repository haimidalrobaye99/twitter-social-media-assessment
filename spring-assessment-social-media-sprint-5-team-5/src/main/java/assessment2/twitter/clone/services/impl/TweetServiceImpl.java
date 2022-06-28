package assessment2.twitter.clone.services.impl;

import java.util.List;
import java.util.Optional;

import assessment2.twitter.clone.dtos.CredentialsDto;
import assessment2.twitter.clone.dtos.HashtagDto;
import assessment2.twitter.clone.dtos.TweetRequestDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.dtos.UserRequestDto;
import assessment2.twitter.clone.dtos.UserResponseDto;
import assessment2.twitter.clone.entities.Tweet;
import assessment2.twitter.clone.exceptions.NotFoundException;
import assessment2.twitter.clone.mappers.HashtagMapper;
import assessment2.twitter.clone.mappers.TweetMapper;
import assessment2.twitter.clone.mappers.UserMapper;
import assessment2.twitter.clone.repositories.HashtagRepository;
import assessment2.twitter.clone.repositories.TweetRepository;
import assessment2.twitter.clone.repositories.UserRepository;
import assessment2.twitter.clone.services.*;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TweetServiceImpl implements TweetService{
	
	private final TweetMapper tweetMapper;
	private final TweetRepository tweetRepository;
	private final UserMapper userMapper;
	private final UserRepository userRepository;
	private final HashtagMapper hashtagMapper;
	private final HashtagRepository hashtagRepository;

	
	@Override
	public List<TweetResponseDto> getAllTweets() {
		return tweetMapper.entitiesToResponseDtos(tweetRepository.findAll());
	}

	@Override
	public TweetResponseDto createTweet(TweetRequestDto tweetRequestDto) {
		return tweetMapper.entityToDto(tweetRepository.saveAndFlush(tweetMapper.requestDtoToEntity(tweetRequestDto)));
	}
	
	public TweetResponseDto getTweetById(Long id) {
		return tweetMapper.entityToDto(getTweet(id));
	}
	
	private Tweet getTweet(Long id) {
		Optional<Tweet> optionalTweet = tweetRepository.findById(id);
		if(optionalTweet.isEmpty()) {
			throw new NotFoundException("No Tweet found with id: " + id);			
		}
		optionalTweet.get().getLikes();
		return optionalTweet.get();
	}
	
	
	@Override
	public List<UserResponseDto> getUsersOfLikedTweet(Long id) {
		return userMapper.entitiesToResponseDtos(getTweet(id).getLikes());
	}
	
	
	@Override
	public List<UserResponseDto> getMentionedUsersInTweet(Long id) {
		return userMapper.entitiesToDtos(getTweet(id).getMentions());
	}
	
	@Override
	public List<TweetResponseDto> getTweetReplies(Long id) {
		return tweetMapper.entitiesToResponseDtos(getTweet(id).getReplies());
	}
	
	@Override
	public List<HashtagDto> getTweetTags(Long id) {
		return hashtagMapper.entitiesToDtos(getTweet(id).getHashtags());
		
	
	}
	
	@Override
	public List<TweetResponseDto> getTweetReposts(Long id) {
		return tweetMapper.entitiesToResponseDtos(getTweet(id).getReposts());
	}

	

	
	
	

}
