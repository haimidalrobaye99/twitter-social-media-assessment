package assessment2.twitter.clone.mappers;

import assessment2.twitter.clone.dtos.ProfileDto;
import assessment2.twitter.clone.entities.Profile;
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
public class ProfileMapperImpl implements ProfileMapper {

    @Override
    public ProfileDto entityToDto(Profile entity) {
        if ( entity == null ) {
            return null;
        }

        ProfileDto profileDto = new ProfileDto();

        profileDto.setFirstName( entity.getFirstName() );
        profileDto.setLastName( entity.getLastName() );
        profileDto.setEmail( entity.getEmail() );
        profileDto.setPhone( entity.getPhone() );

        return profileDto;
    }

    @Override
    public List<ProfileDto> entitiesToDtos(List<Profile> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProfileDto> list = new ArrayList<ProfileDto>( entities.size() );
        for ( Profile profile : entities ) {
            list.add( entityToDto( profile ) );
        }

        return list;
    }
}
