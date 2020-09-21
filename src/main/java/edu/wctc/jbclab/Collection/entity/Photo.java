package edu.wctc.jbclab.Collection.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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
    @NotBlank
    @JoinColumn(name = "collector_id")
    private int collectorId;

    @Column(name = "filename")
    private String filename;

    @Column(name = "datestamp")
    private LocalDateTime datestamp;

    @Column(name= "visible")
    private boolean visible;
}
