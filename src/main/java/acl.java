import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class acL implements acM {
   private Color dfM = Color.white;

   public void q(BufferedImage var1, Graphics2D var2, acC var3, acH var4) {
      var2.setColor(this.dfM);
      var2.fill(var4.aqy());
   }

   public void q(Color var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(r.q[15279 & 5118 & 2494 & -11330]);
      } else {
         this.dfM = var1;
      }
   }

   public List aqE() {
      ArrayList var1 = new ArrayList();
      var1.add(acP.q(w.q[12211 & 32227 & 17919 & 27067], this.dfM));
      return var1;
   }

   public acL(Color var1) {
      this.dfM = var1;
   }

   public Color aqF() {
      return this.dfM;
   }

   public String toString() {
      return w.q[-31833 & -21593 & -6673 & 26595];
   }

   public acL() {
   }

   public void H(List var1) {
      for(acN var3 : var1) {
         if (var3.bY().equals(w.q[3051 & -13845 & -17501 & 13291])) {
            this.q((Color)var3.bm());
         }
      }

   }
}
