package com.leavetracker.app; 

import com.leavetracker.model.Employee; 
import com.leavetracker.model.LeaveRequest; 

public class Main {
    public static void main(String s[]){
        // lets create an instance of an Employee with the following details 
        Employee employee1 = new Employee(101, "Kwame Asante", "Engineering", "kwame@company.com"); 
        Employee employee2 = new Employee(102, "Ama Mensah", "Marketing", "ama@company.com"); 

        // lets create a new employee using the default constructor
        Employee employee3 = new Employee(); 
        System.out.println("Employee Details Before: -----"); 
        employee3.setEmpName("Linda Samuel");
        employee3.setEmpDept("Front-Desk");
        employee3.setEmpEmail("slinda@company.com");

        //lets create two instances of a Leave requests
        LeaveRequest request1 = new LeaveRequest(001, "2026-04-15", "2026-04-20", "Pending", "Going on Vacation"); 
        LeaveRequest request2 = new LeaveRequest(002, "2026-05-01", "2026-05-05", "Approved", "Going on a Funeral"); 

        // lets prints to verify 
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(request1);
        System.out.println(request2);

        // lets create get an an employees details and their remaining level balance. 
        System.out.println("Employee Name: " + employee1.getEmpName()); 
        System.out.println("Employee Leave Balance: " + employee1.getEmpLeaveBalance()); 

        // lets lets employee details validations: 
        employee1.setEmpName(null);
        employee1.setEmpName(" ");
        employee1.setEmpEmail("famguy");
        employee1.setEmpEmail("famguy@email.com");

        // lets also test set employee leave balance validations: 
        employee1.setEmpLeaveBalance(-5);
        employee1.setEmpLeaveBalance(30);

        // lets test the leave request validation 
        LeaveRequest leavereq1 = new LeaveRequest(001, "2026-04-15", "2026-04-20", "Pending", "Going on Vacation");
        leavereq1.setStatus("Banana");
        leavereq1.setStatus("Approved");
        System.out.println(leavereq1);

        //lets create a new instance of an employee and make them apply for a leave
        Employee employee_3 = new Employee(103, "Kofi Boateng", "Finance", "kofi@company.com");
        LeaveRequest leavereq2 = new LeaveRequest(002, "2026-05-01", "2026-05-05", "Approved", "Going on a Funeral"); 
        System.out.println("Employee Leave Balance Before: " + employee_3.getEmpLeaveBalance());

        employee_3.applyLeaveRequest(leavereq2);

        System.out.println("Employee Leave Balance After Request: " + employee_3.getEmpLeaveBalance()); 
        System.out.println("Employee Leave Request Status: " + leavereq2.getStatus());


    }
}
