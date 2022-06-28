package assessment2.twitter.clone.mappers;

import assessment2.twitter.clone.dtos.CredentialsDto;
import assessment2.twitter.clone.dtos.ProfileDto;
import assessment2.twitter.clone.dtos.UserRequestDto;
import assessment2.twitter.clone.dtos.UserResponseDto;
import assessment2.twitter.clone.entities.Credentials;
import assessment2.twitter.clone.entities.Profile;
import assessment2.twitter.clone.entities.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-29T22:59:47-0400",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.15 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private ProfileMapper profileMapper;

    @Override
    public UserResponseDto entityToDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setUsername( entityCredentialsUsername( entity ) );
        userResponseDto.setProfile( profileMapper.entityToDto( entity.getProfile() ) );
        userResponseDto.setJoined( entity.getJoined() );

        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> entitiesToDtos(List<User> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UserResponseDto> list = new ArrayList<UserResponseDto>( entities.size() );
        for ( User user : entities ) {
            list.add( entityToDto( user ) );
        }

        return list;
    }

    @Override
    public List<UserResponseDto> entitiesToResponseDtos(Set<User> set) {
        if ( set == null ) {
            return null;
        }

        List<UserResponseDto> list = new ArrayList<UserResponseDto>( set.size() );
        for ( User user : set ) {
            list.add( entityToDto( user ) );
        }

        return list;
    }

    @Override
    public User requestDtoToEntity(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        User user = new User();

        user.setProfile( profileDtoToProfile( userRequestDto.getProfile() ) );
        user.setCredentials( credentialsDtoToCredentials( userRequestDto.getCredentials() ) );

        return user;
    }

    private String entityCredentialsUsername(User user) {
        if ( user == null ) {
            return null;
        }
        Credentials credentials = user.getCredentials();
        if ( credentials == null ) {
            return null;
        }
        String username = credentials.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }

    protected Profile profileDtoToProfile(ProfileDto profileDto) {
        if ( profileDto == null ) {
            return null;
        }

        Profile profile = new Profile();

        profile.setFirstName( profileDto.getFirstName() );
        profile.setLastName( profileDto.getLastName() );
        profile.setEmail( profileDto.getEmail() );
        profile.setPhone( profileDto.getPhone() );

        return profile;
    }

    protected Credentials credentialsDtoToCredentials(CredentialsDto credentialsDto) {
        if ( credentialsDto == null ) {
            return null;
        }

        Credentials credentials = new Credentials();

        credentials.setUsername( credentialsDto.getUsername() );
        credentials.setPassword( credentialsDto.getPassword() );

        return credentials;
    }
}
