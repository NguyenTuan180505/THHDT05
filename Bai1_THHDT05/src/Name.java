import java.util.Scanner;
public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap ten");
        this.name = sc.nextLine();
    }
    public void printName(){
        System.out.println("Hello "+this.name);
    }
}
