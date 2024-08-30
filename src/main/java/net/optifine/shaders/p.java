package net.optifine.shaders;

import java.nio.IntBuffer;
import java.util.Arrays;

public class p {
   private final IntBuffer cDQ;
   private final int cDR;
   private final boolean[] cDS;
   private final boolean[] cDT;

   public int iO(int var1) {
      return this.d(var1, this.cDS[var1]);
   }

   private int d(int var1, boolean var2) {
      int var3 = var2 ? this.cDR : 0;
      return this.cDQ.get(var3 + var1);
   }

   public int iP(int var1) {
      return this.d(var1, !this.cDS[var1]);
   }

   public void pK() {
      Arrays.fill(this.cDS, false);
      Arrays.fill(this.cDT, false);
   }

   public boolean iQ(int var1) {
      return this.cDT[var1];
   }

   public p(IntBuffer var1, int var2) {
      this.cDQ = var1;
      this.cDR = var2;
      this.cDS = new boolean[var1.capacity()];
      this.cDT = new boolean[var1.capacity()];
   }

   public void iR(int var1) {
      this.cDS[var1] = !this.cDS[var1];
      this.cDT[var1] = true;
   }
}
