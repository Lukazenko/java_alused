import java.util.ArrayList;

class Library {

    private ArrayList<Book> lib;


    Library(){
        this.lib = new ArrayList<Book>();

    }

    void addBook(Book newBook){
        lib.add(newBook);
    }

    void printBooks(){
        for(Book asd : lib){
            System.out.println(asd);
        }

    }

}
