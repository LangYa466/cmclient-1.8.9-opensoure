package net.optifine.shaders;

import java.util.Iterator;

public class g implements Iterator {
   private final .WT cEt = new .WT(0, 0, 0);
   private final Iterator3d cEu;
   private final .qp cEv;

   // $FF: synthetic method
   public Object next() {
      return this.ahW();
   }

   public .rA ahW() {
      .NW var1 = this.cEu.ahU();
      this.cEt.ah(var1.aY() << 4, var1.aX() << 4, var1.KO() << 4);
      .rA var2 = this.cEv.k(this.cEt);
      return var2;
   }

   public void remove() {
      throw new RuntimeException(.u.q[11086 & 1357]);
   }

   public boolean hasNext() {
      return this.cEu.hasNext();
   }

   public g(.qp var1, .NW var2, .NW var3, int var4, int var5) {
      this.cEv = var1;
      this.cEu = new Iterator3d(var2, var3, var4, var5);
   }
}
