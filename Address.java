/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author stacie
 */
class Address {
    private int index;
    private String city;
    private String state;
    private int studentId;
    
    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setStudentId(int iD) {
        this.studentId = iD;
    }
    public int getStudentId() {
        return studentId;
    }
}
