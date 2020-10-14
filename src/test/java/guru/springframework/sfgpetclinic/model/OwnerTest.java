package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import guru.springframework.sfgpetclinic.ModelTests;

public class OwnerTest implements ModelTests {
	
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
	
	@DisplayName("Value Source Test - ")
	@ParameterizedTest(name = "{displayName} [{index}] {arguments}")
	@ValueSource(strings = {"Spring", "Framework", "Guru"})
	void testValueSource(String val) {
		System.out.println(val);
	}
	
	@DisplayName("Enum Source Test - ")
	@ParameterizedTest(name = "{displayName} [{index}] {arguments}")
	@EnumSource(OwnerType.class)
	void testEnumSource(OwnerType val) {
		System.out.println(val);
	}
	
	@DisplayName("CSV Source Test - ")
	@ParameterizedTest(name = "{displayName} [{index}] {arguments}")
	@CsvSource({
		"FL,1,2",
		"OH,3,4"
	})
	void testCSVSource(String stateName, int value1, int value2) {
		System.out.println(stateName + " - " + value1 + " - " + value2);
	}
}
