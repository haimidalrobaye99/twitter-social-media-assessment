package assessment2.twitter.clone.mappers;

import assessment2.twitter.clone.dtos.HashtagDto;
import assessment2.twitter.clone.entities.Hashtag;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-29T22:59:47-0400",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.15 (Oracle Corporation)"
)
@Component
public class HashtagMapperImpl implements HashtagMapper {

    @Override
    public HashtagDto entityToDto(Hashtag entity) {
        if ( entity == null ) {
            return null;
        }

        HashtagDto hashtagDto = new HashtagDto();

        hashtagDto.setFirstUsed( entity.getFirstUsed() );
        hashtagDto.setLastUsed( entity.getLastUsed() );
        hashtagDto.setLabel( entity.getLabel() );

        return hashtagDto;
    }

    @Override
    public List<HashtagDto> entitiesToDtos(List<Hashtag> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HashtagDto> list = new ArrayList<HashtagDto>( entities.size() );
        for ( Hashtag hashtag : entities ) {
            list.add( entityToDto( hashtag ) );
        }

        return list;
    }
}
