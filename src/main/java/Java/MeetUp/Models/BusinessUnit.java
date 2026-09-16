package Java.MeetUp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BusinessUnit {

    @GeneratedValue
    @Id
    @Column (name = "business_unit_id")
    private int id;

    @Column (name = "business_unit")
    private String name;

}
