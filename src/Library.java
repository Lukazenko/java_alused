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


    ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for(Book asd : lib){
            if(asd.title().contains(title)){
                found.add(asd);
            }
        }


        return found;
    }

    ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for(Book asd : lib){
            if(asd.publisher().contains(publisher)){
                found.add(asd);
            }
        }


        return found;
    }

    ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for(Book asd : lib){

            if(asd.year() == year){
                found.add(asd);
            }
        }


        return found;
    }
}
