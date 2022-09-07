import java.util.*;

public class MainApp
{
    public static void main(String[] args)
    {

        // Code for Question 1

        ArrayList<Member> memberArrayList = new ArrayList<>();

        memberArrayList.add(new Member("Kyle",10,25.00));
        memberArrayList.add(new Member("Shane",3,25.00));
        memberArrayList.add(new Member("Bronagh",7,25.00));
        memberArrayList.add(new GoldMember("Mark",4,25.00,2));
        memberArrayList.add(new GoldMember("Noel",5,26.00,3));
        memberArrayList.add(new GoldMember("Mary",2,28.00,1));


        displayAllMembers(memberArrayList);
        System.out.println();
        displayGoldMembers(memberArrayList);
        System.out.println(" ");
        // Code for Question 2 on Maps

        Scanner keyboard = new Scanner(System.in);

        Map<String, Room> tree = new TreeMap();
        treeMap(tree);
        System.out.println("please enter your key");

        String key = keyboard.nextLine();
        Room roomHall = tree.get(key.toLowerCase(Locale.ROOT));

//        if(roomHall!=null){
//            int x =  roomHall.getRoomSize();
//
//        }
//        while (roomHall!=null){
//            int x = roomHall.getRoomSize();
//            int i = x+i;
//
//        }
        if(roomHall == null){
            System.out.println("Room Not Found");
        }
        else{
            System.out.println("Room Found");
            System.out.println(key + "RoomHalls TreeMap= " + roomHall + "\n");
        }

        Map<String, Football> hash = new HashMap();
        hashMap(hash);
        System.out.println("please enter your key");

        String key1 = keyboard.nextLine();
        Football footballTeam = hash.get(key1.toLowerCase(Locale.ROOT));
        System.out.println(key1 + " = FootballTeams Hashed= " + footballTeam + "\n");

    }
    public static void displayAllMembers(ArrayList<Member> memberArrayList){

    for (Member customer : memberArrayList) {
        System.out.println(customer + ",");
    }
}
public static void displayGoldMembers(ArrayList<Member> memberArrayList){
    for (Member customer : memberArrayList) {
        if(customer.getNumberVisits()>=1){
            System.out.println(customer);

        //didnt figure out how to implement GetNumberTreatments
        }

    }

}
    public static void treeMap(Map tree) {

        tree.put("p1107", new Room("P1107", 50));
        tree.put("p1111", new Room("P1111", 20));
        tree.put("p1106", new Room("P1106", 30 ));
        tree.put("p1139", new Room("P1139", 90));
        tree.put("p1140", new Room("P1140", 50));

        System.out.print(tree + "\n");


    }
    public static void hashMap (Map hash){
        String liverpool = "liverpool";
        Football footballTeam = new Football("Salah","Mane","Van Djik","Henderson", "Karius");
        hash.put(liverpool, footballTeam);

        String manchester = "manchester";
        footballTeam = new Football("tom", "jerry","bob","tim","mary");
        hash.put(manchester, footballTeam);

        String arsenal = "manchester";
        footballTeam = new Football("Shane","kyle","john","joe","Tristan");
        hash.put(arsenal, footballTeam);

        String newcastle = "newcastle";
        footballTeam = new Football("Barbara","Alex","Ruth","Kate","Adrienne");
        hash.put(newcastle, footballTeam);

        String brighton = "brighton";
        footballTeam = new Football("Mark","Angela","Kamile","Gareth","Cian");
        hash.put(brighton, footballTeam);

        System.out.println(hash + "\n");
    }
}
