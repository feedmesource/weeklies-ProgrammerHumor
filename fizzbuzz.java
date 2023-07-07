class fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            StringBuilder line = new StringBuilder("");
            if (i % 3 == 0) {
                line.append("Fizz");
            } 
            if (i % 5 == 0){
                line.append("Buzz");
            } 
            if (i % 7 == 0){
                line.append("Rizz");
            } 
            if (i % 11 == 0){
                line.append("Jazz");
            }
            if (line.length() == 0) {
                line.append(i);
            }
            System.out.println(line.toString());
        }
    }
}