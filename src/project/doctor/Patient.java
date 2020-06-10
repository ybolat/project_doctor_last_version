package project.doctor;

public abstract class Patient {
    String pName;

    public Patient(String pName){
        this.pName = pName;
    }

    abstract void GoToDoctor(Doctor doctor);

    public String get_pName(){
        return this.pName;
    }
}
