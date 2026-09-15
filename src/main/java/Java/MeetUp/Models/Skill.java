package Java.MeetUp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Skill {

    @GeneratedValue
    @Id
    @Column (name = "skill_id")
    private int skillId;

    @Column(name = "name")
    private String skillName;
}
