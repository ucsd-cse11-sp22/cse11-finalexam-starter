import tester.*;

class Test_Sanity  {
    void testSimpleInterest(Tester t) {
        Account a = new Account("123", "John", 1000.0);
        Duration d = new Duration(0, 0);
        double interest = a.getSimpleInterest(0.0, d);
        t.checkExpect(0.0, interest);
    }

    void testCanPayInterest(Tester t) {        
        Account a = new Account("123", "John", 1000.0);
        Duration d = new Duration(0, 0);
        boolean ans = a.canPayInterest(0.0, d, 1000.0);
        t.checkExpect(true, ans);
    }

    void testCalculateNumYears(Tester t) {
        Duration d = new Duration(0, 0);
        double output = d.calculateNumYears();
        t.checkExpect(0.0, output);
    }
}