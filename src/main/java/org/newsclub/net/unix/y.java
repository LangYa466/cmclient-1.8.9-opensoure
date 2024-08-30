package org.newsclub.net.unix;

import java.io.File;

public final class y extends org.newsclub.net.unix.r {
   private static final String dlq = "org.newsclub.net.unix.socket.default";

   protected AFUNIXSocketAddress E(String var1, int var2) {
      String var3 = System.getProperty(.w.q[27631 & 17405 & -17468 & 21498]);
      if (var3 != null && !var3.isEmpty()) {
         File var4 = new File(var3);
         return new AFUNIXSocketAddress(var4, var2);
      } else {
         throw new IllegalStateException(.w.q[26613 & 2039 & 4067 & 3023]);
      }
   }
}
