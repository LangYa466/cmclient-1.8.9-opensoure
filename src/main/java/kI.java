import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import io.netty.buffer.Unpooled;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class ki extends kf {
   private iU MJ;
   private HT MK;
   private final aeJ ML;
   private int MM = -1;
   private kj MN;
   private int MO = 1;
   private String MP = q.q[9284 & 2105];
   private iU MQ;
   private final DD MR;
   private kj MS;
   private static final PJ MT = new PJ(o.q[-7434 & 1718]);
   private M MU;
   private final int MV = 192;
   private int MW;
   private final int MX = 192;
   private boolean MY;
   private final boolean MZ;
   private int Na;
   private List Nb;
   private iU Nc;
   private final GX Nd;
   private boolean Ne;
   private iU Nf;

   public void o() {
      this.Mt.clear();
      Keyboard.enableRepeatEvents(true);
      if (this.MZ) {
         List var10000 = this.Mt;
         int var10005 = this.eo / 2 - 100;
         this.getClass();
         var10000.add(this.Nf = new iU(3, var10005, 4 + 192, 98, 20, uI.q(o.q[-14349 & 2737])));
         var10000 = this.Mt;
         var10005 = this.eo / 2 + 2;
         this.getClass();
         var10000.add(this.Nc = new iU(0, var10005, 4 + 192, 98, 20, uI.q(q.q[8309 & 885])));
         var10000 = this.Mt;
         var10005 = this.eo / 2 - 100;
         this.getClass();
         var10000.add(this.MQ = new iU(5, var10005, 4 + 192, 98, 20, uI.q(o.q[758 & 5051])));
         var10000 = this.Mt;
         var10005 = this.eo / 2 + 2;
         this.getClass();
         var10000.add(this.MJ = new iU(4, var10005, 4 + 192, 98, 20, uI.q(q.q[18475 & -32210])));
      } else {
         List var6 = this.Mt;
         int var11 = this.eo / 2 - 100;
         this.getClass();
         var6.add(this.Nc = new iU(0, var11, 4 + 192, 200, 20, uI.q(q.q[-12163 & 10103])));
      }

      int var7 = this.eo;
      this.getClass();
      int var1 = (var7 - 192) / 2;
      byte var2 = 2;
      this.Mt.add(this.MS = new kj(1, var1 + 120, var2 + 154, true));
      this.Mt.add(this.MN = new kj(2, var1 + 38, var2 + 154, false));
      this.jG();
      this.ML.pK();
      this.MU = (M)this.G.Bn.h(M.class);
   }

   private void e(char var1, int var2) {
      switch(var2) {
      case 14:
         if (!this.MP.isEmpty()) {
            this.MP = this.MP.substring(0, this.MP.length() - 1);
            this.jG();
         }

         return;
      case 28:
      case 156:
         if (!this.MP.isEmpty()) {
            this.D(true);
            this.G.r((kf)null);
         }

         return;
      default:
         if (this.MP.length() < 16 && Oh.y(var1)) {
            this.MP = this.MP + var1;
            this.jG();
            this.MY = true;
         }

      }
   }

   public void p() {
      super.p();
      ++this.MW;
   }

   protected void q(iU var1) {
      if (var1.aM) {
         if (var1.aq == 0) {
            this.G.r((kf)null);
            this.D(false);
         } else if (var1.aq == 3 && this.MZ) {
            this.Ne = true;
         } else if (var1.aq == 1) {
            if (this.Na < this.MO - 1) {
               ++this.Na;
            } else if (this.MZ) {
               this.jF();
               if (this.Na < this.MO - 1) {
                  ++this.Na;
               }
            }
         } else if (var1.aq == 2) {
            if (this.Na > 0) {
               --this.Na;
            }
         } else if (var1.aq == 5 && this.Ne) {
            this.D(true);
            this.G.r((kf)null);
         } else if (var1.aq == 4 && this.Ne) {
            this.Ne = false;
         }

         this.jG();
      }

   }

   public ki(DD var1, GX var2, boolean var3) {
      this.MR = var1;
      this.Nd = var2;
      this.MZ = var3;
      if (var2.HZ()) {
         HL var4 = var2.Ie();
         this.MK = var4.s(w.q[-31539 & 12493], 8);
         if (this.MK != null) {
            this.MK = (HT)this.MK.IA();
            this.MO = this.MK.II();
            if (this.MO < 1) {
               this.MO = 1;
            }
         }
      }

      if (this.MK == null && var3) {
         this.MK = new HT();
         this.MK.q(new HW(q.q[-31739 & 22576]));
         this.MO = 1;
      }

      this.ML = new aeJ();
   }

   private void jF() {
      if (this.MK != null && this.MK.II() < 50) {
         this.MK.q(new HW(q.q[1025 & -28142]));
         ++this.MO;
         this.MY = true;
      }

   }

   private void jG() {
      this.MS.hW = !this.Ne && (this.Na < this.MO - 1 || this.MZ);
      this.MN.hW = !this.Ne && this.Na > 0;
      this.Nc.hW = !this.MZ || !this.Ne;
      if (this.MZ) {
         this.Nf.hW = !this.Ne;
         this.MJ.hW = this.Ne;
         this.MQ.hW = this.Ne;
         this.MQ.aM = this.MP.trim().length() > 0;
      }

   }

   protected void q(int var1, int var2, int var3) {
      if (var3 == 0) {
         OX var4 = this.x(var1, var2);
         if (this.y(var4)) {
            return;
         }
      }

      super.q(var1, var2, var3);
   }

   protected void q(char var1, int var2) {
      super.q(var1, var2);
      if (this.MZ) {
         if (this.Ne) {
            this.e(var1, var2);
         } else {
            this.r(var1, var2);
         }
      }

   }

   private void V(String var1) {
      String var2 = this.jH();
      String var3 = var2 + var1;
      int var4 = this.CB.w(var3 + OJ.bPX + q.q[1839 & 751], 118);
      if (var4 <= 128 && var3.length() < 256) {
         this.W(var3);
      }

   }

   public OX x(int var1, int var2) {
      if (this.Nb == null) {
         return null;
      } else {
         int var10001 = this.eo;
         this.getClass();
         int var3 = var1 - (var10001 - 192) / 2 - 36;
         int var4 = var2 - 2 - 16 - 16;
         if (var3 >= 0 && var4 >= 0) {
            int var5 = Math.min(128 / this.CB.Gf, this.Nb.size());
            if (var3 <= 116 && var4 < this.G.CB.Gf * var5 + var5) {
               int var6 = var4 / this.G.CB.Gf;
               if (var6 >= 0 && var6 < this.Nb.size()) {
                  OX var7 = (OX)this.Nb.get(var6);
                  int var8 = 0;

                  for(OX var10 : var7) {
                     if (var10 instanceof Oo) {
                        var8 += this.G.CB.K(((Oo)var10).VA());
                        if (var8 > var3) {
                           return var10;
                        }
                     }
                  }
               }

               return null;
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   private String jH() {
      return this.MK != null && this.Na >= 0 && this.Na < this.MK.II() ? this.MK.fy(this.Na) : q.q[292 & 8704];
   }

   // $FF: synthetic method
   static PJ iI() {
      return MT;
   }

   private void r(char var1, int var2) {
      if (kf.aK(var2)) {
         this.V(kf.jC());
      } else {
         switch(var2) {
         case 14:
            String var3 = this.jH();
            if (var3.length() > 0) {
               this.W(var3.substring(0, var3.length() - 1));
            }

            return;
         case 28:
         case 156:
            this.V(q.q[1138 & -32194]);
            return;
         default:
            if (Oh.y(var1)) {
               this.V(Character.toString(var1));
            }
         }
      }

   }

   public void q(int var1, int var2, float var3) {
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.MU.cd.af()) {
         this.ML.kR(this.MU.cf.bk());
         double var4 = (double)this.eo / 2.0D - (double)(this.ML.r() * (float)this.eo / 2.0F);
         double var6 = (double)this.eC / 2.0D - (double)(this.ML.r() * (float)this.eC / 2.0F);
         pz.t(var4, var6, 0.0D);
         pz.u(this.ML.r() * (float)this.eo / (float)this.eo, this.ML.r() * (float)this.eC / (float)this.eC, 1.0F);
      }

      this.G.fJ().o(MT);
      int var10000 = this.eo;
      this.getClass();
      int var14 = (var10000 - 192) / 2;
      byte var5 = 2;
      this.getClass();
      this.getClass();
      this.e(var14, var5, 0, 0, 192, 192);
      if (this.Ne) {
         String var15 = this.MP;
         if (this.MZ) {
            if (this.MW / 6 % 2 == 0) {
               var15 = var15 + OJ.bPX + q.q[831 & -32209];
            } else {
               var15 = var15 + OJ.bQe + q.q[4719 & -30145];
            }
         }

         String var7 = uI.q(o.q[1023 & 21171]);
         int var8 = this.CB.K(var7);
         this.CB.q(var7, var14 + 36 + (116 - var8) / 2, var5 + 16 + 16, 0);
         int var9 = this.CB.K(var15);
         this.CB.q(var15, var14 + 36 + (116 - var9) / 2, var5 + 48, 0);
         String var10 = uI.q(w.q[13514 & 202], this.MR.bY());
         int var11 = this.CB.K(var10);
         this.CB.q(OJ.bQf + var10, var14 + 36 + (116 - var11) / 2, var5 + 48 + 10, 0);
         String var12 = uI.q(o.q[-27972 & 18357]);
         this.CB.q(var12, var14 + 36, var5 + 80, 116, 0);
      } else {
         String var16 = uI.q(e.q[25319 & 4863], this.Na + 1, this.MO);
         String var17 = q.q[572 & 16512];
         if (this.MK != null && this.Na >= 0 && this.Na < this.MK.II()) {
            var17 = this.MK.fy(this.Na);
         }

         if (this.MZ) {
            if (this.CB.hR()) {
               var17 = var17 + q.q[8751 & 623];
            } else if (this.MW / 6 % 2 == 0) {
               var17 = var17 + OJ.bPX + q.q[14911 & 879];
            } else {
               var17 = var17 + OJ.bQe + q.q[559 & 17087];
            }
         } else if (this.MM != this.Na) {
            if (Gb.k(this.Nd.Ie())) {
               try {
                  OX var18 = OY.di(var17);
                  this.Nb = var18 != null ? kA.q(var18, 116, this.CB, true, true) : null;
               } catch (JsonParseException var13) {
                  this.Nb = null;
               }
            } else {
               Oo var19 = new Oo(OJ.bQb + o.q[9909 & 17077]);
               this.Nb = Lists.newArrayList(var19);
            }

            this.MM = this.Na;
         }

         int var20 = this.CB.K(var16);
         iS var25 = this.CB;
         int var10002 = var14 - var20;
         this.getClass();
         var25.q(var16, var10002 + 192 - 44, var5 + 16, 0);
         if (this.Nb == null) {
            this.CB.q(var17, var14 + 36, var5 + 16 + 16, 116, 0);
         } else {
            int var21 = Math.min(128 / this.CB.Gf, this.Nb.size());

            for(int var22 = 0; var22 < var21; ++var22) {
               OX var24 = (OX)this.Nb.get(var22);
               this.CB.q(var24.Vv(), var14 + 36, var5 + 16 + 16 + var22 * this.CB.Gf, 0);
            }

            OX var23 = this.x(var1, var2);
            if (var23 != null) {
               this.q(var23, var1, var2);
            }
         }
      }

      super.q(var1, var2, var3);
   }

   protected boolean y(OX var1) {
      DW var2 = var1 == null ? null : var1.Vw().VI();
      if (var2 == null) {
         return false;
      } else if (var2.GQ() == DX.bgA) {
         String var6 = var2.wx();

         try {
            int var4 = Integer.parseInt(var6) - 1;
            if (var4 >= 0 && var4 < this.MO && var4 != this.Na) {
               this.Na = var4;
               this.jG();
               return true;
            }
         } catch (Throwable var5) {
            ;
         }

         return false;
      } else {
         boolean var3 = super.y(var1);
         if (var3 && var2.GQ() == DX.bgy) {
            this.G.r((kf)null);
         }

         return var3;
      }
   }

   private void D(boolean var1) {
      if (this.MZ && this.MY && this.MK != null) {
         while(this.MK.II() > 1) {
            String var2 = this.MK.fy(this.MK.II() - 1);
            if (var2.length() != 0) {
               break;
            }

            this.MK.ft(this.MK.II() - 1);
         }

         if (this.Nd.HZ()) {
            HL var6 = this.Nd.Ie();
            var6.w(w.q[10493 & -11825], this.MK);
         } else {
            this.Nd.q(w.q[9437 & 20719], this.MK);
         }

         String var7 = y.q[10418 & -11982];
         if (var1) {
            var7 = y.q[12341 & 311];
            this.Nd.q(w.q[5322 & 204], new HW(this.MR.bY()));
            this.Nd.q(w.q[20679 & 231], new HW(this.MP.trim()));

            for(int var3 = 0; var3 < this.MK.II(); ++var3) {
               String var4 = this.MK.fy(var3);
               Oo var5 = new Oo(var4);
               var4 = OY.j(var5);
               this.MK.q(var3, new HW(var4));
            }

            this.Nd.d(Et.bop);
         }

         IG var8 = new IG(Unpooled.buffer());
         var8.ao(this.Nd);
         this.G.fy().q(new JE(var7, var8));
      }

   }

   private void W(String var1) {
      if (this.MK != null && this.Na >= 0 && this.Na < this.MK.II()) {
         this.MK.q(this.Na, new HW(var1));
         this.MY = true;
      }

   }

   public void aL() {
      Keyboard.enableRepeatEvents(false);
   }
}
