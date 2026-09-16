package Java.MeetUp.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class WorkshopDate {
    @GeneratedValue
    @Id
    @Column(name = "workshop_date_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "workshop_id")
    private Workshop workshop;

    @Column(name = "day_time")
    private LocalDate time;
}
