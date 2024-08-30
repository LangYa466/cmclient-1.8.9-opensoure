package net.optifine.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class H {
   public static Properties J(String var0, String var1) {
      .PJ var2 = new .PJ(var0);

      try {
         InputStream var3 = .MV.b(var2);
         if (var3 == null) {
            return null;
         } else {
            net.optifine.util.F var4 = new net.optifine.util.F();
            var4.load(var3);
            var3.close();
            .MV.cM(var1 + .o.q[-14950 & 4363] + var0);
            return var4;
         }
      } catch (FileNotFoundException var5) {
         return null;
      } catch (IOException var6) {
         .MV.cJ(var1 + .o.q[4431 & -15589] + var0);
         return null;
      }
   }

   private static boolean gO(String var0) {
      return var0.equals(var0.toLowerCase(Locale.ROOT));
   }

   private static String[] q(File var0, String[] var1, String[] var2) {
      ArrayList var3 = new ArrayList();
      String var4 = .o.q[4937 & 1289];

      try {
         ZipFile var5 = new ZipFile(var0);
         Enumeration var6 = var5.entries();

         while(var6.hasMoreElements()) {
            ZipEntry var7 = (ZipEntry)var6.nextElement();
            String var8 = var7.getName();
            if (var8.startsWith(var4)) {
               var8 = var8.substring(var4.length());
               if (net.optifine.util.J.e(var8, var1) && net.optifine.util.J.w(var8, var2)) {
                  var3.add(var8);
               }
            }
         }

         var5.close();
         String[] var10 = (String[])var3.toArray(new String[var3.size()]);
         return var10;
      } catch (IOException var9) {
         var9.printStackTrace();
         return new String[0];
      }
   }

   public static Properties e(InputStream var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         try {
            net.optifine.util.F var2 = new net.optifine.util.F();
            var2.load(var0);
            var0.close();
            return var2;
         } catch (FileNotFoundException var3) {
            return null;
         } catch (IOException var4) {
            return null;
         }
      }
   }

   public static String[] q(.uN var0, String[] var1, String[] var2) {
      return q(var0, var1, var2, (String[])null);
   }

   public static String[] q(.uN var0, String[] var1, String[] var2, String[] var3) {
      if (var0 instanceof .uB) {
         return q(var0, var3);
      } else if (!(var0 instanceof .uz)) {
         .MV.cJ(.o.q[263 & -13929] + var0);
         return new String[0];
      } else {
         .uz var4 = (.uz)var0;
         File var5 = var4.ayL;
         if (var5 == null) {
            return new String[0];
         } else if (var5.isDirectory()) {
            return q(var5, .q.q[8704 & -29358], var1, var2);
         } else if (var5.isFile()) {
            return q(var5, var1, var2);
         } else {
            .MV.cJ(.o.q[10568 & 17162] + var5);
            return new String[0];
         }
      }
   }

   private static String[] q(.uN var0, String[] var1) {
      if (var1 == null) {
         return new String[0];
      } else {
         ArrayList var2 = new ArrayList();

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            .PJ var5 = new .PJ(var4);
            if (var0.v(var5)) {
               var2.add(var4);
            }
         }

         String[] var6 = (String[])var2.toArray(new String[var2.size()]);
         return var6;
      }
   }

   public static String[] q(.uN var0, String var1, String var2, String[] var3) {
      return q(var0, new String[]{var1}, new String[]{var2}, var3);
   }

   private static String[] q(File var0, String var1, String[] var2, String[] var3) {
      ArrayList var4 = new ArrayList();
      String var5 = .o.q[-20083 & 16649];
      File[] var6 = var0.listFiles();
      if (var6 == null) {
         return new String[0];
      } else {
         for(int var7 = 0; var7 < var6.length; ++var7) {
            File var8 = var6[var7];
            if (var8.isFile()) {
               String var9 = var1 + var8.getName();
               if (var9.startsWith(var5)) {
                  var9 = var9.substring(var5.length());
                  if (net.optifine.util.J.e(var9, var2) && net.optifine.util.J.w(var9, var3)) {
                     var4.add(var9);
                  }
               }
            } else if (var8.isDirectory()) {
               String var13 = var1 + var8.getName() + .q.q[6495 & 1119];
               String[] var10 = q(var8, var13, var2, var3);
               Collections.addAll(var4, var10);
            }
         }

         String[] var11 = (String[])var4.toArray(new String[var4.size()]);
         return var11;
      }
   }

   public static String[] K(String var0, String var1) {
      return w(new String[]{var0}, new String[]{var1});
   }

   public static String[] w(String[] var0, String[] var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      .uN[] var3 = .MV.Rv();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         .uN var5 = var3[var4];
         String[] var6 = q(var5, var0, var1, (String[])null);
         var2.addAll(Arrays.asList(var6));
      }

      String[] var7 = (String[])var2.toArray(new String[var2.size()]);
      return var7;
   }
}
