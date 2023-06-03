public class Singleton {
    public static void main(String[] args) {
        Obj obj1 = Obj.getInstance();
        obj1.setVal(2);
        Obj obj2 = Obj.getInstance();
        obj2.getVal();
    }

}

/**
 * Singleton: one point access to an object of a class by making a private
 * static instance of that object, making the constructor private and then
 * simple logic in the getInstance function
 */
class Obj {
    private static Obj instance;
    private int val;
    private Obj() {
        this.val = 0;
    }
    public static Obj getInstance() {
        if (instance == null) {
            instance = new Obj();
        }
        return instance;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
