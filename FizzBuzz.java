class FizzBuzz {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            StringBuilder line = new StringBuilder("");

            line.append(num % 3 == 0 ? "Fizz" : "");
            line.append(num % 5 == 0 ? "Buzz" : "");
            line.append(num % 7 == 0 ? "Rizz" : "");
            line.append(num % 11 == 0 ? "Jazz" : "");
            line.append(120 % num == 0 ? "Dizz" : "");
            line.append(isPrime(num) ? (isPrizz(num) ? "Prizz" : "") : "");

            line.append(line.length() == 0 ? num : "");

            System.out.println(line.toString());
        }
    }

    static boolean isPrime (int number) {
        if (number == 1) {return false;}
        double sqrt = Math.pow(number, 0.5);
        for (int i = 2; i <= sqrt ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrizz(int number) {
        do {
            number++;
            if (number % 7 == 0 || number % 11 == 0) {
                return true;
            }
        } while (!isPrime(number));

        return false;
    }
}
