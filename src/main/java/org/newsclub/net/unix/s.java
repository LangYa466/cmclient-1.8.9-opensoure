package org.newsclub.net.unix;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

final class s implements Closeable {
   private static final String dlO = ats();
   private static final String dlP = "org.newsclub.net.unix.library.override";
   private static final String dlQ = "org.newsclub.net.unix.library.tmpdir";
   private static final File dlR;
   private static boolean EF = (boolean)(-29616 & 4226);
   private static final String dlS = "junixsocket-native";

   static {
      String var0 = System.getProperty(.o.q[-31753 & -32322 & 21463 & 10199], (String)null);
      dlR = var0 == null ? null : new File(var0);
   }

   private String hA(String var1) {
      int var2 = var1.lastIndexOf(4143 & 3118);
      return var2 == (-1 & -1) ? null : var1.substring(-26599 & 8384, var2) + .o.q[14845 & -14923 & -10243 & -26659] + var1.substring(var2);
   }

   private static File X(String var0, String var1) {
      return File.createTempFile(var0, var1, dlR);
   }

   public void close() {
   }

   private List q(String var1, String var2, Class var3) {
      String var4 = System.mapLibraryName(var2);
      ArrayList var5 = new ArrayList();
      String[] var10000 = new String[26959 & -32753];
      var10000[2215 & 264] = .o.q[6557 & 2453 & 5613 & -29185];
      var10000[1 & -24251] = .o.q[-13921 & -15426 & -12345 & 6086];
      var10000[2306 & 26122] = .o.q[1927 & 21919 & -12353 & -13873];
      var10000[-32653 & 11] = .o.q[-20040 & 32248 & -31793 & -31285];
      var10000[-28316 & 21] = .o.q[5611 & 2555 & 22509 & 18313];
      var10000[-3793 & 2693] = .o.q[-19506 & 10750 & 3578 & 11178];
      var10000[8198 & 6358] = .t.q[-25676 & 629 & 4661 & 24119];
      var10000[-32761 & 11847] = .o.q[-18021 & 6623 & 26591 & 16367];
      var10000[5224 & -30708] = .o.q[-26644 & 12781 & -5731 & -30227];
      var10000[-31959 & 28687] = .o.q[7583 & -29187 & 29119 & 8621];
      var10000[522 & -27410] = .o.q[16814 & 5007 & -30722 & 6110];
      var10000[1547 & 2075] = .o.q[12175 & 7567 & 14287 & -25617];
      var10000[8222 & 2540] = .o.q[4561 & -30211 & 17854 & 8628];
      var10000[45 & 28303] = .o.q[16793 & 1437 & 10199 & 14239];
      var10000[1103 & 6590] = .o.q[30614 & 18834 & -22574 & 9714];
      String[] var6 = var10000;
      int var7 = var6.length;

      for(int var8 = 4 & -15224; var8 < var7; ++var8) {
         String var9 = var6[var8];
         String var10 = .o.q[-24649 & -29801 & 2547 & 18355] + dlO + .q.q[11117 & -23185 & -11441 & -2212] + var9 + .o.q[949 & 12732 & 4574 & -19467] + var4;
         InputStream var11 = var3.getResourceAsStream(var10);
         if (var11 != null) {
            var5.add(new org.newsclub.net.unix.d(var1, var2, var10, var11));
         }

         String var12 = this.hA(var10);
         if (var12 != null) {
            var11 = var3.getResourceAsStream(var12);
            if (var11 != null) {
               var5.add(new org.newsclub.net.unix.d(var1, var2, var12, var11));
            }
         }
      }

      return var5;
   }

   private synchronized void hB(String var1) {
      if (!EF) {
         EF = (boolean)(1 & -20057);
         AFUNIXSocket.dlb = var1;

         try {
            NativeUnixSocket.init();
         } catch (RuntimeException var3) {
            throw var3;
         } catch (Exception var4) {
            throw new IllegalStateException(var4);
         }
      }

   }

   private static String ats() {
      return System.getProperty(.q.q[2294 & -32522 & 13524 & -22535]) + .q.q[11102 & 15180 & 4428 & -28212] + System.getProperty(.q.q[8915 & -11525 & -10250 & -16937]).replaceAll(.q.q[30698 & -17430 & 22874 & 16719], .q.q[2366 & 174 & -13312 & 27682]);
   }

