package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.ControllerTests;

public class IndexControllerTest implements ControllerTests {
	
	IndexController controller;
	
	@BeforeEach
	void setUp() {
		controller = new IndexController();
	}
	
	@DisplayName("Test if the right view is returned for index page")
	@Test
	void index() {
		assertEquals("index", controller.index());
		assertEquals("index", controller.index(), "Wrong view returned");
	}
	
	@Test
	void oupsHandler() {
		assertThrows(ValueNotFoundException.class, () -> controller.oupsHandler());
	}

	@Test
	void testAssumptionTrue() {
		assumeTrue("GURU".equalsIgnoreCase("GURU"));
	}
}
