package ejercicios.jobs.com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
	}

	@Override
	public void pay() {
		totalPaid = 0;
	}

	@Override
	public String toString() {
		return "Volunteer -> id: " + id + ", name: " + name +", address " + address + ", phone " + phone + ", totalPaid " + totalPaid ;
	}
}
