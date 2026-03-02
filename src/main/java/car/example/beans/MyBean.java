package car.example.beans;

public class MyBean {

    String name;

    public MyBean(){
        System.out.println("Constructor has been called, name = " + name);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName method has been called, name = " + name);
        this.name = name;
    }


    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
