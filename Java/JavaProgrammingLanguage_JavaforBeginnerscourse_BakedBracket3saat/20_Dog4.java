
public class Dog4 {
    private String name;
    private int age;
    private String breed;
    private String color;


    public Dog4(String name, int age,String breed,String color){
this.name=name;
this.age=age;
this.breed=breed;
this.color=color;
    }
    
public void setName(String name){
    this.name=name;
}

public String getName(){
 return name;
}


    public void bark(){
        System.out.println("arf arf");
    }

    public void run(){
        System.out.println("your dog is running around");
    }

    public void stop(){
        System.out.println("your dog has stopped running");
    }
   
}
