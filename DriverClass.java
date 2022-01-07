import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Physician physician1=new Physician("MBA","Family Physician","Kevin",4,500,2000);
        Family family1=new Family(5,"Group","Robert",4,physician1);

        Physician physician2=new Physician("PPA","Family","Robin",3,500,1500);
        Family family2=new Family(5,"Nuclear","Maven",5,physician2);


        Record record=new Record();

        List<Family> list=new ArrayList<>();
        list.add(family1);
        list.add(family2);

        record.add(list);

        for(Family f: record.view()){
            System.out.println(f);
        }

        System.out.println("Search by Family Surname");
        record.search(sc.nextLine());


        System.out.println("Edit by Family Surname");
        record.edit(sc.nextLine());
    }
}