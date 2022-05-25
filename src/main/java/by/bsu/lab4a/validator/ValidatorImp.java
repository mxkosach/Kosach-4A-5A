package by.bsu.lab4a.validator;

import java.io.File;

public class ValidatorImp implements Validator {

    public ValidatorImp() {
    }

    @Override
    public boolean checkFile(File file) {
        if (file == null || !file.exists() || file.isDirectory() || file.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}