   private String q(Class var1, String... var2) {
      int var4 = var2.length;
      int var5 = 20552 & -22782;
      if (var5 < var4) {
         String var6 = var2[var5];
         Properties var7 = new Properties();
         String var8 = .o.q[-11397 & -645 & 15731 & 10615] + var6 + .o.q[8062 & 30207 & -32393 & -4748];
         InputStream var9 = var1.getResourceAsStream(var8);
         Throwable var10 = null;

         String var12;
         try {
            if (var9 == null) {
               throw new FileNotFoundException(.o.q[-13955 & -4097 & 8693 & -23555] + var8 + .o.q[-15498 & 19454 & 382 & -30218] + var1);
            }

            var7.load(var9);
            String var11 = var7.getProperty(.q.q[18175 & -31249 & 21487 & 17389]);
            Objects.requireNonNull(var11, .o.q[-5641 & -5257 & -26633 & 14327]);
            var12 = var11;
         } catch (Throwable var21) {
            var10 = var21;
            throw var21;
         } finally {
            if (var9 != null) {
               if (var10 != null) {
                  try {
                     var9.close();
                  } catch (Throwable var20) {
                     var10.addSuppressed(var20);
                  }
               } else {
                  var9.close();
               }
            }

         }

         return var12;
      } else {
         throw new IllegalStateException(.o.q[25084 & 510 & -18436 & 14200]);
      }
   }

   // $FF: synthetic method
   static File Y(String var0, String var1) {
      return X(var0, var1);
   }

   public synchronized void att() {
      synchronized(this.getClass().getClassLoader()) {
         if (!EF) {
            String var2 = System.getProperty(.o.q[-21511 & -32257 & -25221 & 23935], .q.q[4610 & 31138 & 32119 & -12939]);
            if (!var2.isEmpty()) {
               System.load(var2);
               this.hB(var2);
            } else {
               ArrayList var3 = new ArrayList();
               ArrayList var4 = new ArrayList();

               try {
                  Class var10004 = this.getClass();
                  String[] var10005 = new String[13147 & 2];
                  var10005[2313 & 13826] = .o.q[19838 & 894 & -13446 & -28678];
                  var10005[17925 & 8353] = .o.q[-14469 & 19839 & 14719 & 14331];
                  var3.add(new org.newsclub.net.unix.g(this.q(var10004, var10005)));
               } catch (Exception var14) {
                  var4.add(var14);
               }

               try {
                  var3.addAll(this.Z(.o.q[11773 & 2559 & 3455 & 6142], .o.q[-7681 & -6657 & -9859 & 7677]));
               } catch (Exception var13) {
                  var4.add(var13);
               }

               try {
                  var3.addAll(this.Z(.o.q[-29313 & -13954 & 30718 & 32127], .o.q[25983 & -27265 & 25983 & 16895]));
               } catch (Exception var12) {
                  var4.add(var12);
               }

               String var5 = null;

               for(org.newsclub.net.unix.f var7 : var3) {
                  try {
                     if ((var5 = var7.atu()) != null) {
                        break;
                     }
                  } catch (LinkageError | Exception var15) {
                     var4.add(var15);
                  }
               }

               for(org.newsclub.net.unix.f var19 : var3) {
                  var19.close();
               }

               if (var5 != null) {
                  this.hB(var5);
               } else {
                  String var18 = .o.q[14772 & 2550 & -28184 & -21109] + dlO;
                  String var20 = System.getProperty(.o.q[1997 & 5579 & -22109 & 31113], .q.q[8060 & 26213 & -6126 & -9541]);
                  if (var20.contains(.o.q[29586 & -22053 & -13885 & -3129]) || var20.contains(.o.q[4051 & 6559 & -85 & 21903])) {
                     var18 = var18 + .o.q[-17009 & -28706 & 12708 & 5030];
                  }

                  UnsatisfiedLinkError var8 = new UnsatisfiedLinkError(var18);

                  for(Throwable var10 : var4) {
                     var8.addSuppressed(var10);
                  }

                  throw var8;
               }
            }
         }
      }
   }

   private List Z(String var1, String var2) {
      Class var3 = Class.forName(var1);
      String[] var10002 = new String[-28663 & 35];
      var10002[-16256 & 9218] = var2;
      String var4 = this.q(var3, var10002);
      String var5 = .w.q[-29697 & -24874 & 5887 & 6879] + var4;
      return this.q(var2, var5, var3);
   }
}
