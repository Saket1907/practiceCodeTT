package SpringBoot;


@Service
public class Service {
	
	public Doctor getDoctorDetails(String nameOfDoctor) {
		
		Repositoy.findByName(nameOfDoctor);
		
		
		return Doctor;
	}
	

}
