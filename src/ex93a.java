import java.util.Calendar;

class Person2 {
    private String name;
    private MyDate birthday;

    Person2(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        // Calendar.getInstance().get(Calendar.DATE);
        int date = Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        // Calendar.getInstance().get(Calendar.YEAR);
        int year = Calendar.getInstance().get(Calendar.YEAR);




        return birthday.differenceInYears(new MyDate(date, month, year));








    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }
}

public class ex93a {
    public static void main(String[] args) {
        Person2 pekka = new Person2("Pekka", 15, 2, 1993);
        Person2 steve = new Person2("Thomas", 1, 3, 1955);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
    }
}
