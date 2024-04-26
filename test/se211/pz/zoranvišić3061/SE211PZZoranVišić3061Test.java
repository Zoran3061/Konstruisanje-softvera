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
public class SE211PZZoranVišić3061Test {
    
    public SE211PZZoranVišić3061Test() {
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
     * Test of main method, of class SE211PZZoranVišić3061.
     */
    @Test
    public void testMain(Korisnik korisnik)
    Korisnik kl1 = new Korisnik("Zoran","Visic","zoranvisic97@gmail.com","onlajnprodavnica");
    String ime = "Zoran"
    if (korisnik.getIme().equals(ime){
    return true;
    }else
    {
    return false;
    }
   /*
    public static boolean Reg(Korisnik korisnik)
    Korisnik kl1 = new Korisnik("Zoran","Visic","zoranvisic97@gmail.com","onlajnprodavnica");
    String ime = "Zoran"
    if (korisnik.getIme().equals(ime){
    return true;
    }else
    {
    return false;
    }
    */
}
