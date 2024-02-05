package SpringBoot;


@RestController
public class Controller {

	
	@GetMapping(name = "/getDoctorsAvailable")
	public Doctor getDocDetails() {
		
		Doctor doctor = Service.getDoctorDetails(request.getName());
		
		
		
		return Doctor;
	}
	
	@PostMapping("/bookDoctor"){
		
		
		
	}
	
	
}
