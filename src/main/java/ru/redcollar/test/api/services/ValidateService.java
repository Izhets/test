package ru.redcollar.test.api.services;

import ru.redcollar.test.exceptions.LockedAgeException;

import java.sql.Date;
import java.sql.Timestamp;

public class ValidateService {

//    public static boolean validateAge(Timestamp dateOfBirth){
//        if (dateOfBirth.getYear() <= 103){
//            return true;
//        }
//        return false;
//    }

    public static void validateAge(Timestamp dateOfBirth) throws LockedAgeException {
        if (dateOfBirth.getYear() >= 103){
           throw new LockedAgeException("Извините, вам должно быть 18!");
        }
    }
}
