package SpringBoot;

public interface Repository extends JpaRepository<Doctor, Id>{
	
	@Query(value = "select * from doctor d left join doctorSlot ds d on d.id = ds.id", native)
	findByName(String nameOdDoctor);
	
	
}
