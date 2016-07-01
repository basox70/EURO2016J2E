package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idTeam")
    private int id;
    
    @Column(name="name")
    private String name;
    
    //private String group;

    public int getId() {
        return id;
    }

    /*public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
