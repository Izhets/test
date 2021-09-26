package ru.redcollar.test.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.redcollar.test.exceptions.LockedAgeException;
import ru.redcollar.test.model.dto.EmployeeDto;
import ru.redcollar.test.model.entities.EmployeeEntity;
import ru.redcollar.test.model.factories.EmployeeDtoFactory;
import ru.redcollar.test.model.repositories.EmployeeRepository;

import java.sql.Timestamp;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDtoFactory employeeDtoFactory;
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeDto createEmployee(String surname, String name, String patronymic,
                                      Timestamp dateOfBirth, Long phoneNumber,
                                      String position, Long salary, Long experience,
                                      String workingSchedule, Long seniorityAllowance) throws LockedAgeException {

        if(!ValidateService.validateAge(dateOfBirth)){
            throw new LockedAgeException("Извините, вам должно быть 18!");
        }

        EmployeeEntity employee = employeeRepository.save(
                EmployeeEntity.builder()
                        .surname(surname)
                        .name(name)
                        .patronymic(patronymic)
                        .dateOfBirth(dateOfBirth)
                        .phoneNumber(phoneNumber)
                        .position(position)
                        .salary(salary)
                        .experience(experience)
                        .workingSchedule(workingSchedule)
                        .seniorityAllowance(seniorityAllowance)
                        .build()
        );
        return employeeDtoFactory.makeEmployeeDto(employee);
    }

}
