public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
        }

        else if(kiloBytes>=0) {

            int MegaBytes = kiloBytes / 1024;
            int RemainingKiloBytes = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB" + "=" + MegaBytes + " MB and " + RemainingKiloBytes + " KB");
        }

    }
}
