package bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    
    @OneToMany(mappedBy = "team1", cascade = CascadeType.ALL)
    private Set<Event> eventsAsTeam1 = new HashSet<Event>();
    
    @OneToMany(mappedBy = "team2", cascade = CascadeType.ALL)
    private Set<Event> eventsAsTeam2 = new HashSet<Event>();
    
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

    public Set<Event> getEventsAsTeam1() {
        return eventsAsTeam1;
    }

    public void setEventsAsTeam1(Set<Event> eventsAsTeam1) {
        this.eventsAsTeam1 = eventsAsTeam1;
    }

    public Set<Event> getEventsAsTeam2() {
        return eventsAsTeam2;
    }

    public void setEventsAsTeam2(Set<Event> eventsAsTeam2) {
        this.eventsAsTeam2 = eventsAsTeam2;
    }
}
