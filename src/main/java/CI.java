import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ci {
   cj lX = cj.mg;
   private static final int lY = 1;
   private final HashMap lZ;
   bZ kS;
   final bW ma;
   private static final String[] mb;
   private cb md;
   private static final Logger me = LogManager.getLogger(ci.class);

   ci(bW var1, HashMap var2) {
      this.ma = var1;
      this.lZ = var2;
   }

   public void q(cj var1) {
      this.lX = var1;
   }

   public static ci q(bW var0, long var1, HashMap var3, cb... var4) {
      if (var4 == null || var4.length == 0) {
         cb[] var10000 = new cb[17029 & 1131];
         var10000[-15328 & 905] = cb.lm;
         var4 = var10000;
      }

      ci var5 = null;
      ci[] var6 = new ci[cb.values().length];

      for(int var7 = 8192 & -29696; var7 < (1966 & 26); ++var7) {
         try {
            String var8 = G(var7);
            Logger var21 = me;
            String var10001 = i.q[19455 & -21511 & -31746 & -30722];
            Object[] var10002 = new Object[18435 & -19543];
            var10002[16472 & 1542] = var8;
            var21.debug(String.format(var10001, var10002));
            var5 = q(var0, var3, var8);
            JsonObject var9 = new JsonObject();
            var9.addProperty(w.q[-26913 & 4827 & 15067 & -23553], Integer.valueOf(6493 & 17953));
            var9.addProperty(i.q[20475 & 3071 & 25599 & 14329], Long.toString(var1));
            var5.q(cd.lr, var9, (ca)null);
            cc var10 = var5.cb();
            JsonObject var11 = var10.bM();
            String var12 = cb.lm.name();
            if (var11.has(e.q[5885 & 23293 & 24701 & 25341])) {
               JsonObject var13 = var11.getAsJsonObject(e.q[-14851 & 5885 & -14723 & -11267]);
               if (var13.has(i.q[-2053 & 24575 & -21510 & -23558])) {
                  JsonObject var14 = var13.getAsJsonObject(i.q[7166 & 21499 & -8197 & 26619]);
                  if (var14.has(i.q[9211 & -23557 & -24581 & -11269])) {
                     var12 = var14.get(i.q[-23553 & 25599 & -4097 & -9221]).getAsString();
                  }
               }
            }

            var5.md = cb.a(var12);
            var21 = me;
            var10001 = i.q[13309 & 22525 & 29692 & 26620];
            var10002 = new Object[6418 & -31670];
            var10002[-15096 & 592] = var5.md.name();
            var10002[10531 & -11263] = var10.toString();
            var21.debug(String.format(var10001, var10002));
            if (var5.md == var4[-31376 & 10372] || cb.lm == var4[904 & 16405]) {
               var21 = me;
               var10001 = i.q[20477 & 6143 & 11261 & 2045];
               var10002 = new Object[-19949 & 16457];
               var10002[-30063 & 8224] = var5.md.name();
               var21.info(String.format(var10001, var10002));
               break;
            }

            var6[var5.md.ordinal()] = var5;
            var6[cb.lm.ordinal()] = var5;
            var5.md = null;
            var5 = null;
         } catch (Exception var16) {
            var5 = null;
         }
      }

      if (var5 == null) {
         for(int var17 = 257 & -3477; var17 < var4.length; ++var17) {
            cb var19 = var4[var17];
            Logger var24 = me;
            String var28 = i.q[8191 & 9215 & -11266 & -26625];
            Object[] var32 = new Object[8401 & 22051];
            var32[-19146 & 2049] = var19.name();
            var24.debug(String.format(var28, var32));
            if (var6[var19.ordinal()] != null) {
               var5 = var6[var19.ordinal()];
               var6[var19.ordinal()] = null;
               if (var19 == cb.lm) {
                  for(int var20 = 266 & -28160; var20 < var6.length; ++var20) {
                     if (var6[var20] == var5) {
                        var5.md = cb.values()[var20];
                        var6[var20] = null;
                     }
                  }
               } else {
                  var5.md = var19;
               }

               var24 = me;
               var28 = i.q[-15363 & -23555 & 27647 & 19455];
               var32 = new Object[23553 & 727];
               var32[1664 & 8260] = var5.md.name();
               var24.info(String.format(var28, var32));
               break;
            }
         }

         if (var5 == null) {
            throw new cn();
         }
      }

      for(int var18 = -15736 & 8453; var18 < var6.length; ++var18) {
         if (var18 != cb.lm.ordinal() && var6[var18] != null) {
            try {
               var6[var18].close();
            } catch (Exception var15) {
               me.debug(i.q[-30721 & 14335 & -23553 & -3073], var15);
            }
         }
      }

      var5.lX = cj.mh;
      return var5;
   }

   public abstract cc cb();

   private static String G(int var0) {
      if (System.getProperty(q.q[17106 & 24274 & 6655 & 2302]).contains(o.q[5195 & -24829 & 10883 & 28415])) {
         return o.q[23582 & 24919 & 2023 & 6028] + var0;
      } else {
         String var1 = null;
         String[] var2 = mb;
         int var3 = var2.length;

         for(int var4 = 17969 & -30714; var4 < var3; ++var4) {
            String var5 = var2[var4];
            var1 = System.getenv(var5);
            if (var1 != null) {
               break;
            }
         }

         if (var1 == null) {
            var1 = o.q[-29913 & 3855 & -9457 & 17557];
         }

         return var1 + o.q[16782 & 21143 & -31090 & 22542] + var0;
      }
   }

   static {
      String[] var10000 = new String[4636 & 4];
      var10000[-32382 & 5648] = o.q[39 & 8495 & -6041 & -20921];
      var10000[6177 & -7867] = o.q[-11653 & 24189 & -24149 & -6886];
      var10000[1242 & 4611] = o.q[8031 & 18959 & -24547 & -3797];
      var10000[5651 & -16317] = o.q[-16018 & -22998 & 9566 & 10079];
      mb = var10000;
   }

   public abstract void close();

   private static String cc() {
      return UUID.randomUUID().toString();
   }

   public cb bG() {
      return this.md;
   }

   public void q(bZ var1) {
      this.kS = var1;
   }

   public cj bF() {
      return this.lX;
   }

   private static ci q(bW var0, HashMap var1, String var2) {
      String var3 = System.getProperty(q.q[-7690 & -14 & 1746 & 8918]).toLowerCase();
      if (var3.contains(t.q[13175 & 25443 & 29551 & -15509])) {
         return new cl(var0, var1, var2);
      } else if (!var3.contains(t.q[25463 & 9191 & 887 & -18569]) && !var3.contains(t.q[9079 & 13159 & 10238 & 20453])) {
         throw new RuntimeException(o.q[-18766 & -31040 & 4457 & -25219] + var3);
      } else {
         try {
            return new ck(var0, var1, var2);
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }
      }
   }

   public void q(cd var1, JsonObject var2, ca var3) {
      try {
         String var4 = cc();
         var2.addProperty(e.q[-3587 & 2047 & 4862 & 22143], var4);
         cc var5 = new cc(var1, var2);
         if (var3 != null && !var3.isEmpty()) {
            this.lZ.put(var4, var3);
         }

         this.q(var5.bL());
         Logger var10000 = me;
         String var10001 = o.q[-14795 & 21135 & 28847 & 9643];
         Object[] var10002 = new Object[9 & 26373];
         var10002[24578 & 1540] = var5.toString();
         var10000.debug(String.format(var10001, var10002));
         if (this.kS != null) {
            this.kS.q(this.ma, var5);
         }
      } catch (IOException var6) {
         me.error(o.q[12011 & 1099 & -29817 & -31998]);
         this.lX = cj.mj;
      }

   }

   public abstract void q(byte[] var1);
}
