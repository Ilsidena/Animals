package ru.suai;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Animal {
    @Id
    String name;

    @OneToMany(targetEntity=Animal.class, mappedBy="feeds", fetch=FetchType.EAGER)
    List<Feed> feeds;

    public Animal () {
        this.name = "unknown";
        this.feeds = new ArrayList <> ();
    }

    public Animal (String name) {
        this.name = name;
        this.feeds = new ArrayList <> ();
    }

    public boolean feed (String food, int count) {
        Feed feed = new Feed (food, count);
        return this.feeds.add (feed);
    }
}
