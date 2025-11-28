public class Student {

    public String name;
    public int age;
    public void printstudentinfo(){
        System.out.println("name: "+name+", age: "+age);
    }
    public Student(String a, int b){
        name=a;
        age=b;
    }

    public Student() {//DEFAULT CONSTRUCTOR
        name = "none";
        age = 0;
    }
}
