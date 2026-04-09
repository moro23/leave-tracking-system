public class LeaveRequest {

    private String startDate; 
    private String endDate; 
    private String status; 


    public LeaveRequest(String startDate, String endDate, String status){
        this.startDate = startDate; 
        this.endDate = endDate;
        this.status = status; 
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
        this.status = status; 
    }

    public String toString(){
        return "Start Date: " + startDate + ", End Date: " + endDate + " , Status: " + status;
    }
}