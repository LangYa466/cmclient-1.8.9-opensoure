public class ait implements Runnable {
   private boolean dAs = (boolean)(16515 & -32159);
   private long dAJ;
   private final aiu dAK;

   public aiu axc() {
      return this.dAK;
   }

   public void da(boolean var1) {
      this.dAs = var1;
   }

   public long axd() {
      return this.dAJ;
   }

   public void run() {
      while(this.dAs) {
         try {
            this.dAJ = this.dAK.axd();
            Thread.sleep(223377357L & 277386136L);
         } catch (Exception var2) {
            ;
         }
      }

   }

   public ait(String var1) {
      this.dAK = new aiu(var1);
   }
}
