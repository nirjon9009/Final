import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Record {
    FileOutputStream fos;
    FileInputStream fis;
    File file = new File ("recordFile.txt");
    public void add(List<Family> family){
        try {
            List<Family> familyAll=view();
            familyAll.addAll(family);
            fos = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(familyAll);
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Family> view(){
        ArrayList<Family> list=new ArrayList<>();
        try {if (file.exists()) {
            fis = new FileInputStream(file);
            ObjectInputStream reader = new ObjectInputStream(fis);
            list = (ArrayList<Family>) reader.readObject();

            reader.close();
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (EOFException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void search(String surname){
        try {
            fis = new FileInputStream(file);
            ObjectInputStream reader = new ObjectInputStream(fis);

            ArrayList<Family> list = (ArrayList<Family>) reader.readObject();
            for(Family family:list){
                if(family.getFamilySurname().equalsIgnoreCase(surname)){
                    System.out.println(family);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void edit(String surname){
        Scanner sc=new Scanner(System.in);
        ArrayList<Family> list = view();
        for(Family family:list) {
            Family family1 = new Family();
            if (family.getFamilySurname().equalsIgnoreCase(surname)) {
                System.out.println("Choose te option to modify the data :- \n" +
                        "1- Number of Family member \n" +
                        "2 - Type of Family \n" +
                        "3 - Family Surname \n" +
                        "4 - Number os wedding attended \n" +
                        "5 - House Physician \n" +
                        "Any key for No change");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    System.out.println("Enter number of Family Members :-");
                    family.setNumberOfFamilyMembers(Integer.parseInt(sc.nextLine()));
                } else if (choice == 2) {
                    System.out.println("Enter Type of Family :-");
                    family.setFamilyType(sc.nextLine());
                } else if (choice == 3) {
                    System.out.println("Enter Family Surname :-");
                    family.setFamilySurname(sc.nextLine());
                } else if (sc.nextInt() == 4) {
                    System.out.println("Enter Number of Wedding Attended :-");
                    family.setNumberOfWeddingAttended(Integer.parseInt(sc.nextLine()));
                } else if (sc.nextInt() == 5) {
                    Physician physician = new Physician();
                    System.out.println("Enter Physician Degree :-");
                    physician.setDegree(sc.nextLine());

                    System.out.println("Enter Physician Type :-");
                    physician.setType(sc.nextLine());

                    System.out.println("Enter Physician surname :-");
                    physician.setSurname(sc.nextLine());

                    System.out.println("Enter Physician Number of Visit to family :-");
                    physician.setNumberofVisitToFamily(Integer.parseInt(sc.nextLine()));

                    System.out.println("Enter Physician Fee per Visit :-");
                    physician.setFeePerVisit(Double.parseDouble(sc.nextLine()));

                    System.out.println("Enter Physician Total Payment :-");
                    physician.setTotalPayment(Double.parseDouble(sc.nextLine()));

                    family.setHousePhysician(physician);
                }

                family1 = family;
                list.remove(family);
                list.add(family1);
            }
        }
        ObjectOutputStream os=null;
        try {
            fos = new FileOutputStream(file);
            os = new ObjectOutputStream(fos);
            os.writeObject(list);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
