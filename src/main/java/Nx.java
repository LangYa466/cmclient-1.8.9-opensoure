import java.util.Iterator;

final class NX implements Iterable {
   // $FF: synthetic field
   final NW bOi;
   // $FF: synthetic field
   final NW bOj;

   public Iterator iterator() {
      return new NY(this);
   }

   NX(NW var1, NW var2) {
      this.bOi = var1;
      this.bOj = var2;
   }
}
