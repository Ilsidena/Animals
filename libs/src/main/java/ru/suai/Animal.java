package ru.suai;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Animal {
    @Id
    String name;
    String food;
    int count;

    public Animal () {
        this.name = "unknown";
        this.food = "unknown";
        this.count = 0;
    }

    public Animal (String name) {
        this.name = name;
        this.food = "unknown";
        this.count = 0;
    }

    public void feed (String food, int count) {
        this.count = count;
        this.food = food;
    }
}
