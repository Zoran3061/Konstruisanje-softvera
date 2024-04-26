/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se211.pz.zoranvišić3061;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zoran
 */
public class KorisnikTest {
    
    public KorisnikTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIme method, of class Korisnik.
     */
    @Test
    public void testGetIme() {
        System.out.println("getIme");
        Korisnik instance = new Korisnik();
        String expResult = "Zoran";
        String result = instance.getIme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIme method, of class Korisnik.
     */
    @Test
    public void testSetIme() {
        System.out.println("setIme");
        String ime = "Zoran";
        Korisnik instance = new Korisnik();
        instance.setIme(ime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrezime method, of class Korisnik.
     */
    @Test
    public void testGetPrezime() {
        System.out.println("getPrezime");
        Korisnik instance = new Korisnik();
        String expResult = "getPrezime";
        String result = instance.getPrezime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrezime method, of class Korisnik.
     */
    @Test
    public void testSetPrezime() {
        System.out.println("setPrezime");
        String prezime = "setPrezime";
        Korisnik instance = new Korisnik();
        instance.setPrezime(prezime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Korisnik.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Korisnik instance = new Korisnik();
        String expResult = "getEmail";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Korisnik.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "setEmail";
        Korisnik instance = new Korisnik();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLozinka method, of class Korisnik.
     */
    @Test
    public void testGetLozinka() {
        System.out.println("getLozinka");
        Korisnik instance = new Korisnik();
        String expResult = "getLozinka";
        String result = instance.getLozinka();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLozinka method, of class Korisnik.
     */
    @Test
    public void testSetLozinka() {
        System.out.println("setLozinka");
        String lozinka = "setLozinka";
        Korisnik instance = new Korisnik();
        instance.setLozinka(lozinka);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Korisnik.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Korisnik instance = new Korisnik();
        String expResult = "toString";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
