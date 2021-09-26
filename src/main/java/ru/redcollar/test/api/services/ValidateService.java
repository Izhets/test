package ru.redcollar.test.api.services;

import java.sql.Date;
import java.sql.Timestamp;

public class ValidateService {

    public static boolean validateAge(Timestamp dateOfBirth){
        if (dateOfBirth.getYear() <= 103){
            return true;
        }
        return false;
    }
}
