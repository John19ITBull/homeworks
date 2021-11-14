package by.overone.lesson24;

public class Fruit {
    public String name;
    public static int seeds;

    public Fruit(String name, int seeds) {
        this.name = name;
        this.seeds = seeds;
    }

    static class Seeds {
        //        public static final int count = 4;       2nd task
//        public String getAmount(){               1st task
//           return "Count of seeds: " + seeds;
//        }
        public static String getAmount() {
            return "Count of seeds: " + seeds;
        }
    }
//    public String getAmountOutside() { 1st task
//        Seeds seeds = new Seeds();
//        return seeds.getAmount();
//    }
}

