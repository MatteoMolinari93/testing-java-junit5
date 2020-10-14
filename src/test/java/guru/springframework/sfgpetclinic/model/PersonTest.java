package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.ModelTests;

public class PersonTest implements ModelTests {
	
	@Test
	void groupedAssertions() {
		Person person = new Person(1l, "Marvin", "Franz");
		
		assertAll("Test Props Set",
				() -> assertEquals("Marvin",person.getFirstName()),
				() -> assertEquals("Franz", person.getLastName())
				);
	}
	
	@Test
	void groupedAssertionMsgs() {
		Person person = new Person(1l, "Marvin", "Franz");
		
		assertAll("Test Props Set",
				() -> assertEquals("Marvin2", person.getFirstName(), "First name failed"),
				() -> assertEquals("Franzsd", person.getLastName(), "Last name failed")
				);
	}
	
	@RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} of {totalRepetitions}")
	@DisplayName("My repeated test")
	@Test
	void repeatedtest() {
		
	}

}
