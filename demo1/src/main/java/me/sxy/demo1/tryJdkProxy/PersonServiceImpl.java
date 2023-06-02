package me.sxy.demo1.tryJdkProxy;

public class PersonServiceImpl implements PersonService{


    @Override
    public String savePerson(String name, int age) {
        System.out.printf("save person %s, %d", name ,age);
        return "save person";
    }

    @Override
        public void updatePerson() {
            System.out.println("update person");
        }

        @Override
        public void deletePerson() {
            System.out.println("delete person");
        }
}
