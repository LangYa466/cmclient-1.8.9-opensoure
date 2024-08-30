package net.optifine.shaders;

import java.util.ArrayDeque;
import java.util.Deque;

public class k {
   private final Deque cEO = new ArrayDeque();

   public net.optifine.shaders.j aio() {
      if (this.cEO.isEmpty()) {
         throw new RuntimeException(.y.q[210 & -15718]);
      } else {
         net.optifine.shaders.j var1 = (net.optifine.shaders.j)this.cEO.pollLast();
         return var1;
      }
   }

   public void w(net.optifine.shaders.j var1) {
      this.cEO.addLast(var1);
      if (this.cEO.size() > 100) {
         throw new RuntimeException(.y.q[26033 & -28527] + this.cEO.size());
      }
   }
}
