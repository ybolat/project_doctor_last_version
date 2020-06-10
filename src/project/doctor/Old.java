package project.doctor;

public class Old extends Patient{

    public Old(String pName) {
        super(pName);
    }

    @Override
    void GoToDoctor(Doctor doctor) {
        doctor.check(pName);
    }
}
