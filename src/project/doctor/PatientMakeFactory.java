package project.doctor;

public class PatientMakeFactory implements PatientFactory{
    @Override
    public Patient makePatient(String name, String type) {
        if(type.equalsIgnoreCase("kid")){
            return new Kids(name);
        }else if(type.equalsIgnoreCase("Old")){
            return new Old(name);
        }else{
            throw new IllegalArgumentException("There is no such patient type!");
        }
    }
}
