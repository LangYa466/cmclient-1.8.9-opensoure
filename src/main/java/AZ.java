import org.lwjgl.input.Mouse;

public abstract class aZ extends kx {
   protected long t;
   protected long hJ;
   protected float hK;

   public void q(iU var1) {
      if (var1.aM) {
         if (var1.aq == this.Op) {
            this.Oy -= (double)((float)(this.Om * (8359 & 346) / (-22493 & 16583)));
            this.Os = -1 & -2;
            if (!this.On.GX()) {
               this.On.GY();
            }
         } else if (var1.aq == this.OE) {
            this.Oy += (double)((float)(this.Om * (1282 & 8339) / (-22333 & 803)));
            this.Os = -2 & -2;
            if (!this.On.GX()) {
               this.On.GY();
            }
         }
      }

   }

   public void u(float var1) {
      this.i(this.hK + var1);
   }

   public void aJ() {
      if (this.aT(this.iy)) {
         int var1 = Mouse.getEventDWheel();
         if (var1 != 0) {
            if (var1 > 0) {
               var1 = 24983 & 2049;
            } else {
               var1 = -1 & -1;
            }

            if (this.OA <= (float)this.jV() && (double)var1 < 0.0D) {
               this.Oy += 1.1363636363636365D * 14.079999999999998D;
            }

            if ((double)this.OA >= 0.0D && (double)var1 > 0.0D) {
               this.Oy -= 0.6949152542372882D * 23.024390243902438D;
            }

            if (!this.On.GX()) {
               this.On.GY();
            }
         }
      }

   }

   public aZ(hS var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void w(int var1, int var2) {
   }

   public void aN() {
      if (this.aT(this.iy)) {
         if (Mouse.isButtonDown(-31216 & 4430) && this.jW()) {
            if (this.Os != (-1 & -1)) {
               if (this.Os >= 0) {
                  this.OA -= (float)(this.iy - this.Os) * this.Oo;
                  this.Os = this.iy;
               }
            } else {
               int var1 = 1733 & -32509;
               if (this.iy >= this.Ot && this.iy <= this.Oz) {
                  int var2 = (this.eo - this.iC()) / (274 & -29022);
                  int var3 = (this.eo + this.iC()) / (5282 & 22);
                  int var4 = this.iy - this.Ot - this.OC + (int)this.OA - (3141 & 24580);
                  int var5 = var4 / this.Om;
                  if (var5 < this.bh() && this.ix >= var2 && this.ix <= var3 && var5 >= 0 && var4 >= 0) {
                     int var6 = var5 == this.Ov && hS.fe() - this.Ox < (3515751102044837626L & 1357390074L) ? 16393 & 14051 : 19084 & -32734;
                     this.q(var5, (boolean)var6, this.ix, this.iy);
                     this.Ov = var5;
                     this.Ox = hS.fe();
                  } else if (this.ix >= var2 && this.ix <= var3 && var4 < 0) {
                     this.n(this.ix - var2, this.iy - this.Ot + (int)this.OA - (460 & 29222));
                     var1 = 24708 & 1058;
                  }

                  int var10 = this.bj() - (4623 & 19);
                  int var7 = var10 + (43 & -19645);
                  if (this.ix >= var10 && this.ix <= var7) {
                     this.Oo = -5.0F * 0.2F;
                     int var8 = this.jV();
                     if (var8 < (6401 & 16513)) {
                        var8 = -29167 & 4237;
                     }

                     int var9 = (int)((float)((this.Oz - this.Ot) * (this.Oz - this.Ot)) / (float)this.bi());
                     var9 = Pq.G(var9, 25121 & -32542, this.Oz - this.Ot - (18061 & 2312));
                     this.Oo /= (float)(this.Oz - this.Ot - var9) / (float)var8;
                  } else {
                     this.Oo = 1.0F;
                  }

                  if (var1 != 0) {
                     this.Os = this.iy;
                  } else {
                     this.Os = -2 & -2;
                  }
               } else {
                  this.Os = -1 & -2;
               }
            }
         } else {
            this.Os = -1 & -1;
         }

         if (Mouse.isButtonDown(-28668 & 256)) {
            this.jT();
         }
      }

   }

   public void q(int var1, int var2, float var3) {
      this.aN();
      this.jT();
      this.w(this.bj(), this.bj() + (-16381 & 2615));
   }

   public void i(float var1) {
      this.OA = var1;
   }
}
