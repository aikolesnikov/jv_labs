public class Demo4 {
    public static void main(String [] args) {
        // System.out.print(0x000F + 0b1111 + 0xdc);

        for(int idx = 1; idx < 5; idx++) {
            switch (idx) {
                case 0: break;
                case 1: System.out.print("a ");
                case 2: System.out.print("b ");
                case 3: System.out.print("c ");
                case 4: break;
                default: System.out.print("d ");
            }
        }
        System.out.println("Completed");

    }
}

