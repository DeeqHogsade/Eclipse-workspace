import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HospitalTest {
	
	@Test
	public void patient() {
		App app = new App();
		assertEquals("Patient data error", "Deeg", app.main("Deeg", "Paracetamol"));
	}
	@Test
	public void getPatient() {
		App app = new App();
		assertEquals("Patient data error", 0, app.main("Name = Deeg", "Treatment = Paracetamol"));
	}
	@Test
	public void teamCreation() {
		App app = new App();
		Doctor doctor = new Doctor();
		doctor.setConsultant(true);
		Team team = new Team(doctor);
	}
}
