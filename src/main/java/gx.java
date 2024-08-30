import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Map.Entry;

public final class GX {
   private boolean bsE;
   private int bsF;
   private cv bsG;
   public int bsH;
   private boolean bsI;
   public static final DecimalFormat bsJ = new DecimalFormat(o.q[10213 & 1003]);
   private Fm bsK;
   public int bsL;
   private String bsM;
   private cv bsN;
   private BE bsO;
   private HL bsP;

   public boolean Hw() {
      return this.bsK.Hw();
   }

   public GX bD(String var1) {
      if (this.bsP == null) {
         this.bsP = new HL();
      }

      if (!this.bsP.d(q.q[1339 & 8543], 10)) {
         this.bsP.w(q.q[17819 & -20165], new HL());
      }

      this.bsP.bO(q.q[19359 & 13595]).a(q.q[447 & 431], var1);
      return this;
   }

   public boolean D(cv var1) {
      if (var1 == this.bsG) {
         return this.bsE;
      } else {
         this.bsG = var1;
         if (this.HZ() && this.bsP.d(o.q[3031 & 991], 9)) {
            HT var2 = this.bsP.s(o.q[-15393 & 5079], 8);

            for(int var3 = 0; var3 < var2.II(); ++var3) {
               cv var4 = cv.z(var2.fy(var3));
               if (var4 == var1) {
                  this.bsE = true;
                  return true;
               }
            }
         }

         this.bsE = false;
         return false;
      }
   }

   public Fm do1() {
      return this.bsK;
   }

   public boolean HS() {
      return this.bsP != null && this.bsP.d(q.q[4447 & 283], 10) && this.bsP.bO(q.q[3387 & 795]).d(q.q[12719 & 959], 8);
   }

   public GX fp(int var1) {
      GX var2 = new GX(this.bsK, var1, this.bsF);
      if (this.bsP != null) {
         var2.bsP = (HL)this.bsP.IA();
      }

      this.bsH -= var1;
      return var2;
   }

   public void r(BE var1) {
      this.bsO = var1;
   }

   public GX(Fm var1, int var2, int var3) {
      this.bsG = null;
      this.bsE = false;
      this.bsN = null;
      this.bsI = false;
      this.bsK = var1;
      this.bsH = var2;
      this.bsF = var3;
      if (this.bsF < 0) {
         this.bsF = 0;
      }

   }

   public boolean HT() {
      return this.do1().Hy();
   }

   public boolean HU() {
      return this.do1().Q(this) && !this.Ib();
   }

   public boolean HV() {
      return this.bsO != null;
   }

   public String cM() {
      return this.bsK.N(this);
   }

   public GX HW() {
      GX var1 = new GX(this.bsK, this.bsH, this.bsF);
      if (this.bsP != null) {
         var1.bsP = (HL)this.bsP.IA();
      }

      return var1;
   }

   public void q(QI var1, cv var2, NW var3, DD var4) {
      boolean var5 = this.bsK.q(this, var1, var2, var3, var4);
      if (var5) {
         var4.w(Nj.bKl[Fm.s(this.bsK)]);
      }

   }

   public OX hN() {
      Oo var1 = new Oo(this.tg());
      if (this.HS()) {
         var1.Vw().t(Boolean.valueOf(true));
      }

      OX var2 = (new Oo(w.q[17395 & -30283])).f(var1).da(q.q[924 & 17372]);
      if (this.bsK != null) {
         HL var3 = new HL();
         this.z(var3);
         var2.Vw().q(new DY(DZ.bgJ, new Oo(var3.toString())));
         var2.Vw().w(this.Ij().bqM);
      }

      return var2;
   }

   public boolean ai(GX var1) {
      return var1 != null && this.bsK == var1.bsK && this.bsF == var1.bsF;
   }

   public void fq(int var1) {
      if (!this.HZ()) {
         this.bsP = new HL();
      }

      this.bsP.a(o.q[9182 & -11297], var1);
   }

