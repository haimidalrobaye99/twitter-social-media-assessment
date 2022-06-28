package assessment2.twitter.clone.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Data
public class Profile {

	 private String firstName;

	    private String lastName;

	    @Column(nullable = false)
	    private String email;

	    private String phone;
	}
