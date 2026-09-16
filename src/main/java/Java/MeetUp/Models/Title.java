package Java.MeetUp.Models;

import jakarta.persistence.*;

@Entity
public class Title {

    @GeneratedValue
    @Id
    @Column(name = "title_id")
    private int titleId;

    @Column(name = "description")
    private String description;
}
