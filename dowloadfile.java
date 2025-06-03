 class dowloadfiles {
    public static void file (String file ) {
        for(int i=1; i<=5; i++){
            System.out.println(file + " dowloading .." + (i*20) + "%");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        }
        System.out.println(file + " done");
        System.out.println(" ");
    }
}
    public class dowloadfile   {
        public static void main(String[] args) {
            dowloadfiles obj = new dowloadfiles();
         obj.file("file A");
         obj.file("file B");

         
        }
    }

