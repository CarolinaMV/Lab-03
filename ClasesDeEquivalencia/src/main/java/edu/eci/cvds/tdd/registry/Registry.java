package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if (!p.isAlive()){
            result = RegisterResult.DEAD;
        }else if (p.getAge() >= 0 && p.getAge() < 18){
            result = RegisterResult.UNDERAGE;
        }else if (p.getAge() < 0){
            result = RegisterResult.INVALID_AGE;
        }else if (p.getAge() >= 18 && p.isAlive()){
            result = RegisterResult.VALID;
        }

        return result;
    }
}