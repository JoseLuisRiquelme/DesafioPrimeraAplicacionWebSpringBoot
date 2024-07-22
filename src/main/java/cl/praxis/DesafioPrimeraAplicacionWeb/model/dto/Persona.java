package cl.praxis.DesafioPrimeraAplicacionWeb.model.dto;

public class Persona {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String url;

    public Persona() {
    }

    public Persona(int id, String name, String lastName, int age, String url) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.url=url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return
                "  Nombre=" + name + '\n' +
                "  Apellido=" + lastName + '\n' +
                "  Edad=" + age + " anhos";
    }
}
