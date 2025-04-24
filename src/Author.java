import java.util.Objects;
public class Author {
    private String firstName;
    private String lastName;
    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }

    public int hashCode(){
        return Objects.hash(firstName, lastName);
    }




}
