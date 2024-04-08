// Класс, в котором будут храниться все пациенты данной клиники.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();


    // Создан класс, который позволяет добавлять пациента(ОДНОГО!!!) в наш список
    public void addPatient(Animal animal){
        patients.add(animal);
    }

    // Класс, который позволяет добавить одновременно НЕСКОЛЬКО!!! пациентов в наш список
    public void addPatients(Animal ... animals){        // ... Это массив, аналогичный []
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
    public void addPatients(Cat barsik, Animal eagle, Penguin penguin, Duck duck, Fish fish) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPatients'");
    }
}
