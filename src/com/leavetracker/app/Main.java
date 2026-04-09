public class Main {
    public static void main(String s[]){
        // lets create an instance of an Employee with the following details 
        Employee employee1 = new Employee(101, "Kwame Asante", "Engineering", "kwame@company.com"); 
        Employee employee2 = new Employee(102, "Ama Mensah", "Marketing", "ama@company.com"); 

        //lets create two instances of a Leave requests
        LeaveRequest request1 = new LeaveRequest("2026-04-15", "2026-04-20", "Pending"); 
        LeaveRequest request2 = new LeaveRequest("2026-05-01", "2026-05-05", "Approved"); 

        // lets prints to verify 
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(request1);
        System.out.println(request2);
    }
}
