package assessment2.twitter.clone.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Tweet {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private User author;
	
	@CreatedDate
	private Timestamp posted = Timestamp.valueOf(LocalDateTime.now());

	private String content;

	@ManyToOne
	private Tweet inReplyTo;
	
	@OneToMany(mappedBy = "inReplyTo")
    	private List<Tweet> replies = new ArrayList<>();

	@ManyToOne
	private Tweet inRepostOf;
	
	@OneToMany(mappedBy = "inRepostOf")
    	private List<Tweet> reposts = new ArrayList<>();
	
	private boolean deleted = false;
	
	@ManyToMany
    	@JoinTable(name = "mentions")
    	private List<User> mentions = new ArrayList<>();

    	@ManyToMany
    	@JoinTable(name = "hashtags")
    	private List<Hashtag> hashtags = new ArrayList<>();

    	@ManyToMany
    	@JoinTable(name = "likes")
    	private Set<User> likes = new HashSet<>();

}
