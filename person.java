package Task_2;

public class person {

     public static void main(String[] args) {
           person p1 = new person();
           p1.name = "Arun";
           p1.display();   

           person p2 = new person("Bala",18);
           p2.display();
      }
    
    public String name;
    public int age;

    public person(){
         age = 18;
    }

    public person(String _name,int _age){
       name = _name;
       age = _age;
    }

    public void display(){
        System.out.println("Name: " + name + " | Age: " + age);
    }
}
