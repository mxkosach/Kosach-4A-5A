package by.bsu.lab4a.main;

import by.bsu.lab4a.action.PuppyOperator;
import by.bsu.lab4a.entity.Puppy;
import by.bsu.lab4a.exception.FileException;
import by.bsu.lab4a.reader.DataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.FileNotFoundException;

public class Main {
    static Logger logger= LogManager.getLogger();
    public static void main(String[] args) throws FileNotFoundException,FileException {
        //Puppy puppy=new Puppy("Charlie",2,POODLE);
        DataReader dataReader=new DataReader();
        Puppy puppy=new Puppy();
        puppy=dataReader.readFromFile("src/main/resources/data/puppy.txt");
        logger.info(puppy);
        PuppyOperator puppyOperator=new PuppyOperator();
        logger.info(puppyOperator.writeName(puppy));
        logger.info(puppyOperator.bite(puppy));
        logger.info(puppyOperator.jump(puppy));
        logger.info(puppyOperator.bark(puppy));
        logger.info(puppyOperator.run(puppy));
    }

}
