import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter number of seats you want?:");
        int n = data.nextInt();
        data.nextLine();

        String[] seatNumbers = new String[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            seatNumbers[i] = "A" + (i + 1);
            System.out.print("Enter name  " + seatNumbers[i] + ": ");
            names[i] = data.nextLine();
        }

        System.out.println("Do want to see number detail of seat to view?");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + seatNumbers[i]);
        }

        System.out.print("Enter your choice (1 to " + n + "): ");
        int choice = data.nextInt();

        System.out.println(" Detail:");
        switch (choice) {
            case 1:
                System.out.println(seatNumbers[0] + " -> " + names[0]);
                break;
            case 2:
                if (n >= 2)
                    System.out.println(seatNumbers[1] + " -> " + names[1]);
                else
                    System.out.println("Invalid choice.");
                break;
            case 3:
                if (n >= 3)
                    System.out.println(seatNumbers[2] + " -> " + names[2]);
                else
                    System.out.println("Invalid choice.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        data.close();
    }
}
