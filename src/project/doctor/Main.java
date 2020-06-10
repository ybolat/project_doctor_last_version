package project.doctor;

public class Main {

    public static void main(String[] args) {
        Doctors doctor = new Doctors(new DoctorMakeFactory());
        Doctor Aizhan = doctor.makeDoctor("Aizhan" , "Therapist");
        Doctor Aldana = doctor.makeDoctor("Aldana" , "Pediatrician");
        Doctor Leva = doctor.makeDoctor("Leva" , "Dermatologist");

        Patients patient = new Patients(new PatientMakeFactory());
        Patient Yerassyl = patient.makePatient("Yerassyl" , "kid");
        Patient Bob = patient.makePatient("Bob" , "Old");

        Yerassyl.GoToDoctor(Aldana);

        Bob.GoToDoctor(Leva);
    }
}
