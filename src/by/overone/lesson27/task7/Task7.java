package by.overone.lesson27.task7;

public class Task7 {
    public static void main(String[] args) {
        Consumer<String> currency = str -> {
            String[] arr = str.split(" ");
            int sum = Integer.parseInt(arr[0]);
            double result = 0;
            switch (arr[1]) {
                case ("rub"):
                    result = sum * 0.0132;
                    break;
                case ("byn"):
                    result = sum * 0.39;
                    break;
                case ("uah"):
                    result = sum * 0.037;
                    break;
            }
            System.out.println("Amount in dollars: " + result);
        };
        currency.converter("10 byn");
    }
}

interface Consumer<T> {
    void converter(T str);
}
