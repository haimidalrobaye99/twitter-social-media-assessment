package assessment2.twitter.clone.services.impl;

import java.util.List;

import assessment2.twitter.clone.dtos.HashtagDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.entities.Hashtag;
import assessment2.twitter.clone.mappers.HashtagMapper;
import assessment2.twitter.clone.repositories.HashtagRepository;
import assessment2.twitter.clone.repositories.TweetRepository;
import assessment2.twitter.clone.services.*;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.var;

@Service
@RequiredArgsConstructor
public class HashtagServiceImpl implements HashtagService{
	private HashtagRepository hashtagRepository;
	private HashtagMapper hashtagMapper;
	private TweetRepository tweetRepository;
	
	@Override
	public List<HashtagDto> getAllHashtags() {
		// TODO Auto-generated method stub
		return hashtagMapper.entitiesToDtos(hashtagRepository.findAll());
	}

	@Override
	public HashtagDto createHashtag(HashtagDto hashtagDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TweetResponseDto> getTweetsByLabel(var hashTag) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
