import java.util.Iterator;

public class IteratorDP  {
    public static void main(String[] args) {
        int[] testing = {1,2,3};

        System.out.println(new IteratorDP().iterator().next());
    }
    public String[] li = {"abc", "bdf", "efc"};
    public Iterator iterator() {
        return new FriendsIterator();
    }
    class FriendsIterator implements  Iterator {
        int i = 0;
        @Override
        public boolean hasNext() {
            return i < li.length - 1;
        }

        @Override
        public Object next() {
            return li[i++];
        }
    }
}
