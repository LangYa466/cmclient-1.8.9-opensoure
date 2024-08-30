import java.text.SimpleDateFormat;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

public class aeD extends kf {
   private int dnf = -1 & -1;
   private iU dng = null;
   private aeG dnh = null;
   private static final SimpleDateFormat dni = new SimpleDateFormat(q.q[-18753 & -32066 & 28398 & 5358]);
   private aeE dnj = null;
   private iU NS = null;
   private iU dnk = null;
   private CompletableFuture dnl = null;
   private final kf dnm;
   private ExecutorService cYj = null;

   // $FF: synthetic method
   static int q(aeD var0, int var1) {
      return var0.dnf = var1;
   }

   // $FF: synthetic method
   static iS q(aeD var0) {
      return var0.CB;
   }

   public aeD(kf var1, aeG var2) {
      this.dnm = var1;
      this.dnh = var2;
   }

   public void aL() {
      Keyboard.enableRepeatEvents((boolean)(97 & 9088));
      if (this.dnl != null && !this.dnl.isDone()) {
         this.dnl.cancel((boolean)(-23433 & 23041));
         this.cYj.shutdownNow();
      }

   }

   protected void q(char var1, int var2) {
      switch(var2) {
      case 1:
         this.q(this.dnk);
         break;
      case 28:
         this.q(this.dng);
         break;
      case 200:
         if (this.dnf > 0) {
            this.dnf -= -24567 & 16513;
            if (jB()) {
               aez.cm(this.dnf, this.dnf + (385 & 605));
               aez.aa();
            }
         }
         break;
      case 208:
         if (this.dnf < aez.size() - (449 & -15343)) {
            this.dnf += 9 & -13631;
            if (jB()) {
               aez.cm(this.dnf, this.dnf - (16481 & 5377));
               aez.aa();
            }
         }
         break;
      case 211:
         this.q(this.NS);
      }

      if (aM(var2) && this.dnf >= 0) {
         U(aez.kO(this.dnf).XD());
      }

   }

   public void q(int var1, int var2, float var3) {
      if (this.dnj != null) {
         this.dnj.q(var1, var2, var3);
      }

      super.q(var1, var2, var3);
      iS var10001 = this.CB;
      String var10002 = q.q[-16213 & 752 & -4357 & -28933];
      Object[] var10003 = new Object[319 & 4225];
      var10003[8192 & 18054] = aez.size();
      this.w(var10001, aeH.hX(String.format(var10002, var10003)), this.eo / (11570 & -12093), -31660 & 26646, -1 & -1);
      pz.nx();
      var10001 = this.CB;
      var10002 = q.q[6333 & -26449 & 20451 & 1191];
      var10003 = new Object[4225 & 1097];
      var10003[-24568 & 17] = aeC.fD().XD();
      this.w(var10001, aeH.hX(String.format(var10002, var10003)), this.eo / (6402 & -15861), (404 & 52) + this.CB.Gf, -1 & -1);
      pz.oe();
      if (this.dnh != null && !this.dnh.atY()) {
         String var4 = this.dnh.getMessage();
         pz.nx();
         iT.q(this.G.Cx.eo / (6 & 4026) - this.G.CB.K(var4) / (10250 & -16381) - (9323 & 147), 36 & 262, this.G.Cx.eo / (9362 & 35) + this.G.CB.K(var4) / (-15094 & 150) + (12419 & 17423), (1815 & 16399) + this.G.CB.Gf + (1026 & -17909), 1823473672 & -469692349);
         this.G.Cx.w(this.G.CB, this.dnh.getMessage(), this.G.Cx.eo / (-32342 & 12307), 12327 & 3783, -1 & -1);
         pz.oe();
      }

   }

   // $FF: synthetic method
   static void q(aeD var0, PJ var1, int var2, int var3, int var4) {
      var0.q(var1, var2, var3, var4);
   }

