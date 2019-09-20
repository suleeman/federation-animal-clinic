/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.federationanimalclinic.beans;
import java.util.Date;

/**
 *
 * @author Moiz Ahmad Mughal
 */

public class Appointment {
    boolean NURSE,BED,CAGE;
    private String petName,vetName,appoinmentType,date,nurse,bed,cage;
    private int roomNumber;
   
    
    public Appointment(){
    NURSE = BED = CAGE = false;
    }

    public boolean isNURSE() {
        return NURSE;
    }

    public void setNURSE(boolean NURSE) {
        this.NURSE = NURSE;
    }

    public boolean isBED() {
        return BED;
    }

    public void setBED(boolean BED) {
        this.BED = BED;
    }

    public boolean isCAGE() {
        return CAGE;
    }

    public void setCAGE(boolean CAGE) {
        this.CAGE = CAGE;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getAppoinmentType() {
        return appoinmentType;
    }

    public void setAppoinmentType(String appoinmentType) {
        this.appoinmentType = appoinmentType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    

    
    
    
    
}
