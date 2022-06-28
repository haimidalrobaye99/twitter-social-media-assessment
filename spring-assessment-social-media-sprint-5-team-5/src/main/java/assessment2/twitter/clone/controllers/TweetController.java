package assessment2.twitter.clone.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import assessment2.twitter.clone.dtos.CredentialsDto;
import assessment2.twitter.clone.dtos.TweetRequestDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.dtos.UserResponseDto;
import assessment2.twitter.clone.entities.Tweet;
import assessment2.twitter.clone.exceptions.BadRequestException;
import assessment2.twitter.clone.services.TweetService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/tweets")
@RequiredArgsConstructor
public class TweetController {
	
	private final TweetService tweetService;
	
	
	@GetMapping
	public List<TweetResponseDto> getAllTweets() {
		return tweetService.getAllTweets();		
	}	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TweetResponseDto createTweet(@RequestBody TweetRequestDto tweetRequestDto) {
		if (tweetRequestDto.getContent() == null || tweetRequestDto.getCredentials() == null) {
			throw new BadRequestException("no content");
		}
		if (tweetRequestDto.getCredentials().getPassword() == null || tweetRequestDto.getCredentials().getUsername() == null) {
			throw new BadRequestException("no password or username");
		}
		
		return tweetService.createTweet(tweetRequestDto);
	}
	
	@GetMapping("/{id}")
	public TweetResponseDto getTweetById(@PathVariable Long id) {
		return tweetService.getTweetById(id);
	}
	
//	@ResponseStatus(code = HttpStatus.ACCEPTED)
//    @DeleteMapping("/{id}")
//	public TweetResponseDto deleteUser(@PathVariable Long id, @RequestBody CredentialsDto credentialsDto) {
//	        return tweetService.deleteTweet(id, credentialsDto);
//	}
//	
	 	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public TweetResponseDto getTweet(@PathVariable Long id) {
			return tweetService.getTweetById(id);
	}
		
	@GetMapping("likes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<UserResponseDto> getTweetLikes(@PathVariable Long id) {
			return tweetService.getUsersOfLikedTweet(id);
	}
	
	@GetMapping("mentions/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<UserResponseDto> getMentionedUsersInTweet(@PathVariable Long id) {
			return tweetService.getMentionedUsersInTweet(id);
	}
	
	@GetMapping("replies/{id}")
	@ResponseStatus(HttpStatus.OK)
	public List<TweetResponseDto> getTweetReplies(@PathVariable Long id) {
			return tweetService.getTweetReplies(id);
	}
	
	
}
