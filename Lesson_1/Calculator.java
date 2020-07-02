class Calculator {
    public static void main(String[] args) {
        int firstVslue = 6;
        int secondValue = 8;
        char action = '^';

        if(action == '*') {
            System.out.println(firstVslue +""+ action +""+ secondValue + "=" + (firstVslue * secondValue));
        } else if(action == '/') {
            System.out.println(firstVslue +""+ action +""+ secondValue + "=" + (firstVslue / secondValue));
        } else if(action == '+') {
            System.out.println(firstVslue +""+ action +""+ secondValue + "=" + (firstVslue + secondValue));
        } else if(action == '-') {
            System.out.println(firstVslue +""+ action +""+ secondValue + "=" + (firstVslue - secondValue));
        } else if(action == '%') {
            System.out.println(firstVslue +""+ action +""+ secondValue + "=" + (firstVslue % secondValue));
        } else if(action == '^') {
            int result = 1;
            for(int i = 0; i < secondValue; i++) {
                result *= firstVslue;
            }
            System.out.println(result);
        }
    }
}