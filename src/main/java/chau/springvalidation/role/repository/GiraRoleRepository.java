package chau.springvalidation.role.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chau.springvalidation.role.model.GiraRole;

@Repository
public interface GiraRoleRepository extends JpaRepository<GiraRole, UUID>{

}
