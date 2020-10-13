package guru.springframework.sfgpetclinic.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.controllers.IndexController;

public class IndexControllerTest {
	
	IndexController controller;
	
	@BeforeEach
	void setUp() {
		controller = new IndexController();
	}
	
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
