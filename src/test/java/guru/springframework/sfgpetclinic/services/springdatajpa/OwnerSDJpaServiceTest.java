package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

@Disabled("Disabled until we activate Mocking")
class OwnerSDJpaServiceTest {
	
	OwnerSDJpaService service;

	@BeforeEach
	void setUp() throws Exception {
		service = new OwnerSDJpaService(null, null, null);
	}

	@Disabled
	@Test
	void findByLastName() {
		Owner foundOwner = service.findByLastName("Buck");
	}

}
