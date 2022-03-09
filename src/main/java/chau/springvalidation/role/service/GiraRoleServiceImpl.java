package chau.springvalidation.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chau.springvalidation.role.dto.GiraRoleDTO;
import chau.springvalidation.role.mapper.GiraRoleMapper;
import chau.springvalidation.role.model.GiraRole;
import chau.springvalidation.role.repository.GiraRoleRepository;

@Service
public class GiraRoleServiceImpl implements GiraRoleService {
	
	@Autowired
	private GiraRoleRepository repository;
	
	@Override
	public List<GiraRole> findAllEntity() {
		return repository.findAll();
	}

	@Override
	public GiraRole save(GiraRoleDTO dto) {
		//map dto to entity
		GiraRole role = GiraRoleMapper.INSTANCE.mapToEntity(dto);
		
		return repository.save(role);
	}

}
