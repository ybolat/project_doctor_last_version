package project.doctor;

public class DoctorMakeFactory implements DoctorsFactory{
    @Override
    public Doctor makeDoctor(String name , String type) {
        if(type.equalsIgnoreCase("Therapist")){
            return new Therapist(name);
        }else if(type.equalsIgnoreCase("Pediatrician")){
            return new Pediatrician(name);
        }else if(type.equalsIgnoreCase("Dermatologist")){
            return new Dermatologist(name);
        }else{
            throw new IllegalArgumentException("THere is no such doctor type!");
        }
    }
}
