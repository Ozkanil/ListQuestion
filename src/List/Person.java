package List;

/*POJO class:
        1) POJO class must be public
     2) All instance variables must be private
     3) All getters-setters must be created for instance variables
     4) It must have default constructor (The default constructor is used to provide the default values to the object)
     5) It can have constructor with parameter
     6) It can have toString()*/

import java.util.List;
import java.util.Locale;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private String email;

    public Person() {
    }

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email="ozkan@gmail.com";
    }

    public static Person oldestPerson (List<Person> person1) {

        Person person = new Person();


        int oldestAge = person1.get(0).getAge();
        for (int i = 0; i < person1.size(); i++) {

            if (person1.get(i).getAge()>=oldestAge) {
                person.setName(person1.get(i).getName());
                person.setLastName(person1.get(i).getLastName());
                person.setAge(person1.get(i).getAge());
                oldestAge = person1.get(i).getAge();
            }
        }
        return person;
    }

    public static List<Person> allPersonWithEmail(List<Person> person){

        for (int i = 0; i < person.size(); i++) {

            String firstInitial = person.get(i).getName().substring(0,1).toLowerCase(Locale.ROOT) ;
            String lastName = person.get(i).getLastName().toLowerCase(Locale.ROOT);
            String addition = "@gmail.com";

            person.get(i).setEmail(firstInitial + lastName + addition);

        }
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
