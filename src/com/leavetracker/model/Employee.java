package com.leavetracker.model; 

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Employee {
    // lets create class attributes 
    private int empID; 
    private String empName; 
    private String empDept; 
    private String empEmail; 

    // lets set the leave balance of an employee at the beginning of the year.
    private int empLeaveBalance = 40 ; 


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

    public String getEmpDept(){
        return empDept;
    }

    public String getEmpEmail(){
        return empEmail;
    }

    public int getEmpLeaveBalance(){
        return empLeaveBalance; 
    }

    // lets create setters 
    public void setEmpName(String empName){
        if (empName.isEmpty()){
            System.err.println("Employee name cannot be empty.");
        }else{
            this.empName = empName;
        }
    }

    public void setEmpDept(String empDept){
        this.empDept = empDept; 
    }

    public void setEmpEmail(String empEmail){
        if (empEmail == null || empEmail.contains("@")){
          System.out.println("Employee email must be a valid email address");
        }else{
            this.empEmail = empEmail;
        }
      
    }


    public void setEmpLeaveBalance(int empLeaveBalance){
        // lets check if the employees leave balance is alwasy create than o
        if (empLeaveBalance >= 0){
            this.empLeaveBalance = empLeaveBalance;
        }else{
            System.out.println("Employee does not have any remaining leave days.");
        }
       
    }


    // lets create a function to apply for a leave 
    public void applyLeaveRequest(LeaveRequest request){

        // lets get the start and end date of the leave
        LocalDate starDate = LocalDate.parse(request.getStartDate()); 
        LocalDate endDate = LocalDate.parse(request.getEndDate());
        
        // compute the actual leave days from the end and start date
        int actualLeaveDays = (int) ChronoUnit.DAYS.between(starDate, endDate);

        //check if the remaning leavedays is greater or eqaul to the actual leave days requestsed 
        if (empLeaveBalance >= actualLeaveDays){
            // substract the actualLeaveDays from the emp leave balance and return the new balance
            empLeaveBalance -= actualLeaveDays; 
            request.setStatus("Approved");
            System.out.print("Your leave has been granted.");
        }else{
            request.setStatus("Denied");
            System.out.println("You don't have any remaining leave days");
        }

    }


    public String toString(){
        return "EmpId: " + empID + " , Name: " + empName + " , Department: " + empDept + " , Email: " + empEmail;
    }
}