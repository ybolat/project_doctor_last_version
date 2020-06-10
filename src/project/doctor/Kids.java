package project.doctor;

public class Kids extends Patient{

    public Kids(String pName) {
        super(pName);
    }

    @Override
    void GoToDoctor(Doctor doctor) {
        doctor.check(pName);
    }
}
