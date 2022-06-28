package assessment2.twitter.clone.mappers;

import assessment2.twitter.clone.dtos.TweetRequestDto;
import assessment2.twitter.clone.dtos.TweetResponseDto;
import assessment2.twitter.clone.entities.Tweet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-29T22:59:48-0400",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.15 (Oracle Corporation)"
)
@Component
public class TweetMapperImpl implements TweetMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public TweetResponseDto entityToDto(Tweet entity) {
        if ( entity == null ) {
            return null;
        }

        TweetResponseDto tweetResponseDto = new TweetResponseDto();

        tweetResponseDto.setId( entity.getId() );
        tweetResponseDto.setAuthor( userMapper.entityToDto( entity.getAuthor() ) );
        tweetResponseDto.setPosted( entity.getPosted() );
        tweetResponseDto.setContent( entity.getContent() );
        tweetResponseDto.setInReplyTo( entityToDto( entity.getInReplyTo() ) );

        return tweetResponseDto;
    }

    @Override
    public List<TweetResponseDto> entitiesToDtos(List<Tweet> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TweetResponseDto> list = new ArrayList<TweetResponseDto>( entities.size() );
        for ( Tweet tweet : entities ) {
            list.add( entityToDto( tweet ) );
        }

        return list;
    }

    @Override
    public Tweet requestDtoToEntity(TweetRequestDto tweetRequestDto) {
        if ( tweetRequestDto == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setContent( tweetRequestDto.getContent() );

        return tweet;
    }

    @Override
    public List<TweetResponseDto> entitiesToResponseDtos(List<Tweet> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<TweetResponseDto> list = new ArrayList<TweetResponseDto>( findAll.size() );
        for ( Tweet tweet : findAll ) {
            list.add( entityToDto( tweet ) );
        }

        return list;
    }
}
