/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import pkg2do.parcial.herrera.agustin.Usuario;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioTest {

    private static Usuario usr;
    private static int i = 1;

    @BeforeClass
    public static void antesDeTodo() {

        usr = new Usuario("Juanjo", 1212);

        System.out.println("test de usuario");
    }

    @AfterClass
    public static void despuesDeTodo() {

        System.out.println("fin de las pruebas " + LocalDate.now().minusDays(1));
    }

    @Before
    public void before() {

        System.out.println("test nro " + i);
        i++;
    }

    @After
    public void after() {

        System.out.println("---------------------");
    }

    @Test
    public void testValidarUsr() {

        int contra = 2222;

        boolean resultado = usr.validarPassword(contra);

        assertTrue(resultado);
    }

    @Test
    public void testValidarEmail() {

        String email = "juanjo@gmail.com";

        boolean valido = email.contains("@")
                && email.contains(".")
                && email.length() < 20;

        assertTrue(valido);
    }

    @Test
    public void testCambioPass() {

        String newPass = "1234";

        usr.cambioPassword(newPass);

        System.out.println("se cambio la pass");

        assertEquals(1234, usr.getPass());
    }

    @Test(timeout = 30)
    public void testDelay() {

        usr.delay(50);
    }

    @Test
    public void testUsuariosDiferentes() {

        Usuario u1 = new Usuario("Pablo", 1111);
        Usuario u2 = new Usuario("Maira", 2222);

        assertNotSame("mismo usuario", u1, u2);
    }
    
    
    
    
    
    
    
    
    
}
