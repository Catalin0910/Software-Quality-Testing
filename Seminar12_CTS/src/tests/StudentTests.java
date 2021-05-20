package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorRightName() {
		String nume = "Mirel";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testListAddNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testListOSinguraNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMediePentruONoat() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMediaPentruMaiMulteNote() {
		Student student = new Student();
		int nota = 10;
		int nota2 = 9;
		int nota3 = 7;
		int nota4 = 10;
		float medie = (nota + nota2 + nota3 + nota4) / 4.0f;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		student.adaugaNota(nota4);
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMediaFaraNoteAdugate() {
		Student student = new Student();
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testCalculeazaGetNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(-1));
	}
	
	@Test
	public void testCalculeazaGetNotaJU3() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		try {
			int x = student.getNota(-1);
			fail("testul a picat pentru ca nu a aruncat exceptie");
			
		}
		catch(IndexOutOfBoundsException err) {
		}
	}
	
	@Test
	public void testVerificaDacaAreRestante() {
		Student student = new Student();
		int nota = 10;
		int nota2 = 4;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareDacaNuAreRestante() {
		Student student = new Student();
		int nota = 10;
		int nota2 = 5;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		
		assertFalse(student.areRestante());
	}

}
