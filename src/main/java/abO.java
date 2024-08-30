import java.io.UnsupportedEncodingException;

public class abo extends RuntimeException {
   private final UnsupportedEncodingException dan;

   public abo(UnsupportedEncodingException var1) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dan = var1;
      }
   }

   public UnsupportedEncodingException aos() {
      return this.dan;
   }
}
