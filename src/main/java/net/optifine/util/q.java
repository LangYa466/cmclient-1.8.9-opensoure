package net.optifine.util;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class q {
   private Class cVc = null;
   private final ArrayDeque cVd = new ArrayDeque();
   private int ajs = 0;

   public synchronized void b(Object var1) {
      if (var1 != null) {
         Class var2 = var1.getClass();
         if (var2.getComponentType() != this.cVc) {
            throw new IllegalArgumentException(.u.q[-15501 & 1851]);
         }

         if (this.cVd.size() < this.ajs) {
            this.cVd.add(var1);
         }
      }

   }

   public q(Class var1, int var2) {
      this.cVc = var1;
      this.ajs = var2;
   }

   public synchronized Object jz(int var1) {
      Object var2 = this.cVd.pollLast();
      if (var2 == null || Array.getLength(var2) < var1) {
         var2 = Array.newInstance(this.cVc, var1);
      }

      return var2;
   }
}
