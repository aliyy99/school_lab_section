public class Book {
    public String title;
    public int pages;

    public Book(String t , int p){
        title=t;
        pages=p;
    }
    public void add_pages(int add){
        pages+=add;
    }
    public void print_book(){
        System.out.println("Book's title: "+title+" , Book's count of pages: "+pages);
    }
}
