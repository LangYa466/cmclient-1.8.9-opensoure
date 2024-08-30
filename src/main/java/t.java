import java.awt.Color;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class T extends E {
   public final bI cx;
   public final bI cy;
   public final bI cz;
   public final bI cA;
   public final bI cB;
   private final PJ cC = new PJ(w.q[5055 & -19475 & 15852 & 2412]);
   private final String[] cD;
   public final bI cE;
   public final bI cF;
   public final bI cG;
   public final bI cH;
   public final bI cI;

   public void q(ago var1) {
      if (this.J() && this.cI.af() && this.aK.CM != null) {
         OX var2 = var1.Nk();
         String var3 = var2.Vv();
         Stream var10000 = Stream.of(this.cD);
         var3.getClass();
         if (!var10000.anyMatch(var3::contains)) {
            if (var3.contains(this.aK.CM.hl())) {
               this.aK.fs().w(iu.q(this.cC, 1.0F));
            }

         }
      }
   }

   public T() {
      super(u.q[3935 & 19415 & 22002 & 24063], 271 & 254);
      String[] var10001 = new String[-32245 & 17491];
      var10001[-32734 & 12037] = u.q[-17965 & -23213 & 4479 & 475];
      var10001[-17915 & 161] = u.q[-28169 & 988 & -24588 & -30860];
      var10001[4171 & 18434] = u.q[-4777 & -18049 & 16351 & 5981];
      this.cD = var10001;
      new bI(this, u.q[17366 & 25567 & -30370 & -23713]);
      this.cx = (new bI(this, u.q[18815 & 11103 & 19831 & 21887])).o((boolean)(81 & 9217));
      this.cB = (new bI(this, u.q[-15527 & 3417 & -29346 & 2395])).o((boolean)(8280 & 2052));
      this.cH = (new bI(this, u.q[-9383 & 31739 & -28839 & -28167])).o((new Color(-31732 & 688, 16386 & -24239, 936 & 65, 50 & 9279)).getRGB(), -32380 & 8257);
      this.cy = (new bI(this, u.q[-29349 & 1887 & -3750 & 16862])).o((boolean)(-32767 & 20883));
      this.cA = (new bI(this, u.q[9211 & -15525 & 14175 & -20101])).o((boolean)(16409 & -26173));
      this.cz = (new bI(this, u.q[8061 & -8737 & 10748 & 13788])).o((boolean)(579 & 429));
      this.cE = (new bI(this, u.q[4957 & -29731 & 7679 & -25089])).q(Integer.valueOf(2029 & 19434)).t(-32387 & 6244, 8344 & 24582, 18435 & 8777);
      this.cI = (new bI(this, u.q[-27682 & 17758 & 11262 & -5153])).o((boolean)(-9932 & 3));
      this.cF = (new bI(this, u.q[-31905 & -19617 & 12671 & 31199])).o((boolean)(-14845 & 385));
      this.cG = (new bI(this, u.q[-9247 & -12435 & -20126 & 13810])).q(Integer.valueOf(3 & 87)).t(-27391 & 16517, 4507 & 8746, -16087 & 1217);
      this.w((boolean)(9985 & -32623));
      this.aK.Bn.atM().e(ago.class, this::q);
      this.aK.Bn.atM().e(agr.class, this::q);
   }

   public float ae() {
      return aiz.e((float)this.cG.bk(), 1.0F, 0.35955057F * 27.8125F, 3.0909092E-4F * 3.235294F, 0.007045455F * 1.4193548F);
   }

   private void q(agr var1) {
      if (this.cA.af()) {
         this.aK.BZ.iA().iW();
      }

   }
}
