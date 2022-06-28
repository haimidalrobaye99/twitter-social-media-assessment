package assessment2.twitter.clone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import assessment2.twitter.clone.entities.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long>{

	
	
}
