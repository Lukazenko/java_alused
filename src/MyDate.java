public class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }

    private void advance(){

        this.day += 1;

        if(this.day > 30){
            this.day = 1;
            this.month += 1;
        } else if(this.month > 12){
            this.year += 1;
            this.month = 1;
        }






    }

    private void advance(int numberOfDays){
        int i = 0;
        while(i < numberOfDays){
            advance();
            i++;
        }

    }

    MyDate afterNumberOfDays(int days){

        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);





        return newMyDate;
    }

    int differenceInYears(MyDate comparedDate){

        int diff_day = comparedDate.day - day; //23
        int diff_month = comparedDate.month - month; //11
        int diff_year = 0;

        if(diff_day < 0){
            diff_day = diff_day * -1;
        }
        if(diff_month < 0){
            diff_month = diff_month * -1;
        }


        if(diff_month < 12 && diff_day < 30){
            diff_year = year - comparedDate.year;
            diff_year -= 1;

        } else {
            diff_year = year - comparedDate.year;

        }


        return diff_year;
    }
}
