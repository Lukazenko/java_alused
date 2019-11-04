import java.util.ArrayList;

class Phonebook {

    private ArrayList<Person3> list = new ArrayList<Person3>();


    void add(String name, String number){


        list.add(new Person3(name, number));


    }

    void printAll(){
        for (Person3 asd : list){
            System.out.println(asd);
        }
    }

}
