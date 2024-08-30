import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class adb implements acM {
   private float iH;
   private Color dge = Color.blue;
   private Color dgf = Color.cyan;
   private int dn;
   private boolean dgg;

   public void q(BufferedImage var1, Graphics2D var2, acC var3, acH var4) {
      int var5 = var3.aqs();
      float var6 = (float)var5 * this.iH;
      float var7 = (float)(-var4.aqx() + var3.aqp() + this.dn + var5 / (8194 & 17487)) - var6 / 2.0F;
      var2.setPaint(new GradientPaint(0.0F, var7, this.dgf, 0.0F, var7 + var6, this.dge, this.dgg));
      var2.fill(var4.aqy());
   }

   public Color aqJ() {
      return this.dgf;
   }

   public void aw(float var1) {
      this.iH = var1;
   }

   public Color aqK() {
      return this.dge;
   }

   public boolean aqL() {
      return this.dgg;
   }

   public float G() {
      return this.iH;
   }

   public int WY() {
      return this.dn;
   }

   public void ko(int var1) {
      this.dn = var1;
   }

   public void H(List var1) {
      for(acN var3 : var1) {
         if (var3.bY().equals(r.q[32687 & 17343 & -17489 & -27713])) {
            this.dgf = (Color)var3.bm();
         } else if (var3.bY().equals(r.q[-4104 & 17400 & 15293 & 15285])) {
            this.dge = (Color)var3.bm();
         } else if (var3.bY().equals(r.q[-4171 & -19463 & -28681 & 19443])) {
            this.dn = ((Integer)var3.bm()).intValue();
         } else if (var3.bY().equals(r.q[-21509 & -21569 & 24571 & -3085])) {
            this.iH = ((Float)var3.bm()).floatValue();
         } else if (var3.bY().equals(r.q[15285 & -29771 & -2113 & -73])) {
            this.dgg = ((Boolean)var3.bm()).booleanValue();
         }
      }

   }

   public adb(Color var1, Color var2, float var3) {
      this.dn = -32738 & 13313;
      this.iH = 1.0F;
      this.dgf = var1;
      this.dge = var2;
      this.iH = var3;
   }

   public void cL(boolean var1) {
      this.dgg = var1;
   }

   public List aqE() {
      ArrayList var1 = new ArrayList();
      var1.add(acP.q(r.q[20399 & 32703 & -7169 & -31825], this.dgf));
      var1.add(acP.q(r.q[3070 & 29692 & 8119 & 26555], this.dge));
      var1.add(acP.q(r.q[-19525 & -27655 & 13237 & 947], this.dn, r.q[-4173 & -6218 & -25602 & 32698]));
      var1.add(acP.q(r.q[-24577 & 1023 & 18423 & 1971], this.iH, 0.0F, 1.0F, r.q[17399 & 31733 & 11190 & 13247]));
      var1.add(acP.q(r.q[-21515 & 15349 & -7233 & -15425], this.dgg, r.q[1015 & 15350 & -5193 & 25526]));
      return var1;
   }

   public adb() {
      this.dn = 2193 & 8256;
      this.iH = 1.0F;
   }

   public void e(Color var1) {
      this.dge = var1;
   }

   public String toString() {
      return r.q[-15362 & -19521 & 4014 & 27582];
   }

   public void r(Color var1) {
      this.dgf = var1;
   }
}
