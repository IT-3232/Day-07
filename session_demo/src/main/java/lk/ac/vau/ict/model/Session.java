package lk.ac.vau.ict.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Session {
    @Id
    private String id;
    
    private String name;
    private String description;
    private LocalDate date;
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "workshop_id")
    private Workshops workshops;
}
