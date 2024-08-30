import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.lwjgl.opengl.GL11;

public class agN {
   private int dvv;
   private final String dvw;
   private final float dvx;
   private static final int[] dvy;
   private static final Pattern dvz = Pattern.compile(u.q[2003 & 2039 & 13269 & 5119]);
   private float dvA;
   private final hS dvB;
   private acC dfr;
   private final Map dvC;
   public static final int dvD = 9;

   public int q(String var1, int var2, int var3, int var4) {
      return this.w(var1, (float)var2, (float)var3, var4, (boolean)(72 & 15876));
   }

   public String q(String var1, int var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();
      int var5 = 1863 & 10248;
      int var6 = var3 ? var1.length() - (8195 & 4417) : 553 & 16;
      int var7 = var3 ? -1 & -1 : -29949 & 9329;
      int var8 = -28544 & 16937;
      int var9 = 347 & 10784;

      for(int var10 = var6; var10 >= 0 && var10 < var1.length() && var5 < var2; var10 += var7) {
         char var11 = var1.charAt(var10);
         float var12 = this.o(var11);
         if (var8 != 0) {
            var8 = 1104 & 16392;
            if (var11 != (-28564 & 1660) && var11 != (334 & 77)) {
               if (var11 == (-16270 & 5746) || var11 == (8406 & -15782)) {
                  var9 = 33 & 6228;
               }
            } else {
               var9 = -31421 & 25265;
            }
         } else if (var12 < 0.0F) {
            var8 = 8193 & 5155;
         } else {
            var5 += (int)var12;
            if (var9 != 0) {
               ++var5;
            }
         }

         if (var5 > var2) {
            break;
         }

         if (var3) {
            var4.insert(4496 & -31672, var11);
         } else {
            var4.append(var11);
         }
      }

      return var4.toString();
   }

   public void w(String var1, float var2, float var3, int var4) {
      this.e(var1, var2 - (float)((int)this.id(var1) >> (23041 & 8401)), var3, var4);
   }

   public String e(String var1, int var2) {
      return this.q(var1, var2, (boolean)(-27136 & 8));
   }

   public float id(String var1) {
      if (this.dvC.size() > (23528 & 1001)) {
         this.dvC.clear();
      }

      return ((Float)this.dvC.computeIfAbsent(var1, (var2) -> {
         return (float)this.dfr.hl(var1) / this.dvA;
      })).floatValue();
   }

   public void q(String var1, int var2, int var3, int var4, double var5) {
      GL11.glPushMatrix();
      GL11.glTranslated((double)var2, (double)var3, 0.0D);
      GL11.glScaled(var5, var5, var5);
      this.q(var1, 354 & 513, -31203 & 2306, var4);
      GL11.glPopMatrix();
   }

   public float o(char var1) {
      return (float)this.dfr.hl(String.valueOf(var1));
   }

   public int e(String var1, float var2, float var3, int var4) {
      return this.w(var1, var2, var3, var4, (boolean)(26640 & 2));
   }

   public int w(String var1, float var2, float var3, int var4, boolean var5) {
      if (var1 == null) {
         return 0 & 12928;
      } else {
         kJ var6 = this.dvB.Bn == null ? new kJ(this.dvB) : this.dvB.Bn.atA();
         if (var6.kq() != this.dvv) {
            this.dvv = var6.kq();

            try {
               (this.dfr = new acC(this.ie(this.dvw).deriveFont(this.dvx * (float)this.dvv / 2.0F))).aqj();
               this.dfr.aqt().add(new acL(Color.WHITE));
               this.dfr.aql();
            } catch (IOException | acA | FontFormatException var29) {
               var29.printStackTrace();
            }
         }

         if (var5) {
            var4 = (var4 & 150797566 & -2063663364) >> (16443 & 2050) | var4 & -16767721 & -16349056;
         }

         this.dvA = (float)var6.kq();
         GL11.glPushMatrix();
         pz.u(1.0F / this.dvA, 1.0F / this.dvA, 1.0F / this.dvA);
         var2 = var2 * this.dvA;
         var3 = var3 * this.dvA;
         float var7 = var2;
         float var8 = (float)(var4 >> (210 & 18964) & -27393 & 255) / (1020.0F * 0.25F);
         float var9 = (float)(var4 >> (138 & 18440) & 16639 & 4351) / (0.18181819F * 1402.5F);
         float var10 = (float)(var4 & 16895 & -32001) / (70.833336F * 3.6F);
         float var11 = (float)(var4 >> (8282 & 57) & -23809 & 1279) / (8.666667F * 29.423077F);
         pz.u(var8, var9, var10, var11);
         int var12 = var4;
         char[] var13 = var1.toCharArray();
         pz.nx();
         pz.nX();
         pz.s(14098 & 17378, 12051 & 867, 2145 & 8595, 8704 & -27456);
         pz.P(902 & 11027, 859 & 803);
         String[] var14 = dvz.split(var1);
         int var15 = -32252 & 2176;
         String[] var16 = var14;
         int var17 = var14.length;

         for(int var18 = 56 & 18432; var18 < var17; ++var18) {
            String var19 = var16[var18];
            String[] var20 = var19.split(q.q[20542 & 18550 & -12806 & -26702]);
            int var21 = var20.length;

            for(int var22 = 6948 & 1162; var22 < var21; ++var22) {
               String var23 = var20[var22];
               String[] var24 = var23.split(u.q[-10257 & 19439 & -30769 & -18465]);
               String[] var25 = var24;
               int var26 = var24.length;

               for(int var27 = 4608 & 24903; var27 < var26; ++var27) {
                  String var28 = var25[var27];
                  this.dfr.q(var2, var3, var28, new act(var12));
                  var2 += (float)this.dfr.hl(var28);
                  var15 += var28.length();
                  if (var15 < var13.length && var13[var15] == (941 & 8269)) {
                     var2 = var7;
                     ++var15;
                  }
               }

               if (var15 < var13.length && var13[var15] == (-24402 & 2058)) {
                  var2 = var7;
                  var3 += this.ig(var23) * 2.0F;
                  ++var15;
               }
            }

            if (var15 < var13.length) {
               char var33 = var13[var15];
               if (var33 == (25519 & -28441)) {
                  char var34 = var13[var15 + (19497 & -32191)];
                  int var32 = q.q[28628 & -20866 & -1290 & -27946].indexOf(var34);
                  if (var32 < 0) {
                     if (var34 == (246 & 9330)) {
                        var12 = var4;
                     }
                  } else {
                     var12 = dvy[var32];
                  }

                  var15 += 2;
               }
            }
         }

         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         pz.bW(-26744 & 16450);
         pz.nF();
         return (int)var2;
      }
   }

