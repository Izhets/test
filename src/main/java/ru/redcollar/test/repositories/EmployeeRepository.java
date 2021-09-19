package ru.redcollar.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.redcollar.test.entities.EmployeeEntity;

import java.sql.Time;
import java.util.Optional;
import java.util.stream.Stream;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity, Long> {

    Optional<EmployeeEntity> findBySurname (String surname);
    Optional<EmployeeEntity> findByName (String name);
    Optional<EmployeeEntity> findByPatronymic (String patronymic);
    Optional<EmployeeEntity> findByDateOfBirth (Time dateOfBirth);
    Optional<EmployeeEntity> findByPhoneNumber (Long phoneNumber);
    Optional<EmployeeEntity> findByPosition (String position);
    Optional<EmployeeEntity> findBySalary (Long salary);
    Optional<EmployeeEntity> findByExperience (Long experience);
    Optional<EmployeeEntity> findByWorkingSchedule (String workingSchedule);
    Optional<EmployeeEntity> findBySeniorityAllowance(Long seniorityAllowance);

    Stream<EmployeeEntity> streamAllBy();

}
