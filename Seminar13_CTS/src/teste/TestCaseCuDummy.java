package teste;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.categorii.TesteUrgente;

public class TestCaseCuDummy {

	private IStudent studentDummy;
	
	@Before
	public void setUp() throws Exception {
		studentDummy = new StudentDummy();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Category({TesteNormale.class})
	public void testAdaugaStudent() {
		Grupa grupa = new Grupa(1000);
		grupa.adaugaStudent(studentDummy);
		assertEquals(1, grupa.getListaStudenti().size());
	}
	
	@Test
	@Category({TesteUrgente.class})
	public void testAdaugaStudentCardinality() {
		Grupa grupa = new Grupa(1000);
		IStudent studentDummy1 = new StudentDummy();
		IStudent studentDummy2 = new StudentDummy();
		grupa.adaugaStudent(studentDummy);
		grupa.adaugaStudent(studentDummy1);
		grupa.adaugaStudent(studentDummy2);
		assertEquals(3, grupa.getListaStudenti().size());
	}
}
