package net.optifine.util;

import java.util.Iterator;

public class z {
   private net.optifine.util.c cVA;
   private net.optifine.util.c cVB;
   private int hR;

   public boolean isEmpty() {
      return this.hR <= 0;
   }

   private void q(net.optifine.util.c var1) {
      if (net.optifine.util.c.u(var1) != this) {
         throw new IllegalArgumentException(.t.q[2710 & 30375] + var1 + .t.q[679 & -13433] + net.optifine.util.c.u(var1) + .t.q[18062 & 2713] + this);
      }
   }

   public net.optifine.util.c amx() {
      return this.cVB;
   }

   private void w(net.optifine.util.c var1) {
      if (net.optifine.util.c.u(var1) != null) {
         throw new IllegalArgumentException(.t.q[-32081 & 2710] + var1 + .t.q[-32057 & 8879] + net.optifine.util.c.u(var1) + .t.q[3976 & -32102] + this);
      }
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();

      for(net.optifine.util.c var3 : this) {
         if (var1.length() > 0) {
            var1.append(.q.q[1135 & 750]);
         }

         var1.append(var3.amA());
      }

      return this.hR + .q.q[5018 & 18363] + var1 + .q.q[10236 & -25700];
   }

   public boolean e(net.optifine.util.c var1) {
      return net.optifine.util.c.u(var1) == this;
   }

   public int bh() {
      return this.hR;
   }

   public void q(net.optifine.util.c var1, net.optifine.util.c var2) {
      this.r(var2);
      this.w(var1, var2);
   }

   public net.optifine.util.c amy() {
      return this.cVA;
   }

   public net.optifine.util.c r(net.optifine.util.c var1) {
      this.q(var1);
      net.optifine.util.c var2 = var1.amC();
      net.optifine.util.c var3 = var1.amB();
      if (var2 != null) {
         net.optifine.util.c.e(var2, var3);
      } else {
         this.cVB = var3;
      }

      if (var3 != null) {
         net.optifine.util.c.r(var3, var2);
      } else {
         this.cVA = var2;
      }

      net.optifine.util.c.r(var1, (net.optifine.util.c)null);
      net.optifine.util.c.e(var1, (net.optifine.util.c)null);
      net.optifine.util.c.q(var1, (net.optifine.util.z)null);
      --this.hR;
      return var1;
   }

   public void w(net.optifine.util.c var1, net.optifine.util.c var2) {
      if (var1 == null) {
         this.y(var2);
      } else if (var1 == this.cVA) {
         this.t(var2);
      } else {
         this.q(var1);
         this.w(var2);
         net.optifine.util.c var3 = var1.amB();
         net.optifine.util.c.e(var1, var2);
         net.optifine.util.c.r(var2, var1);
         net.optifine.util.c.r(var3, var2);
         net.optifine.util.c.e(var2, var3);
         net.optifine.util.c.q(var2, this);
         ++this.hR;
      }

   }

   public boolean q(net.optifine.util.c var1, net.optifine.util.c var2, net.optifine.util.c var3) {
      this.q(var2);
      if (var3 != null) {
         this.q(var3);
      }

      net.optifine.util.c var4;
      for(var4 = var2; var4 != null && var4 != var3; var4 = var4.amB()) {
         if (var4 == var1) {
            return true;
         }
      }

      if (var4 != var3) {
         throw new IllegalArgumentException(.t.q[-22876 & 17285] + var2 + .t.q[17029 & 4741] + var3);
      } else {
         return false;
      }
   }

   public void t(net.optifine.util.c var1) {
      this.w(var1);
      if (this.isEmpty()) {
         this.cVB = var1;
         this.cVA = var1;
      } else {
         net.optifine.util.c var2 = this.cVA;
         net.optifine.util.c.r(var1, var2);
         net.optifine.util.c.e(var2, var1);
         this.cVA = var1;
      }

      net.optifine.util.c.q(var1, this);
      ++this.hR;
   }

   public void y(net.optifine.util.c var1) {
      this.w(var1);
      if (this.isEmpty()) {
         this.cVB = var1;
         this.cVA = var1;
      } else {
         net.optifine.util.c var2 = this.cVB;
         net.optifine.util.c.e(var1, var2);
         net.optifine.util.c.r(var2, var1);
         this.cVB = var1;
      }

      net.optifine.util.c.q(var1, this);
      ++this.hR;
   }

   public Iterator iterator() {
      net.optifine.util.x var1 = new net.optifine.util.x(this);
      return var1;
   }
}
