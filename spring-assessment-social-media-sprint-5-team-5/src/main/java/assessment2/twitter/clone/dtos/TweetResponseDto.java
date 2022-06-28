package assessment2.twitter.clone.dtos;
import java.sql.Timestamp;

import assessment2.twitter.clone.entities.Tweet;
import assessment2.twitter.clone.entities.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TweetResponseDto {
	private Long id;
	private UserResponseDto author;
	private Timestamp posted;
	private String content;
	private TweetResponseDto inReplyTo;
	private TweetResponseDto repostOf;
}
