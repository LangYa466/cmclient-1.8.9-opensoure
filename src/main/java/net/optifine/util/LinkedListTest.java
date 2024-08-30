package net.optifine.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class LinkedListTest {
   private static void w(net.optifine.util.z var0) {
      StringBuffer var1 = new StringBuffer();
      var0.iterator().forEachRemaining((var1x) -> {
         if (var1x.amA() != null) {
            .Zz var3 = (.Zz)var1x.amA();
            if (var1.length() > 0) {
               var1.append(.q.q[622 & 16879]);
            }

            var1.append(var3.ahF());
         }
      });
      cM(.i.q[4933 & 24915] + var1);
   }

   private static void w(List var0, List var1, int var2) {
      int var3 = var0.size() + var1.size();
      if (var3 != var2) {
         throw new RuntimeException(.i.q[20807 & 9687] + var3);
      }
   }

   private static void q(net.optifine.util.z var0, int var1) {
      if (var0.bh() != var1) {
         throw new RuntimeException(.i.q[27074 & -32398] + var0.bh() + .i.q[-30269 & 1919] + var1);
      } else {
         int var2 = 0;

         for(net.optifine.util.c var3 = var0.amx(); var3 != null; var3 = var3.amB()) {
            ++var2;
         }

         if (var0.bh() != var2) {
            throw new RuntimeException(.i.q[2884 & 26069] + var0.bh() + .i.q[4933 & 11613] + var2);
         } else {
            int var5 = 0;

            for(net.optifine.util.c var4 = var0.amy(); var4 != null; var4 = var4.amC()) {
               ++var5;
            }

            if (var0.bh() != var5) {
               throw new RuntimeException(.i.q[-5818 & 342] + var0.bh() + .i.q[-29331 & 9157] + var5);
            }
         }
      }
   }

   private static void cM(String var0) {
      System.out.println(var0);
   }

   public static void main(String[] var0) {
      net.optifine.util.z var1 = new net.optifine.util.z();
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();
      Random var4 = new Random();
      byte var5 = 100;

      for(int var6 = 0; var6 < var5; ++var6) {
         .Zz var7 = new .Zz();
         var7.iH(var6);
         var2.add(var7);
      }

      for(int var11 = 0; var11 < 100000; ++var11) {
         w(var2, var3, var5);
         q(var1, var3.size());
         if (var11 % 5 == 0) {
            w(var1);
         }

         if (var4.nextBoolean()) {
            if (!var2.isEmpty()) {
               .Zz var13 = (.Zz)var2.get(var4.nextInt(var2.size()));
               net.optifine.util.c var14 = var13.ahH();
               if (var4.nextBoolean()) {
                  var1.y(var14);
                  cM(.i.q[10685 & 829] + var13.ahF());
               } else if (var4.nextBoolean()) {
                  var1.t(var14);
                  cM(.i.q[-31361 & 9150] + var13.ahF());
               } else {
                  if (var3.isEmpty()) {
                     continue;
                  }

                  .Zz var9 = (.Zz)var3.get(var4.nextInt(var3.size()));
                  net.optifine.util.c var10 = var9.ahH();
                  var1.w(var10, var14);
                  cM(.i.q[831 & 20799] + var9.ahF() + .q.q[-14994 & 4734] + var13.ahF());
               }

               var2.remove(var13);
               var3.add(var13);
            }
         } else if (!var3.isEmpty()) {
            .Zz var12 = (.Zz)var3.get(var4.nextInt(var3.size()));
            net.optifine.util.c var8 = var12.ahH();
            var1.r(var8);
            cM(.i.q[23036 & 323] + var12.ahF());
            var3.remove(var12);
            var2.add(var12);
         }
      }

   }
}
