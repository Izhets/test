package ru.redcollar.test.model.factories;

import org.springframework.stereotype.Component;
import ru.redcollar.test.model.dto.EmployeeDto;
import ru.redcollar.test.model.entities.EmployeeEntity;

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
