import java.util.concurrent.Callable;

class hV implements Callable {
   // $FF: synthetic field
   final hS CP;

   public String gm() {
      StringBuilder var1 = new StringBuilder();

      for(String var3 : this.CP.Br.ayS) {
         if (var1.length() > 0) {
            var1.append(q.q[2670 & -12178]);
         }

         var1.append(var3);
         if (this.CP.Br.aDv.contains(var3)) {
            var1.append(i.q[27307 & 259]);
         }
      }

      return var1.toString();
   }

   hV(hS var1) {
      this.CP = var1;
   }

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }
}