   public void HX() {
      if (this.bsP != null && this.bsP.d(q.q[-14049 & 923], 10)) {
         HL var1 = this.bsP.bO(q.q[4379 & 17759]);
         var1.bU(q.q[1967 & 4543]);
         if (var1.Ix()) {
            this.bsP.bU(q.q[10655 & 283]);
            if (this.bsP.Ix()) {
               this.l((HL)null);
            }
         }
      }

   }

   public void q(QI var1, DD var2, int var3) {
      var2.q(Nj.bKp[Fm.s(this.bsK)], var3);
      this.bsK.w(this, var1, var2);
   }

   public GX(cv var1, int var2) {
      this(var1, var2, 0);
   }

   public Fj HY() {
      return this.do1().W(this);
   }

   public boolean HZ() {
      return this.bsP != null;
   }

   public void d(Fm var1) {
      this.bsK = var1;
   }

   public GX(Fm var1) {
      this(var1, 1);
   }

   public List r(DD var1, boolean var2) {
      ArrayList var3 = Lists.newArrayList();
      String var4 = this.tg();
      if (this.HS()) {
         var4 = OJ.bQr + var4;
      }

      var4 = var4 + OJ.bQs;
      if (var2) {
         String var5 = q.q[-16068 & 12354];
         if (var4.length() > 0) {
            var4 = var4 + w.q[821 & 19316];
            var5 = w.q[1311 & 2077];
         }

         int var6 = Fm.s(this.bsK);
         if (this.Hw()) {
            var4 = var4 + String.format(o.q[976 & 985], var6, this.bsF, var5);
         } else {
            var4 = var4 + String.format(o.q[-31791 & 5105], var6, var5);
         }
      } else if (!this.HS() && this.bsK == Et.bmM) {
         var4 = var4 + t.q[22699 & -23413] + this.bsF;
      }

      var3.add(var4);
      int var15 = 0;
      if (this.HZ() && this.bsP.d(o.q[978 & -25633], 99)) {
         var15 = this.bsP.bQ(o.q[2011 & -27694]);
      }

      if ((var15 & 32) == 0) {
         this.bsK.q(this, var1, var3, var2);
      }

      if (this.HZ()) {
         if ((var15 & 1) == 0) {
            HT var16 = this.Im();
            if (var16 != null) {
               for(int var7 = 0; var7 < var16.II(); ++var7) {
                  short var8 = var16.fv(var7).bI(w.q[-16067 & 6845]);
                  short var9 = var16.fv(var7).bI(r.q[-15498 & 6002]);
                  if (yH.dt(var8) != null) {
                     var3.add(yH.dt(var8).dq(var9));
                  }
               }
            }
         }

         if (this.bsP.d(q.q[16795 & 3359], 10)) {
            HL var17 = this.bsP.bO(q.q[1819 & 2331]);
            if (var17.d(q.q[415 & 23967], 3)) {
               if (var2) {
                  var3.add(o.q[1023 & 20435] + Integer.toHexString(var17.bQ(q.q[18847 & 4575])).toUpperCase());
               } else {
                  var3.add(OJ.bQr + PO.dn(o.q[-15396 & 3029]));
               }
            }

            if (var17.bT(o.q[-22531 & 5079]) == 9) {
               HT var19 = var17.s(o.q[18391 & 9173], 8);
               if (var19.II() > 0) {
                  for(int var23 = 0; var23 < var19.II(); ++var23) {
                     var3.add(OJ.bQc + q.q[2085 & 24592] + OJ.bQr + var19.fy(var23));
                  }
               }
            }
         }
      }

      Multimap var18 = this.Il();
      if (!var18.isEmpty() && (var15 & 2) == 0) {
         var3.add(q.q[-12990 & 8325]);

         for(Entry var24 : var18.entries()) {
            Bf var27 = (Bf)var24.getValue();
            double var10 = var27.Bj();
            if (var27.Bk() == Fm.bqY) {
               var10 += (double)yS.q(this, zH.aRI);
            }

            double var12;
            if (var27.Bi() != 1 && var27.Bi() != 2) {
               var12 = var10;
            } else {
               var12 = var10 * 100.0D;
            }

            if (var10 > 0.0D) {
               var3.add(OJ.bQg + PO.e(e.q[121 & -3735] + var27.Bi(), bsJ.format(var12), PO.dn(e.q[3434 & -24454] + (String)var24.getKey())));
            } else if (var10 < 0.0D) {
               var12 = var12 * -1.0D;
               var3.add(OJ.bQj + PO.e(e.q[-28805 & 4203] + var27.Bi(), bsJ.format(var12), PO.dn(e.q[17019 & 106] + (String)var24.getKey())));
            }
         }
      }

      if (this.HZ() && this.Ie().bL(o.q[17359 & 7135]) && (var15 & 4) == 0) {
         var3.add(OJ.bQg + PO.dn(o.q[-27658 & 17366]));
      }

      if (this.HZ() && this.bsP.d(o.q[-23585 & 7127], 9) && (var15 & 8) == 0) {
         HT var21 = this.bsP.s(o.q[10231 & -31777], 8);
         if (var21.II() > 0) {
            var3.add(q.q[17067 & 13568]);
            var3.add(OJ.bQe + PO.dn(o.q[5117 & 27610]));

            for(int var25 = 0; var25 < var21.II(); ++var25) {
               cv var28 = cv.z(var21.fy(var25));
               if (var28 != null) {
                  var3.add(OJ.bQf + var28.cP());
               } else {
                  var3.add(OJ.bQf + q.q[21359 & -29841]);
               }
            }
         }
      }

      if (this.HZ() && this.bsP.d(o.q[17369 & -25637], 9) && (var15 & 16) == 0) {
         HT var22 = this.bsP.s(o.q[989 & -31783], 8);
         if (var22.II() > 0) {
            var3.add(q.q[8216 & 4419]);
            var3.add(OJ.bQe + PO.dn(o.q[9182 & 23547]));

            for(int var26 = 0; var26 < var22.II(); ++var26) {
               cv var29 = cv.z(var22.fy(var26));
               if (var29 != null) {
                  var3.add(OJ.bQf + var29.cP());
               } else {
                  var3.add(OJ.bQf + q.q[9199 & 23407]);
               }
            }
         }
      }

      if (var2) {
         if (this.Ih()) {
            var3.add(o.q[-31781 & 29659] + (this.Hz() - this.Ik()) + o.q[12124 & 16717] + this.Hz());
         }

         var3.add(OJ.bQf + ((PJ)Fm.bqX.z(this.bsK)).toString());
         if (this.HZ()) {
            var3.add(OJ.bQf + o.q[1020 & -27682] + this.Ie().IG().size() + o.q[22493 & 3037]);
         }
      }

      return var3;
   }

