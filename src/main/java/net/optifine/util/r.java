package net.optifine.util;

public class r {
   private int jD = 0;
   private int ckG = 18;
   private int jE = 0;
   private byte[][][] cVi = (byte[][][])null;
   private int cVg = 0;
   private byte[] cVj = null;
   private int cVf = 0;
   private int ckK = 128;
   private int ckI = 18;

   public byte an(int var1, int var2, int var3) {
      try {
         this.cVj = this.cVi[var1 - this.jE][var2 - this.jD];
         this.cVf = var3 - this.cVg;
         return this.cVj[this.cVf];
      } catch (ArrayIndexOutOfBoundsException var5) {
         var5.printStackTrace();
         return -1;
      }
   }

   public void e(byte var1) {
      try {
         this.cVj[this.cVf] = var1;
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void Z(int var1, int var2, int var3) {
      this.jE = var1;
      this.jD = var2;
      this.cVg = var3;
      this.ce();
   }

   public void ce() {
      for(int var1 = 0; var1 < this.ckG; ++var1) {
         byte[][] var2 = this.cVi[var1];

         for(int var3 = 0; var3 < this.ckK; ++var3) {
            byte[] var4 = var2[var3];

            for(int var5 = 0; var5 < this.ckI; ++var5) {
               var4[var5] = -1;
            }
         }
      }

   }

   public r(int var1, int var2, int var3) {
      this.ckG = var1;
      this.ckK = var2;
      this.ckI = var3;
      this.cVi = new byte[var1][var2][var3];
      this.ce();
   }
}
