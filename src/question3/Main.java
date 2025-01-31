package question3;

public class Main {
    public static void main(String[] args) {

        AssistantProfessor assistantProfessor = new AssistantProfessor("Jane Smith", "01210528B", "456  St", "jane@gmail.com", "+23355654321", 40000);
        assistantProfessor.displayPaySlip("AssistantProfessor");

        AssociateProfessor associateProfessor = new AssociateProfessor("Richard Frimpong", "01210584B", "Emmanuel St", "frimpong@egmail.com", "+2333247654341", 45000);
        associateProfessor.displayPaySlip("AssociateProfessor");

        Employee employee = new Employee("Reuben Godbless", "01210427B", "Nii Amui St", "godbless@gmail.com", "+233552453676", 30000);
        employee.displayPaySlip("Employee");

        Professor professor = new Professor("Afrifa Emmanuel", "01210547B", "123 no.2 St", "afrifaemmanuel@gmail.com", "+23350432436", 50000);
        professor.displayPaySlip("Professor");

        Programmer programmer = new Programmer("Emmanuel Dzeagu", "01210527B", "123 Dublin St", "dzeaguemmanuel@gmail.com", "+233552878485", 80000);
        programmer.displayPaySlip("Programmer");


    }
}


