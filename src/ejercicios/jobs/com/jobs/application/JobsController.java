package ejercicios.jobs.com.jobs.application;

import ejercicios.jobs.com.jobs.domain.AbsStaffMember;
import ejercicios.jobs.com.jobs.domain.Employee;
import ejercicios.jobs.com.jobs.domain.Volunteer;
import ejercicios.jobs.com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		repository = new EmployeeRepository();
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManagerEmployee());
		repository.addMember(manager);
	}

	public void payAllEmployeers() {
		for (AbsStaffMember absStaffMember : repository.getAllMembers()) {
			absStaffMember.pay();
		}
	}

	public String getAllEmployees() {
		String allEmployees = "";
		for (AbsStaffMember absStaffMember : repository.getAllMembers()) {
			allEmployees+=(absStaffMember.toString()+"\n");
		}
		return allEmployees;
	}

	public void createVolunteer(String name, String address, String phone, String description) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);
	}
}
