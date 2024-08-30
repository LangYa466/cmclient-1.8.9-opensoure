import com.google.common.collect.ImmutableSet;
import java.util.Collection;

public class hu extends hx {
   private final ImmutableSet Ab = ImmutableSet.of(Boolean.valueOf(true), Boolean.valueOf(false));

   protected hu(String var1) {
      super(var1, Boolean.class);
   }

   public static hu x(String var0) {
      return new hu(var0);
   }

   public Collection et() {
      return this.Ab;
   }

   public String q(Boolean var1) {
      return var1.toString();
   }
}
