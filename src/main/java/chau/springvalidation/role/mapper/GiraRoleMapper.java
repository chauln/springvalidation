package chau.springvalidation.role.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import chau.springvalidation.role.dto.GiraRoleDTO;
import chau.springvalidation.role.model.GiraRole;

@Mapper
public interface GiraRoleMapper {
	GiraRoleMapper INSTANCE = Mappers.getMapper(GiraRoleMapper.class);
	
	GiraRole mapToEntity(GiraRoleDTO dto);
}
