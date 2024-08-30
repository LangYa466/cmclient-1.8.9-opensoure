public class DJ implements EV {
   public boolean bfr;
   public GX[] bfs = new GX[4];
   private GX gv;
   public GX[] bft = new GX[36];
   public DD Dm;
   public int bfu;

   public void h(DD var1) {
   }

   public GX Gz() {
      return this.gv;
   }

   public float m(cv var1) {
      float var2 = 1.0F;
      if (this.bft[this.bfu] != null) {
         var2 *= this.bft[this.bfu].m(var1);
      }

      return var2;
   }

   public GX er(int var1) {
      GX[] var2 = this.bft;
      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.bfs;
      }

      return var2[var1];
   }

   public void vv() {
      this.bfr = true;
   }

   public GX ar(int var1, int var2) {
      GX[] var3 = this.bft;
      if (var1 >= this.bft.length) {
         var3 = this.bfs;
         var1 -= this.bft.length;
      }

      if (var3[var1] != null) {
         if (var3[var1].bsH <= var2) {
            GX var5 = var3[var1];
            var3[var1] = null;
            return var5;
         } else {
            GX var4 = var3[var1].fp(var2);
            if (var3[var1].bsH == 0) {
               var3[var1] = null;
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   private int t(Fm var1, int var2) {
      for(int var3 = 0; var3 < this.bft.length; ++var3) {
         if (this.bft[var3] != null && this.bft[var3].do1() == var1 && this.bft[var3].dm() == var2) {
            return var3;
         }
      }

      return -1;
   }

   public void aB(float var1) {
      var1 = var1 / 4.0F;
      if (var1 < 1.0F) {
         var1 = 1.0F;
      }

      for(int var2 = 0; var2 < this.bfs.length; ++var2) {
         if (this.bfs[var2] != null && this.bfs[var2].do1() instanceof FH) {
            this.bfs[var2].w((int)var1, this.Dm);
            if (this.bfs[var2].bsH == 0) {
               this.bfs[var2] = null;
            }
         }
      }

   }

   public int CC() {
      return 64;
   }

   public DJ(DD var1) {
      this.Dm = var1;
   }

   public void q(HT var1) {
      this.bft = new GX[36];
      this.bfs = new GX[4];

      for(int var2 = 0; var2 < var1.II(); ++var2) {
         HL var3 = var1.fv(var2);
         int var4 = var3.bN(q.q[-31253 & 461]) & 255;
         GX var5 = GX.x(var3);
         if (var5 != null) {
            if (var4 >= 0 && var4 < this.bft.length) {
               this.bft[var4] = var5;
            }

            if (var4 >= 100 && var4 < this.bfs.length + 100) {
               this.bfs[var4 - 100] = var5;
            }
         }
      }

   }

   public boolean A(cv var1) {
      if (var1.cB().en()) {
         return true;
      } else {
         GX var2 = this.er(this.bfu);
         return var2 != null ? var2.n(var1) : false;
      }
   }

   private int E(GX var1) {
      Fm var2 = var1.do1();
      int var3 = var1.bsH;
      int var4 = this.F(var1);
      if (var4 < 0) {
         var4 = this.GA();
      }

      if (var4 < 0) {
         return var3;
      } else {
         if (this.bft[var4] == null) {
            this.bft[var4] = new GX(var2, 0, var1.dm());
            if (var1.HZ()) {
               this.bft[var4].l((HL)var1.Ie().IA());
            }
         }

         int var5 = var3;
         if (var3 > this.bft[var4].Id() - this.bft[var4].bsH) {
            var5 = this.bft[var4].Id() - this.bft[var4].bsH;
         }

         if (var5 > this.CC() - this.bft[var4].bsH) {
            var5 = this.CC() - this.bft[var4].bsH;
         }

         if (var5 == 0) {
            return var3;
         } else {
            var3 = var3 - var5;
            this.bft[var4].bsH += var5;
            this.bft[var4].bsL = 5;
            return var3;
         }
      }
   }

   public OX dh() {
      return (OX)(this.dg() ? new Oo(this.bY()) : new Op(this.bY(), new Object[0]));
   }

   public int GA() {
      for(int var1 = 0; var1 < this.bft.length; ++var1) {
         if (this.bft[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   private int F(GX var1) {
      for(int var2 = 0; var2 < this.bft.length; ++var2) {
         if (this.bft[var2] != null && this.bft[var2].do1() == var1.do1() && this.bft[var2].Ig() && this.bft[var2].bsH < this.bft[var2].Id() && this.bft[var2].bsH < this.CC() && (!this.bft[var2].Hw() || this.bft[var2].dm() == var1.dm()) && GX.r(this.bft[var2], var1)) {
            return var2;
         }
      }

      return -1;
   }

   public void eT(int var1) {
      if (var1 > 0) {
         var1 = 1;
      }

      if (var1 < 0) {
         var1 = -1;
      }

      for(this.bfu -= var1; this.bfu < 0; this.bfu += 9) {
         ;
      }

      while(this.bfu >= 9) {
         this.bfu -= 9;
      }

   }

   public int q(Fm var1, int var2, int var3, HL var4) {
      int var5 = 0;

      for(int var6 = 0; var6 < this.bft.length; ++var6) {
         GX var7 = this.bft[var6];
         if (var7 != null && (var1 == null || var7.do1() == var1) && (var2 <= -1 || var7.dm() == var2) && (var4 == null || HX.q(var4, var7.Ie(), true))) {
            int var8 = var3 <= 0 ? var7.bsH : Math.min(var3 - var5, var7.bsH);
            var5 += var8;
            if (var3 != 0) {
               this.bft[var6].bsH -= var8;
               if (this.bft[var6].bsH == 0) {
                  this.bft[var6] = null;
               }

               if (var3 > 0 && var5 >= var3) {
                  return var5;
               }
            }
         }
      }

      for(int var9 = 0; var9 < this.bfs.length; ++var9) {
         GX var11 = this.bfs[var9];
         if (var11 != null && (var1 == null || var11.do1() == var1) && (var2 <= -1 || var11.dm() == var2) && (var4 == null || HX.q(var4, var11.Ie(), false))) {
            int var12 = var3 <= 0 ? var11.bsH : Math.min(var3 - var5, var11.bsH);
            var5 += var12;
            if (var3 != 0) {
               this.bfs[var9].bsH -= var12;
               if (this.bfs[var9].bsH == 0) {
                  this.bfs[var9] = null;
               }

               if (var3 > 0 && var5 >= var3) {
                  return var5;
               }
            }
         }
      }

      if (this.gv != null) {
         if (var1 != null && this.gv.do1() != var1) {
            return var5;
         }

         if (var2 > -1 && this.gv.dm() != var2) {
            return var5;
         }

         if (var4 != null && !HX.q(var4, this.gv.Ie(), false)) {
            return var5;
         }

         int var10 = var3 <= 0 ? this.gv.bsH : Math.min(var3 - var5, this.gv.bsH);
         var5 += var10;
         if (var3 != 0) {
            this.gv.bsH -= var10;
            if (this.gv.bsH == 0) {
               this.gv = null;
            }

            if (var3 > 0 && var5 >= var3) {
               return var5;
            }
         }
      }

      return var5;
   }

   public int zx() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.bfs.length; ++var2) {
         if (this.bfs[var2] != null && this.bfs[var2].do1() instanceof FH) {
            int var3 = ((FH)this.bfs[var2].do1()).brr;
            var1 += var3;
         }
      }

      return var1;
   }

   public void q(Fm var1, int var2, boolean var3, boolean var4) {
      GX var5 = this.GE();
      int var6 = var3 ? this.t(var1, var2) : this.o(var1);
      if (var6 >= 0 && var6 < 9) {
         this.bfu = var6;
      } else if (var4 && var1 != null) {
         int var7 = this.GA();
         if (var7 >= 0 && var7 < 9) {
            this.bfu = var7;
         }

         if (var5 == null || !var5.HU() || this.t(var5.do1(), var5.Ik()) != this.bfu) {
            int var8 = this.t(var1, var2);
            int var9;
            if (var8 >= 0) {
               var9 = this.bft[var8].bsH;
               this.bft[var8] = this.bft[this.bfu];
            } else {
               var9 = 1;
            }

            this.bft[this.bfu] = new GX(var1, var9, var2);
         }
      }

   }

   public void GB() {
      for(int var1 = 0; var1 < this.bft.length; ++var1) {
         if (this.bft[var1] != null) {
            this.Dm.q(this.bft[var1], true, false);
            this.bft[var1] = null;
         }
      }

      for(int var2 = 0; var2 < this.bfs.length; ++var2) {
         if (this.bfs[var2] != null) {
            this.Dm.q(this.bfs[var2], true, false);
            this.bfs[var2] = null;
         }
      }

   }

   public int bE(int var1) {
      return 0;
   }

   public boolean i(Fm var1) {
      int var2 = this.o(var1);
      if (var2 < 0) {
         return false;
      } else {
         if (--this.bft[var2].bsH <= 0) {
            this.bft[var2] = null;
         }

         return true;
      }
   }

   private int o(Fm var1) {
      for(int var2 = 0; var2 < this.bft.length; ++var2) {
         if (this.bft[var2] != null && this.bft[var2].do1() == var1) {
            return var2;
         }
      }

      return -1;
   }

   public boolean G(GX var1) {
      if (var1 != null && var1.bsH != 0 && var1.do1() != null) {
         try {
            if (var1.Ih()) {
               int var6 = this.GA();
               if (var6 >= 0) {
                  this.bft[var6] = GX.ak(var1);
                  this.bft[var6].bsL = 5;
                  var1.bsH = 0;
                  return true;
               } else if (this.Dm.bdO.bfz) {
                  var1.bsH = 0;
                  return true;
               } else {
                  return false;
               }
            } else {
               int var2;
               while(true) {
                  var2 = var1.bsH;
                  var1.bsH = this.E(var1);
                  if (var1.bsH <= 0 || var1.bsH >= var2) {
                     break;
                  }
               }

               if (var1.bsH == var2 && this.Dm.bdO.bfz) {
                  var1.bsH = 0;
                  return true;
               } else {
                  return var1.bsH < var2;
               }
            }
         } catch (Throwable var5) {
            xW var3 = xW.q(var5, t.q[17149 & -30752]);
            ye var4 = var3.bd(t.q[-23815 & 1763]);
            var4.w(t.q[738 & -29970], Integer.valueOf(Fm.s(var1.do1())));
            var4.w(t.q[739 & -9497], Integer.valueOf(var1.dm()));
            var4.q(t.q[-32027 & 3820], new DK(this, var1));
            throw new PI(var3);
         }
      } else {
         return false;
      }
   }

   public void K(int var1, int var2) {
   }

   public boolean p(Fm var1) {
      int var2 = this.o(var1);
      return var2 >= 0;
   }

   public GX es(int var1) {
      GX[] var2 = this.bft;
      if (var1 >= this.bft.length) {
         var2 = this.bfs;
         var1 -= this.bft.length;
      }

      if (var2[var1] != null) {
         GX var3 = var2[var1];
         var2[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public static int GC() {
      return 9;
   }

   public boolean t(int var1, GX var2) {
      return true;
   }

   public void clear() {
      for(int var1 = 0; var1 < this.bft.length; ++var1) {
         this.bft[var1] = null;
      }

      for(int var2 = 0; var2 < this.bfs.length; ++var2) {
         this.bfs[var2] = null;
      }

   }

   public void GD() {
      for(int var1 = 0; var1 < this.bft.length; ++var1) {
         if (this.bft[var1] != null) {
            this.bft[var1].q(this.Dm.vR, this.Dm, var1, this.bfu == var1);
         }
      }

   }

   public boolean H(GX var1) {
      for(int var2 = 0; var2 < this.bfs.length; ++var2) {
         if (this.bfs[var2] != null && this.bfs[var2].ai(var1)) {
            return true;
         }
      }

      for(int var3 = 0; var3 < this.bft.length; ++var3) {
         if (this.bft[var3] != null && this.bft[var3].ai(var1)) {
            return true;
         }
      }

      return false;
   }

   public void y(int var1, GX var2) {
      GX[] var3 = this.bft;
      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.bfs;
      }

      var3[var1] = var2;
   }

   public String bY() {
      return e.q[1247 & 4559];
   }

   public HT w(HT var1) {
      for(int var2 = 0; var2 < this.bft.length; ++var2) {
         if (this.bft[var2] != null) {
            HL var3 = new HL();
            var3.q(q.q[24011 & 461], (byte)var2);
            this.bft[var2].z(var3);
            var1.q(var3);
         }
      }

      for(int var4 = 0; var4 < this.bfs.length; ++var4) {
         if (this.bfs[var4] != null) {
            HL var5 = new HL();
            var5.q(q.q[-24115 & 21995], (byte)(var4 + 100));
            this.bfs[var4].z(var5);
            var1.q(var5);
         }
      }

      return var1;
   }

   public int CB() {
      return this.bft.length + 4;
   }

   public void I(GX var1) {
      this.gv = var1;
   }

   public int mL() {
      return 0;
   }

   public boolean g(DD var1) {
      return this.Dm.aNQ ? false : var1.B(this.Dm) <= 64.0D;
   }

   public GX eU(int var1) {
      return this.bfs[var1];
   }

   public GX GE() {
      return this.bfu < 9 && this.bfu >= 0 ? this.bft[this.bfu] : null;
   }

   public void f(DD var1) {
   }

   public boolean dg() {
      return false;
   }

   public void q(DJ var1) {
      for(int var2 = 0; var2 < this.bft.length; ++var2) {
         this.bft[var2] = GX.ak(var1.bft[var2]);
      }

      for(int var3 = 0; var3 < this.bfs.length; ++var3) {
         this.bfs[var3] = GX.ak(var1.bfs[var3]);
      }

      this.bfu = var1.bfu;
   }
}
