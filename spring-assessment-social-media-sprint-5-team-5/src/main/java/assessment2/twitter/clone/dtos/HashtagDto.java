package assessment2.twitter.clone.dtos;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class HashtagDto {
	private Timestamp firstUsed;
	private Timestamp lastUsed;
	private String label;
}
