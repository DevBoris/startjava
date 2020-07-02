public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        if(age > 20) {
            System.out.println("Больше 20 лет.");
        }

        boolean isMale = true;
        if(isMale) {
            System.out.println("Пол - мужчина.");
        }

        if(!isMale) {
            System.out.println("Пол - не мужчина.");
        }

        double height = 1.80;
        if(height < 1.80) {
            System.out.println("Рост меньше 1.80.");
        } else {
            System.out.println("Рост больше 1.80.");
        }

        String name = "Boris";
        if(name.charAt(0) == 'M') {
            System.out.println("Первая буква имени - M");
        } else if(name.charAt(0) == 'I') {
            System.out.println("Первая буква имени - I");
        } else {
            System.out.println("Первая буква имени не M или I");
        }
    }
}