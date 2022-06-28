package assessment2.twitter.clone.dtos;

import java.sql.Timestamp;

import assessment2.twitter.clone.entities.Profile;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserResponseDto {
	private String username;
	private ProfileDto profile;
	private Timestamp joined;
}
