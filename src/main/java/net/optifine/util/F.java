package net.optifine.util;

import java.util.UUID;

public class f {
   public static .zk s(UUID var0) {
      .QU var1 = Qq();
      if (var1 == null) {
         return null;
      } else {
         .zk var2 = var1.u(var0);
         return var2;
      }
   }

   public static .QU Qq() {
      .hS var0 = .MV.eV();
      .mP var1 = var0.Cg;
      if (var1 == null) {
         return null;
      } else if (!var0.fS()) {
         return null;
      } else {
         .Mi var2 = var0.fQ();
         if (var2 == null) {
            return null;
         } else {
            .QO var3 = var1.bXI;
            if (var3 == null) {
               return null;
            } else {
               int var4 = var3.ZQ();

               try {
                  .QU var5 = var2.gh(var4);
                  return var5;
               } catch (NullPointerException var6) {
                  return null;
               }
            }
         }
      }
   }

   public static .No h(.NW var0) {
      .QU var1 = Qq();
      if (var1 == null) {
         return null;
      } else {
         .RQ var2 = var1.Zu().H(var0.aY() >> 4, var0.KO() >> 4);
         if (var2 == null) {
            return null;
         } else {
            .No var3 = var2.q(var0, .RT.cdz);
            return var3;
         }
      }
   }
}
