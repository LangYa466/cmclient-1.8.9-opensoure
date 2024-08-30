package net.optifine.util;

import java.util.Iterator;

class x implements Iterator {
   net.optifine.util.c cDm;
   // $FF: synthetic field
   final net.optifine.util.z cVC;

   public boolean hasNext() {
      return this.cDm != null;
   }

   // $FF: synthetic method
   public Object next() {
      return this.amz();
   }

   public void remove() {
      throw new UnsupportedOperationException(.e.q[-28677 & 12507]);
   }

   public net.optifine.util.c amz() {
      net.optifine.util.c var1 = this.cDm;
      if (this.cDm != null) {
         this.cDm = net.optifine.util.c.p(this.cDm);
      }

      return var1;
   }

   x(net.optifine.util.z var1) {
      this.cVC = var1;
      this.cDm = this.cVC.amx();
   }
}
