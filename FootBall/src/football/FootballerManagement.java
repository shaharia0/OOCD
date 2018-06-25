package football;


public class FootballerManagement {
    String name;
    int age;
    String Country;
    double numberofgoals;
    double numberofassists;
    double numberofmatches;
    public FootballerManagement(String name,int age,String country,Double g,Double a,Double m){
   this.name = name;
   this.age = age;
   this.Country = country;
   numberofgoals = g;
   numberofassists= a;
   numberofmatches = m;
    }
    public double increasegoal(double goal ){
        return numberofgoals+= goal;
    }
    public double assist(double assist){
        return numberofassists+=assist;
    }
    public double match(double match){
        return numberofmatches+=match;
    }
    public void printInfo()
    {
        System.out.println("name : " + name);
        System.out.println("age :"+ age);
        System.out.println("Country"+ Country);
    }    
}
