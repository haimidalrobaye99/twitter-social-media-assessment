package assessment2.twitter.clone.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NotAuthorizedException extends RuntimeException {
	 
	
	private static final long serialVersionUID = 1517412710792920307L;
	private String message;
}
