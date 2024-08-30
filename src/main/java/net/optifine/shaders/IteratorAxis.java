package net.optifine.shaders;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorAxis implements Iterator {
   private double cEg;
   private double cEh;
   private boolean cEi = false;
   private int cEj;
   private double cEk;
   private double cEl;
   private final int cEm;
   private final double cEn;
   private final int cEo;
   private final double cEp;
   private double cEq;
   private double cEr;
   private final .WT cEs = new .WT(0, 0, 0);

   public boolean hasNext() {
      return this.cEi;
   }

   // $FF: synthetic method
   public Object next() {
      return this.ahU();
   }

   public static void main(String[] var0) {
      .NW var1 = new .NW(-2, 10, 20);
      .NW var2 = new .NW(2, 12, 22);
      double var3 = -0.5D;
      double var5 = 0.5D;
      IteratorAxis var7 = new IteratorAxis(var1, var2, var3, var5);
      System.out.println(.u.q[349 & 11629] + var1 + .u.q[29023 & -30866] + var2 + .u.q[3071 & 9551] + var3 + .u.q[1394 & -7856] + var5);

      while(var7.hasNext()) {
         .NW var8 = var7.ahU();
         System.out.println(.q.q[-29627 & 4640] + var8);
      }

   }

   public IteratorAxis(.NW var1, .NW var2, double var3, double var5) {
      this.cEn = var3;
      this.cEp = var5;
      this.cEo = var1.aY();
      this.cEm = var2.aY();
      this.cEh = (double)var1.aX();
      this.cEg = (double)var2.aX() - 0.5D;
      this.cEl = (double)var1.KO();
      this.cEk = (double)var2.KO() - 0.5D;
      this.cEj = this.cEo;
      this.cEq = this.cEh;
      this.cEr = this.cEl;
      this.cEi = this.cEj < this.cEm && this.cEq < this.cEg && this.cEr < this.cEk;
   }

   public void remove() {
      throw new RuntimeException(.u.q[1356 & -31923]);
   }

   private void ahV() {
      ++this.cEr;
      if (this.cEr >= this.cEk) {
         this.cEr = this.cEl;
         ++this.cEq;
         if (this.cEq >= this.cEg) {
            this.cEq = this.cEh;
            this.cEh += this.cEn;
            this.cEg += this.cEn;
            this.cEq = this.cEh;
            this.cEl += this.cEp;
            this.cEk += this.cEp;
            this.cEr = this.cEl;
            ++this.cEj;
            if (this.cEj >= this.cEm) {
               ;
            }
         }
      }

   }

   public .NW ahU() {
      if (!this.cEi) {
         throw new NoSuchElementException();
      } else {
         this.cEs.P((double)this.cEj, this.cEq, this.cEr);
         this.ahV();
         this.cEi = this.cEj < this.cEm && this.cEq < this.cEg && this.cEr < this.cEk;
         return this.cEs;
      }
   }
}
