public class BusinessSystem {
    public static void main(String[] args) {
        Employee manager= new Manager(100,"Ahmed",5000);
        Employee salesPerson= new SalesPerson(101,"mohammed",2000);
        Employee intern=new Intern(102,"Ali", 3000);
        Employee[] employees={manager, salesPerson, intern};
         for (int i=0; i<=employees.length;i++){
             employees[i].displayInfo();
             System.out.println("Your gross salary is: "+employees[i].calculateSalary());
         }

    }
}
