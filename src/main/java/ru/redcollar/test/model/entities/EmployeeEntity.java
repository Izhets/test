package ru.redcollar.test.model.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;


@Setter
@Getter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "employee")

public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String surname;
    public String name;
    private String patronymic;

    private Timestamp dateOfBirth;

    private Long phoneNumber;
    private String position;
    private Long salary;
    private Long experience;
    private String workingSchedule;
    private Long seniorityAllowance;

    public EmployeeEntity(String name){
        this.name = name;
    }

    public EmployeeEntity() {

    }
}
