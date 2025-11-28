public class Book_demo {
    static void main(String[] args) {
        Book b1=new Book("Software",0);
        Book b2=b1;
        b2.add_pages(20);
        b1.print_book();
        b2.print_book();
        //b2 is not new object.b1 and b2 are same object. therefore when b2 is changed , b1 is affected.So one object is created in memory

        System.out.println("\nEXTENSİON--b3 Comparison");
        Book b3=new Book("Software",20);
        System.out.println();
        System.out.println("b1==b3 "+(b1==b3)); //output is "false" because b1 and b3 are different objects. therefore their reference codes are different
        System.out.println("\nb1 name: "+b1.title);
        System.out.println("b3 name: "+b3.title);
        System.out.println("names equal ? "+b1.title.equals(b3.title));
        System.out.println("\nb1 pages: "+b1.pages);
        System.out.println("b3 pages: "+b3.pages);
        boolean equal=b1.pages==b3.pages;
        System.out.println("pages equal ? "+equal);
        //field values of b1 and b3 are same but their objects are different.So their contents are same however own of object is different
        //Briefly,comparing fields means comparing content.
    }
}
