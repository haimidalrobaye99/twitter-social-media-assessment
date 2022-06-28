package assessment2.twitter.clone.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -8498968276045646608L;
	private String message;
}
