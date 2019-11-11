

class Birds {
    private String name;
    private String Lname;
    private int observe;


    Birds(String name, String Lname){
        this.name = name;
        this.Lname = Lname;
        this.observe = 0;


    }

    void AddObserve(){
        this.observe += 1;
    }

    String getBird(){
        return this.name;
    }

    String getLatin(){
        return this.Lname;
    }

    int getObserve(){
        return this.observe;
    }




}
