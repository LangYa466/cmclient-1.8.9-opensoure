package net.optifine.util;

public class d {
   private int bAw = 0;
   private int cVx = 0;
   private int[] cVy = null;

   public void jE(int var1) {
      this.cVy[this.bAw] = var1;
      ++this.bAw;
      if (this.cVx < this.bAw) {
         this.cVx = this.bAw;
      }

   }

   public d(int var1) {
      this.cVy = new int[var1];
   }

   public int amv() {
      return this.cVx;
   }

   public void clear() {
      this.bAw = 0;
      this.cVx = 0;
   }

   public int[] amw() {
      return this.cVy;
   }

   public int ahF() {
      return this.bAw;
   }

   public void k(int[] var1) {
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.cVy[this.bAw] = var1[var3];
         ++this.bAw;
      }

      if (this.cVx < this.bAw) {
         this.cVx = this.bAw;
      }

   }

   public void bU(int var1, int var2) {
      this.cVy[var1] = var2;
      if (this.cVx < var1) {
         this.cVx = var1;
      }

   }

   public void jF(int var1) {
      this.bAw = var1;
   }

   public int jG(int var1) {
      return this.cVy[var1];
   }
}
