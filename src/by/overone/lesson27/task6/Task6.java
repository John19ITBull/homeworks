package by.overone.lesson27.task6;

public class Task6 {
    public static void main(String[] args) {
        Function<String, Double> currency = str -> {
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
            return result;
        };
        System.out.println("Amount in dollars: " + currency.converter("10 rub"));
    }
}

interface Function<T, R> {
    R converter(T str);
}
