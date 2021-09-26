package ru.redcollar.test.model.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String surname;
    private String name;
    private String patronymic;

    private Timestamp dateOfBirth;

    private Long phoneNumber;
    private String position;
    private Long salary;
    private Long experience;
    private String workingSchedule;
    private Long seniorityAllowance;

}
