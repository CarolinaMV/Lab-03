package edu.eci.cvds.tdd.registry;

public class Registry {

    HashMap<Integer, String> listRegistry = new HashMap<Integer, String>();

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
        }else if (listRegistry.containsKey(p.getId())){
            result = RegisterResult.DUPLICATED;
        }else{
            listRegistry.put(p.getId(), p.getName());
        }

        return result;
    }
}