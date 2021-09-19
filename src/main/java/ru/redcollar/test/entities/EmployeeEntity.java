package ru.redcollar.test.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Time;
import java.time.Instant;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String surname;
    String name;
    String patronymic;

    Time dateOfBirth;
    Long phoneNumber;
    String position;
    Long salary;
    Long experience;
    String workingSchedule;
    Long seniorityAllowance;

}
