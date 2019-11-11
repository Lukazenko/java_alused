class Book {
    private String title;
    private String publisher;
    private int year;


    Book(String title, String publisher, int year){
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    String title(){
        return this.title;
    }

    String publisher(){
        return this.publisher;

    }

    int year(){
        return this.year;

    }

    public String toString(){
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}
