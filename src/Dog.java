public class Dog {
    private int age;
    private String name;
    private String color;

    public Dog(){
        age = 0;
        name = "";
        color = "";
    }

    public Dog(int ageValue, String nameValue, String colorValue){
        age = ageValue;
        name = nameValue;
        color = colorValue;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int birthday(){
        addOneAge();
        return age;
    }

    private void addOneAge(){
        age++;
    }




    public String toString(){
        return ("The dog is named " + name + " and is " + age + " years old. This dog is " + color + ".");
    }
}




