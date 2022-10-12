package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.id = 1;
		customer.firstName = "Hakkı";
		customer.lastName = "Terzi";
		customer.email = "abc@hotmail.com";

		Employee employee = new Employee();
		employee.id = 1;
		employee.firstName = "Ali";
		employee.lastName = "Üzüm";
		employee.salary = 5000;

		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.BestEmployee();

	}

}
