package org.newsclub.net.unix;

import java.io.File;
import java.net.URLDecoder;
import java.net.UnknownHostException;

public final class u extends org.newsclub.net.unix.w {
   private static final String dlr = "localhost";
   private static final String dls = "file://";
   private static final String dlt = "file%";

   protected boolean hy(String var1) {
      var1 = hz(var1);
      return (boolean)(!var1.startsWith(.t.q[29531 & -10405 & -133 & -20645]) && !var1.startsWith(.u.q[8127 & 2558 & 29695 & 10623]) ? 112 & 2564 : 17665 & 2049);
   }

   private static String hz(String var0) {
      if (var0.startsWith(.w.q[18873 & 947 & 957 & 437])) {
         if (var0.endsWith(.q.q[25598 & 956 & 1949 & 5053])) {
            var0 = var0.substring(25089 & 469, var0.length() - (177 & -23795));
         } else {
            var0 = var0.substring(16385 & -32627);
         }
      }

      return var0;
   }

   protected AFUNIXSocketAddress E(String var1, int var2) {
      var1 = hz(var1);
      if (var1.startsWith(.u.q[1855 & -23234 & -24193 & 14143])) {
         try {
            var1 = URLDecoder.decode(var1, .u.q[19839 & 2431 & 4543 & -14913]);
         } catch (Exception var5) {
            throw (UnknownHostException)(new UnknownHostException()).initCause(var5);
         }
      }

      if (!var1.startsWith(.t.q[-24613 & -33 & -4101 & 29567])) {
         throw new UnknownHostException();
      } else {
         String var3 = var1.substring(.t.q[10203 & 2011 & 21343 & 23391].length());
         if (var3.isEmpty()) {
            throw new UnknownHostException();
         } else {
            if (var3.startsWith(.y.q[-21250 & -27906 & 17391 & -7189])) {
               var3 = var3.substring(.y.q[26094 & 9214 & -25350 & -5382].length());
            }

            if (!var3.startsWith(.q.q[13439 & 223 & 32223 & 3455])) {
               throw new UnknownHostException();
            } else {
               File var4 = new File(var3);
               return new AFUNIXSocketAddress(var4, var2);
            }
         }
      }
   }
}
