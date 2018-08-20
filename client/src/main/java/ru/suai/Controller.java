package ru.suai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.Optional;

@RestController
class Controller {
    @RequestMapping("/feed")
    public Rest  feed (@RequestParam (value = "name", defaultValue = "unknown") String name,
                       @RequestParam (value = "food", defaultValue = "unknown") String food,
                       @RequestParam (value = "count", defaultValue = "0") int count) {
        Animal animal = zoo.findById(name);

       if (animal == null)
            animal = new Animal(name);

        animal.feed(food, count);
        zoo.save(animal);

        return new Rest (name, new Feed (food, count))  ;
    }

    @Autowired
    public Controller () {
        zoo = new Zoo ();
    }

    private Zoo zoo;
}
