package oo.person;

class Person2 {

    private Integer age;

    private String name;

    public Person2(int a,String n){
        age = a;
        name = n;
        return;
    }

    public static void main(String[] args) {
        Person2 p1 = new Person2(1,"abc");
        Person2 p2 = new Person2(1,"abc");
    }

}
