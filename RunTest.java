package Homework4;

public class RunTest {
    public static void main(String[] args) {
        Birds b = new Birds();
        b.birdsfly();
        b.birdswings();
        b.birdsnest();

        System.out.println("Pigeon");
        Pigeon p = new Pigeon();
        p.birdsfly();
        p.birdswings();
        p.birdsnest();

        System.out.println("Owl");
        Owl o = new Owl();
        o.birdsfly();
        o.birdswings();
        o.birdsnest();

        System.out.println("Duck");
        Duck d=new Duck();
        d.Duckfeathers();
        d.Duckeyes();

    }
}






