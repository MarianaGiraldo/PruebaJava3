/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Parking {
    private String number;
    private String place;
    private Boolean occupied;
    //private Person owner;
    private String ownersEmail;

    public Parking() {
    }

    
    
    public Parking(String number, String place, Boolean occupied, String ownersEmail) {
        this.number = number;
        this.place = place;
        this.occupied = occupied;
        this.ownersEmail = ownersEmail;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the occupied
     */
    public Boolean getOccupied() {
        return occupied;
    }

    /**
     * @param occupied the occupied to set
     */
    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }
    
    /**
     * @return the ownersEmail
     */
    public String getOwnersEmail() {
        return ownersEmail;
    }

    /**
     * @param ownersEmail the occupied to set
     */
    public void setOwnersEmail(String ownersEmail) {
        this.ownersEmail = ownersEmail;
    }

    
    
    //CRUD
    public String consultParking(){
        return "El parqueadero ha sido encontrado.";
    }
    
    public String editParking(){
        return "El parqueadero ha sido editado exitosamente.";
    }
    
    public String deleteParking(){
        return "El parqueadero ha sido eeliminado exitosamente";
    }
    
    public String insertParking(){
       return "El parqueadero se ha ingresado correctamente"; 
    }
    
    public String getData(){
        String occupiedString;
        if(this.getOccupied()){
            occupiedString = "Si";
        }else{
            occupiedString = "No";
        }
        String cadena = "<b>Numero:</b> "
                + this.getNumber()
                + "<br/> <b>Lugar:</b> "
                + this.getPlace()
                + "<br/> <b>¿Esta ocupado?:</b> "
                + occupiedString
                + "<br/> <b>Email del dueno actual:</b> "
                + this.getOwnersEmail();
        
        return cadena;
    }
    
    public ArrayList listParking(){
        ArrayList parking = new <Parking>ArrayList();
        parking.add(this);
        return parking;
    }
}
