import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Sm implements RW {
   private final boolean ceI;
   private final boolean ceJ;
   private Tb ceK;
   private Tb ceL;
   private QI vR;
   private final hI[] ceM = new hI[256];
   private final List ceN = Lists.newArrayList();
   private final Su ceO;
   private Random aF;

   public void q(RQ var1, int var2, int var3) {
      for(Uj var5 : this.ceN) {
         var5.q(this, this.vR, var2, var3, (RU)null);
      }

   }

   public List q(zI var1, NW var2) {
      Rl var3 = this.vR.ai(var2);
      return var3.q(var1);
   }

   public RQ H(int var1, int var2) {
      RU var3 = new RU();

      for(int var4 = 0; var4 < this.ceM.length; ++var4) {
         hI var5 = this.ceM[var4];
         if (var5 != null) {
            for(int var6 = 0; var6 < 16; ++var6) {
               for(int var7 = 0; var7 < 16; ++var7) {
                  var3.q(var6, var4, var7, var5);
               }
            }
         }
      }

      for(Sx var10 : this.ceN) {
         var10.q(this, this.vR, var1, var2, var3);
      }

      RQ var9 = new RQ(this.vR, var3, var1, var2);
      Rl[] var11 = this.vR.ZB().q((Rl[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var12 = var9.abB();

      for(int var13 = 0; var13 < var12.length; ++var13) {
         var12[var13] = (byte)var11[var13].car;
      }

      var9.abS();
      return var9;
   }

   public boolean q(RW var1, RQ var2, int var3, int var4) {
      return false;
   }

   public boolean q(boolean var1, Pb var2) {
      return true;
   }

   public Sm(QI var1, long var2, boolean var4, String var5) {
      this.vR = var1;
      this.aF = new Random(var2);
      this.ceO = Su.dH(var5);
      if (var4) {
         Map var6 = this.ceO.acp();
         if (var6.containsKey(w.q[24858 & 283])) {
            Map var7 = (Map)var6.get(w.q[-32262 & 283]);
            if (!var7.containsKey(w.q[-24225 & 2331])) {
               var7.put(w.q[26939 & 283], w.q[2364 & 25437]);
            }

            this.ceN.add(new Up(var7));
         }

         if (var6.containsKey(w.q[8989 & -30305])) {
            this.ceN.add(new Uf((Map)var6.get(w.q[2333 & 16669])));
         }

         if (var6.containsKey(w.q[318 & 4894])) {
            this.ceN.add(new Uc((Map)var6.get(w.q[-29858 & 1310])));
         }

         if (var6.containsKey(w.q[25887 & -31777])) {
            this.ceN.add(new Uh((Map)var6.get(w.q[4383 & -23745])));
         }

         if (var6.containsKey(w.q[306 & 12717])) {
            this.ceN.add(new UW((Map)var6.get(w.q[-31967 & 12658])));
         }
      }

      if (this.ceO.acp().containsKey(w.q[4515 & 3937])) {
         this.ceL = new Tb(Ea.bgT);
      }

      if (this.ceO.acp().containsKey(w.q[4387 & -13974])) {
         this.ceK = new Tb(Ea.bkv);
      }

      this.ceI = this.ceO.acp().containsKey(w.q[-11933 & 311]);
      int var13 = 0;
      int var14 = 0;
      boolean var8 = true;

      for(Sv var10 : this.ceO.aco()) {
         for(int var11 = var10.acw(); var11 < var10.acw() + var10.acs(); ++var11) {
            hI var12 = var10.act();
            if (var12.ds() != Ea.bjN) {
               var8 = false;
               this.ceM[var11] = var12;
            }
         }

         if (var10.act().ds() == Ea.bjN) {
            var14 += var10.acs();
         } else {
            var13 += var10.acs() + var14;
            var14 = 0;
         }
      }

      var1.hk(var13);
      this.ceJ = var8 ? false : this.ceO.acp().containsKey(w.q[16687 & 1956]);
   }

   public RQ a(NW var1) {
      return this.H(var1.aY() >> 4, var1.KO() >> 4);
   }

   public NW q(QI var1, String var2, NW var3) {
      if (q.q[12862 & 2622].equals(var2)) {
         for(Uj var5 : this.ceN) {
            if (var5 instanceof Uh) {
               return var5.am(var1, var3);
            }
         }
      }

      return null;
   }

   public void lp() {
   }

   public int lo() {
      return 0;
   }

   public void q(RW var1, int var2, int var3) {
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      NW var6 = new NW(var4, 0, var5);
      Rl var7 = this.vR.ai(new NW(var4 + 16, 0, var5 + 16));
      boolean var8 = false;
      this.aF.setSeed(this.vR.Zn());
      long var9 = this.aF.nextLong() / 2L * 2L + 1L;
      long var11 = this.aF.nextLong() / 2L * 2L + 1L;
      this.aF.setSeed((long)var2 * var9 + (long)var3 * var11 ^ this.vR.Zn());
      Qn var13 = new Qn(var2, var3);

      for(Uj var15 : this.ceN) {
         boolean var16 = var15.q(this.vR, this.aF, var13);
         if (var15 instanceof Up) {
            var8 |= var16;
         }
      }

      if (this.ceL != null && !var8 && this.aF.nextInt(4) == 0) {
         this.ceL.w(this.vR, this.aF, var6.C(this.aF.nextInt(16) + 8, this.aF.nextInt(256), this.aF.nextInt(16) + 8));
      }

      if (this.ceK != null && !var8 && this.aF.nextInt(8) == 0) {
         NW var17 = var6.C(this.aF.nextInt(16) + 8, this.aF.nextInt(this.aF.nextInt(248) + 8), this.aF.nextInt(16) + 8);
         if (var17.aX() < this.vR.Zr() || this.aF.nextInt(10) == 0) {
            this.ceK.w(this.vR, this.aF, var17);
         }
      }

      if (this.ceI) {
         for(int var18 = 0; var18 < 8; ++var18) {
            (new SR()).w(this.vR, this.aF, var6.C(this.aF.nextInt(16) + 8, this.aF.nextInt(256), this.aF.nextInt(16) + 8));
         }
      }

      if (this.ceJ) {
         var7.q(this.vR, this.aF, var6);
      }

   }

   public String ln() {
      return w.q[17725 & 805];
   }

   public boolean E(int var1, int var2) {
      return true;
   }

   public boolean lq() {
      return false;
   }

   public boolean lr() {
      return true;
   }
}
