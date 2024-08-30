public class afr {
   private final int[] dqR;
   private final int[] dqS;
   private final int[] dqT;

   public int[] ave() {
      return this.dqR;
   }

   public int[] avf() {
      return this.dqS;
   }

   public afr(int[] var1, int[] var2, int[] var3) {
      this.dqS = var1;
      this.dqT = var3;
      this.dqR = var2;
   }

   public int[] avg() {
      return this.dqT;
   }
}
