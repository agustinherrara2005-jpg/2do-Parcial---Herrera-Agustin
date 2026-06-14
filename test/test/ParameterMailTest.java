/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Admin
 */


import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterMailTest {

    private final String email;
    private final boolean esperado;

    public ParameterMailTest(String email, boolean esperado) {

        this.email = email;
        this.esperado = esperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {

        return Arrays.asList(new Object[][]{

            {"juanjo@gmail.com", true},
            {"agustin123@hotmail.com", true},
            {"correo_invalido", false},
            {"@gmail", false},
            {"sinarroba.com", false}

        });
    }

    public static boolean validarMail(String email) {

        Pattern pattern = Pattern.compile(
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        );

        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }

    @Test
    public void testValidarMail() {

        assertEquals(esperado, validarMail(email));
    }
    
    
}