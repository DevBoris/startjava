public class Variable {
    public static void main(String[] args) {
        boolean wifi = true;
        byte coreCPU = 2;
        short portUSB = 2;
        int hdd = 250;
        long memory = 4_294_967_296L;
        float display = 15.6f;
        double cpuGHz = 1.70;
        char[] cpu = {'A', 'M', 'D'};

        System.out.print("CPU: ");
        for(int i = 0; i < cpu.length; i++) {
            System.out.print(cpu[i]);
        }

        System.out.println("\nКоличество ядер CPU: " + coreCPU);
        System.out.printf("Тактовая частота CPU: " + "%.2f" + "Ghz %n", cpuGHz);
        System.out.println("HDD: " + hdd);
        System.out.println("ОП: " + memory + " byte");
        System.out.println("Диагональ: " + display);
        System.out.println("Количество USB: " + portUSB);
        System.out.println("Наличие Wi-Fi: " + wifi);
    }
}