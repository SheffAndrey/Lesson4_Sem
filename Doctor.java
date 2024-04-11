
import java.time.LocalDate;

public class Doctor{
    public Doctor() {
        super();
    }

    public Doctor(String name, String profession, String day) {
        super(name, profession, day);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void cure() {

    }

    @Override
    public String getCure() {
        return "Занимается основным лечением";
    }

    @Override
    public void toDo() {
        System.out.println(getName() + " может проводить операции");;
    }
}
