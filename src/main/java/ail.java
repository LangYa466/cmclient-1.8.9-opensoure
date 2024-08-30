public class ail {
   private final Runnable dAo;
   private final aew dAp;

   public ail(aew var1, Runnable var2) {
      this.dAp = var1;
      this.dAo = var2;
   }

   public void GY() {
      this.dAp.dmK.remove(this);
      this.dAp.dmK.add(this);
   }

   public void run() {
      this.dAo.run();
   }

   public boolean GX() {
      return this.dAp.dmK.contains(this);
   }

   public void awW() {
      this.dAp.dmK.remove(this);
   }
}
