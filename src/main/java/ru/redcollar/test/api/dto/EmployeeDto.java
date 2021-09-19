package ru.redcollar.test.api.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Time;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class EmployeeDto {

    @NonNull
    Long id;

    @NonNull
    String surname;

    @NonNull
    String name;

    @NonNull
    String patronymic;


    Time dateOfBirth;

    Long phoneNumber;

    String position;

    Long salary;

    Long experience;

    String workingSchedule;

    Long seniorityAllowance;
}
