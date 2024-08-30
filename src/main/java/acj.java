import java.util.Iterator;
import java.util.ListIterator;

class acJ implements Iterator {
   // $FF: synthetic field
   final acI dfG;
   // $FF: synthetic field
   final ListIterator dfH;

   public void remove() {
      this.dfH.remove();
   }

   public boolean hasNext() {
      return this.dfH.hasPrevious();
   }

   public Object next() {
      return this.dfH.previous();
   }

   acJ(acI var1, ListIterator var2) {
      this.dfG = var1;
      this.dfH = var2;
   }
}
