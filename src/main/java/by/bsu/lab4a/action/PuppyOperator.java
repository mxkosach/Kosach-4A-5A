package by.bsu.lab4a.action;

import by.bsu.lab4a.entity.Puppy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PuppyOperator {

    public String writeName(Puppy puppy) {
        return "Name: " + puppy.getName();
    }

    public String bark(Puppy puppy) {
        return "Woof-woof";
    }

    public String jump(Puppy puppy) {
        return "jump";
    }

    public String run(Puppy puppy) {
        //System.out.println("run");
        return "run";

    }

    public String bite(Puppy puppy) {
        return "bite";
    }
}
