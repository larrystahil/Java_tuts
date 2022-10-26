public class Student {
    String stdName, course;
    String [] depart = {"FOCIS", "COMP SC", "COMP ENG", "TELCO"};
    int age;

    public Student(String name, int age, String clssrm){
        this.stdName = name;
        this.course = clssrm;
        this.age = age;
        System.out.println("Your name is " + name + " and your are "+age+" and in the class " + clssrm);
    }

    /*public void dep(String Dep1, String Dep2, String Dep3, String Dep4){
        this.depart[0] = Dep1;
        this.depart[1] = Dep2;
        this.depart[2] = Dep3;
        this.depart[3] = Dep4;
    }*/


}