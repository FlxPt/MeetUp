package Java.MeetUp.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Workshop {

  @GeneratedValue
  @Id
  @Column(name = "workshop_id")
  private int id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @ManyToMany
  @JoinTable(
      name = "workshop_skill",
      joinColumns = @JoinColumn(name = "workshop_id"),
      inverseJoinColumns = @JoinColumn(name = "skill_id"))
  private List<Skill> skills;

  @OneToMany(mappedBy = "workshop")
  private List<WorkshopDate> workshopDates;
}
