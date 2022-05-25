import by.bsu.lab4a.action.PuppyOperator;
import by.bsu.lab4a.entity.Puppy;
import by.bsu.lab4a.reader.DataReader;
import org.testng.Assert;

import java.io.FileNotFoundException;

public class Test {
    @org.testng.annotations.Test
    public static void main(String[] args) throws FileNotFoundException {
        DataReader dataReader = new DataReader();
        Puppy puppy = new Puppy();
        puppy = dataReader.readFromFile("src/main/resources/data/puppy.txt");
        System.out.println(puppy);
        PuppyOperator puppyOperator = new PuppyOperator();
        // puppyOperator.writeName(puppy);
        Assert.assertEquals(puppyOperator.bite(puppy), "bite");
        Assert.assertTrue(puppyOperator.jump(puppy) == "jump");
        Assert.assertNotEquals(puppyOperator.bark(puppy), "Woof-woof2");
        Assert.assertEquals(puppyOperator.run(puppy), "run");

        //    Assert.assertTrue((5==4));
    }
}
