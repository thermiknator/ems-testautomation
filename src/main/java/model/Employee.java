package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Employee {

    @Id
    private UUID empdId;
    private String firstName;
    private String lastName;
    private Date dOB;
    private String eMail;
    private int depId;

    public Employee() {
    }

    public Employee (String firstName, String lastName, Date dOB, String eMail, int depId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dOB = dOB;
        this.eMail = eMail;
        this.depId = depId;
    }

    public Employee (String empId, String firstName, String lastName, Date dOB, String eMail, int depId){
        this(firstName, lastName, dOB, eMail, depId);
        if(empId != null){
            this.empdId = UUID.fromString(empId);
        }
    }

    public UUID getEmpdId() {
        return empdId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getdOB() {
        return dOB;
    }

    public String geteMail() {
        return eMail;
    }

    public int getDepId() {
        return depId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setdOB(Date dOB) {
        this.dOB = dOB;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }
}
