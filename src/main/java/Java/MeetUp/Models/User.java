package Java.MeetUp.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

  @GeneratedValue
  @Id
  @Column(name = "app_user_id")
  private int id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "surname")
  private String surname;

  @ManyToOne
  @JoinColumn(name = "title_id")
  private Title title;

  @ManyToOne
  @JoinColumn(name = "business_id")
  private BusinessUnit businessUnit;

  @ManyToMany
  @JoinTable(
      name = "app_user_skill",
      joinColumns = @JoinColumn(name = "app_user_id"),
      inverseJoinColumns = @JoinColumn(name = "skill_id"))
  private List<Skill> skills;
}
