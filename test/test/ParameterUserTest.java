/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Admin
 */


import pkg2do.parcial.herrera.agustin.Usuario;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ParameterUserTest {

    private final String valorActual;
    private final Usuario usr;
    private final int valorEsperado;

    public ParameterUserTest(String valorActual, Usuario usr, int valorEsperado) {

        this.valorActual = valorActual;
        this.usr = usr;
        this.valorEsperado = valorEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {

        return Arrays.asList(new Object[][]{

            {"1234", new Usuario("juan", 1111), 1234},
            {"123", new Usuario("juan", 1111), 1234},
            {"abcd", new Usuario("juan", 1111), 1234}

        });
    }

    @Test
    public void testCambioPass() {

        try {

            usr.cambioPassword(valorActual);

            assertEquals(valorEsperado, usr.getPass());

        } catch (Exception e) {

            fail("error al cambiar password");
        }
    }
    
    
    
}
