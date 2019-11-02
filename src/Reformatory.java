class Reformatory {
    private int call = 0;


    int weight(Person person) {
        // returns the weight of the parameter

        call += 1;


        return person.getWeight();
    }

    void feed(Person person){
        int feed = person.getWeight() + 1;
        person.setWeight(feed);
    }

    int totalWeightsMeasured(){


        return call;
    }
}
