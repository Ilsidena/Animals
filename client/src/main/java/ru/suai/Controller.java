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
    public Animal  feed (@RequestParam (value = "name", defaultValue = "unknown") String name,
                       @RequestParam (value = "food", defaultValue = "unknown") String food,
                       @RequestParam (value = "count", defaultValue = "0") int count) {
       zoo.save(new Animal(name, food, count));

        return new Animal(name, food, count)  ;
    }

    @Autowired
    public Controller (Zoo zoo) {
        this.zoo = zoo;
    }

    private Zoo zoo;
}
