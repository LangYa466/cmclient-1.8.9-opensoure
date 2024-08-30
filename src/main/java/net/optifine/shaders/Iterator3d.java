package net.optifine.shaders;

import java.util.Iterator;

public class Iterator3d implements Iterator {
   private final .WT cDX = new .WT(0, 0, 0);
   private final int cDY;
   private final IteratorAxis cDZ;
   private static final int cEa = 0;
   private int cEb = 0;
   private static final int cEc = 1;
   private final int cEd;
   private static final int cEe = 2;
   private final int cEf;

   public void remove() {
      throw new RuntimeException(.o.q[-30259 & 1821]);
   }

   private .NW q(.NW var1, boolean var2, boolean var3, boolean var4) {
      if (var2) {
         var1 = new .NW(-var1.aY(), var1.aX(), var1.KO());
      }

      if (var3) {
         var1 = new .NW(var1.aY(), -var1.aX(), var1.KO());
      }

      if (var4) {
         var1 = new .NW(var1.aY(), var1.aX(), -var1.KO());
      }

      return var1;
   }

   public Iterator3d(.NW var1, .NW var2, int var3, int var4) {
      boolean var5 = var1.aY() > var2.aY();
      boolean var6 = var1.aX() > var2.aX();
      boolean var7 = var1.KO() > var2.KO();
      var1 = this.q(var1, var5, var6, var7);
      var2 = this.q(var2, var5, var6, var7);
      this.cEd = var5 ? -1 : 1;
      this.cDY = var6 ? -1 : 1;
      this.cEf = var7 ? -1 : 1;
      .PX var8 = new .PX((double)(var2.aY() - var1.aY()), (double)(var2.aX() - var1.aX()), (double)(var2.KO() - var1.KO()));
      .PX var9 = var8.XT();
      .PX var10 = new .PX(1.0D, 0.0D, 0.0D);
      double var11 = var9.f(var10);
      double var13 = Math.abs(var11);
      .PX var15 = new .PX(0.0D, 1.0D, 0.0D);
      double var16 = var9.f(var15);
      double var18 = Math.abs(var16);
      .PX var20 = new .PX(0.0D, 0.0D, 1.0D);
      double var21 = var9.f(var20);
      double var23 = Math.abs(var21);
      if (var23 >= var18 && var23 >= var13) {
         this.cEb = 2;
         .NW var35 = new .NW(var1.KO(), var1.aX() - var3, var1.aY() - var4);
         .NW var37 = new .NW(var2.KO(), var1.aX() + var3 + 1, var1.aY() + var4 + 1);
         int var39 = var2.KO() - var1.KO();
         double var41 = (double)(var2.aX() - var1.aX()) / (double)var39;
         double var43 = (double)(var2.aY() - var1.aY()) / (double)var39;
         this.cDZ = new IteratorAxis(var35, var37, var41, var43);
      } else if (var18 >= var13 && var18 >= var23) {
         this.cEb = 1;
         .NW var34 = new .NW(var1.aX(), var1.aY() - var3, var1.KO() - var4);
         .NW var36 = new .NW(var2.aX(), var1.aY() + var3 + 1, var1.KO() + var4 + 1);
         int var38 = var2.aX() - var1.aX();
         double var40 = (double)(var2.aY() - var1.aY()) / (double)var38;
         double var42 = (double)(var2.KO() - var1.KO()) / (double)var38;
         this.cDZ = new IteratorAxis(var34, var36, var40, var42);
      } else {
         this.cEb = 0;
         .NW var25 = new .NW(var1.aY(), var1.aX() - var3, var1.KO() - var4);
         .NW var26 = new .NW(var2.aY(), var1.aX() + var3 + 1, var1.KO() + var4 + 1);
         int var27 = var2.aY() - var1.aY();
         double var28 = (double)(var2.aX() - var1.aX()) / (double)var27;
         double var30 = (double)(var2.KO() - var1.KO()) / (double)var27;
         this.cDZ = new IteratorAxis(var25, var26, var28, var30);
      }

   }

   public .NW ahU() {
      .NW var1 = this.cDZ.ahU();
      switch(this.cEb) {
      case 0:
         this.cDX.ah(var1.aY() * this.cEd, var1.aX() * this.cDY, var1.KO() * this.cEf);
         return this.cDX;
      case 1:
         this.cDX.ah(var1.aX() * this.cEd, var1.aY() * this.cDY, var1.KO() * this.cEf);
         return this.cDX;
      case 2:
         this.cDX.ah(var1.KO() * this.cEd, var1.aX() * this.cDY, var1.aY() * this.cEf);
         return this.cDX;
      default:
         this.cDX.ah(var1.aY() * this.cEd, var1.aX() * this.cDY, var1.KO() * this.cEf);
         return this.cDX;
      }
   }

   public static void main(String[] var0) {
      .NW var1 = new .NW(10, 20, 30);
      .NW var2 = new .NW(30, 40, 20);
      Iterator3d var3 = new Iterator3d(var1, var2, 1, 1);

      while(var3.hasNext()) {
         .NW var4 = var3.ahU();
         System.out.println(.q.q[12288 & 642] + var4);
      }

   }

   public boolean hasNext() {
      return this.cDZ.hasNext();
   }

   // $FF: synthetic method
   public Object next() {
      return this.ahU();
   }
}
