import java.util.Iterator;

final class NZ implements Iterable {
   // $FF: synthetic field
   final NW bOm;
   // $FF: synthetic field
   final NW bOn;

   NZ(NW var1, NW var2) {
      this.bOn = var1;
      this.bOm = var2;
   }

   public Iterator iterator() {
      return new Oa(this);
   }
}