   public String toString() {
      return this.bsH + q.q[595 & 3415] + this.bsK.cM() + e.q[2364 & -27460] + this.bsF;
   }

   public boolean Ia() {
      return this.do1().R(this);
   }

   public boolean Ib() {
      return this.bsP != null && this.bsP.d(t.q[8888 & -27972], 9);
   }

   public boolean aj(GX var1) {
      return this.al(var1);
   }

   public BE Ic() {
      return this.bsO;
   }

   public GX(Fm var1, int var2) {
      this(var1, var2, 0);
   }

   public int Id() {
      return this.do1().Hn();
   }

   public boolean n(cv var1) {
      return this.bsK.n(var1);
   }

   public HL u(String var1, boolean var2) {
      if (this.bsP != null && this.bsP.d(var1, 10)) {
         return this.bsP.bO(var1);
      } else if (var2) {
         HL var3 = new HL();
         this.q(var1, var3);
         return var3;
      } else {
         return null;
      }
   }

   private GX() {
      this.bsG = null;
      this.bsE = false;
      this.bsN = null;
      this.bsI = false;
   }

   public GX(cv var1) {
      this(var1, 1);
   }

   public static boolean e(GX var0, GX var1) {
      return var0 == null && var1 == null || var0 != null && var1 != null && var0.ai(var1);
   }

