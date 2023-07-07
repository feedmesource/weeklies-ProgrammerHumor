class FizzBuzz {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            StringBuilder line = new StringBuilder("");
            if (num % 3 == 0) {
                line.append("Fizz");
            } 
            if (num % 5 == 0){
                line.append("Buzz");
            } 
            if (num % 7 == 0){
                line.append("Rizz");
            } 
            if (num % 11 == 0){
                line.append("Jazz");
            }
            if (120 % num == 0) {
                line.append("Dizz");
            }
            if (isPrime(num)) {
                if (isPrizz(num)) {
                    line.append("Prizz");
                }
            }
            if (line.length() == 0) {
                line.append(num);
            }
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
