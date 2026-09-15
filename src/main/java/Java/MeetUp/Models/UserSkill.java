package Java.MeetUp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;

public class UserSkill {

    @JoinColumn (name = "user_id", referencedColumnName = "user_id")
    @Column (name = "userId")
    private int userId;

    @JoinColumn (name = "skill_id", referencedColumnName = "skill_id")
    @Column (name = "skillId")
    private int skillId;
}
