import java.util.Comparator;

public class Sort {
   public static class SortByRam implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Mobile2 m1 = (Mobile2) o1;
            Mobile2 m2 = (Mobile2) o2;
            return m1.ram - m2.ram;
        }
    }

    static class SortByRom implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Mobile2)o1).rom-((Mobile2)o2).rom;
        }
    }

    static public class SortByName implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Mobile2) o1).name.compareTo(((Mobile2)o2).name);
        }
    }

    static public class SortByColor implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Mobile2) o1).color.compareTo(((Mobile2) o2).color);
        }
    }

    static class SortByPriceHtoL implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return (int)(((Mobile2) o2).price - ((Mobile2) o1).price);
        }
    }

    static class SortByPriceLtoH implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return (int) (((Mobile2) o1).price - ((Mobile2) o2).price);
        }
    }

}



