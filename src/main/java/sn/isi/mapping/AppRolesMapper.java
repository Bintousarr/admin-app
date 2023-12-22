package sn.isi.mapping;

import sn.isi.dto.AppRoles;
import sn.isi.entities.AppRolesEntity;

import org.mapstruct.Mapper;
@Mapper
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
