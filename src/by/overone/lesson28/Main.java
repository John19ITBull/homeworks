package by.overone.lesson28;

import java.util.Arrays;
import java.util.Random;

public class Main extends Thread {
    public static void main(String[] args) {
        Thread factory = new Thread(new Factory());
        Thread servant = new Thread(new Servant());
        factory.start();
        servant.start();
    }
}

class Factory implements Runnable {
    Random rand = new Random();

    public void run() {
        for (int j = 0; j < 20; j++) {
            Dump.dump.add(Parts.ret(rand.nextInt(9) + 1));
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 49; i++) {
            for (int j = 0; j < rand.nextInt(4) + 1; j++) {
                Dump.dump.add(Parts.ret(rand.nextInt(9) + 1));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Servant implements Runnable {
    Random rand = new Random();
    int count = 0;

    public void run() {
        System.out.println("Storage stages with details: ");
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < rand.nextInt(4) + 1; j++) {
                if (Dump.dump.size() == 0) {
                    break;
                }
                Storage.storage.add(Dump.dump.get(0));
                Dump.dump.remove(0);
            }
            System.out.println(Arrays.toString(Storage.storage.toArray()));
            while (Storage.storage.contains(Parts.HEAD) && Storage.storage.contains(Parts.BODY) && Storage.storage.contains(Parts.RIGHT_HAND) && Storage.storage.contains(Parts.LEFT_HAND) && Storage.storage.contains(Parts.RIGHT_LEG) && Storage.storage.contains(Parts.LEFT_LEG) && Storage.storage.contains(Parts.CPU) && Storage.storage.contains(Parts.RAM) && Storage.storage.contains(Parts.HDD)) {
                Storage.storage.remove(Parts.HEAD);
                Storage.storage.remove(Parts.BODY);
                Storage.storage.remove(Parts.RIGHT_HAND);
                Storage.storage.remove(Parts.LEFT_HAND);
                Storage.storage.remove(Parts.RIGHT_LEG);
                Storage.storage.remove(Parts.LEFT_LEG);
                Storage.storage.remove(Parts.CPU);
                Storage.storage.remove(Parts.RAM);
                Storage.storage.remove(Parts.HDD);
                count++;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Count of robots made: " + count);
    }
}
