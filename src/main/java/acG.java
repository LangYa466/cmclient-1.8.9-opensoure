import java.nio.ByteBuffer;

public class acg {
   public static ByteBuffer ape() {
      return ByteBuffer.allocate(6176 & -31999);
   }

   public static int w(ByteBuffer var0, ByteBuffer var1) {
      if (var0 != null && var1 != null) {
         int var2 = var0.remaining();
         int var3 = var1.remaining();
         if (var2 > var3) {
            int var4 = Math.min(var2, var3);
            var0.limit(var4);
            var1.put(var0);
            return var4;
         } else {
            var1.put(var0);
            return var2;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