   public aeD(kf var1) {
      this.dnm = var1;
   }

   // $FF: synthetic method
   static iU w(aeD var0) {
      return var0.dng;
   }

   private void q(PJ var1, int var2, int var3, int var4) {
      pz.nX();
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      this.G.fJ().o(var1);
      iT.q(var2, var3, 0.0F, 0.0F, var4, var4, (float)var4, (float)var4);
      pz.nz();
   }

   // $FF: synthetic method
   static iS e(aeD var0) {
      return var0.CB;
   }

   public void aJ() {
      this.dnj.aJ();
      super.aJ();
   }

   protected void q(iU var1) {
      if (var1 != null) {
         if (var1.aM) {
            switch(var1.aq) {
            case 0:
               if (this.dnl == null || this.dnl.isDone()) {
                  if (this.cYj == null) {
                     this.cYj = Executors.newSingleThreadExecutor();
                  }

                  aeA var2 = aez.kO(this.dnf);
                  String var3 = StringUtils.isBlank(var2.XD()) ? q.q[22755 & -29 & 23010 & -31837] : var2.XD();
                  AtomicReference var4 = new AtomicReference(q.q[23849 & 7661 & 16960 & 24904]);
                  AtomicReference var5 = new AtomicReference(q.q[10674 & -23002 & 4416 & -2832]);
                  String var10003 = q.q[-21329 & -19221 & 4579 & 8951];
                  Object[] var10004 = new Object[-15743 & 2049];
                  var10004[-30720 & 24598] = var3;
                  this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), -1L & -1L);
                  this.dnl = aeB.q(var2.atT(), this.cYj).handle((var2x, var3x) -> {
                     if (var2x != null) {
                        var2.hF(var2x.XD());
                        aez.aa();
                        aeC.q(var2x);
                        String var10003 = q.q[-14171 & 7093 & 5607 & 29175];
                        Object[] var10004 = new Object[-32759 & 4515];
                        var10004[0 & 17687] = var2.XD();
                        this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), 4458775811341800332L & -4458775811989170296L);
                        return Boolean.valueOf((boolean)(8193 & 9));
                     } else {
                        return Boolean.valueOf((boolean)(-16320 & 8614));
                     }
                  }).thenComposeAsync((var3x) -> {
                     if (var3x.booleanValue()) {
                        throw new NoSuchElementException();
                     } else {
                        String var10003 = q.q[5565 & 13565 & -21777 & 2813];
                        Object[] var10004 = new Object[-32495 & 6895];
                        var10004[13319 & -16256] = var3;
                        this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), -1L & -1L);
                        return aeB.t(var2.atV(), this.cYj);
                     }
                  }).thenComposeAsync((var3x) -> {
                     String var10003 = q.q[16554 & 24750 & -18518 & -3410];
                     Object[] var10004 = new Object[2561 & 28865];
                     var10004[-27884 & 18529] = var3;
                     this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), -1L & -1L);
                     var4.set(var3x.get(q.q[8891 & -5445 & 20975 & 6847]));
                     return aeB.e((String)var3x.get(q.q[28077 & -29012 & 24748 & -2324]), this.cYj);
                  }).thenComposeAsync((var2x) -> {
                     String var10003 = q.q[-32277 & -27477 & 30205 & 12475];
                     Object[] var10004 = new Object[345 & 5153];
                     var10004[-18430 & 17152] = var3;
                     this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), -1L & -1L);
                     return aeB.r(var2x, this.cYj);
                  }).thenComposeAsync((var2x) -> {
                     String var10003 = q.q[16295 & 3046 & 25511 & 24758];
                     Object[] var10004 = new Object[1035 & 18453];
                     var10004[18698 & -28556] = var3;
                     this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), -1L & -1L);
                     return aeB.q((String)var2x.get(q.q[8695 & 12799 & -30801 & -24913]), (String)var2x.get(q.q[8380 & 188 & -17493 & -16977]), this.cYj);
                  }).thenComposeAsync((var3x) -> {
                     String var10003 = q.q[26295 & -19801 & 27131 & 6643];
                     Object[] var10004 = new Object[-18031 & 513];
                     var10004[7545 & -15740] = var3;
                     this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), -1L & -1L);
                     var5.set(var3x);
                     return aeB.q(var3x, this.cYj);
                  }).thenAccept((var4x) -> {
                     var2.hE((String)var4.get());
                     var2.hG((String)var5.get());
                     var2.hF(var4x.XD());
                     var2.Q(System.currentTimeMillis());
                     aez.aa();
                     aeC.q(var4x);
                     String var10003 = q.q[4325 & 16869 & 28341 & 3765];
                     Object[] var10004 = new Object[16405 & 8931];
                     var10004[8832 & 16386] = var2.XD();
                     this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), 7866941142372889484L & -7866941143376456760L);
                  }).exceptionally((var2x) -> {
                     if (!(var2x.getCause() instanceof NoSuchElementException)) {
                        String var10003 = q.q[27124 & 8372 & -8985 & -21017];
                        Object[] var10004 = new Object[10 & -29805];
                        var10004[-16384 & 2273] = var2x.getMessage();
                        var10004[21507 & 2089] = var3;
                        this.dnh = new aeG(aeH.hX(String.format(var10003, var10004)), 3568845844709462938L & -3568845845944068152L);
                     }

                     return null;
                  });
               }
               break;
            case 1:
               this.G.r(new aeF(this.dnm));
               break;
            case 2:
               int var10000 = this.dnf;
               this.dnf -= 2233 & -27577;
               aez.kP(var10000);
               aez.aa();
               this.p();
               break;
            case 3:
               this.G.r(this.dnm);
               break;
            default:
               this.dnj.q(var1);
            }
         }

      }
   }

   public void o() {
      aez.x();
      Keyboard.enableRepeatEvents((boolean)(17027 & -32431));
      this.Mt.clear();
      this.Mt.add(this.dng = new iU(-30188 & 24809, this.eo / (9219 & -11438) - (1462 & -23914) - (559 & 23556), this.eC - (-32460 & 17142), 150 & 21406, -23785 & 7252, q.q[-32548 & -14657 & 17053 & 4319]));
      this.Mt.add(new iU(5505 & -32729, this.eo / (9486 & 16962) + (-30412 & 24716), this.eC - (12020 & -28355), -26217 & 150, -13612 & 13597, q.q[6909 & 7069 & 29183 & -24097]));
      this.Mt.add(this.NS = new iU(307 & 25226, this.eo / (-27053 & 16426) - (17334 & -32618) - (28820 & 1060), this.eC - (-28323 & 17436), 3743 & 8694, 150 & -18380, q.q[9726 & 15614 & 16543 & 29598]));
      this.Mt.add(this.dnk = new iU(-32637 & 595, this.eo / (626 & -28414) + (1927 & 12), this.eC - (-25732 & 1055), 27062 & -31594, 52 & 4188, q.q[25055 & 15103 & -9985 & -11105]));
      this.dnj = new aeE(this, this.G);
      this.dnj.v(10315 & 4399, 7452 & 142);
      this.p();
   }

   // $FF: synthetic method
   static int r(aeD var0) {
      return var0.dnf;
   }

   // $FF: synthetic method
   static SimpleDateFormat atX() {
      return dni;
   }

   public void p() {
      if (this.dng != null && this.NS != null) {
         this.dng.aM = this.NS.aM = (boolean)(this.dnf >= 0 ? 8833 & 4355 : 2576 & 9222);
         if (this.dnl != null && !this.dnl.isDone()) {
            this.dng.aM = (boolean)(2097 & 20806);
         }
      }

   }

   // $FF: synthetic method
   static iS t(aeD var0) {
      return var0.CB;
   }
}
