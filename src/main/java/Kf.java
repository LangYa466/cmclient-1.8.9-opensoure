import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public abstract class kf extends iT implements kE {
   protected List Mq = Lists.newArrayList();
   private static final Logger Mr = LogManager.getLogger();
   private int Ms;
   public int eC;
   protected List Mt = Lists.newArrayList();
   private static final Splitter Mu = Splitter.on('\n');
   private int Mv;
   protected iS CB;
   private URI Mw;
   private static final Set Mx = Sets.newHashSet(new String[]{w.q[9174 & 21486], o.q[13307 & -31799]});
   private iU My;
   public int eo;
   private long Mz;
   public boolean MA;
   protected sj MB;
   public hS G;

   public static boolean jy() {
      return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
   }

   public void p() {
   }

   public void jz() {
      if (this.G.Bn.atD().L.Y().J()) {
         char var1 = Keyboard.getEventCharacter();
         int var2 = Keyboard.getEventKey();
         if (Keyboard.getEventKeyState() || var2 == 0 && Character.isDefined(var1)) {
            this.q(var1, var2);
         }
      } else if (Keyboard.getEventKeyState()) {
         this.q(Keyboard.getEventCharacter(), Keyboard.getEventKey());
      }

      this.G.fd();
   }

   public void jA() {
      this.aL(0);
   }

   protected void w(String var1, boolean var2) {
   }

   public static boolean jB() {
      return hS.Ch ? Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220) : Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
   }

   public void q(boolean var1, int var2) {
      if (var2 == 31102009) {
         if (var1) {
            this.q(this.Mw);
         }

         this.Mw = null;
         this.G.r(this);
      }

   }

   protected void w(int var1, int var2, int var3) {
      if (this.My != null && var3 == 0) {
         this.My.f(var1, var2);
         this.My = null;
      }

   }

   public static String jC() {
      try {
         Transferable var0 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object)null);
         if (var0 != null && var0.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return (String)var0.getTransferData(DataFlavor.stringFlavor);
         }
      } catch (Exception var1) {
         ;
      }

      return q.q[1120 & 10268];
   }

   public void b(int var1) {
      if (this.G.Bn.atS().bo.af()) {
         pz.nx();
         pz.og();
         this.G.fJ().o(x.M);
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         q(0, 0, 0.0F, 0.0F, 3840, 2160, this.eo, this.eC, 3840.0F, 2160.0F);
      } else {
         pz.nx();
         pz.og();
         qk var2 = qk.pm();
         qq var3 = var2.pl();
         this.G.fJ().o(Gp);
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         var3.q(7, us.axL);
         var3.i(0.0D, (double)this.eC, 0.0D).e(0.0D, (double)((float)this.eC / 32.0F)).v(64, 64, 64, 255).pJ();
         var3.i((double)this.eo, (double)this.eC, 0.0D).e((double)((float)this.eo / 32.0F), (double)((float)this.eC / 32.0F)).v(64, 64, 64, 255).pJ();
         var3.i((double)this.eo, 0.0D, 0.0D).e((double)((float)this.eo / 32.0F), 0.0D).v(64, 64, 64, 255).pJ();
         var3.i(0.0D, 0.0D, 0.0D).e(0.0D, 0.0D).v(64, 64, 64, 255).pJ();
         var2.pn();
      }

   }

   public static boolean aK(int var0) {
      return var0 == 47 && jB() && !jy() && !jD();
   }

   protected void q(List var1, int var2, int var3) {
      if (!var1.isEmpty()) {
         pz.nS();
         qh.pj();
         pz.nx();
         pz.nW();
         int var4 = 0;

         for(String var6 : var1) {
            int var7 = this.CB.K(var6);
            if (var7 > var4) {
               var4 = var7;
            }
         }

         int var13 = var2 + 12;
         int var14 = var3 - 12;
         int var15 = 8;
         if (var1.size() > 1) {
            var15 += 2 + (var1.size() - 1) * 10;
         }

         if (var13 + var4 > this.eo) {
            var13 -= 28 + var4;
         }

         if (var14 + var15 + 6 > this.eC) {
            var14 = this.eC - var15 - 6;
         }

         this.Gr = 300.0F;
         this.MB.Gr = 300.0F;
         int var8 = -267386864;
         this.r(var13 - 3, var14 - 4, var13 + var4 + 3, var14 - 3, var8, var8);
         this.r(var13 - 3, var14 + var15 + 3, var13 + var4 + 3, var14 + var15 + 4, var8, var8);
         this.r(var13 - 3, var14 - 3, var13 + var4 + 3, var14 + var15 + 3, var8, var8);
         this.r(var13 - 4, var14 - 3, var13 - 3, var14 + var15 + 3, var8, var8);
         this.r(var13 + var4 + 3, var14 - 3, var13 + var4 + 4, var14 + var15 + 3, var8, var8);
         int var9 = 1347420415;
         int var10 = (var9 & 16711422) >> 1 | var9 & -16777216;
         this.r(var13 - 3, var14 - 3 + 1, var13 - 3 + 1, var14 + var15 + 3 - 1, var9, var10);
         this.r(var13 + var4 + 2, var14 - 3 + 1, var13 + var4 + 3, var14 + var15 + 3 - 1, var9, var10);
         this.r(var13 - 3, var14 - 3, var13 + var4 + 3, var14 - 3 + 1, var9, var9);
         this.r(var13 - 3, var14 + var15 + 2, var13 + var4 + 3, var14 + var15 + 3, var10, var10);

         for(int var11 = 0; var11 < var1.size(); ++var11) {
            String var12 = (String)var1.get(var11);
            this.CB.q(var12, (float)var13, (float)var14, -1);
            if (var11 == 0) {
               var14 += 2;
            }

            var14 += 10;
         }

         this.Gr = 0.0F;
         this.MB.Gr = 0.0F;
         pz.oe();
         pz.ob();
         qh.pi();
         pz.od();
      }

   }

   protected void e(String var1, int var2, int var3) {
      this.q(Arrays.asList(var1), var2, var3);
   }

   protected void q(OX var1, int var2, int var3) {
      if (var1 != null && var1.Vw().VG() != null) {
         DY var4 = var1.Vw().VG();
         if (var4.GT() == DZ.bgJ) {
            GX var5 = null;

            try {
               HL var6 = Hz.bE(var4.GU().Vv());
               if (var6 instanceof HL) {
                  var5 = GX.x(var6);
               }
            } catch (HG var11) {
               ;
            }

            if (var5 != null) {
               this.q(var5, var2, var3);
            } else {
               this.e(OJ.bQj + o.q[4041 & -15376], var2, var3);
            }
         } else if (var4.GT() == DZ.bgK) {
            if (this.G.Br.aCO) {
               try {
                  HL var12 = Hz.bE(var4.GU().Vv());
                  if (var12 instanceof HL) {
                     ArrayList var14 = Lists.newArrayList();
                     HL var7 = var12;
                     var14.add(var7.bG(q.q[119 & -24449]));
                     if (var7.d(q.q[8696 & -31240], 8)) {
                        String var8 = var7.bG(q.q[-26119 & 8696]);
                        var14.add(o.q[334 & 20814] + var8 + w.q[29501 & 2038] + zv.bi(var8) + w.q[20575 & 2333]);
                     }

                     var14.add(var7.bG(w.q[61 & 19069]));
                     this.q(var14, var2, var3);
                  } else {
                     this.e(OJ.bQj + o.q[-31801 & 17345], var2, var3);
                  }
               } catch (HG var10) {
                  this.e(OJ.bQj + o.q[22469 & -23599], var2, var3);
               }
            }
         } else if (var4.GT() == DZ.bgH) {
            this.q(Mu.splitToList(var4.GU().Vy()), var2, var3);
         } else if (var4.GT() == DZ.bgI) {
            Nb var13 = Nj.cT(var4.GU().Vv());
            if (var13 != null) {
               OX var15 = var13.Ts();
               Op var16 = new Op(o.q[25539 & 5098] + (var13.Tr() ? o.q[510 & 3006] : o.q[-23605 & 21475]), new Object[0]);
               var16.Vw().t(Boolean.valueOf(true));
               String var17 = var13 instanceof MW ? ((MW)var13).bp() : null;
               ArrayList var9 = Lists.newArrayList(new String[]{var15.Vy(), var16.Vy()});
               if (var17 != null) {
                  var9.addAll(this.CB.r(var17, 150));
               }

               this.q(var9, var2, var3);
            } else {
               this.e(OJ.bQj + o.q[-26684 & 9180], var2, var3);
            }
         }

         pz.nx();
      }

   }

   public void aJ() {
      int var1 = Mouse.getEventX() * this.eo / this.G.Cr;
      int var2 = this.eC - Mouse.getEventY() * this.eC / this.G.BB - 1;
      int var3 = Mouse.getEventButton();
      if (Mouse.getEventButtonState()) {
         if (this.G.Br.aEb && this.Mv++ > 0) {
            return;
         }

         this.Ms = var3;
         this.Mz = hS.fe();
         this.q(var1, var2, this.Ms);
      } else if (var3 != -1) {
         if (this.G.Br.aEb && --this.Mv > 0) {
            return;
         }

         this.Ms = -1;
         this.w(var1, var2, var3);
      } else if (this.Ms != -1 && this.Mz > 0L) {
         long var4 = hS.fe() - this.Mz;
         this.q(var1, var2, this.Ms, var4);
      }

   }

   public void u(hS var1, int var2, int var3) {
      this.i(var1, var2, var3);
   }

   public void i(hS var1, int var2, int var3) {
      this.G = var1;
      this.MB = var1.gi();
      this.CB = var1.CB;
      this.eo = var2;
      this.eC = var3;
      this.Mt.clear();
      this.o();
      this.G.Bn.atM().q(new agB(new kJ(this.G)));
   }

   protected boolean y(OX var1) {
      if (var1 == null) {
         return false;
      } else {
         DW var2 = var1.Vw().VI();
         if (jy()) {
            if (var1.Vw().VM() != null) {
               this.w(var1.Vw().VM(), false);
            }
         } else if (var2 != null) {
            if (var2.GQ() == DX.bgw) {
               if (!this.G.Br.aFa) {
                  return false;
               }

               try {
                  URI var3 = new URI(var2.wx());
                  String var4 = var3.getScheme();
                  if (var4 == null) {
                     throw new URISyntaxException(var2.wx(), o.q[1989 & -29713]);
                  }

                  if (!Mx.contains(var4.toLowerCase())) {
                     throw new URISyntaxException(var2.wx(), o.q[25543 & -27706] + var4.toLowerCase());
                  }

                  if (this.G.Br.aDH) {
                     this.Mw = var3;
                     this.G.r(new iY(this, var2.wx(), 31102009, false));
                  } else {
                     this.q(var3);
                  }
               } catch (URISyntaxException var5) {
                  Mr.error(o.q[5063 & 3047] + var2, var5);
               }
            } else if (var2.GQ() == DX.bgx) {
               URI var6 = (new File(var2.wx())).toURI();
               this.q(var6);
            } else if (var2.GQ() == DX.bgz) {
               this.w(var2.wx(), true);
            } else if (var2.GQ() == DX.bgy) {
               this.r(var2.wx(), false);
            } else {
               Mr.error(r.q[7927 & -31757] + var2);
            }

            return true;
         }

         return false;
      }
   }

   public static void U(String var0) {
      if (!StringUtils.isEmpty(var0)) {
         try {
            StringSelection var1 = new StringSelection(var0);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var1, (ClipboardOwner)null);
         } catch (Exception var2) {
            ;
         }
      }

   }

   public void q(int var1, int var2, float var3) {
      for(int var4 = 0; var4 < this.Mt.size(); ++var4) {
         ((iU)this.Mt.get(var4)).r(this.G, var1, var2);
      }

      for(int var5 = 0; var5 < this.Mq.size(); ++var5) {
         ((jx)this.Mq.get(var5)).y(this.G, var1, var2);
      }

   }

   public void r(String var1, boolean var2) {
      if (var2) {
         this.G.BZ.iA().T(var1);
      }

      this.G.CM.G(var1);
   }

   protected void q(GX var1, int var2, int var3) {
      List var4 = var1.r(this.G.CM, this.G.Br.aCO);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         if (var5 == 0) {
            var4.set(var5, var1.Ij().bqM + (String)var4.get(var5));
         } else {
            var4.set(var5, OJ.bQe + (String)var4.get(var5));
         }
      }

      this.q(var4, var2, var3);
   }

   public boolean s() {
      return true;
   }

   public void aL(int var1) {
      if (this.G.Cg != null) {
         if (!this.G.Bn.atS().bg.af()) {
            this.r(0, 0, this.eo, this.eC, -1072689136, -804253680);
         }
      } else {
         this.b(var1);
      }

   }

   protected void q(int var1, int var2, int var3) {
      if (var3 == 0) {
         for(int var4 = 0; var4 < this.Mt.size(); ++var4) {
            iU var5 = (iU)this.Mt.get(var4);
            if (var5.w(this.G, var1, var2)) {
               this.My = var5;
               var5.w(this.G.fs());
               this.q(var5);
            }
         }
      }

   }

   public static boolean aM(int var0) {
      return var0 == 46 && jB() && !jy() && !jD();
   }

   protected void q(int var1, int var2, int var3, long var4) {
   }

   private void q(URI var1) {
      try {
         Class var2 = Class.forName(t.q[17238 & 12118]);
         Object var3 = var2.getMethod(t.q[991 & -7305]).invoke((Object)null);
         var2.getMethod(t.q[-31876 & 14171], URI.class).invoke(var3, var1);
      } catch (Throwable var4) {
         Mr.error(o.q[-30771 & 9160], var4);
      }

   }

   public static boolean aN(int var0) {
      return var0 == 30 && jB() && !jy() && !jD();
   }

   public static boolean aO(int var0) {
      return var0 == 45 && jB() && !jy() && !jD();
   }

   protected void q(char var1, int var2) {
      if (var2 == 1) {
         this.G.r((kf)null);
         if (this.G.Cx == null) {
            this.G.fC();
         }
      }

   }

   public static boolean jD() {
      return Keyboard.isKeyDown(56) || Keyboard.isKeyDown(184);
   }

   public void aL() {
   }

   public void o() {
   }

   protected void q(iU var1) {
   }

   public void jE() {
      if (Mouse.isCreated()) {
         while(Mouse.next()) {
            this.aJ();
         }
      }

      if (Keyboard.isCreated()) {
         while(Keyboard.next()) {
            this.jz();
         }
      }

   }

   public void G(String var1) {
      this.r(var1, true);
   }
}
