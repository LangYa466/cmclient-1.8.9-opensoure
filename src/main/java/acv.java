import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JComponent;

abstract class acV implements acN {
   String av;
   String aLv;

   public boolean q(JComponent var1, String var2) {
      acX var3 = new acX(var1, this.av, var2);
      var3.setTitle(this.av);
      var3.setLocationRelativeTo((Component)null);
      EventQueue.invokeLater(new acW(this, var1));
      var3.setVisible((boolean)(16657 & 139));
      return var3.dga;
   }

   public String Iy() {
      return this.aLv;
   }

   public acV(String var1, String var2) {
      this.aLv = var2;
      this.av = var1;
   }

   public String bY() {
      return this.av;
   }

   public String toString() {
      return this.aLv == null ? q.q[6417 & 30422 & -31166 & -15533] : this.aLv.toString();
   }

   public void hq(String var1) {
      this.aLv = var1;
   }
}
