package Java.MeetUp.Models;

import jakarta.persistence.*;
import jdk.jfr.Name;

import java.time.LocalDate;

@Entity
public class Appointment {

    @GeneratedValue
    @Id
    @Column (name = "appointment_id")
    private int appointmentId;

    @Column (name = "number")
    private int appointmentNumber;

    @Column (name = "date")
    private LocalDate appointmentDate;
}
