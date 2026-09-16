package Java.MeetUp.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Workshop {

  @GeneratedValue
  @Id
  @Column(name = "workshop_id")
  private int workshopId;

  @Column(name = "name")
  private String workshopName;

  @Column(name = "description")
  private String workshopDescription;

  @ManyToMany
  @JoinTable(
      name = "workshop_skill",
      joinColumns = @JoinColumn(name = "workshop_id"),
      inverseJoinColumns = @JoinColumn(name = "skill_id"))
  private List<Skill> skills;
}
