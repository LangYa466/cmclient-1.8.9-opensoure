package net.optifine.expr;

import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;

public class b {
   private static net.optifine.expr.v q(char var0, net.optifine.expr.n var1, PushbackReader var2) {
      StringBuffer var3 = new StringBuffer();
      var3.append(var0);

      while(true) {
         int var4 = var2.read();
         if (var4 < 0) {
            break;
         }

         char var5 = (char)var4;
         if (!var1.i(var5)) {
            var2.unread(var5);
            break;
         }

         var3.append(var5);
      }

      return new net.optifine.expr.v(var1, var3.toString());
   }

   public static net.optifine.expr.v[] eZ(String var0) {
      StringReader var1 = new StringReader(var0);
      PushbackReader var2 = new PushbackReader(var1);
      ArrayList var3 = new ArrayList();

      while(true) {
         int var4 = var2.read();
         if (var4 < 0) {
            net.optifine.expr.v[] var8 = (net.optifine.expr.v[])var3.toArray(new net.optifine.expr.v[var3.size()]);
            return var8;
         }

         char var5 = (char)var4;
         if (!Character.isWhitespace(var5)) {
            net.optifine.expr.n var6 = net.optifine.expr.n.u(var5);
            if (var6 == null) {
               throw new net.optifine.expr.c(.q.q[-23635 & 956] + var5 + .q.q[2991 & -23571] + var0);
            }

            net.optifine.expr.v var7 = q(var5, var6, var2);
            var3.add(var7);
         }
      }
   }
}
