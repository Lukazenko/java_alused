class Reformatory {
    int weight(Person person) {
        // returns the weight of the parameter


        return person.getWeight();
    }

    void feed(Person person){
        int feed = person.getWeight() + 1;
        person.setWeight(feed);
    }
}