   public boolean q(DD var1, QI var2, NW var3, OK var4, float var5, float var6, float var7) {
      boolean var8 = this.do1().q(this, var1, var2, var3, var4, var5, var6, var7);
      if (var8) {
         var1.w(Nj.bKl[Fm.s(this.bsK)]);
      }

      return var8;
   }

   public GX(cv var1, int var2, int var3) {
      this(Fm.C(var1), var2, var3);
   }

   public HL Ie() {
      return this.bsP;
   }

   public boolean q(DD var1, zz var2) {
      return this.bsK.q(this, var1, var2);
   }

   public boolean g(cv var1) {
      if (var1 == this.bsN) {
         return this.bsI;
      } else {
         this.bsN = var1;
         if (this.HZ() && this.bsP.d(o.q[-23555 & 4059], 9)) {
            HT var2 = this.bsP.s(o.q[2041 & -23589], 8);

            for(int var3 = 0; var3 < var2.II(); ++var3) {
               cv var4 = cv.z(var2.fy(var3));
               if (var4 == var1) {
                  this.bsI = true;
                  return true;
               }
            }
         }

         this.bsI = false;
         return false;
      }
   }

   public boolean If() {
      return this.bsK != null && this.bsK.Hz() > 0 && (!this.HZ() || !this.Ie().bL(o.q[1999 & -25617]));
   }

   public boolean Ig() {
      return this.Id() > 1 && (!this.If() || !this.Ih());
   }

   public void w(int var1, zz var2) {
      if ((!(var2 instanceof DD) || !((DD)var2).bdO.bfz) && this.If() && this.r(var1, var2.zY())) {
         var2.v(this);
         --this.bsH;
         if (var2 instanceof DD) {
            DD var3 = (DD)var2;
            var3.w(Nj.bJW[Fm.s(this.bsK)]);
            if (this.bsH == 0 && this.do1() instanceof FR) {
               var3.FG();
            }
         }

         if (this.bsH < 0) {
            this.bsH = 0;
         }

         this.bsF = 0;
      }

   }

   public void l(HL var1) {
      this.bsP = var1;
   }

   public static boolean r(GX var0, GX var1) {
      return var0 == null && var1 == null || var0 != null && var1 != null && (var0.bsP != null || var1.bsP == null) && (var0.bsP == null || var0.bsP.equals(var1.bsP));
   }

   public boolean Ih() {
      return this.If() && this.bsF > 0;
   }

   public void w(QI var1, DD var2, int var3) {
      this.do1().q(this, var1, var2, var3);
   }

   public GX q(QI var1, DD var2) {
      return this.do1().q(this, var1, var2);
   }

   public int Ii() {
      return this.HZ() && this.bsP.d(o.q[19422 & -30754], 3) ? this.bsP.bQ(o.q[2014 & -15394]) : 0;
   }

   public Fl Ij() {
      return this.do1().P(this);
   }

   public void w(HL var1) {
      if (var1.d(w.q[2175 & -4035], 8)) {
         this.bsK = Fm.bA(var1.bG(w.q[10429 & 383]));
      } else {
         this.bsK = Fm.fe(var1.bI(w.q[-32707 & 445]));
      }

      this.bsH = var1.bN(o.q[21468 & 12236]);
      this.bsF = var1.bI(o.q[989 & -18481]);
      if (this.bsF < 0) {
         this.bsF = 0;
      }

      if (var1.d(o.q[21454 & 11214], 10)) {
         this.bsP = var1.bO(o.q[974 & 3070]);
         if (this.bsK != null) {
            this.bsK.j(this.bsP);
         }
      }

   }

   public static GX ak(GX var0) {
      return var0 == null ? null : var0.HW();
   }

   public static boolean t(GX var0, GX var1) {
      return var0 == null && var1 == null || var0 != null && var1 != null && var0.al(var1);
   }

   public void fr(int var1) {
      this.bsF = var1;
      if (this.bsF < 0) {
         this.bsF = 0;
      }

   }

   public HL z(HL var1) {
      PJ var2 = (PJ)Fm.bqX.z(this.bsK);
      var1.a(w.q[383 & 61], var2 == null ? o.q[-31797 & 5071] : var2.toString());
      var1.q(o.q[3020 & 9180], (byte)this.bsH);
      var1.q(o.q[-15411 & 5101], (short)this.bsF);
      if (this.bsP != null) {
         var1.w(o.q[30670 & 990], this.bsP);
      }

      return var1;
   }

