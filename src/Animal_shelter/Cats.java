package Animal_shelter;
import java.util.Objects;
public class Cats implements Animals {
    private String cage_number;

    private String nickname;
    private String animal_type ;
    private Double weight;
    //конструктор с параметром
    public Cats(String cage_number, String nickname, String animal_type, Double weight) {
        this.cage_number = cage_number;
        this.nickname = nickname;
        this.animal_type = animal_type;
        this.weight= weight;

    }
    //пустой конструктор
    public Cats() {
        System.out.println("Создали кота!");
    }
//конструктор копирования
    public Cats(Cats cats) {
        cage_number = cage_number;
        nickname = nickname;
      animal_type = animal_type;
        weight= weight;
    }




    public void setCage_number(String cage_number) {
        this.cage_number = cage_number;
    }



    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String setAnimal_type() {
    //    this.animal_type= animal_type;
        return animal_type;
    }

    public void setWeight(Double weight) {
        this.weight= weight;
    }





    public String getNickname() {
        return nickname;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{" + cage_number + ", " + nickname+ ", "  + animal_type + "," + weight+ "} ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(cage_number, cats.cage_number);
    }
    @Override
    public void printAnimal() {
        System.out.println("{" + cage_number + ", " + nickname+ ", "  + animal_type + "," + weight + "} ");
    }
    @Override
    public String getCage_number() {
        return cage_number;
    }
}
