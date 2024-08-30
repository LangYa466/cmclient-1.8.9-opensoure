import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class afZ {
   public List dsH;
   public String av;
   public afQ dtn;

   public afZ(String var1, afQ var2) {
      this.av = var1;
      this.dtn = var2;
      this.dsH = new ArrayList();
   }

   public void init() {
      Map var1 = afP.q(this.dtn);

      for(Entry var3 : var1.entrySet()) {
         afS var4 = (afS)var3.getValue();
         aga var5 = new aga(this, (String)var3.getKey(), var4);
         this.dsH.add(var5);
      }

      this.dtn.avj();
   }
}
