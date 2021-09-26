package ru.redcollar.test.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.redcollar.test.api.services.EmployeeService;
import ru.redcollar.test.exceptions.LockedAgeException;
import ru.redcollar.test.model.dto.EmployeeDto;
import ru.redcollar.test.model.entities.EmployeeEntity;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

// TODO: все параметры в RequestBody

//TODO: добвать реквест маппинг на уровне класса
// TODO: save
// TODO: добавить свою ошибку если несовершеннолетний, при добавление

@Transactional
@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public EmployeeDto createEmployee(@RequestParam String surname, @RequestParam String name, @RequestParam String patronymic,
                                      @RequestParam Timestamp dateOfBirth, @RequestParam Long phoneNumber, @RequestParam String position,
                                      @RequestParam Long salary, @RequestParam Long experience, @RequestParam String workingSchedule,
                                      @RequestParam Long seniorityAllowance) throws LockedAgeException {

        return employeeService.createEmployee(surname, name, patronymic, dateOfBirth, phoneNumber, position, salary, experience, workingSchedule,seniorityAllowance);
    }

    @GetMapping("/employees")
        public List<EmployeeEntity> findAllEmployees(){
            return employeeService.getAllEmployees();
    }

    @GetMapping("/employeesNames")
    public List<EmployeeEntity> findUserByName(@RequestParam String name){
        return employeeService.findUser(name);
    }


}
