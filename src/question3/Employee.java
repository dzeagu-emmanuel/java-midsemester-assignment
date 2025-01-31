package question3;

public class Employee {
    protected String empName;
    protected String empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;
    protected double basicPay;

    public Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        return basicPay + da + hra;
    }

    public double calculateNetSalary() {
        double pf = 0.12 * basicPay;
        double clubFund = 0.001 * basicPay;
        return calculateGrossSalary() - pf - clubFund;
    }

    public void displayPaySlip(String employeeType) {
        System.out.println("********* " + employeeType + " ********");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println();
    }
}

class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class Professor extends Employee {
    public Professor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

