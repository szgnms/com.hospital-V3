package hospital.repo;

public enum Floors {

    FLOOR_1(1),
    FLOOR_2(2),
    FLOOR_3(3),
    FLOOR_4(4),
    FLOOR_5(5),
    FLOOR_6(6),
    FLOOR_7(7),
    FLOOR_8(8),
    FLOOR_9(9),
    FLOOR_10(10);

    private final Integer floor;

    Floors(Integer floor) {

        this.floor = floor;
    }
}
