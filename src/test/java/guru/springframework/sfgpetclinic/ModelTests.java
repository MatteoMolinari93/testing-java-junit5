package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@Tag("model")
@TestInstance(Lifecycle.PER_CLASS)
public interface ModelTests {
	
	@BeforeEach()
	default void beforeEach(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
	}

}
