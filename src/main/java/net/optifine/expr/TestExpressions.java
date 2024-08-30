package net.optifine.expr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestExpressions {
   public static void main(String[] var0) {
      net.optifine.expr.r var1 = new net.optifine.expr.r((net.optifine.expr.k)null);

      while(true) {
         try {
            InputStreamReader var2 = new InputStreamReader(System.in);
            BufferedReader var3 = new BufferedReader(var2);
            String var4 = var3.readLine();
            if (var4.length() <= 0) {
               return;
            }

            net.optifine.expr.d var5 = var1.eW(var4);
            if (var5 instanceof net.optifine.expr.h) {
               net.optifine.expr.h var6 = (net.optifine.expr.h)var5;
               float var7 = var6.agg();
               System.out.println(.q.q[17162 & 8324] + var7);
            }

            if (var5 instanceof net.optifine.expr.f) {
               net.optifine.expr.f var9 = (net.optifine.expr.f)var5;
               boolean var10 = var9.agj();
               System.out.println(.q.q[1553 & -24318] + var10);
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }
   }
}
