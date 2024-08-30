package net.optifine.util;

public class i {
   private final int cVs;
   private int ji;

   public synchronized void pK() {
      this.ji = this.cVs;
   }

   public i(int var1) {
      this.cVs = var1;
      this.ji = var1;
   }

   public int akP() {
      return this.ji;
   }

   public synchronized int amu() {
      int var1 = this.ji++;
      return var1;
   }
}
