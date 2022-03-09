package chau.springvalidation.role.repository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import chau.springvalidation.role.model.GiraRole;

@SpringBootTest
@Transactional
public class GiraRoleRepositoryTest {
	
	@Autowired
	private GiraRoleRepository repository;
	
	@Test
	public void shouldNotInsertRole() {
		GiraRole role = GiraRole.builder()
							.code("FOURS")
							.description("des")
							.build();
		
		assertDoesNotThrow(() -> repository.save(role));
	}
}
