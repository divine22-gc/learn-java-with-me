class Student{
    String name;
    int age;
    int prn;
    int wg;

    public Student(String name, int age, int prn, int wg){
        this.name = name;
        this.age = age;
        this.prn = prn;
        this.wg = wg;
    }
    public Student(string name){
        name = "default";
        age = 0;
        prn = 0;
        wg = 00;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("PRN: "+ prn);
        System.out.println("Weight: "+ wg);
    }

    public class Constructor{
        public static void main(String[] args){
            Student s1 = new Student("John", 20, 12345, 70);
            Student s2 = new Student("Alice", 22, 67890, 60);
            Student s3 = new Student("Divine");
            s1.display();
            s2.display();
            s3.display();
        }
    }
}


    