import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class hS implements Pe {
   public boolean Bi;
   private vD Bj;
   public zk Bk;
   private xW Bl;
   public boolean Bm = true;
   public final aew Bn = new aew(this);
   private final String Bo;
   public final OU Bp = new OU();
   private final String Bq;
   public vL Br;
   private final boolean Bs;
   public pp Bt;
   private final List Bu = Lists.newArrayList();
   private final uB Bv;
   private sj dP;
   public String Bw = q.q[17527 & 256];
   long Bx = -1L;
   private int By;
   private vb Bz;
   private static int BA;
   public int BB;
   private boolean BC;
   private uP BD;
   private final File BE;
   private boolean BF;
   private pY BG;
   private static hS BH;
   private uJ BI;
   public int BJ;
   private boolean BK;
   long BL = System.nanoTime();
   private mL BM;
   private final int BN;
   public final PS BO = new PS(20.0F);
   long BP = fe();
   public hR BQ;
   private iy BR;
   private final File BS;
   public Py BT;
   private ir BU;
   private static final Logger BV = LogManager.getLogger();
   private Mi BW;
   private Ip BX;
   private uT BY;
   public jr BZ;
   public tU Ca;
   int Cb;
   public np Cc;
   public boolean Cd;
   volatile boolean Ce = true;
   private final PropertyMap Cf;
   public mP Cg;
   public static final boolean Ch = PV.XS() == PW.bUS;
   public final File Ci;
   private String Cj = q.q[16831 & 351];
   long Bh = fe();
   private boolean Ck;
   private long Cl = -1L;
   private int Cm;
   private zk Cn;
   private final Queue Co = Queues.newArrayDeque();
   private final boolean Cp = true;
   private int Cq;
   public int Cr;
   public PB Cs;
   private Wp Ct;
   public mJ Cu;
   public qd Cv;
   public iS Cw;
   public kf Cx;
   private vQ Cy;
   public String eP;
   private final MinecraftSessionService Cz;
   private final PM CA;
   public iS CB;
   private final Proxy CC;
   private final int CD;
   private final Thread CE = Thread.currentThread();
   public final LN CF = new LN();
   private sx CG;
   public kQ CH;
   private final vp CI = new vp();
   private pl CJ;
   private static final List CK = Lists.newArrayList(new DisplayMode[]{new DisplayMode(2560, 1600), new DisplayMode(2880, 1800)});
   private tS CL;
   public iQ CM;

   public static hS eV() {
      return BH;
   }

   public void eW() {
      this.Ce = false;
   }

   public sx eX() {
      return this.CG;
   }

   private String eY() {
      return this.BW != null ? (this.BW.Qh() ? p.q[26395 & 351] : y.q[-32130 & 9941]) : (this.BM != null ? (this.BM.lI() ? p.q[4413 & 24860] : y.q[21109 & 2647]) : p.q[1885 & 4381]);
   }

   public boolean eZ() {
      return this.BF;
   }

   public void q(xW var1) {
      this.BC = true;
      this.Bl = var1;
   }

   private void fa() {
      this.Br = new vL(this, this.Ci);
      this.Bu.add(this.Bv);
      if (this.Br.aEK > 0 && this.Br.aDx > 0) {
         this.Cr = this.Br.aDx;
         this.BB = this.Br.aEK;
      }

      BV.info(p.q[25309 & -31271] + Sys.getVersion());
      this.fT();
      this.gd();
      this.gc();
      qa.oA();
      this.Cy = new vQ(this.Cr, this.BB, true);
      this.Cy.s(0.0F, 0.0F, 0.0F, 0.0F);
      this.fr();
      this.BY = new uT(this.BE, new File(this.Ci, p.q[766 & -28454]), this.Bv, this.CI, this.Br);
      this.BI = new uY(this.CI);
      this.BD = new uP(this.CI, this.Br.aDL);
      this.BI.q(this.BD);
      this.gl();
      this.CL = new tS(this.BI);
      this.BI.q(this.CL);
      l var1 = new l(this, 14);
      var1.q(p.q[4571 & 1247]);
      this.Bz = new vb(this.CL, new File(this.BS, p.q[27868 & 220]), this.Cz);
      this.Ct = new RZ(new File(this.Ci, r.q[-24209 & 24175]));
      var1.q(p.q[1277 & -14115]);
      this.BR = new iy(this.BI, this.Br);
      var1.q(p.q[1246 & 21470]);
      this.BI.q(this.BR);
      this.BU = new ir(this);
      var1.q(p.q[4831 & 8703]);
      this.CB = new iS(this.Br, new PJ(p.q[2784 & -7942]), this.CL, false);
      if (this.Br.aDL != null) {
         this.CB.z(this.fK());
         this.CB.x(this.BD.tq());
      }

      this.Cw = new iS(this.Br, new PJ(p.q[1249 & -7449]), this.CL, false);
      this.BI.q(this.CB);
      this.BI.q(this.Cw);
      this.BI.q(new uH());
      this.BI.q(new uG());
      MX.bJc.q(new hT(this));
      this.BT = new Py();
      this.A(p.q[-28446 & 502]);
      pz.nP();
      pz.bP(7425);
      pz.a(1.0D);
      pz.ob();
      pz.bR(515);
      pz.hT();
      pz.t(516, 0.1F);
      pz.bS(1029);
      pz.bO(5889);
      pz.nU();
      pz.bO(5888);
      this.A(p.q[2275 & 763]);
      var1.q(e.q[3020 & 26095]);
      this.Ca = new tU(y.q[4511 & -15717]);
      this.Ca.cT(this.Br.avj);
      this.CL.q(tU.awb, (tH)this.Ca);
      this.CL.o(tU.awb);
      this.Ca.e(false, this.Br.avj > 0);
      this.Bj = new vD(this.Ca);
      this.BI.q(this.Bj);
      var1.q(q.q[-32281 & 13783]);
      this.dP = new sj(this.CL, this.Bj);
      this.CG = new sx(this.CL, this.dP);
      this.BG = new pY(this);
      this.BI.q(this.dP);
      var1.q(u.q[182 & -20058]);
      this.Bt = new pp(this, this.BI);
      this.BI.q(this.Bt);
      this.CJ = new pl(this.Bj.nb(), this.Br);
      this.BI.q(this.CJ);
      this.Cv = new qd(this);
      this.BI.q(this.Cv);
      this.CH = new kQ(this);
      pz.h(0, 0, this.Cr, this.BB);
      this.Cc = new np(this.Cg, this.CL);
      this.A(p.q[236 & 484]);
      this.BZ = new jr(this);
      this.BQ = new hR(this);
      if (this.Br.aCt && !this.BF) {
         this.fm();
      }

      try {
         Display.setVSyncEnabled(this.Br.aCA);
      } catch (OpenGLException var3) {
         this.Br.aCA = false;
         this.Br.uG();
      }

      this.Cv.oR();
      this.Bn.q(var1);
      if (this.eP != null) {
         this.r(new mH(new k(), this, this.eP, this.Cm));
      } else {
         this.r(new k());
      }

      var1.q(p.q[3309 & -16155]);
   }

   private int fb() {
      return this.Cg == null && this.Cx != null ? this.Bn.atS().aX.bk() : this.Br.aFu;
   }

   public void run() {
      this.Ce = true;

      try {
         this.fa();
      } catch (Throwable var11) {
         xW var2 = xW.q(var11, p.q[-28452 & 2261]);
         var2.bd(p.q[727 & -12067]);
         this.e(this.w(var2));
         return;
      }

      try {
         while(this.Ce) {
            if (this.BC && this.Bl != null) {
               this.e(this.Bl);
            } else {
               try {
                  this.fx();
               } catch (OutOfMemoryError var10) {
                  this.fL();
                  this.r(new jF());
                  System.gc();
               }
            }
         }

         return;
      } catch (Pw var12) {
         ;
      } catch (PI var13) {
         this.w(var13.Xy());
         this.fL();
         BV.fatal(p.q[18686 & 9430], var13);
         this.e(var13.Xy());
      } catch (Throwable var14) {
         xW var16 = this.w(new xW(p.q[727 & 9431], var14));
         this.fL();
         BV.fatal(p.q[16861 & 248], var14);
         this.e(var16);
      } finally {
         this.fE();
      }

   }

   public static Map fc() {
      HashMap var0 = Maps.newHashMap();
      var0.put(p.q[3358 & 29086], eV().fD().XD());
      var0.put(p.q[319 & 799], eV().fD().XF());
      var0.put(p.q[1392 & 12585], q.q[3251 & 755]);
      return var0;
   }

   public ListenableFuture q(Callable var1) {
      Validate.notNull(var1);
      if (!this.fg()) {
         ListenableFutureTask var2 = ListenableFutureTask.create(var1);
         synchronized(this.Co) {
            this.Co.add(var2);
            return var2;
         }
      } else {
         try {
            return Futures.immediateFuture(var1.call());
         } catch (Exception var6) {
            return Futures.immediateFailedCheckedFuture(var6);
         }
      }
   }

   public void fd() {
      int var1 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
      if (var1 != 0 && !Keyboard.isRepeatEvent() && (!(this.Cx instanceof iZ) || ((iZ)this.Cx).uI <= fe() - 20L) && Keyboard.getEventKeyState()) {
         if (var1 == this.Br.aCq.bB()) {
            this.fm();
         } else if (var1 == this.Br.aFe.bB()) {
            PL.q(this.Ci, this.Cr, this.BB, this.Cy);
         }
      }

   }

   public static long fe() {
      return Sys.getTime() * 1000L / Sys.getTimerResolution();
   }

   public pY ff() {
      return this.BG;
   }

   public boolean fg() {
      return Thread.currentThread() == this.CE;
   }

   private void fh() {
      // $FF: Couldn't be decompiled
   }

   public mL fi() {
      return this.BM;
   }

   public xW w(xW var1) {
      var1.wt().q(p.q[24863 & 3859], new id(this));
      var1.wt().q(p.q[16660 & -31467], new ie(this));
      var1.wt().q(p.q[-7873 & 789], new if1(this));
      var1.wt().q(p.q[-24298 & 16726], new ig(this));
      var1.wt().q(p.q[2391 & -18665], new ih(this));
      var1.wt().q(r.q[25465 & 120], new ii(this));
      var1.wt().q(q.q[2498 & 5093], new hU(this));
      var1.wt().q(p.q[477 & 1304], new hV(this));
      var1.wt().q(p.q[17177 & 10557], new hW(this));
      var1.wt().q(w.q[8887 & -27715], new hX(this));
      var1.wt().q(p.q[-27361 & 1018], new hY(this));
      if (this.Cg != null) {
         this.Cg.r(var1);
      }

      return var1;
   }

   public PropertyMap fj() {
      if (this.Cf.isEmpty()) {
         GameProfile var1 = this.fn().fillProfileProperties(this.CA.Jw(), false);
         this.Cf.putAll(var1.getProperties());
      }

      return this.Cf;
   }

   public vQ fk() {
      return this.Cy;
   }

   public String fl() {
      return this.Bo;
   }

   public ListenableFuture q(Runnable var1) {
      Validate.notNull(var1);
      return this.q(Executors.callable(var1));
   }

   public void fm() {
      try {
         boolean var1 = this.BF;
         boolean var2 = this.Bn.atS().bJ.af();
         if (var2 && !var1) {
            System.setProperty(p.q[16130 & 427], q.q[1137 & 17017]);
         } else if (var1) {
            System.setProperty(p.q[14658 & 1282], q.q[-13325 & 12410]);
         }

         this.BF = !this.BF;
         this.Br.aCt = this.BF;
         if (this.BF) {
            this.ft();
            this.Cr = Display.getDisplayMode().getWidth();
            this.BB = Display.getDisplayMode().getHeight();
         } else {
            Display.setDisplayMode(new DisplayMode(this.CD, this.BN));
            this.Cr = this.CD;
            this.BB = this.BN;
         }

         if (this.Cr <= 0) {
            this.Cr = 1;
         }

         if (this.BB <= 0) {
            this.BB = 1;
         }

         if (this.Cx != null) {
            this.d(this.Cr, this.BB);
         } else {
            this.fX();
         }

         if (!this.BF && SystemUtils.IS_OS_WINDOWS) {
            Display.setResizable(false);
            Display.setResizable(true);
         }

         Display.setFullscreen(!var2 && this.BF);
         Display.setVSyncEnabled(this.Br.aCA);
         this.fw();
         System.setProperty(p.q[1282 & 4378], q.q[24947 & 4338]);
      } catch (Exception var3) {
         BV.error(p.q[8995 & -28413], var3);
      }

   }

   public MinecraftSessionService fn() {
      return this.Cz;
   }

   public void at(int var1) {
      this.Cg.ZG();
      this.Cg.lP();
      int var2 = 0;
      String var3 = null;
      if (this.CM != null) {
         var2 = this.CM.yi();
         this.Cg.i(this.CM);
         var3 = this.CM.hA();
      }

      this.Cn = null;
      iQ var4 = this.CM;
      this.CM = this.Cu.q(this.Cg, this.CM == null ? new Ni() : this.CM.hw());
      this.CM.xG().d(var4.xG().wS());
      this.CM.aOe = var1;
      this.Cn = this.CM;
      this.CM.yc();
      this.CM.H(var3);
      this.Cg.p(this.CM);
      this.Cu.e(this.CM);
      this.CM.Fv = new PA(this.Br);
      this.CM.dF(var2);
      this.Cu.w(this.CM);
      this.CM.bl(var4.FI());
      if (this.Cx instanceof jp) {
         this.r((kf)null);
      }

   }

   public static boolean fo() {
      return BH != null && BH.Br.aDG != 0;
   }

   public void q(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      float var11 = 0.00390625F;
      float var12 = 0.00390625F;
      qq var13 = qk.pm().pl();
      var13.q(7, us.axL);
      var13.i((double)var1, (double)(var2 + var6), 0.0D).e((double)((float)var3 * var11), (double)((float)(var4 + var6) * var12)).v(var7, var8, var9, var10).pJ();
      var13.i((double)(var1 + var5), (double)(var2 + var6), 0.0D).e((double)((float)(var3 + var5) * var11), (double)((float)(var4 + var6) * var12)).v(var7, var8, var9, var10).pJ();
      var13.i((double)(var1 + var5), (double)var2, 0.0D).e((double)((float)(var3 + var5) * var11), (double)((float)var4 * var12)).v(var7, var8, var9, var10).pJ();
      var13.i((double)var1, (double)var2, 0.0D).e((double)((float)var3 * var11), (double)((float)var4 * var12)).v(var7, var8, var9, var10).pJ();
      qk.pm().pn();
   }

   public boolean fp() {
      return this.BK && this.BW != null;
   }

   public is fq() {
      return this.CM != null ? (this.CM.vR.bXI instanceof QQ ? is.Dw : (this.CM.vR.bXI instanceof QP ? (Bn.aWE != null && Bn.aWD > 0 ? is.Dx : is.Dy) : (this.CM.bdO.bfz && this.CM.bdO.bfC ? is.Du : is.Dt))) : is.Ds;
   }

   private void fr() {
      this.CI.q(new vx(), vw.class);
      this.CI.q(new vm(), vl.class);
      this.CI.q(new vj(), vi.class);
      this.CI.q(new vv(), vu.class);
      this.CI.q(new vt(), vs.class);
   }

   public iy fs() {
      return this.BR;
   }

   private void ft() {
      HashSet var1 = Sets.newHashSet();
      Collections.addAll(var1, Display.getAvailableDisplayModes());
      DisplayMode var2 = Display.getDesktopDisplayMode();
      if (!var1.contains(var2) && PV.XS() == PW.bUS) {
         label52:
         for(DisplayMode var4 : CK) {
            boolean var5 = true;

            for(DisplayMode var7 : var1) {
               if (var7.getBitsPerPixel() == 32 && var7.getWidth() == var4.getWidth() && var7.getHeight() == var4.getHeight()) {
                  var5 = false;
                  break;
               }
            }

            if (!var5) {
               Iterator var8 = var1.iterator();

               DisplayMode var9;
               while(true) {
                  if (!var8.hasNext()) {
                     continue label52;
                  }

                  var9 = (DisplayMode)var8.next();
                  if (var9.getBitsPerPixel() == 32 && var9.getWidth() == var4.getWidth() / 2 && var9.getHeight() == var4.getHeight() / 2) {
                     break;
                  }
               }

               var2 = var9;
            }
         }
      }

      Display.setDisplayMode(var2);
      this.Cr = var2.getWidth();
      this.BB = var2.getHeight();
   }

   public hS(net.minecraft.client.main.q var1) {
      BH = this;
      this.Ci = var1.Tg.To;
      this.BS = var1.Tg.Tr;
      this.BE = var1.Tg.Tq;
      this.Bq = var1.Tf.Ts;
      this.Bo = var1.Tf.Tt;
      this.Cf = var1.Tj.Tz;
      this.Bv = new uB((new uR(var1.Tg.Tr, var1.Tg.Tp)).tu());
      this.CC = var1.Tj.Tw == null ? Proxy.NO_PROXY : var1.Tj.Tw;
      this.Cz = (new YggdrasilAuthenticationService(var1.Tj.Tw, UUID.randomUUID().toString())).createMinecraftSessionService();
      this.CA = var1.Tj.Tx;
      BV.info(p.q[-7434 & 211] + this.CA.XD());
      BV.info(p.q[987 & 11475] + this.CA.XH() + w.q[61 & 8607]);
      this.Cr = var1.Ti.Tl > 0 ? var1.Ti.Tl : 1;
      this.BB = var1.Ti.Tk > 0 ? var1.Ti.Tk : 1;
      this.CD = var1.Ti.Tl;
      this.BN = var1.Ti.Tk;
      this.BF = var1.Ti.Tm;
      this.Bs = fu();
      this.BW = new Mi(this);
      if (var1.Th.Tv != null) {
         this.eP = var1.Th.Tv;
         this.Cm = var1.Th.Tu;
      }

      ImageIO.setUseCache(false);
      Eb.GY();
   }

   private ByteBuffer w(InputStream var1) {
      BufferedImage var2 = ImageIO.read(var1);
      int[] var3 = var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
      ByteBuffer var4 = ByteBuffer.allocate(4 * var3.length);

      for(int var8 : var3) {
         var4.putInt(var8 << 8 | var8 >> 24 & 255);
      }

      var4.flip();
      return var4;
   }

   private void A(String var1) {
      this.getClass();
      int var2 = GL11.glGetError();
      if (var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         BV.error(p.q[254 & -32276]);
         BV.error(p.q[4845 & 9709] + var1);
         BV.error(var2 + q.q[-15674 & 6813] + var3);
      }

   }

   private static boolean fu() {
      String[] var0 = new String[]{w.q[863 & 893], w.q[-14497 & 2910], q.q[10448 & -14371]};

      for(String var4 : var0) {
         String var5 = System.getProperty(var4);
         if (var5 != null && var5.contains(w.q[4959 & -31873])) {
            return true;
         }
      }

      return false;
   }

   public void fv() {
      if (this.Bi) {
         vP.uS();
         this.Bi = false;
         this.BT.Xs();
      }

   }

   public void fw() {
      this.CF.cf(p.q[9468 & 4349]);
      Display.update();
      this.CF.Ol();
      this.gb();
   }

   private void fx() {
      long var1 = System.nanoTime();
      this.CF.cf(q.q[287 & 26591]);
      if (Display.isCreated() && Display.isCloseRequested()) {
         this.eW();
      }

      if (this.Ck && this.Cg != null) {
         float var3 = this.BO.ath;
         this.BO.XN();
         this.BO.ath = var3;
      } else {
         this.BO.XN();
      }

      this.CF.cf(q.q[-22185 & 20895]);
      synchronized(this.Co) {
         while(!this.Co.isEmpty()) {
            PV.q((FutureTask)this.Co.poll(), BV);
         }
      }

      this.CF.Ol();
      long var14 = System.nanoTime();
      this.CF.cf(q.q[8984 & 506]);

      for(int var5 = 0; var5 < this.BO.bUF; ++var5) {
         this.fW();
      }

      this.CF.cd(q.q[-31909 & 4381]);
      long var15 = System.nanoTime() - var14;
      this.A(p.q[497 & 3313]);
      this.CF.cd(y.q[18255 & 8525]);
      this.BR.q(this.CM, this.BO.ath);
      this.CF.Ol();
      this.CF.cf(q.q[25946 & 2458]);
      pz.nE();
      pz.bY(16640);
      this.Cy.aa(true);
      this.CF.cf(q.q[1307 & 12571]);
      pz.nP();
      if (this.CM != null && this.CM.xQ()) {
         this.Br.aCr = 0;
      }

      this.CF.Ol();
      if (!this.Cd) {
         this.CF.cd(p.q[-11786 & 2802]);
         this.Bt.w(this.BO.ath, var1);
         this.CF.Ol();
      }

      if (this.CM != null && this.Bn.Ff.cU.af()) {
         this.Bn.dmD.doX.sk();
      }

      M var7 = M.cg;
      if (this.CM != null && var7.ce.af()) {
         boolean var8 = this.CM.hI();
         aeI var9 = this.CM.yb();
         float var10 = var7.cc.br();
         float var11 = 0.01F + (10.0F - var10) / 9.0F * 0.99F;
         var9.q(var8 ? 1.0D : 0.0D, (double)var11, var8 ? aeL.doB : aeL.dor, true);
         var9.aub();
      }

      this.CF.Ol();
      if (this.Br.aex && this.Br.aEM && !this.Br.aFw) {
         if (!this.CF.bDx) {
            this.CF.Om();
         }

         this.CF.bDx = true;
         this.w(var15);
      } else {
         this.CF.bDx = false;
         this.Bx = System.nanoTime();
      }

      if (this.Bn.atS().bs.af()) {
         this.CH.kz();
      }

      this.Cy.uZ();
      pz.nF();
      pz.nE();
      this.Cy.ak(this.Cr, this.BB);
      pz.nF();
      this.CF.cf(q.q[-31937 & 12639]);
      this.Bn.atM().q(new agw());
      this.fw();
      Thread.yield();
      this.A(p.q[24819 & 499]);
      ++this.Cb;
      this.Ck = this.fp() && this.Cx != null && this.Cx.s() && !this.BW.Qh();
      long var16 = System.nanoTime();
      this.Bp.k(var16 - this.BL);
      this.BL = var16;
      boolean var17 = this.Bn.atS().bc.af();
      if (var17) {
         ahe.aW();
         BA = (int)ahe.avN();
         this.Bw = String.format(p.q[1780 & -32516], BA, rA.apH, rA.apH != 1 ? e.q[8422 & 226] : q.q[10304 & 16896], (float)this.Br.aFu == vO.aFN.uO() ? p.q[253 & 8437] : this.Br.aFu, this.Br.aCA ? p.q[-32514 & 2294] : q.q[20964 & 1041], this.Br.ru ? q.q[27 & 1284] : p.q[2295 & -15617], this.Br.aDl == 0 ? q.q[-29680 & 5] : (this.Br.aDl == 1 ? p.q[-25864 & 9464] : p.q[16633 & -32519]), qa.ou() ? p.q[28410 & -28422] : q.q[2712 & -27615]);
      }

      while(fe() >= this.BP + 1000L) {
         if (!var17) {
            BA = this.Cb;
         }

         this.Bw = String.format(p.q[1268 & 8695], BA, rA.apH, rA.apH != 1 ? e.q[503 & 746] : q.q[10500 & -28568], (float)this.Br.aFu == vO.aFN.uO() ? p.q[-32521 & 5365] : this.Br.aFu, this.Br.aCA ? p.q[6646 & 246] : q.q[10470 & 21272], this.Br.ru ? q.q[-6139 & 4496] : p.q[5367 & 8951], this.Br.aDl == 0 ? q.q[-19163 & 2048] : (this.Br.aDl == 1 ? p.q[4857 & -30468] : p.q[11519 & 20729]), qa.ou() ? p.q[16890 & -27398] : q.q[18620 & -32703]);
         rA.apH = 0;
         this.BP += 1000L;
         this.Cb = 0;
      }

      if (!this.Bi && !Display.isActive()) {
         Display.sync(this.Bn.atS().by.bk());
      } else if (this.fO()) {
         this.CF.cf(p.q[255 & -20997]);
         Display.sync(this.fb());
         this.CF.Ol();
      }

      this.CF.Ol();
   }

   public void q(mL var1) {
      this.BM = var1;
   }

   public nb fy() {
      return this.CM != null ? this.CM.FE : null;
   }

   public void r(kf var1) {
      if (this.Cx != null) {
         this.Cx.aL();
      }

      if (var1 == null && this.Cg == null) {
         var1 = new k();
      } else if (var1 == null && this.CM.zA() <= 0.0F) {
         var1 = new jp();
      }

      if (var1 instanceof k) {
         this.Br.aex = false;
         this.Bn.atM().q(new agr());
      }

      this.Cx = (kf)var1;
      if (var1 != null) {
         this.fv();
         kJ var2 = new kJ(this);
         int var3 = var2.kr();
         int var4 = var2.kp();
         ((kf)var1).i(this, var3, var4);
         this.Cd = false;
      } else {
         this.BR.gJ();
         this.fC();
      }

   }

   public boolean fz() {
      return this.Bs;
   }

   public tU fA() {
      return this.Ca;
   }

   public void q(mP var1, String var2) {
      if (var1 != this.Cg) {
         this.Bt.nr().km();
      }

      if (var1 == null) {
         nb var3 = this.fy();
         if (var3 != null) {
            var3.cd();
         }

         if (this.BW != null && this.BW.PL()) {
            this.BW.PB();
            this.BW.Qi();
         }

         this.BW = null;
         this.CH.kA();
         this.Bt.nr().km();
      }

      this.Cn = null;
      this.BX = null;
      if (this.BQ != null) {
         this.BQ.m(var2);
         this.BQ.v(q.q[-28145 & 16512]);
      }

      if (var1 == null && this.Cg != null) {
         this.BY.tw();
         this.BZ.is();
         this.q((mL)null);
         this.BK = false;
      }

      this.BR.gL();
      this.Cg = var1;
      if (var1 != null) {
         if (this.Cv != null) {
            this.Cv.t(var1);
         }

         if (this.Cc != null) {
            this.Cc.w(var1);
         }

         if (this.CM == null) {
            this.CM = this.Cu.q(var1, new Ni());
            this.Cu.e(this.CM);
         }

         this.CM.yc();
         var1.p(this.CM);
         this.CM.Fv = new PA(this.Br);
         this.Cu.w(this.CM);
         this.Cn = this.CM;
      } else {
         this.Ct.aca();
         this.CM = null;
      }

      if (!this.Bn.atS().bk.af()) {
         System.gc();
      }

      this.Bh = 0L;
   }

   public pl fB() {
      return this.CJ;
   }

   public void fC() {
      if (Display.isActive() && !this.Bi) {
         if (!Ch && this.Bn.atS().bb.af()) {
            vP.uV();
         }

         this.Bi = true;
         this.BT.Xu();
         this.r((kf)null);
         this.BJ = 10000;
      }

   }

   public PM fD() {
      return this.CA;
   }

   public void fE() {
      try {
         BV.info(p.q[-32274 & 25838]);

         try {
            this.q((mP)null);
         } catch (Throwable var5) {
            ;
         }

         this.BR.gI();
         BV.info(p.q[17647 & -24321]);
         this.Bn.dmM.close();
         if (this.Bn.dmj != null) {
            this.Bn.dmj.cZ(true);
         }

         this.Bn.j();
         BV.info(p.q[8436 & -31502]);
      } finally {
         Display.destroy();
         if (!this.BC) {
            System.exit(0);
         }

      }

      System.gc();
   }

   // $FF: synthetic method
   static String q(hS var0) {
      return var0.Bq;
   }

   private void w(long var1) {
      if (this.CF.bDx) {
         List var3 = this.CF.ce(this.Cj);
         LO var4 = (LO)var3.remove(0);
         pz.bY(256);
         pz.bO(5889);
         pz.nV();
         pz.nU();
         pz.q(0.0D, (double)this.Cr, (double)this.BB, 0.0D, 1000.0D, 3000.0D);
         pz.bO(5888);
         pz.nU();
         pz.y(0.0F, 0.0F, -2000.0F);
         GL11.glLineWidth(1.0F);
         pz.nC();
         qk var5 = qk.pm();
         qq var6 = var5.pl();
         short var7 = 160;
         int var8 = this.Cr - var7 - 10;
         int var9 = this.BB - var7 * 2;
         pz.nX();
         var6.q(7, us.axK);
         var6.i((double)((float)var8 - (float)var7 * 1.1F), (double)((float)var9 - (float)var7 * 0.6F - 16.0F), 0.0D).v(200, 0, 0, 0).pJ();
         var6.i((double)((float)var8 - (float)var7 * 1.1F), (double)(var9 + var7 * 2), 0.0D).v(200, 0, 0, 0).pJ();
         var6.i((double)((float)var8 + (float)var7 * 1.1F), (double)(var9 + var7 * 2), 0.0D).v(200, 0, 0, 0).pJ();
         var6.i((double)((float)var8 + (float)var7 * 1.1F), (double)((float)var9 - (float)var7 * 0.6F - 16.0F), 0.0D).v(200, 0, 0, 0).pJ();
         var5.pn();
         pz.nz();
         double var10 = 0.0D;

         for(int var12 = 0; var12 < var3.size(); ++var12) {
            LO var13 = (LO)var3.get(var12);
            int var14 = Pq.D(var13.bDD / 4.0D) + 1;
            var6.q(6, us.axK);
            int var15 = var13.bl();
            int var16 = var15 >> 16 & 255;
            int var17 = var15 >> 8 & 255;
            int var18 = var15 & 255;
            var6.i((double)var8, (double)var9, 0.0D).v(var16, var17, var18, 255).pJ();

            for(int var19 = var14; var19 >= 0; --var19) {
               float var20 = (float)((var10 + var13.bDD * (double)var19 / (double)var14) * 3.141592653589793D * 2.0D / 100.0D);
               float var21 = Pq.bk(var20) * (float)var7;
               float var22 = Pq.bi(var20) * (float)var7 * 0.5F;
               var6.i((double)((float)var8 + var21), (double)((float)var9 - var22), 0.0D).v(var16, var17, var18, 255).pJ();
            }

            var5.pn();
            var6.q(5, us.axK);

            for(int var35 = var14; var35 >= 0; --var35) {
               float var36 = (float)((var10 + var13.bDD * (double)var35 / (double)var14) * 3.141592653589793D * 2.0D / 100.0D);
               float var37 = Pq.bk(var36) * (float)var7;
               float var38 = Pq.bi(var36) * (float)var7 * 0.5F;
               var6.i((double)((float)var8 + var37), (double)((float)var9 - var38), 0.0D).v(var16 >> 1, var17 >> 1, var18 >> 1, 255).pJ();
               var6.i((double)((float)var8 + var37), (double)((float)var9 - var38 + 10.0F), 0.0D).v(var16 >> 1, var17 >> 1, var18 >> 1, 255).pJ();
            }

            var5.pn();
            var10 += var13.bDD;
         }

         DecimalFormat var23 = new DecimalFormat(p.q[-31747 & 26877]);
         pz.nP();
         String var24 = q.q[9124 & 0];
         if (!var4.bDB.equals(q.q[16739 & 7084])) {
            var24 = var24 + p.q[10495 & 22526];
         }

         if (var4.bDB.length() == 0) {
            var24 = var24 + p.q[2815 & 24831];
         } else {
            var24 = var24 + var4.bDB + q.q[10703 & 330];
         }

         int var27 = 16777215;
         this.CB.q(var24, (float)(var8 - var7), (float)(var9 - var7 / 2 - 16), var27);
         this.CB.q(var24 = var23.format(var4.bDC) + q.q[1022 & -6658], (float)(var8 + var7 - this.CB.K(var24)), (float)(var9 - var7 / 2 - 16), var27);

         for(int var28 = 0; var28 < var3.size(); ++var28) {
            LO var29 = (LO)var3.get(var28);
            String var30 = q.q[256 & -31609];
            if (var29.bDB.equals(q.q[-21086 & 304])) {
               var30 = var30 + p.q[-31296 & 301];
            } else {
               var30 = var30 + w.q[433 & -26177] + (var28 + 1) + y.q[-28156 & 25159];
            }

            var30 = var30 + var29.bDB;
            this.CB.q(var30, (float)(var8 - var7), (float)(var9 + var7 / 2 + var28 * 8 + 20), var29.bl());
            this.CB.q(var30 = var23.format(var29.bDD) + q.q[2046 & -26114], (float)(var8 + var7 - 50 - this.CB.K(var30)), (float)(var9 + var7 / 2 + var28 * 8 + 20), var29.bl());
            this.CB.q(var30 = var23.format(var29.bDC) + q.q[17918 & -31746], (float)(var8 + var7 - this.CB.K(var30)), (float)(var9 + var7 / 2 + var28 * 8 + 20), var29.bl());
         }
      }

   }

   public uL fF() {
      return this.BI;
   }

   public ListenableFuture fG() {
      return this.q(new hZ(this));
   }

   public Wp fH() {
      return this.Ct;
   }

   public boolean fI() {
      return this.Ck;
   }

   public tS fJ() {
      return this.CL;
   }

   public boolean fK() {
      return this.BD.ts() || this.Br.aCZ;
   }

   public void fL() {
      try {
         this.Cv.oJ();
      } catch (Throwable var3) {
         ;
      }

      try {
         System.gc();
         this.q((mP)null);
      } catch (Throwable var2) {
         ;
      }

      System.gc();
   }

   public void e(xW var1) {
      File var2 = new File(eV().Ci, w.q[-19554 & 17052]);
      File var3 = new File(var2, w.q[671 & -23875] + (new SimpleDateFormat(w.q[-2402 & 734])).format(new Date()) + p.q[248 & 12522]);
      Eb.bu(var1.ws());
      if (var1.wq() != null) {
         Eb.bu(p.q[2537 & 20715] + var1.wq());
         System.exit(-1);
      } else if (var1.r(var3)) {
         Eb.bu(p.q[491 & -32023] + var3.getAbsolutePath());
         System.exit(-1);
      } else {
         Eb.bu(p.q[-27414 & 16623]);
         System.exit(-2);
      }

   }

   private void fM() {
      // $FF: Couldn't be decompiled
   }

   public void fN() {
      if (this.Cx == null) {
         this.r(new js());
         if (this.fp() && !this.BW.Qh()) {
            this.BR.gK();
         }
      }

   }

   public boolean fO() {
      return (float)this.fb() < vO.aFN.uO();
   }

   public String fP() {
      return this.Bq;
   }

   // $FF: synthetic method
   static uP w(hS var0) {
      return var0.BD;
   }

   public Mi fQ() {
      return this.BW;
   }

   private void au(int var1) {
      List var2 = this.CF.ce(this.Cj);
      if (var2 != null && !var2.isEmpty()) {
         LO var3 = (LO)var2.remove(0);
         if (var1 == 0) {
            if (var3.bDB.length() > 0) {
               int var4 = this.Cj.lastIndexOf(q.q[4323 & 2371]);
               if (var4 >= 0) {
                  this.Cj = this.Cj.substring(0, var4);
               }
            }
         } else {
            --var1;
            if (var1 < var2.size() && !((LO)var2.get(var1)).bDB.equals(q.q[2341 & 13626])) {
               if (this.Cj.length() > 0) {
                  this.Cj = this.Cj + q.q[67 & 17751];
               }

               this.Cj = this.Cj + ((LO)var2.get(var1)).bDB;
            }
         }
      }

   }

   private void fR() {
      // $FF: Couldn't be decompiled
   }

   public boolean fS() {
      return this.BK;
   }

   private void fT() {
      PW var1 = PV.XS();
      if (var1 != PW.bUS) {
         InputStream var2 = null;
         InputStream var3 = null;

         try {
            var2 = this.Bv.c(new PJ(w.q[883 & -29737]));
            var3 = this.Bv.c(new PJ(w.q[23508 & 9079]));
            if (var2 != null && var3 != null) {
               Display.setIcon(new ByteBuffer[]{this.w(var2), this.w(var3)});
            }
         } catch (IOException var8) {
            BV.error(p.q[2799 & 20711], var8);
         } finally {
            IOUtils.closeQuietly(var2);
            IOUtils.closeQuietly(var3);
         }
      }

   }

   public void r(zk var1) {
      this.Cn = var1;
      this.Bt.s(var1);
   }

   public uP fU() {
      return this.BD;
   }

   public uT fV() {
      return this.BY;
   }

   public void fW() {
      if (this.Cq > 0) {
         --this.Cq;
      }

      this.CF.cf(t.q[-31852 & 13270]);
      if (!this.Ck) {
         this.BZ.iu();
      }

      this.CF.Ol();
      this.Bt.O(1.0F);
      this.CF.cf(o.q[2029 & -11603]);
      if (!this.Ck && this.Cg != null) {
         this.Cu.lz();
      }

      this.CF.cd(y.q[24827 & 6811]);
      if (!this.Ck) {
         this.CL.lS();
      }

      if (this.Cx == null && this.CM != null) {
         if (this.CM.zA() <= 0.0F) {
            this.r((kf)null);
         } else if (this.CM.zV() && this.Cg != null) {
            this.r(new ku());
         }
      } else if (this.Cx != null && this.Cx instanceof ku && !this.CM.zV()) {
         this.r((kf)null);
      }

      if (this.Cx != null) {
         this.BJ = 10000;
      }

      this.Bn.atM().q(new agA());
      if (this.Cx != null) {
         try {
            this.Cx.jE();
         } catch (Throwable var7) {
            xW var2 = xW.q(var7, p.q[-3660 & 2893]);
            ye var3 = var2.bd(p.q[16703 & 4549]);
            var3.q(t.q[-29801 & 927], new ib(this));
            throw new PI(var2);
         }

         if (this.Cx != null) {
            try {
               this.Cx.p();
            } catch (Throwable var6) {
               xW var12 = xW.q(var6, p.q[2342 & 4550]);
               ye var16 = var12.bd(p.q[309 & 18823]);
               var16.q(t.q[919 & -25705], new ic(this));
               throw new PI(var12);
            }
         }
      }

      if (this.Cx == null || this.Cx.MA) {
         this.CF.cd(t.q[19346 & 1010]);

         while(Mouse.next()) {
            int var1 = Mouse.getEventButton();
            vP.q(var1 - 100, Mouse.getEventButtonState());
            if (Mouse.getEventButtonState()) {
               if (this.CM.hm() && var1 == 2) {
                  this.BZ.iB().jY();
               } else {
                  vP.dj(var1 - 100);
               }
            }

            long var13 = fe() - this.Bh;
            if (var13 <= 200L) {
               int var4 = Mouse.getEventDWheel();
               if (var4 != 0) {
                  if (this.CM.hm()) {
                     var4 = var4 < 0 ? -1 : 1;
                     if (this.BZ.iB().jZ()) {
                        this.BZ.iB().aV(-var4);
                     } else {
                        float var5 = Pq.n(this.CM.bdO.GF() + (float)var4 * 0.005F, 0.0F, 0.2F);
                        this.CM.bdO.aV(var5);
                     }
                  } else if (!this.Bn.atR().W().q((double)var4)) {
                     this.CM.bdM.eT(var4);
                  }
               }

               if (this.Cx == null) {
                  if (!this.Bi && Mouse.getEventButtonState()) {
                     this.fC();
                  }
               } else if (this.Cx != null) {
                  this.Cx.aJ();
               }
            }
         }

         if (this.BJ > 0) {
            --this.BJ;
         }

         this.CF.cd(p.q[-17641 & 271]);

         while(Keyboard.next()) {
            int var9 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 256 : Keyboard.getEventKey();
            vP.q(var9, Keyboard.getEventKeyState());
            if (Keyboard.getEventKeyState()) {
               vP.dj(var9);
            }

            if (this.Cl > 0L) {
               if (fe() - this.Cl >= 6000L) {
                  throw new PI(new xW(p.q[24860 & 5480], new Throwable()));
               }

               if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                  this.Cl = -1L;
               }
            } else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
               this.Cl = fe();
            }

            this.fd();
            if (Keyboard.getEventKeyState()) {
               if (var9 == 62 && this.Bt != null) {
                  this.Bt.ni();
               }

               if (this.Cx != null) {
                  this.Cx.jz();
               } else {
                  this.Bn.atM().q(new agv(var9));
                  if (var9 == 1) {
                     this.fN();
                  }

                  if (var9 == 32 && Keyboard.isKeyDown(61) && this.BZ != null) {
                     this.BZ.iA().iW();
                  }

                  if (var9 == 31 && Keyboard.isKeyDown(61)) {
                     this.gl();
                  }

                  if (var9 == 17 && Keyboard.isKeyDown(61)) {
                     ;
                  }

                  if (var9 == 18 && Keyboard.isKeyDown(61)) {
                     ;
                  }

                  if (var9 == 47 && Keyboard.isKeyDown(61)) {
                     ;
                  }

                  if (var9 == 38 && Keyboard.isKeyDown(61)) {
                     ;
                  }

                  if (var9 == 22 && Keyboard.isKeyDown(61)) {
                     ;
                  }

                  if (var9 == 20 && Keyboard.isKeyDown(61)) {
                     this.gl();
                  }

                  if (var9 == 33 && Keyboard.isKeyDown(61)) {
                     this.Br.q(vO.aFK, kf.jy() ? -1 : 1);
                  }

                  if (var9 == 30 && Keyboard.isKeyDown(61)) {
                     this.Cv.oH();
                  }

                  if (var9 == 35 && Keyboard.isKeyDown(61)) {
                     this.Br.aCO = !this.Br.aCO;
                     this.Br.uG();
                  }

                  if (var9 == 48 && Keyboard.isKeyDown(61)) {
                     this.CG.U(!this.CG.rz());
                  }

                  if (var9 == 25 && Keyboard.isKeyDown(61)) {
                     this.Br.aDn = !this.Br.aDn;
                     this.Br.uG();
                  }

                  if (var9 == 59) {
                     this.Br.aFw = !this.Br.aFw;
                  }

                  if (var9 == 61) {
                     this.Br.aex = !this.Br.aex;
                     this.Br.aEM = kf.jy();
                     this.Br.aFA = kf.jD();
                  }

                  if (this.Br.aEu.bD()) {
                     ++this.Br.aCr;
                     if (this.Br.aCr > 2) {
                        this.Br.aCr = 0;
                     }

                     if (this.Br.aCr == 0) {
                        this.Bt.s(this.gj());
                     } else if (this.Br.aCr == 1) {
                        this.Bt.s((zk)null);
                     }

                     this.Cv.pf();
                  }

                  if (this.Br.aCP.bD()) {
                     this.Br.aCF = !this.Br.aCF;
                  }
               }

               if (this.Br.aex && this.Br.aEM) {
                  if (var9 == 11) {
                     this.au(0);
                  }

                  for(int var14 = 0; var14 < 9; ++var14) {
                     if (var9 == 2 + var14) {
                        this.au(var14 + 1);
                     }
                  }
               }
            }
         }

         for(int var10 = 0; var10 < 9; ++var10) {
            if (this.Br.aDO[var10].bD()) {
               if (this.CM.hm()) {
                  this.BZ.iB().aW(var10);
               } else {
                  this.CM.bdM.bfu = var10;
               }
            }
         }

         boolean var11 = this.Br.aFt != DF.bex;

         while(this.Br.aDW.bD()) {
            if (this.Cu.hH()) {
               this.CM.hM();
            } else {
               this.fy().q(new JC(JD.bxm));
               this.r(new lq(this.CM));
            }
         }

         while(this.Br.aDp.bD()) {
            if (!this.CM.hm()) {
               this.CM.k(kf.jB());
            }
         }

         while(this.Br.aEy.bD()) {
            if (!this.CM.hm()) {
               this.CM.k(true);
            }
         }

         while(this.Br.aDM.bD() && var11) {
            this.r(new iW());
         }

         if (this.Cx == null && this.Br.aFo.bD() && var11) {
            this.r(new iW(q.q[16479 & 11359]));
         }

         if (this.CM.FM()) {
            if (!this.Br.aFj.bC()) {
               this.Cu.r(this.CM);
            }

            while(this.Br.aCL.bD()) {
               this.Bn.atD().S.aH();
            }

            while(this.Br.aFj.bD()) {
               this.Bn.atD().T.aH();
            }

            while(this.Br.aDS.bD()) {
               ;
            }
         } else {
            while(this.Br.aCL.bD()) {
               this.fh();
               this.Bn.atD().S.aH();
            }

            while(this.Br.aFj.bD()) {
               this.fM();
               this.Bn.atD().T.aH();
            }

            while(this.Br.aDS.bD()) {
               this.fR();
            }
         }

         if (this.Br.aFj.bC() && this.Cq == 0 && !this.CM.FM()) {
            this.fM();
         }

         this.g(this.Cx == null && this.Br.aCL.bC() && this.Bi);
      }

      if (this.Cg != null) {
         if (this.CM != null) {
            ++this.By;
            if (this.By == 30) {
               this.By = 0;
               this.Cg.Z(this.CM);
            }
         }

         this.CF.cd(p.q[21235 & 2294]);
         if (!this.Ck) {
            this.Bt.nu();
         }

         this.CF.cd(p.q[-7925 & 7437]);
         if (!this.Ck) {
            this.Cv.oI();
         }

         this.CF.cd(t.q[-17517 & 915]);
         if (!this.Ck) {
            if (this.Cg.Zy() > 0) {
               this.Cg.hj(this.Cg.Zy() - 1);
            }

            this.Cg.ZD();
         }
      } else if (this.Bt.nk()) {
         this.Bt.ns();
      }

      if (!this.Ck) {
         this.BU.aW();
         this.BR.aW();
      }

      if (this.Cg != null) {
         if (!this.Ck) {
            this.Cg.u(this.Cg.Kq() != Qr.bWe, true);

            try {
               this.Cg.lS();
            } catch (Throwable var8) {
               xW var15 = xW.q(var8, p.q[798 & -28342]);
               if (this.Cg == null) {
                  ye var17 = var15.bd(e.q[938 & 843]);
                  var17.w(p.q[4379 & 875], p.q[16652 & 5452]);
               } else {
                  this.Cg.r(var15);
               }

               throw new PI(var15);
            }
         }

         this.CF.cd(p.q[5101 & 16671]);
         if (!this.Ck && this.Cg != null && this.Bn.atS().bv.af()) {
            this.Cg.j(Pq.D(this.CM.aNZ), Pq.D(this.CM.aNK), Pq.D(this.CM.aOt));
         }

         this.CF.cd(t.q[948 & 18340]);
         if (!this.Ck) {
            this.Cc.my();
         }
      } else if (this.BX != null) {
         this.CF.cd(p.q[-27362 & 2415]);
         this.BX.IM();
      }

      this.CF.Ol();
      this.Bh = fe();
   }

   public void q(String var1, String var2, QZ var3) {
      this.q((mP)null);
      System.gc();
      Wq var4 = this.Ct.f(var1, false);
      WB var5 = var4.adG();
      if (var5 == null && var3 != null) {
         var5 = new WB(var3, var1);
         var4.w(var5);
      }

      if (var3 == null) {
         var3 = new QZ(var5);
      }

      try {
         this.BW = new Mi(this, var1, var2, var3);
         this.BW.Pk();
         this.BK = true;
      } catch (Throwable var10) {
         xW var7 = xW.q(var10, p.q[783 & 319]);
         ye var8 = var7.bd(p.q[17167 & -28161]);
         var8.w(p.q[-10856 & 308], var1);
         var8.w(p.q[16657 & -31333], var2);
         throw new PI(var7);
      }

      this.BQ.b(uI.q(w.q[-7524 & 655]));

      while(!this.BW.Qd()) {
         String var6 = this.BW.Pu();
         if (var6 != null) {
            this.BQ.v(uI.q(var6));
         } else {
            this.BQ.v(q.q[1121 & -20460]);
         }

         try {
            Thread.sleep(200L);
         } catch (InterruptedException var9) {
            ;
         }
      }

      this.r(new kq());
      SocketAddress var11 = this.BW.Pn().Ja();
      Ip var12 = Ip.q(var11);
      var12.q(new mZ(var12, this, (kf)null));
      var12.t(new IS(47, var11.toString(), 0, HY.bue));
      var12.t(new IV(this.fD().Jw()));
      this.BX = var12;
   }

   private void fX() {
      this.Cy.am(this.Cr, this.BB);
      if (this.Bt != null) {
         this.Bt.L(this.Cr, this.BB);
      }

   }

   public static boolean fY() {
      return BH == null || !BH.Br.aFw;
   }

   public static void fZ() {
      if (BH != null) {
         Mi var0 = BH.fQ();
         if (var0 != null) {
            var0.PF();
         }
      }

   }

   public OU ga() {
      return this.Bp;
   }

   private GX q(Fm var1, int var2, No var3) {
      GX var4 = new GX(var1, 1, var2);
      HL var5 = new HL();
      var3.q(var5);
      if (var1 == Et.bll && var5.bM(r.q[9602 & 424])) {
         HL var8 = var5.bO(r.q[-24192 & 469]);
         HL var9 = new HL();
         var9.w(r.q[-31891 & 21229], var8);
         var4.l(var9);
         return var4;
      } else {
         var4.q(e.q[18943 & -19235], var5);
         HL var6 = new HL();
         HT var7 = new HT();
         var7.q(new HW(p.q[18771 & 1938]));
         var6.w(o.q[3031 & 9173], var7);
         var4.q(q.q[-32453 & 19935], var6);
         return var4;
      }
   }

   protected void gb() {
      if (!this.BF && Display.wasResized()) {
         int var1 = this.Cr;
         int var2 = this.BB;
         this.Cr = Display.getWidth();
         this.BB = Display.getHeight();
         if (this.Cr != var1 || this.BB != var2) {
            if (this.Cr <= 0) {
               this.Cr = 1;
            }

            if (this.BB <= 0) {
               this.BB = 1;
            }

            this.d(this.Cr, this.BB);
         }
      }

   }

   private void g(boolean var1) {
      if (!var1) {
         this.BJ = 0;
      }

      if (this.BJ <= 0 && (!this.CM.FM() || ao.ef.ei.af())) {
         if (var1 && this.Cs != null && this.Cs.bTH == PC.bTK) {
            NW var2 = this.Cs.dU();
            if (this.Cg.g(var2).ds().cB() != hn.zp && this.Cu.e(var2, this.Cs.bTI)) {
               if (this.Bn.atS().bQ.af()) {
                  this.Cc.t(var2, this.Cs.bTI);
               }

               this.CM.hB();
            }
         } else {
            this.Cu.lx();
         }
      }

   }

   private void gc() {
      Display.setResizable(true);
      Display.setTitle(e.q[-30533 & 28731]);

      try {
         Display.create((new PixelFormat()).withDepthBits(24));
      } catch (LWJGLException var4) {
         BV.error(p.q[230 & 23015], var4);

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var3) {
            ;
         }

         if (this.BF) {
            this.ft();
         }

         Display.create();
      }

   }

   private void gd() {
      if (this.BF) {
         Display.setFullscreen(true);
         DisplayMode var1 = Display.getDisplayMode();
         this.Cr = Math.max(1, var1.getWidth());
         this.BB = Math.max(1, var1.getHeight());
      } else {
         Display.setDisplayMode(new DisplayMode(this.Cr, this.BB));
      }

   }

   public static int ge() {
      return BA;
   }

   public Proxy gf() {
      return this.CC;
   }

   public ir gg() {
      return this.BU;
   }

   public void q(mP var1) {
      this.q(var1, q.q[1668 & 2]);
   }

   public vb gh() {
      return this.Bz;
   }

   private void d(int var1, int var2) {
      this.Cr = Math.max(1, var1);
      this.BB = Math.max(1, var2);
      if (this.Cx != null) {
         kJ var3 = new kJ(this);
         this.Cx.u(this, var3.kr(), var3.kp());
      }

      this.BQ = new hR(this);
      this.fX();
   }

   public sj gi() {
      return this.dP;
   }

   public zk gj() {
      return this.Cn;
   }

   public static boolean gk() {
      return BH != null && BH.Br.ru;
   }

   public void gl() {
      ArrayList var1 = Lists.newArrayList(this.Bu);

      for(uX var3 : this.BY.tD()) {
         var1.add(var3.tI());
      }

      if (this.BY.ty() != null) {
         var1.add(this.BY.ty());
      }

      try {
         this.BI.y(var1);
      } catch (RuntimeException var4) {
         BV.info(p.q[-16149 & 2283], var4);
         var1.clear();
         var1.addAll(this.Bu);
         this.BY.o(Collections.emptyList());
         this.BI.y(var1);
         this.Br.ayS.clear();
         this.Br.aDv.clear();
         this.Br.uG();
      }

      this.BD.u(var1);
      if (this.Cv != null) {
         this.Cv.oH();
      }

   }
}
