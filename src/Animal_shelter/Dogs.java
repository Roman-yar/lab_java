package Animal_shelter;
import java.util.Objects;
public class Dogs implements Animals {
    private String cage_number;

    private String nickname;
    private String animal_type ;
    private String gender;

    public Dogs(String cage_number, String nickname, String animal_type, String gender) {
        this.cage_number = cage_number;
        this.nickname = nickname;
        this.animal_type = animal_type;
        this.gender= gender;

    }






    public void setCage_number(String cage_number) {
        this.cage_number = cage_number;
    }



    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type= animal_type;
    }

    public void setGender(String gender) {
        this.gender= gender;
    }

  //  public String getCage_number() {
    //    return cage_number;
   // }



    public String getNickname() {
        return nickname;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "{" + cage_number + ", " + nickname+ ", "  + animal_type + "," + gender + "} ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Dogs dogs = (Dogs) o;
        return Objects.equals(cage_number, dogs.cage_number);
    }
    @Override
    public void printAnimal() {
        System.out.println("{" + cage_number + ", " + nickname+ ", "  + animal_type + "," + gender + "} ");
    }
    //получение номера клетки
    @Override
    public String getCage_number() {
        return cage_number;
    }
}