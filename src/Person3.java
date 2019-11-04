class Person3 {
    private String name;
    private String number;

    Person3(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }

    void changeNumber(String newNumber){
        this.number = newNumber;
    }

    public String toString(){
        return this.name + " number: " + this.number;
    }
}
