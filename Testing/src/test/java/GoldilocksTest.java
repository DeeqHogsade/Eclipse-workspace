import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GoldilocksTest {

	@Test
	public void hot() {
		App app = new App();
		assertEquals("Too Hot error", "Too Hot", app.goldilocks(35));
	}

	@Test
	public void cold() {
		App app = new App();
		assertEquals("Too Cold error", "Too Cold", app.goldilocks(7));
	}

	@Test
	public void good() {
		App app = new App();
		assertEquals("Just Right error", "Just Right", app.goldilocks(22));
	}
}
