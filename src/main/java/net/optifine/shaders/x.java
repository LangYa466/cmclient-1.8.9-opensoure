package net.optifine.shaders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class x {
   private static final String cEY = "[Shaders] ";
   private static final Logger cEZ = LogManager.getLogger();

   public static void fs(String var0) {
      cEZ.debug(.i.q[-31829 & 5089] + var0);
   }

   public static void ft(String var0) {
      cEZ.error(.i.q[1009 & 5035] + var0);
   }

   public static void t(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      cEZ.info(.i.q[2985 & 1953] + var2);
   }

   public static void fu(String var0) {
      cEZ.warn(.i.q[-31761 & 18353] + var0);
   }

   public static void y(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      cEZ.debug(.i.q[1959 & 11233] + var2);
   }

   public static void fv(String var0) {
      cEZ.info(.i.q[17317 & 8161] + var0);
   }

   public static void u(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      cEZ.warn(.i.q[-30799 & 17385] + var2);
   }

   public static void i(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      cEZ.error(.i.q[17323 & 2993] + var2);
   }
}
