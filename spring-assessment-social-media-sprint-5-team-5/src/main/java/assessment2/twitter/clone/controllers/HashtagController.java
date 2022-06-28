package assessment2.twitter.clone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import assessment2.twitter.clone.dtos.HashtagDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.entities.Hashtag;
import assessment2.twitter.clone.services.HashtagService;

import lombok.RequiredArgsConstructor;
import lombok.var;

import java.util.List;

@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class HashtagController {
	
	private final HashtagService hashtagService;
	
	
	@GetMapping
	public List<HashtagDto> getAllHashtags() {
		return hashtagService.getAllHashtags();
		
	}
	
	@PostMapping
	public HashtagDto createHashtag(@RequestBody HashtagDto hashtagDto) {
		return hashtagService.createHashtag(hashtagDto);
	}
	
	@GetMapping("/{label}")
	public List<TweetResponseDto> getTagByLab(@PathVariable(name="label") var hashTag) {
		return hashtagService.getTweetsByLabel(hashTag);
	}
}

