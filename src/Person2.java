import java.util.Calendar;

class Person2 {
    private String name;
    private MyDate birthday;

    Person2(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    Person2(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    Person2(String name){
        // Calendar.getInstance().get(Calendar.DATE);
        int date = Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        // Calendar.getInstance().get(Calendar.YEAR);
        int year = Calendar.getInstance().get(Calendar.YEAR);

        this.birthday = new MyDate(date, month, year);
        this.name = name;



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

        MyDate current = new MyDate(date, month, year);


        return birthday.differenceInYears(current);

    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }

    boolean olderThan(Person2 compared) {
        // compare the ages based on birthdate

        if(this.birthday.earlier(compared.birthday)){
            return true;
        } else {
            return false;
        }
    }
}