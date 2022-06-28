package assessment2.twitter.clone.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "user_table")
public class User {
	 @Id
	    @GeneratedValue
	    private Long id;

	    @Embedded
	    private Profile profile;

	    @Column(nullable = false)
	    @CreatedDate
	    private Timestamp joined = Timestamp.valueOf(LocalDateTime.now());

	    @Embedded
	    private Credentials credentials;
	    
	    @ManyToMany
	    @JoinTable(name = "followers_following")
	    private List<User> followers;
	    
	    @ManyToMany(mappedBy = "followers")
	    private List<User> following;

	    @OneToMany(mappedBy = "author")
	    private List<Tweet> tweets;
	    
	    private boolean deleted;
	    
	    @ManyToMany(mappedBy = "mentions")
	    private List<Tweet> tweetsMentioned = new ArrayList<>();

	    @ManyToMany(mappedBy = "likes")
	    private List<Tweet> likedTweets = new ArrayList<>();

}
