package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryUnderAge() {

        Person person = new Person();
        person.setName("Carolina");
        person.setId(12345);
        person.setAge(17);
        person.setGender(Gender.FEMALE);
        person.setAlive(true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateRegistryInvalidAge(){

        Person person = new Person();
        person.setName("Pepito");
        person.setId(72345);
        person.setAge(-1);
        person.setGender(Gender.MALE);
        person.setAlive(true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateRegistryDead(){
        Person person = new Person();
        person.setName("Nicole");
        person.setId(12945);
        person.setAge(22);
        person.setGender(Gender.FEMALE);
        person.setAlive(false);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateRegistryDuplicated(){
        Person person = new Person();
        person.setName("Nicole");
        person.setId(12945);
        person.setAge(22);
        person.setGender(Gender.FEMALE);
        person.setAlive(false);
        
        Person person2 = new Person();
        person2.setName("Caroline");
        person2.setId(12945);
        person2.setAge(22);
        person2.setGender(Gender.FEMALE);
        person2.setAlive(false);        

        RegisterResult result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    

    @Test
    public void validateRegistryValid() {

        Person person = new Person("Esteban", 12345, 20, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
}
