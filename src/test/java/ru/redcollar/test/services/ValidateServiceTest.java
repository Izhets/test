package ru.redcollar.test.services;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.redcollar.test.api.services.EmployeeService;
import ru.redcollar.test.exceptions.LockedAgeException;
import ru.redcollar.test.model.factories.EmployeeDtoFactory;
import ru.redcollar.test.model.repositories.EmployeeRepository;

import java.sql.Timestamp;

//@ExtendWith(SpringExtension.class)
//
//@ContextConfiguration(classes = TestConfig.class,
//        loader = AnnotationConfigContextLoader.class)

public class ValidateServiceTest {

//    @Mock
//    private EmployeeRepository employeeRepository;
//
//    private EmployeeService employeeService;
//
//    // mocked dependencies
//    public ValidateServiceTest(){
//        MockitoAnnotations.initMocks(this);
//        this.employeeService = new EmployeeService();
//    }

    @Mock
   // EmployeeService employeeService;

    EmployeeService employeeService = Mockito.mock(EmployeeService.class);

    @Test
    public void chekCheTo() throws LockedAgeException {
        Mockito.when(employeeService.createEmployee("Хныкин", "Данила", "Иванович",
                            Timestamp.valueOf("2004-05-30T20:00:00.000+00:00"), Long.valueOf("1444"), "Мастер", Long.valueOf("1444"),
                        Long.valueOf("1444"), "5/2", Long.valueOf("1444")))
                .thenThrow(new LockedAgeException("18!"));
        }
    }

