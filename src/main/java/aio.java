public class aio extends Thread {
   public int dAy;
   private final hS dAz;

   public aio(hS var1) {
      super(o.q[31229 & 23805 & 2556 & -11780]);
      this.dAz = var1;
      this.dAy = 2703 & 28943;
   }

   public void run() {
      while(!this.isInterrupted()) {
         try {
            Thread.sleep(2130586811792169961L & 906134504L);
            int var10000 = this.dAy;
            this.dAy -= -30447 & 16963;
            if (var10000 == 0) {
               this.dAz.Bn.atI().info(o.q[-30465 & 6399 & 28925 & -9729]);
               this.dAz.eW();
               this.interrupt();
               return;
            }
         } catch (Throwable var2) {
            this.dAz.Bn.atI().info(o.q[-31233 & -27394 & 31743 & -7425], var2);
            System.exit(-1 & -2);
         }
      }

   }
}
