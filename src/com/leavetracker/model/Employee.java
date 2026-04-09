public class Employee {
    // lets create class attributes 
    private int empID; 
    private String empName; 
    private String empDept; 
    private String empEmail; 


    // lets create the constructor 
    public Employee(int EmpID, String EmpName, String EmpDept, String EmpEmail){
        this.empID = EmpID; 
        this.empName = EmpName; 
        this.empDept = EmpDept; 
        this.empEmail = EmpEmail; 
    }

    // lets create getters 
    public int getEmpID(){
        return empID;
    }

    public String getEmpName(){
        return empName; 
    }

    public String getempDept(){
        return empDept;
    }

    public String getempEmail(){
        return empEmail;
    }

    // lets create setters 
    public void setEmpName(String empName){
        this.empName = empName;
    }

    public void setEmpDept(String empDept){
        this.empDept = empDept; 
    }

    public void setEmpEmail(String empEmail){
        this.empEmail = empEmail;
    }

    public String toString(){
        return "EmpId: " + empID + " , Name: " + empName + " , Department: " + empDept + " , Email: " + empEmail;
    }
}