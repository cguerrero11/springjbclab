package edu.wctc.jbclab.Recipe.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Photo")
public class Photo {
    @Id
    @Column(name = "photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @JoinColumn(name = "recipe_id")
    private int collectorId;

    @Column(name = "filename")
    private String filename;

    @Column(name = "datestamp")
    private LocalDateTime datestamp;

    @Column(name = "caption")
    private String caption;

    @Column(name= "visible")
    private boolean visible;


}
