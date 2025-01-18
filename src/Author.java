public class Author {
    private String name;
    private String surname;
    private String nameSurname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.nameSurname = name + " " + surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getNameSurname(){
        return this.nameSurname;
    }
}