   public int Hz() {
      return this.bsK.Hz();
   }

   public int Ik() {
      return this.bsF;
   }

   public int dm() {
      return this.bsF;
   }

   public void q(zz var1, DD var2) {
      boolean var3 = this.bsK.q(this, var1, var2);
      if (var3) {
         var2.w(Nj.bKl[Fm.s(this.bsK)]);
      }

   }

   public boolean r(int var1, Random var2) {
      if (!this.If()) {
         return false;
      } else {
         if (var1 > 0) {
            int var3 = yS.w(yH.aMp.aMr, this);
            int var4 = 0;

            for(int var5 = 0; var3 > 0 && var5 < var1; ++var5) {
               if (yP.q(this, var3, var2)) {
                  ++var4;
               }
            }

            var1 -= var4;
            if (var1 <= 0) {
               return false;
            }
         }

         this.bsF += var1;
         return this.bsF > this.Hz();
      }
   }

   public GX w(QI var1, DD var2) {
      return this.do1().e(this, var1, var2);
   }

   public Multimap Il() {
      Object var1;
      if (this.HZ() && this.bsP.d(o.q[11231 & 21471], 9)) {
         var1 = HashMultimap.create();
         HT var2 = this.bsP.s(o.q[3039 & 22495], 10);

         for(int var3 = 0; var3 < var2.II(); ++var3) {
            HL var4 = var2.fv(var3);
            Bf var5 = zR.d(var4);
            if (var5 != null && var5.Bk().getLeastSignificantBits() != 0L && var5.Bk().getMostSignificantBits() != 0L) {
               ((Multimap)var1).put(var4.bG(o.q[-25626 & 9192]), var5);
            }
         }
      } else {
         var1 = this.do1().Ht();
      }

      return (Multimap)var1;
   }

   public HT Im() {
      return this.bsP == null ? null : this.bsP.s(t.q[-22532 & 696], 10);
   }

   public float m(cv var1) {
      return this.do1().q(this, var1);
   }

   public void q(QI var1, zk var2, int var3, boolean var4) {
      if (this.bsL > 0) {
         --this.bsL;
      }

      this.bsK.q(this, var1, var2, var3, var4);
   }

   public static GX x(HL var0) {
      GX var1 = new GX();
      var1.w(var0);
      return var1.do1() != null ? var1 : null;
   }

   public String tg() {
      if (this.bsM != null) {
         return this.bsM;
      } else {
         String var1 = this.do1().O(this);
         if (this.bsP != null && this.bsP.d(q.q[11035 & 315], 10)) {
            HL var2 = this.bsP.bO(q.q[23963 & 9051]);
            if (var2.d(q.q[-31313 & 11263], 8)) {
               var1 = var2.bG(q.q[17839 & 6575]);
            }
         }

         this.bsM = var1;
         return var1;
      }
   }

   public int In() {
      return this.do1().U(this);
   }

   private boolean al(GX var1) {
      return this.bsH == var1.bsH && this.bsK == var1.bsK && this.bsF == var1.bsF && (this.bsP != null || var1.bsP == null) && (this.bsP == null || this.bsP.equals(var1.bsP));
   }

   public void q(String var1, HE var2) {
      if (this.bsP == null) {
         this.l(new HL());
      }

      this.bsP.w(var1, var2);
   }

   public void w(yH var1, int var2) {
      if (this.bsP == null) {
         this.l(new HL());
      }

      if (!this.bsP.d(t.q[2810 & -32068], 9)) {
         this.bsP.w(t.q[6138 & 8892], new HT());
      }

      HT var3 = this.bsP.s(t.q[1978 & 2812], 10);
      HL var4 = new HL();
      var4.q(w.q[27197 & -31299], (short)var1.aMr);
      var4.q(r.q[890 & -11402], (short)((byte)var2));
      var3.q(var4);
   }
}
