package ru.redcollar.test.api.factories;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import ru.redcollar.test.api.dto.EmployeeDto;
import ru.redcollar.test.entities.EmployeeEntity;

import java.sql.Time;

@Component
public class EmployeeDtoFactory {

    public EmployeeDto makeEmployeeDto(EmployeeEntity entity){

        return EmployeeDto.builder()
                .id(entity.getId())
                .surname(entity.getSurname())
                .name(entity.getName())
                .patronymic(entity.getPatronymic())
                .dateOfBirth(entity.getDateOfBirth())
                .phoneNumber(entity.getPhoneNumber())
                .position(entity.getPosition())
                .salary(entity.getSalary())
                .experience(entity.getExperience())
                .workingSchedule(entity.getWorkingSchedule())
                .seniorityAllowance(entity.getSeniorityAllowance())
                .build();
    }

}
