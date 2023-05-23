package hospital.methods;


import hospital.repo.WrongInput;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class FloorMethods implements WrongInput {

    static Integer[][] floorRoom = new Integer[10][10];

    public void addRoom(int floorNumber, int roomNumber) {
        addZero();
        for (int i = 1; i <= 10; i++) {
            if (floorRoom[floorNumber - 1][i - 1] == 0) {
                floorRoom[floorNumber - 1][i - 1] = roomNumber;
                break;
            }

        }
        if (Arrays.stream(floorRoom[floorNumber - 1]).noneMatch(t->t==0)) {
            wrongMethod();
        }
        System.out.println(Arrays.deepToString(floorRoom));

    }

    public void removeRoom(int roomNumber1) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (floorRoom[i][j] == roomNumber1) {
                    floorRoom[i][j] = 0;
                }
            }
        }
    }

    public void addZero() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                floorRoom[i][j] = 0;
            }
        }

    }




    @Override
    public void wrongMethod() {
        System.out.println("This floor is full\nThere is no room left in this part of our hospital.");
        for (int i = 0; i < 5; i++) {
            System.out.print(". ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

        new MainMenuMethods().hospitalRun();

    }
}
