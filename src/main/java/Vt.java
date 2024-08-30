import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

public class vT {
   private uL afj;
   private float aIm;
   private String aIn;
   private Matrix4f aIi;
   private final List aIo = Lists.newArrayList();
   private vQ aIp;
   public final List aIq = Lists.newArrayList();
   private int aIr;
   private final Map aIs = Maps.newHashMap();
   private float aIt;
   private int aIu;

   public final String vf() {
      return this.aIn;
   }

   public void as(float var1) {
      if (var1 < this.aIt) {
         this.aIm += 1.0F - this.aIt;
         this.aIm += var1;
      } else {
         this.aIm += var1 - this.aIt;
      }

      for(this.aIt = var1; this.aIm > 20.0F; this.aIm -= 20.0F) {
         ;
      }

      for(vR var3 : this.aIq) {
         var3.aq(this.aIm / 20.0F);
      }

   }

   public void an(int var1, int var2) {
      this.aIu = this.aIp.aIb;
      this.aIr = this.aIp.aHZ;
      this.vh();

      for(vR var4 : this.aIq) {
         var4.q(this.aIi);
      }

      for(vQ var6 : this.aIo) {
         var6.am(var1, var2);
      }

   }

   private void q(tS var1, JsonElement var2) {
      JsonObject var3 = Pk.w(var2, p.q[1107 & -16129]);
      String var4 = Pk.a(var3, q.q[127 & 119]);
      String var5 = Pk.a(var3, p.q[-32676 & 1238]);
      String var6 = Pk.a(var3, p.q[19541 & -23843]);
      vQ var7 = this.aG(var5);
      vQ var8 = this.aG(var6);
      if (var7 == null) {
         throw new wa(p.q[2527 & 4182] + var5 + p.q[-4001 & 471]);
      } else if (var8 == null) {
         throw new wa(p.q[88 & 29180] + var6 + p.q[-29321 & 16607]);
      } else {
         vR var9 = this.q(var4, var7, var8);
         JsonArray var10 = Pk.q(var3, p.q[223 & -3751], (JsonArray)null);
         if (var10 != null) {
            int var11 = 0;

            for(JsonElement var13 : var10) {
               try {
                  JsonObject var14 = Pk.w(var13, p.q[9306 & 122]);
                  String var30 = Pk.a(var14, q.q[20607 & -32393]);
                  String var16 = Pk.a(var14, w.q[16445 & -24451]);
                  vQ var17 = this.aG(var16);
                  if (var17 == null) {
                     PJ var18 = new PJ(p.q[-5281 & 1243] + var16 + q.q[12 & 27788]);

                     try {
                        this.afj.w(var18);
                     } catch (FileNotFoundException var24) {
                        throw new wa(p.q[2140 & 8573] + var16 + p.q[11479 & 87]);
                     }

                     var1.o(var18);
                     tF var19 = var1.f(var18);
                     int var20 = Pk.p(var14, q.q[3454 & 16829]);
                     int var21 = Pk.p(var14, q.q[4989 & 317]);
                     boolean var22 = Pk.t(var14, p.q[22653 & -24099]);
                     if (var22) {
                        GL11.glTexParameteri(3553, 10241, 9729);
                        GL11.glTexParameteri(3553, 10240, 9729);
                     } else {
                        GL11.glTexParameteri(3553, 10241, 9728);
                        GL11.glTexParameteri(3553, 10240, 9728);
                     }

                     var9.q(var30, Integer.valueOf(var19.pv()), var20, var21);
                  } else {
                     var9.q(var30, var17, var17.aIb, var17.aHZ);
                  }
               } catch (Exception var25) {
                  wa var15 = wa.q(var25);
                  var15.aO(p.q[8798 & 20574] + var11 + q.q[-31748 & 11166]);
                  throw var15;
               }

               ++var11;
            }
         }

         JsonArray var26 = Pk.q(var3, r.q[20238 & 4751], (JsonArray)null);
         if (var26 != null) {
            int var27 = 0;

            for(JsonElement var29 : var26) {
               try {
                  this.e(var29);
               } catch (Exception var23) {
                  wa var31 = wa.q(var23);
                  var31.aO(r.q[6703 & 527] + var27 + q.q[5021 & 9116]);
                  throw var31;
               }

               ++var27;
            }
         }

      }
   }

   public void vg() {
      for(vQ var2 : this.aIs.values()) {
         var2.uY();
      }

      for(vR var4 : this.aIq) {
         var4.ve();
      }

      this.aIq.clear();
   }

   private void vh() {
      this.aIi = new Matrix4f();
      this.aIi.setIdentity();
      this.aIi.m00 = 2.0F / (float)this.aIp.aIb;
      this.aIi.m11 = 2.0F / (float)(-this.aIp.aHZ);
      this.aIi.m22 = -0.0020001999F;
      this.aIi.m33 = 1.0F;
      this.aIi.m03 = -1.0F;
      this.aIi.m13 = 1.0F;
      this.aIi.m23 = -1.0001999F;
   }

