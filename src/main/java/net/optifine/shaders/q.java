package net.optifine.shaders;

import java.util.ArrayList;
import java.util.HashSet;

public class q {
   private final .Yi[] cDu;
   private final int cDv;

   public int ahM() {
      return this.cDv;
   }

   public int[] aey() {
      HashSet var1 = new HashSet();

      for(int var2 = 0; var2 < this.cDu.length; ++var2) {
         .Yi var3 = this.cDu[var2];
         int var4 = var3.eG();
         var1.add(Integer.valueOf(var4));
      }

      Integer[] var5 = (Integer[])var1.toArray(new Integer[var1.size()]);
      int[] var6 = .MV.q(var5);
      return var6;
   }

   public q(int var1, .Yi[] var2) {
      this.cDv = var1;
      this.cDu = var2;
   }

   public String toString() {
      return .i.q[159 & 13151] + this.cDv + .q.q[24854 & 2622] + .MV.w(this.cDu);
   }

   public boolean bD(int var1, int var2) {
      for(int var3 = 0; var3 < this.cDu.length; ++var3) {
         .Yi var4 = this.cDu[var3];
         if (var4.bD(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public .Yi[] iM(int var1) {
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < this.cDu.length; ++var3) {
         .Yi var4 = this.cDu[var3];
         if (var4.eG() == var1) {
            var2.add(var4);
         }
      }

      .Yi[] var5 = (.Yi[])var2.toArray(new .Yi[var2.size()]);
      return var5;
   }
}
