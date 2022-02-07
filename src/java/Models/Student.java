/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;


/**
 *
 * @author maria
 */
public class Student extends Person {
    private String studentNumber;
    private String averageMark;

    public Student() {
    }

    public Student(String studentNumber, String averageMark, String name, String phoneNumber, String email, String userType) {
        super(name, phoneNumber, email, userType);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }
    

    /**
     * @return the studentNumber
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return the averageMark
     */
    public String getAverageMark() {
        return averageMark;
    }

    /**
     * @param averageMark the averageMark to set
     */
    public void setAverageMark(String averageMark) {
        this.averageMark = averageMark;
    }
    
    //CRUD
    public String consultStudent(){
        return "El usuario de estudiante ha sido encontrado exitosamente";
    }
    
    public String editStudent(){
        return "El usuario de estudiante ha sido editado exitosamente";
    }
    
    public String deleteStudent(){
        return "El usuario de estudiante ha sido eeliminado exitosamente";
    }
    
    public String insertStudent(){
       return "El usuario de estudiante se ha ingresado correctamente"; 
    }
    
    public String getData(){
        String cadena = "<b>Nombre:</b> "
                + this.getName()
                + "<br/> <b>Telefono:</b> "
                + this.getPhoneNumber()
                + "<br/> <b>Correo:</b> "
                + this.getEmail()
                + "<br/> <b>Codigo Estudiante:</b> "
                + this.getStudentNumber()
                + "<br/> <b>Nota Promedio:</b> "
                + this.getAverageMark();
        
        return cadena;
        
    }
    
}
