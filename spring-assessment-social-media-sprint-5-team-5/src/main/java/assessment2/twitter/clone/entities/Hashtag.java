package assessment2.twitter.clone.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Hashtag {

	 @Id
	    @GeneratedValue
	    private Long id;

	    @Column(nullable = false, unique = true)
	    private String label;

	    @Column(nullable = false)
	    @CreatedDate
	    private Timestamp firstUsed = Timestamp.valueOf(LocalDateTime.now());

	    @Column(nullable = false)
	    @LastModifiedDate
	    private Timestamp lastUsed = Timestamp.valueOf(LocalDateTime.now());

	    @ManyToMany
	    private List<Tweet> taggedTweets = new ArrayList<>();
}
