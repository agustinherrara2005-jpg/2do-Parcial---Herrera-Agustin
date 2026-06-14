/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2do.parcial.herrera.agustin;

/**
 *
 * @author Admin
 */
public class Usuario {

    private String user;
    private int pass;

    public Usuario() {
    }

    public Usuario(String user, int pass) {
        this.user = user;
        this.pass = pass;
    }

    public boolean validarPassword(int contra) {
        return pass == contra;
    }

    public void cambioPassword(String newPass) {
        pass = Integer.parseInt(newPass);
    }

    public void delay(int mili) {

        try {

            Thread.sleep(mili);

        } catch (InterruptedException e) {

            System.out.println("delay de " + mili + " milisegundos");
        }
    }

    public boolean usuariosDiferentes(Usuario u2) {

        return !this.equals(u2);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
    
    
}