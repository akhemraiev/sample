package demo;

import classes.House;
import classes.TV;

//1. Create ability to have 3 Rooms in a House;
//2. Each Room should contain TV, table, chair, sofa.
//3. Crete one house for Molly, one for Tom and one for Jim.

public class DemoHouse {

    public static void main(String[] args) {
        House dom1 = new House();
        dom1.setAdress("Baker street 221");
        dom1.setEtage(5);

        TV tv1 = new TV();
        tv1.setColour("Black");
        tv1.setType("LCD");
        tv1.setDiagonal(20.0);

        dom1.setTelek(tv1);
    }
}
