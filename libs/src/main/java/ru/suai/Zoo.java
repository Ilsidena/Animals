package ru.suai;

/*
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Zoo extends CrudRepository <Animal, String> {
}
*/

import java.util.LinkedList;
import java.util.ListIterator;

public class Zoo {
    private LinkedList<Animal> zoo;

    public Zoo (){
        zoo = new LinkedList<>();
    }

    public Animal findById (String Id) {
        ListIterator <Animal> itr = zoo.listIterator();

        while (itr.hasNext()) {
            if (itr.next().getName() == Id)
                return itr.previous();
        }

        return null;
    }

    public boolean save (Animal animal) {
        Animal tmp;

        if ((tmp = this.findById(animal.name)) == null)
            return zoo.add(animal);

        zoo.remove(tmp);
        return zoo.add(animal);
    }
}