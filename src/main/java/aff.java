import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class afF {
   public List dsg = new ArrayList();
   public acj[] dsh;
   public String av;
   public Map dsi = new HashMap();
   public String dsj = q.q[26113 & 26134 & 4212 & -32713];
   private boolean KV;
   public boolean aM = (boolean)(17921 & 4110);

   public afF(String var1) {
      this.av = var1;
   }

   public void avh() {
      if (!this.KV) {
         for(afG var2 : this.dsi.values()) {
            if (!var2.dsq.isEmpty()) {
               var2.dsp = (afG)this.dsi.get(var2.dsq);
               var2.dss.q(var2.dsp.dsr);
               var2.dss.aph();
               var2.dss.e(var2.dsr);
            } else {
               var2.dss.q(var2.dsr);
            }
         }

         this.dsg.sort(Comparator.comparingInt((var0) -> {
            return var0.apI;
         }));
         this.dsh = new acj[this.dsg.size()];
         this.KV = (boolean)(529 & 8523);
      }

   }

   public void w(afG var1) {
      this.dsi.put(var1.av, var1);
      this.dsg.add(var1);
   }
}
