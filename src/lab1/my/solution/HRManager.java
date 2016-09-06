/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

/**
 *
 * @author amellem
 */
public class HRManager{
    private Employee employee;
    private static int cubeId;
    
    public void orientNewEmployee(String firstName, String lastName, String ssn){
        Employee e = new Employee();
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        e.completeEmployeeOrientation("A101");
        employee = e;
    }
}
