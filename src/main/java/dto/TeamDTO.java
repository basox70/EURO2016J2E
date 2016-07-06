/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import bean.Team;
import java.io.Serializable;

/**
 *
 * @author Alexy Duquesnoy
 */
public class TeamDTO implements Serializable {
    public int id;
    public String name;

    public TeamDTO(Team team) {
        this.id = team.getId();
        this.name = team.getName();
    }
    
}
