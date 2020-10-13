package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {
	
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
		assertTrue("notimplemented".equals(controller.oupsHandler()));
	}

}
