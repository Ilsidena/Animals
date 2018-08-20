package ru.suai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.suai.service.Caller;

@RestController
public class Controller {
    protected Caller caller;

    @Autowired
    public Controller(Caller caller){
        this.caller = caller;
    }

    @RequestMapping(value = "/feed", method = RequestMethod.GET)
    public Rest  feed (@RequestParam (value = "name", defaultValue = "unknown") String name,
                       @RequestParam (value = "food", defaultValue = "unknown") String food,
                       @RequestParam (value = "count", defaultValue = "0") int count) {
        return caller.getResponse(name, food, count);
    }
}