   public vT(tS var1, uL var2, vQ var3, PJ var4) {
      this.afj = var2;
      this.aIp = var3;
      this.aIm = 0.0F;
      this.aIt = 0.0F;
      this.aIu = var3.aHY;
      this.aIr = var3.aId;
      this.aIn = var4.toString();
      this.vh();
      this.q(var1, var4);
   }

   private vQ aG(String var1) {
      return var1 == null ? null : (var1.equals(p.q[-31632 & 4832]) ? this.aIp : (vQ)this.aIs.get(var1));
   }

   private void w(JsonElement var1) {
      if (Pk.u(var1)) {
         this.t(var1.getAsString(), this.aIu, this.aIr);
      } else {
         JsonObject var2 = Pk.w(var1, p.q[-13227 & 251]);
         String var3 = Pk.a(var2, q.q[119 & 12159]);
         int var4 = Pk.q(var2, q.q[1534 & -5316], this.aIu);
         int var5 = Pk.q(var2, q.q[2365 & -14531], this.aIr);
         if (this.aIs.containsKey(var3)) {
            throw new wa(var3 + p.q[5718 & -32421]);
         }

         this.t(var3, var4, var5);
      }

   }

   public void q(tS var1, PJ var2) {
      JsonParser var3 = new JsonParser();
      InputStream var4 = null;

      try {
         uK var5 = this.afj.w(var2);
         var4 = var5.getInputStream();
         JsonObject var22 = var3.parse(IOUtils.toString(var4, Charsets.UTF_8)).getAsJsonObject();
         if (Pk.i(var22, p.q[1869 & 12383])) {
            JsonArray var7 = var22.getAsJsonArray(p.q[10077 & -14227]);
            int var8 = 0;

            for(JsonElement var10 : var7) {
               try {
                  this.w(var10);
               } catch (Exception var19) {
                  wa var12 = wa.q(var19);
                  var12.aO(p.q[16510 & 7758] + var8 + q.q[6044 & 9180]);
                  throw var12;
               }

               ++var8;
            }
         }

         if (Pk.i(var22, p.q[8271 & 21455])) {
            JsonArray var23 = var22.getAsJsonArray(p.q[5231 & 351]);
            int var24 = 0;

            for(JsonElement var26 : var23) {
               try {
                  this.q(var1, var26);
               } catch (Exception var18) {
                  wa var27 = wa.q(var18);
                  var27.aO(p.q[1145 & -28592] + var24 + q.q[5021 & -7172]);
                  throw var27;
               }

               ++var24;
            }
         }
      } catch (Exception var20) {
         wa var6 = wa.q(var20);
         var6.aN(var2.XA());
         throw var6;
      } finally {
         IOUtils.closeQuietly(var4);
      }

   }

   private void e(JsonElement var1) {
      JsonObject var2 = Pk.w(var1, r.q[831 & -23913]);
      String var3 = Pk.a(var2, q.q[-32649 & 18807]);
      vY var4 = ((vR)this.aIq.get(this.aIq.size() - 1)).vc().aJ(var3);
      if (var4 == null) {
         throw new wa(p.q[1247 & -13729] + var3 + p.q[11895 & 471]);
      } else {
         float[] var5 = new float[4];
         int var6 = 0;

         for(JsonElement var8 : Pk.u(var2, e.q[602 & 15960])) {
            try {
               var5[var6] = Pk.q(var8, w.q[-3185 & 1951]);
            } catch (Exception var11) {
               wa var10 = wa.q(var11);
               var10.aO(r.q[9855 & 17179] + var6 + q.q[2972 & 17404]);
               throw var10;
            }

            ++var6;
         }

         switch(var6) {
         case 0:
         default:
            break;
         case 1:
            var4.ar(var5[0]);
            break;
         case 2:
            var4.s(var5[0], var5[1]);
            break;
         case 3:
            var4.f(var5[0], var5[1], var5[2]);
            break;
         case 4:
            var4.d(var5[0], var5[1], var5[2], var5[3]);
         }

      }
   }

   public void t(String var1, int var2, int var3) {
      vQ var4 = new vQ(var2, var3, true);
      var4.s(0.0F, 0.0F, 0.0F, 0.0F);
      this.aIs.put(var1, var4);
      if (var2 == this.aIu && var3 == this.aIr) {
         this.aIo.add(var4);
      }

   }

   public vR q(String var1, vQ var2, vQ var3) {
      vR var4 = new vR(this.afj, var1, var2, var3);
      this.aIq.add(this.aIq.size(), var4);
      return var4;
   }

   public vQ aH(String var1) {
      return (vQ)this.aIs.get(var1);
   }
}
