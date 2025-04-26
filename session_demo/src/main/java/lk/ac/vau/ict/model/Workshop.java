package lk.ac.vau.ict.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Workshop {
    @Id
    private int id;

    private String description;
    private String name;

    private LocalDate startDate;
    private LocalDate endDate;

    

}
