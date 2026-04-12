package com.leavetracker.model; 

public class LeaveRequest {

    private int requestId;
    private String startDate; 
    private String endDate; 
    private String status; 
    private String reason; 

    // lets create a default constructor 
    public LeaveRequest(){
        this.requestId = 0;
        this.startDate = ""; 
        this.endDate = ""; 
        this.status = "Pending";
        this.reason = "";
    }

    // lets create a parameterized constructor
    public LeaveRequest(int requestId, String startDate, String endDate, String status, String reason){
        this.requestId = requestId; 
        this.startDate = startDate; 
        this.endDate = endDate;
        this.status = status; 
        this.reason = reason; 
    }

    //lets create getters 
    public String getStartDate(){
        return startDate; 
    }

    public String getEndDate(){
        return endDate;
    }

    public String getStatus(){
        return status; 
    }



    //lets create setters 

    public void setStartDate(String startDate){
        this.startDate = startDate; 
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public void setStatus(String status){
        if (status.equals("Pending") || status.equals("Approved") || status.equals("Denied") ){
            this.status = status; 
        }else{
            System.out.println("Invalid Status, must be either Pending, Approved, or Denied.");
        }
      
    }

    @Override
    public String toString(){
        return "Start Date: " + startDate + ", End Date: " + endDate + " , Status: " + status;
    }
}