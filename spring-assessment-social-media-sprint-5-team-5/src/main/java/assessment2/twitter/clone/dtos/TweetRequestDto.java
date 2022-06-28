package assessment2.twitter.clone.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TweetRequestDto {
	private String content;
	private CredentialsDto credentials;
}
