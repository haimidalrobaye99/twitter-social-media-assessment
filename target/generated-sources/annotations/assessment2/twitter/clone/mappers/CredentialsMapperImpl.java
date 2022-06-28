package assessment2.twitter.clone.mappers;

import assessment2.twitter.clone.dtos.CredentialsDto;
import assessment2.twitter.clone.entities.Credentials;
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
public class CredentialsMapperImpl implements CredentialsMapper {

    @Override
    public CredentialsDto entityToDto(Credentials entity) {
        if ( entity == null ) {
            return null;
        }

        CredentialsDto credentialsDto = new CredentialsDto();

        credentialsDto.setUsername( entity.getUsername() );
        credentialsDto.setPassword( entity.getPassword() );

        return credentialsDto;
    }

    @Override
    public List<CredentialsDto> entitiesToDtos(List<Credentials> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CredentialsDto> list = new ArrayList<CredentialsDto>( entities.size() );
        for ( Credentials credentials : entities ) {
            list.add( entityToDto( credentials ) );
        }

        return list;
    }
}
