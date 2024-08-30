import com.google.common.collect.Lists;
import java.util.List;

public class jx extends iT {
   private int JU;
   private iS JV;
   private List JW;
   private int JX;
   private boolean JY;
   public boolean hW = true;
   protected int JZ = 200;
   private int Ka;
   public int Kb;
   public int Kc;
   public int Kd;
   private int Ke;
   private boolean Kf;
   protected int Kg = 20;
   private int Kh;

   public void R(String var1) {
      this.JW.add(uI.q(var1));
   }

   protected void t(hS var1, int var2, int var3) {
      if (this.Kf) {
         int var4 = this.JZ + this.Ke * 2;
         int var5 = this.Kg + this.Ke * 2;
         int var6 = this.Kc - this.Ke;
         int var7 = this.Kb - this.Ke;
         q(var6, var7, var6 + var4, var7 + var5, this.Kh);
         this.w(var6, var6 + var4, var7, this.Ka);
         this.w(var6, var6 + var4, var7 + var5, this.JU);
         this.q(var6, var7, var7 + var5, this.Ka);
         this.q(var6 + var4, var7, var7 + var5, this.JU);
      }

   }

   public jx iD() {
      this.JY = true;
      return this;
   }

   public jx(iS var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.JV = var1;
      this.Kd = var2;
      this.Kc = var3;
      this.Kb = var4;
      this.JZ = var5;
      this.Kg = var6;
      this.JW = Lists.newArrayList();
      this.JY = false;
      this.Kf = false;
      this.JX = var7;
      this.Kh = -1;
      this.Ka = -1;
      this.JU = -1;
      this.Ke = 0;
   }

   public void y(hS var1, int var2, int var3) {
      if (this.hW) {
         pz.nX();
         pz.s(770, 771, 1, 0);
         this.t(var1, var2, var3);
         int var4 = this.Kb + this.Kg / 2 + this.Ke / 2;
         int var5 = var4 - this.JW.size() * 10 / 2;

         for(int var6 = 0; var6 < this.JW.size(); ++var6) {
            if (this.JY) {
               this.w(this.JV, (String)this.JW.get(var6), this.Kc + this.JZ / 2, var5 + var6 * 10, this.JX);
            } else {
               this.q(this.JV, (String)this.JW.get(var6), this.Kc, var5 + var6 * 10, this.JX);
            }
         }
      }

   }
}
