package by.bsu.lab4a.reader;

import by.bsu.lab4a.entity.Puppy;
import by.bsu.lab4a.evidence.DogBreed;
import by.bsu.lab4a.exception.FileException;
import by.bsu.lab4a.validator.Validator;
import by.bsu.lab4a.validator.ValidatorImp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DataReader {
    public Puppy readFromFile(String file) throws FileException, FileNotFoundException {

        Validator validator = new ValidatorImp();
        File fileNew = new File(file);
        boolean resultValidator = validator.checkFile(fileNew);
        if (!resultValidator) throw new FileException("File is not exit");

        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);

        String s = new String();
        while (scanner.hasNextLine()) {
            s = scanner.nextLine();
        }

        Puppy puppy = new Puppy();
        String[] words = s.split(" ");

        puppy.setName(words[0]);
        puppy.setAge(Integer.parseInt(words[1]));
        String puppyBreed = new String();
        int puppyBreedIndex = 0;
        String str;
        for (int i = 0; i < DogBreed.values().length; i++) {
            str = String.valueOf(DogBreed.values()[i]);
            if (words[2].equals(str)) {
                puppyBreedIndex = i;
            }
        }
        puppy.setBreed(DogBreed.values()[puppyBreedIndex]);

        return puppy;
    }
}
