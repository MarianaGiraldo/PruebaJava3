/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

/**
 *
 * @author Mariana
 */
public class Professor extends Person {
    private int salary;
    
    public Professor(){
        
    }

    public Professor(int salary, String name, String phoneNumber, String email, String userType) {
        super(name, phoneNumber, email, userType);
        this.salary = salary;
    }

    
    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    //CRUD
    public String consultProfessor(){
        return "El usuario de profesor ha sido encontrado exitosamente";
    }
    
    public String editProfessor(){
        return "El usuario de profesor ha sido editado exitosamente";
    }
    
    public String deleteProfessor(){
        return "El usuario de profesor ha sido eeliminado exitosamente";
    }
    
    public String insertProfessor(){
       return "El usuario de profesor se ha ingresado correctamente"; 
    }
    
    public String getData(){
        String cadena = "<b>Nombre:</b> "
                + this.getName()
                + "<br/> <b>Telefono:</b> "
                + this.getPhoneNumber()
                + "<br/> <b>Correo:</b> "
                + this.getEmail()
                + "<br/> <b>Salario:</b> "
                + this.getSalary();
        
        return cadena;
    }
}
