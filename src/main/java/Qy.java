import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class qY {
   static final Gson anT = (new GsonBuilder()).registerTypeAdapter(qY.class, new qZ()).registerTypeAdapter(rb.class, new rc()).create();
   private final Map anU = Maps.newHashMap();

   public rd aq(String var1) {
      rd var2 = (rd)this.anU.get(var1);
      if (var2 == null) {
         throw new ra(this);
      } else {
         return var2;
      }
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof qY) {
         qY var2 = (qY)var1;
         return this.anU.equals(var2.anU);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.anU.hashCode();
   }

   public qY(List var1) {
      for(qY var3 : var1) {
         this.anU.putAll(var3.anU);
      }

   }

   public static qY w(Reader var0) {
      return (qY)anT.fromJson(var0, qY.class);
   }

   public qY(Collection var1) {
      for(rd var3 : var1) {
         this.anU.put(rd.q(var3), var3);
      }

   }
}
