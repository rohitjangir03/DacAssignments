package EmployeeManagementSystem;
import java.io.Serializable;
import java.time.LocalDate;

public class employee implements Serializable {
    private String id;
    private String firstName;
    private String lastName;
    private dept deptNo ; 
    private double salary;
    private LocalDate joinDate;

    public employee(String id, String firstName, String lastName, dept deptNo, double salary, LocalDate joinDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNo = deptNo;
        this.salary = salary;
        this.joinDate = joinDate;
    }
    public employee(String id){
        this.id  = id;
    }

    @Override
    public boolean equals(Object O){
    if(O instanceof employee)
       return this.id.equals(((employee)O).id);
     return false;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public dept getDeptNo() {
        return this.deptNo;
    }

    public void setDeptNo(dept deptNo) {
        this.deptNo = deptNo;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoinDate() {
        return this.joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", deptNo='" + getDeptNo() + "'" +
            ", salary='" + getSalary() + "'" +
            ", joinDate='" + getJoinDate() + "'" +
            "}";
    }

}
