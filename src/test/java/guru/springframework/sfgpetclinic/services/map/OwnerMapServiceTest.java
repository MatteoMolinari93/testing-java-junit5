package guru.springframework.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;

@DisplayName("Owner Map Service Test - ")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OwnerMapServiceTest {
	OwnerMapService ownerMapService;
	PetTypeService petTypeService;
	PetService petService;
	
	@BeforeEach
	void setUp() {
		petTypeService = new PetTypeMapService();
		petService = new PetMapService();
		ownerMapService = new OwnerMapService(petTypeService, petService);
	}
	
	@DisplayName("Verify zero owners")
	@Test
	@Order(1)
	void ownersAreZero() {
		System.out.println("ownersAreZero");
		int ownerCount = ownerMapService.findAll().size();
		assertEquals(0, ownerCount);
	}
	
	@DisplayName("Verify still zero owners")
	@Test
	@Order(2)
	void ownersAreStillZero() {
		System.out.println("ownersAreStillZero");
		int ownerCount = ownerMapService.findAll().size();
		assertEquals(0, ownerCount);
	}
	
	@DisplayName("Pet Type - ")
	@Nested
	class TestCreatePetTypes {
		
		@BeforeEach
		void setUp() {
			PetType petType = new PetType(1l, "Dog");
			PetType petType2 = new PetType(2l, "Cat");
			petTypeService.save(petType);
			petTypeService.save(petType2);
		}
		
		@Test
		void testPetCount() {
			int petTypeCount = petTypeService.findAll().size();
			assertEquals(2, petTypeCount);
		}
		
		@DisplayName("Save Owners Tests - ")
		@Nested
		class SaveOwnersTests {
			
			@BeforeEach
			void setUp() {
				ownerMapService.save(new Owner(1l, "Before", "Each"));
			}
			
			@Test
			void saveOwner() {
				Owner savedOwner = ownerMapService.save(new Owner(1l, "Joe", "Buck"));
				assertNotNull(savedOwner);
			}
			
		}
		
	}
}
