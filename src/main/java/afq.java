import java.util.List;
import java.util.Map;

public class afQ {
   public List dqP;
   public List dsH;
   public List dsI;
   public Map dsJ;
   public Map dsK;
   public List dqO;

   public afQ(List var1, List var2, List var3, List var4, Map var5, Map var6) {
      this.dqO = var1;
      this.dsI = var2;
      this.dqP = var3;
      this.dsH = var4;
      this.dsK = var5;
      this.dsJ = var6;

      for(afR var8 : var4) {
         var8.dsM = (afF)var6.get(var8.dsL);
      }

   }

   public void avj() {
      this.dqO.clear();
      this.dsI.clear();
      this.dqP.clear();
      this.dsH.clear();
   }
}
