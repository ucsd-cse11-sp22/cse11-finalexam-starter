import tester.*;

class FinalPart2_Sanity {
    void testMode(Tester t) {
        Mode m = new Mode();
        t.checkExpect(1, m.mode(new int[]{2,3,4,9,5,6,0,7,8}));
    }

    void testfindArea(Tester t) {        
        Shape r1 = new Square(2);
        Shape r2 = new Circle(2);
        Shape r3 = new Triangle(2,4);
        Shape r4 = new Trapezoid(3,5,3);

        t.checkExpect(4.0, r1.findArea());
        t.checkExpect(12.56, r2.findArea());
        t.checkExpect(4.0, r3.findArea());
        t.checkExpect(12.0, r4.findArea());
    }
}