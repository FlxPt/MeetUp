package Java.MeetUp.Models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class User {

    @GeneratedValue
    @Id
    @Column (name = "user_id")
    private int userId;

    @Column (name = "username")
    private String username;

    @Column (name = "job")
    private String userJob;

    @Column (name = "business_unit")
    private int businessUnit;

    private ArrayList<Skill> skill;
}
