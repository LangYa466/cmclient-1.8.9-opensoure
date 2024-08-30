import com.google.common.collect.Queues;
import java.util.Deque;

public class ahI {
   private final Deque dyF = Queues.newArrayDeque();

   public void awg() {
      ahJ var1 = (ahJ)this.dyF.getLast();
      this.dyF.addLast(new ahJ(var1.dyG.awf(), var1.dyH.awd()));
   }

   public ahI() {
      ahG var1 = new ahG();
      var1.awb();
      ahF var2 = new ahF();
      var2.awb();
      this.dyF.add(new ahJ(var1, var2));
   }

   public void e(ahK var1) {
      ahJ var2 = (ahJ)this.dyF.getLast();
      var2.dyG.w(var1);
      var2.dyH.q(var1);
   }

   public void t(double var1, double var3, double var5) {
      ahJ var7 = (ahJ)this.dyF.getLast();
      var7.dyG.R((float)var1, (float)var3, (float)var5);
   }

   public void u(float var1, float var2, float var3) {
      ahJ var4 = (ahJ)this.dyF.getLast();
      var4.dyG.w(ahG.S(var1, var2, var3));
      if (var1 == var2 && var2 == var3) {
         if (var1 > 0.0F) {
            return;
         }

         var4.dyH.cD(-0.30232558F * 3.3076923F);
      }

      float var5 = 1.0F / var1;
      float var6 = 1.0F / var2;
      float var7 = 1.0F / var3;
      float var8 = ahH.cG(var5 * var6 * var7);
      var4.dyH.q(ahF.Q(var8 * var5, var8 * var6, var8 * var7));
   }

   public ahJ awh() {
      return (ahJ)this.dyF.getLast();
   }

   public void awi() {
      this.dyF.removeLast();
   }

   public boolean awj() {
      return (boolean)(this.dyF.size() == (269 & -15199) ? 4169 & -4699 : 4144 & -32242);
   }
}
