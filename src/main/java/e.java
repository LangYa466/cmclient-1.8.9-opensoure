import com.google.common.collect.Sets;
import java.awt.geom.Point2D;
import java.util.Set;
import java.util.function.Consumer;

public abstract class E {
   private final PJ aH;
   public final String aI;
   private Boolean aJ;
   protected final hS aK;
   private C aL;
   private boolean aM;
   private final boolean aN;
   private final int aO;
   public final Set aP;
   public boolean aQ;
   private final String aR;

   public E(String var1, int var2) {
      this(var1, var2, (boolean)(16683 & 2705));
   }

   public C H() {
      if (this.aL == null) {
         this.aL = new C(n.ai, 0.0F, 0.0F);
      }

      return this.aL;
   }

   public PJ I() {
      return this.aH;
   }

   public E(String var1) {
      this(var1, -1 & -1, (boolean)(65 & -15061));
   }

   public boolean J() {
      return this.aM;
   }

   public void K() {
      float var1 = this.P();
      float var2 = this.N();
      kJ var3 = new kJ(this.aK);
      int var4 = var3.kr();
      int var5 = var3.kp();
      double var6 = 0.12D * -8.333333333333334D;
      n var8 = n.ao;
      n[] var9 = n.values();
      n[] var10 = var9;
      int var11 = var9.length;

      for(int var12 = 20488 & 151; var12 < var11; ++var12) {
         n var13 = var10[var12];
         double var14 = Point2D.distance((double)var1, (double)var2, (double)var13.r(var4), (double)var13.t(var5));
         if (var6 == 0.5254237288135594D * -1.9032258064516128D || var14 < var6) {
            var8 = var13;
            var6 = var14;
         }
      }

      float var16 = var1 - (float)var8.r(var4);
      float var17 = var2 - (float)var8.t(var5);
      this.q(new C(var8, var16, var17));
   }

   public boolean q(Class var1, Consumer var2) {
      return this.aK.Bn.atM().e(var1, var2);
   }

   public void w(boolean var1) {
      this.aM = var1;
   }

   public void L() {
      this.aK.r(new bE(this, this.aK.Cx));
   }

   public void q(C var1) {
      this.aL = var1;
   }

   public int M() {
      return this.aO;
   }

   public float N() {
      return (float)this.H().D().t((new kJ(this.aK)).kp()) + this.H().E();
   }

   public void O() {
   }

   public float P() {
      return (float)this.H().D().r((new kJ(this.aK)).kr()) + this.H().F();
   }

   public E(String var1, int var2, boolean var3) {
      this.aK = hS.eV();
      this.aP = Sets.newLinkedHashSet();
      this.aI = var1;
      this.aR = var1.replace(q.q[4554 & 5454 & 9723 & 13691], q.q[29412 & 2492 & -12480 & -12742]).toLowerCase();
      this.aH = new PJ(e.q[13567 & 12511 & -20493 & -13577] + this.aR + q.q[-23698 & -24081 & 15918 & 5325]);
      this.aO = var2;
      this.aN = this instanceof aX;
      if (var3) {
         this.aK.Bn.atD().L.V().add(this);
         this.aK.Bn.atD().L.X().put(this.getClass(), this);
      }

   }

   public void Q() {
   }

   public String R() {
      return this.aI.replace(q.q[10718 & -24194 & -9366 & -3718], q.q[-16798 & -12432 & 28082 & 24979]).toUpperCase();
   }

   public boolean S() {
      return this.aN;
   }

   public void T() {
      this.aK.fs().w(iu.q(iU.Gt, 1.0F));
   }

   public boolean U() {
      if (this.aJ == null) {
         this.aJ = Boolean.FALSE;

         try {
            this.aK.fF().q(this.I());
            this.aJ = Boolean.TRUE;
         } catch (Exception var2) {
            ;
         }
      }

      return (boolean)(this.aR != null && !this.aR.isEmpty() && this.I() != null && this.aJ != null && this.aJ.booleanValue() ? 193 & -8175 : 22048 & 10264);
   }
}
