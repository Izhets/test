package ru.redcollar.test.api.controllers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.redcollar.test.api.dto.EmployeeDto;
import ru.redcollar.test.api.factories.EmployeeDtoFactory;
import ru.redcollar.test.entities.EmployeeEntity;
import ru.redcollar.test.repositories.EmployeeRepository;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RequiredArgsConstructor //все финальные поля засовывает в констурктор и создает их
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Transactional
@RestController

public class EmployeeController {

    EmployeeDtoFactory employeeDtoFactory;
    EmployeeRepository employeeRepository;

    public static final String CREATE_EMPLOYEE = "/api/employees";

    @PostMapping(CREATE_EMPLOYEE)
    public EmployeeDto createEmployee(@RequestParam String surname, String name, String patronymic,
                                      Time dateOfBirth, Long phoneNumber, String position, Long salary,
                                      Long experience, String workingSchedule, Long seniorityAllowance){

        employeeRepository
                .findBySurname(surname);
        employeeRepository
                .findByName(name);
        employeeRepository
                .findByPatronymic(patronymic);
        employeeRepository
                .findByDateOfBirth(dateOfBirth);
        employeeRepository
                .findByPhoneNumber(phoneNumber);
        employeeRepository
                .findByPosition(position);
        employeeRepository
                .findBySalary(salary);
        employeeRepository
                .findByExperience(experience);
        employeeRepository
                .findByWorkingSchedule(workingSchedule);
        employeeRepository
                .findBySeniorityAllowance(seniorityAllowance);



        EmployeeEntity employee = employeeRepository.saveAndFlush(
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

    @GetMapping("/api/employees")
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }


}
