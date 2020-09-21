package edu.wctc.jbclab.Recipe.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Recipe")
public class Recipe {
    @Column(name = "recipe_id")
    private String firstName;

    @OneToMany
    @JoinColumn(name = "chef_id")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

}
