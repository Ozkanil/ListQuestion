package List;

import java.util.*;

public class PersonsRunner {

    public static void main(String[] args) {


        Person person1 = new Person("Mark", "Yamata", 55);
        Person person2 = new Person("John", "Campel", 4);
        Person person3 = new Person("Natan", "Elmy", 23);
        Person person4 = new Person("Ozin", "Yavn", 15);
        Person person5 = new Person("Sally", "Kar", 65);
        Person person6 = new Person("Nataly", "Calm", 24);


//1)Type the names on the console with their frequencies

        List<Person> newList = new ArrayList<>();

        newList.add(person1);
        newList.add(person2);
        newList.add(person3);
        newList.add(person4);
        newList.add(person5);
        newList.add(person6);
        //System.out.println(newList);

        HashMap<String, Integer> newHashmap = new HashMap<>();

        for (Person w : newList) {

            if (!newHashmap.containsKey(w.getName())) {

                newHashmap.put(w.getName(), 1);

            } else {
                newHashmap.put(w.getName(), newHashmap.get(w.getName()) + 1);
            }
        }
        System.out.println(newHashmap);


//2)Type all the names on the console without repetition

        HashMap<String, Integer> newHashmap2 = new HashMap<>();
        for (Person w : newList) {

            if (!newHashmap2.containsKey(w.getName())) {

                newHashmap.put(w.getName(), 1);
            }
        }
        System.out.println(newHashmap.keySet());


//3) Create a method to return the oldest person

        System.out.println(Person.oldestPerson(newList));


//4) Sort all ages

        int[] ages = new int[newList.size()];

        for (int i = 0; i < newList.size(); i++) {

            ages[i] = newList.get(i).getAge();

        }
        Arrays.sort(ages);
       System.out.println("Ages sorted: " + Arrays.toString(ages));



//5) Create a method to generate a g-mail for each person using the initial of name and the lastname and then type all emails on the console in different lines

        System.out.println(Person.allPersonWithEmail(newList));

}
}






