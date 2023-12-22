package sn.isi.mapping;

import org.mapstruct.Mapper;
import sn.isi.dto.AppUser;
import sn.isi.entities.AppUserEntity;

@Mapper
public interface AppUserMapper {
    AppUser toAppuser(AppUserEntity appUserEntity);
    AppUserEntity fromAppUser(AppUser appUser);
}
