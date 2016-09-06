package lab1.my.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    // Keep variables private whenever possible
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date currentDate;

    public Employee() {
        currentDate = new Date();
    }

    public void completeEmployeeOrientation(String cubeId){
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }
    
    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");
        String formatDate = simpleDateFormat.format(currentDate);
        System.out.println("Met with Hr on " + formatDate);
        metWithHr = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if(metWithHr) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");
            String formatDate = simpleDateFormat.format(currentDate);
            System.out.println("Met with Dept. Staff on " + formatDate);
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");
            String formatDate = simpleDateFormat.format(currentDate);
            System.out.println("Reviewed Dept. Policies on " + formatDate);
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");
            String formatDate = simpleDateFormat.format(currentDate);
            System.out.println("Moved into cube on " + formatDate);
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");
        String formatDate = simpleDateFormat.format(currentDate);

        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + formatDate;
        } else {
            return formatDate + ": Orientation in progress...";
        }
    }

    
    
    public String getFirstName() {
        //needs validation
        return firstName;
    }

    public void setFirstName(String firstName) {
        //needs validation
        this.firstName = firstName;
    }

    public String getLastName() {
        //needs validation
        return lastName;
    }

    public void setLastName(String lastName) {
        //needs validation
        this.lastName = lastName;
    }

    public String getSsn() {
        //needs validation
        return ssn;
    }

    public void setSsn(String ssn) {
        //needs validation
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        //needs validation
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        //needs validation
        this.birthDate = birthDate;
    }

    public boolean isMetWithHr() {
        //needs validation
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        //needs validation
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        //needs validation
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        //needs validation
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        //needs validation
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        //needs validation
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        //needs validation
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        //needs validation
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        //needs validation
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        //needs validation
        this.cubeId = cubeId;
    }

    public Date getCurrentDate() {
        //needs validation
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        //needs validation
        this.currentDate = currentDate;
    }
    
    
}
