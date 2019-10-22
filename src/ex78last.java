public class ex78last {
    public static void main(String[] args) throws Exception {
        BoundedCounterd seconds = new BoundedCounterd(59);
        BoundedCounterd minutes = new BoundedCounterd(59);
        BoundedCounterd hours = new BoundedCounterd(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            // put here the logic to advance your clock by one second
            seconds.next();
            // advance minutes
            if(seconds.getValue() == 0){
                minutes.next();
            }
            // if minutes become zero, advance hours
            if(minutes.getValue() == 0 && seconds.getValue() == 0){
                hours.next();
            }
    }
}
}
