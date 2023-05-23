package hospital.repo;

import java.util.ArrayList;
import java.util.List;

public class Rooms {

    public static int firstFloorNumberRoom = 100;
    public static int secondFloorNumberRoom = 200;
    public static int thirdFloorNumberRoom = 300;
    public static int fourthFloorNumberRoom = 400;
    public static int fifthFloorNumberRoom = 500;
    public static int sixthFloorNumberRoom = 600;
    public static int seventhFloorNumberRoom = 700;
    public static int eighthFloorNumberRoom = 800;
    public static int ninthFloorNumberRoom = 900;
    public static int tenthFloorNumberRoom = 1000;

    public static List<List> floorList = new ArrayList<>();

    public void addFloor() {
        floorList.add(firstFloorRooms);
        floorList.add(secondFloorRoooms);
        floorList.add(thirdFloorRooms);
        floorList.add(fourthFloorRooms);
        floorList.add(fifthFloorRooms);
        floorList.add(sixthFloorRooms);
        floorList.add(seventhFloorRooms);
        floorList.add(eighthFloorRooms);
        floorList.add(eighthFloorRooms);
        floorList.add(ninthFloorRooms);
        floorList.add(tenthFloorRooms);
    }

    public static List<Patient> firstFloorRooms = new ArrayList<>();
    static List<Patient> secondFloorRoooms = new ArrayList<>();
    static List<Patient> thirdFloorRooms = new ArrayList<>();
    static List<Patient> fourthFloorRooms = new ArrayList<>();
    static List<Patient> fifthFloorRooms = new ArrayList<>();
    static List<Patient> sixthFloorRooms = new ArrayList<>();
    static List<Patient> seventhFloorRooms = new ArrayList<>();
    static List<Patient> eighthFloorRooms = new ArrayList<>();
    static List<Patient> ninthFloorRooms = new ArrayList<>();
    static List<Patient> tenthFloorRooms = new ArrayList<>();

    static List<Patient> fullRooms = new ArrayList<>();

    public static Integer[] firstFloorRoomsArray =new Integer[10];
    public static Integer[] secondFloorRoomsArray =new Integer[10];
    public static Integer[] thirdFloorRoomsArray =new Integer[10];
    public static Integer[] fourthFloorRoomsArray =new Integer[10];
    public static Integer[] fifthFloorRoomsArray =new Integer[10];
    public static Integer[] sixthFloorRoomsArray =new Integer[10];
    public static Integer[] seventhFloorRoomsArray =new Integer[10];
    public static Integer[] eighthFloorRoomsArray =new Integer[10];
    public static Integer[] ninthFloorRoomsArray =new Integer[10];
    public static Integer[] tenthFloorRoomsArray =new Integer[10];


}
