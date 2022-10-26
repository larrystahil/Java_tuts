public class Puppy {
    int puppyAge;

    public Puppy(String name){
        System.out.println("Passed name is: " + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy age is: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        Puppy lawrence = new Puppy("Goodboy");

        lawrence.setAge(2);
        lawrence.getAge();

        System.out.println("This is your puppy's age: " + lawrence.puppyAge);
    }
}
