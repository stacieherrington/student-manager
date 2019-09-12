/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.util.ArrayList;

/**
 *
 * @author stacie
 */
public class Student {
    private int iD;
    private String name;
    private String major;
    private double gpa;
    private ArrayList<Address> addresses = new ArrayList<>();
    
    public ArrayList<Address> getAddresses() {
        return addresses;
    }
    public void addAddress(Address address) {
        addresses.add(address);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }
    public double getGpa() {
        return gpa;
    }
    void setId(int iD) {
        this.iD = iD;
    }
    public int getId() {
        return iD;
    }
}
