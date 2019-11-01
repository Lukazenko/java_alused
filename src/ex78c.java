public class ex78c {
    public static void main(String[] args) {
        BoundedCounterc minutes = new BoundedCounterc(59);
        BoundedCounterc hours = new BoundedCounterc(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            // advance minutes
            minutes.next();
            // if minutes become zero, advance hours
            if(minutes.getValue() == 0){
                hours.next();
            }




            i++;
        }
    }
}
