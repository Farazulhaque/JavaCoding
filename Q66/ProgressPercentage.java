package Q66;

public class ProgressPercentage {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print("\rCurrent Progress: " + i + "%");
            // try{
            // Thread.sleep(20);
            // }
            // catch (InterruptedException e){
            // e.printStackTrace();
            // }

            for (long j = 0; j < 400000000; j++)
                ;
        }
        System.out.println("Download Completed");
    }
}
