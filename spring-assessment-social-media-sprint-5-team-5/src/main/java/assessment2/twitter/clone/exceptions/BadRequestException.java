package assessment2.twitter.clone.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BadRequestException extends RuntimeException {
			
	private static final long serialVersionUID = -3679600636804384624L;
	private String message;
}
