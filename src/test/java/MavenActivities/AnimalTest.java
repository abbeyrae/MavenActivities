package MavenActivities;

import static org.junit.Assert.assertEquals;
import MavenActivities.domain.Animal;
import MavenActivities.domain.Cat;
import org.junit.Test;

public class AnimalTest {

    private Animal dog = new Animal();
    private Cat cat = new Cat();

    @Test
    public void dogNameTest(){
        dog.setName("snow");
        assertEquals(dog.getName(),"snow");
    }

    @Test
    public void dogColorTest(){
        dog.setColor("black");
        assertEquals(dog.getColor(),"black");
    }

    @Test
    public void dogNoOfLegsTest(){
        dog.setNoOfLegs(4);
        assertEquals(dog.getNoOfLegs(),4);
    }

    @Test
    public void crabNoOfLegsTest(){
        Animal crab = new Animal();
        crab.setNoOfLegs(12);
        assertEquals(crab.getNoOfLegs(),10);
    }

    @Test
    public void animalCatTest(){
        cat.setName("lily");
        cat.setColor("white");
        cat.setNoOfLegs(4);

        assertEquals(cat.getName(),"lily");
        assertEquals(cat.getColor(),"white");
        assertEquals(cat.getNoOfLegs(),4);
        assertEquals(cat.getNoise(),"meow");
    }
}