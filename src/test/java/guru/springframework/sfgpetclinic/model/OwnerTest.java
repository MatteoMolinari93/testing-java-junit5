package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("model")
public class OwnerTest {
	
	@Test
	void dependentAssertions() {
		Owner owner = new Owner(1l, "Joe", "Buck");
		owner.setCity("Zürich");
		owner.setTelephone("1231231234");
		assertAll("Properties test",
				() -> assertAll("Person Properties",
							() -> assertEquals("Joe", owner.getFirstName()),
							() -> assertEquals("Buck", owner.getLastName())), 
				() -> assertAll("Owner Properties", 
						() -> assertEquals("Zürich", owner.getCity()),
						() -> assertEquals("1231231234", owner.getTelephone())
				));
	}
}
