package chau.springvalidation.role.service;

import java.util.List;

import chau.springvalidation.role.dto.GiraRoleDTO;
import chau.springvalidation.role.model.GiraRole;

public interface GiraRoleService {
	List<GiraRole> findAllEntity();
	GiraRole save(GiraRoleDTO dto);
}
