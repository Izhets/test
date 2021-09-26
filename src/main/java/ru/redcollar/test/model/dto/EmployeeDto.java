package ru.redcollar.test.model.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    @NonNull
    private Long id;

    @NonNull
    private String surname;

    @NonNull
    private String name;

    @NonNull
    private String patronymic;


    private Timestamp dateOfBirth;

    private Long phoneNumber;

    private String position;

    private Long salary;

    private Long experience;

    private String workingSchedule;

    private Long seniorityAllowance;
}