   public void r(String var1, float var2, float var3, int var4) {
      this.w(PQ.ds(var1), var2 + 0.16666667F * 3.0F, var3 + 0.65384614F * 0.7647059F, var4);
      this.w(var1, var2, var3, var4);
   }

   public int w(String var1, int var2, int var3, int var4, boolean var5) {
      return this.w(var1, (float)var2, (float)var3, var4, var5);
   }

   public int q(String var1, float var2, float var3, int var4) {
      int var5 = this.w(var1, var2 + 1.0F, var3 + 1.0F, var4, (boolean)(5123 & -15919));
      return Math.max(var5, this.w(var1, var2, var3, var4, (boolean)(25 & 22818)));
   }

   private Font ie(String var1) {
      return this.if1(var1);
   }

   static {
      int[] var10000 = new int[25235 & 304];
      var10000[16416 & 15709] = 10304 & 949;
      var10000[1041 & -10033] = 6318 & 9130;
      var10000[18002 & -32605] = 15268505 & -1174032640;
      var10000[16551 & -24237] = 19250922 & 302049963;
      var10000[17422 & 8421] = 1105858568 & -2002025390;
      var10000[28725 & -30705] = 11235770 & 1860863146;
      var10000[8942 & -30714] = 318746593 & 1241496080;
      var10000[3207 & -32761] = -2068907270 & 1790618542;
      var10000[42 & 6425] = 1818056671 & 326620501;
      var10000[4185 & 26893] = -1940032001 & 586669567;
      var10000[16410 & 3627] = -992608425 & 175505237;
      var10000[12443 & -29329] = 1266548735 & -1604845569;
      var10000[398 & -31635] = -1862314155 & 603938293;
      var10000[9263 & 22685] = -520129025 & 503272959;
      var10000[9758 & 270] = 503316351 & 16777045;
      var10000[18959 & -20337] = -1644167169 & 553648127;
      dvy = var10000;
   }

   private Font if1(String var1) {
      return Font.createFont(-27646 & 8600, this.getClass().getResourceAsStream(var1));
   }

   public void q(ArrayList var1, int var2, int var3, int var4) {
      this.q(String.join(u.q[-10252 & 21462 & -22561 & -16432], var1), var2, var3, var4);
   }

   public List H(String var1, int var2) {
      ArrayList var3 = new ArrayList();
      String[] var4 = var1.split(q.q[-30389 & -31894 & -9873 & 23390]);
      StringBuilder var5 = new StringBuilder();
      String[] var6 = var4;
      int var7 = var4.length;

      for(int var8 = -28288 & 8254; var8 < var7; ++var8) {
         String var9 = var6[var8];
         String var10 = var5 + q.q[2394 & 8686 & 9054 & 3550] + var9;
         if (this.id(var10) >= (float)var2) {
            var3.add(var5.toString());
            var5 = new StringBuilder();
         }

         var5.append(var9).append(q.q[-22149 & -31910 & 1871 & -4261]);
      }

      var3.add(var5.toString());
      return var3;
   }

   public agN(hS var1, String var2, float var3) {
      this.dvB = var1;
      this.dvC = new WeakHashMap();
      kJ var4 = new kJ(this.dvB);
      this.dvv = var4.kq();
      this.dvw = var2;
      this.dvx = var3;

      try {
         this.dvv = var4.kq();
         (this.dfr = new acC(this.ie(var2).deriveFont(var3 * (float)this.dvv / 2.0F))).aqj();
         this.dfr.aqt().add(new acL(Color.WHITE));
         this.dfr.aql();
      } catch (IOException | acA | FontFormatException var6) {
         var6.printStackTrace();
      }

      this.dvA = (float)var4.kq();
   }

   public acC avF() {
      return this.dfr;
   }

   public float ig(String var1) {
      return (float)this.dfr.hk(var1) / 2.0F;
   }
}
