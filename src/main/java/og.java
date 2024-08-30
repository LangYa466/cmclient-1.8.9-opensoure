import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Og extends UnmodifiableIterator {
   private final Iterable[] bOs;
   private final Object[] bOt;
   private final Iterator[] bOu;
   private int apI;

   public boolean hasNext() {
      if (this.apI == -2) {
         this.apI = 0;

         for(Iterator var4 : this.bOu) {
            if (!var4.hasNext()) {
               this.Vn();
               break;
            }
         }

         return true;
      } else {
         if (this.apI >= this.bOu.length) {
            for(this.apI = this.bOu.length - 1; this.apI >= 0; --this.apI) {
               Iterator var1 = this.bOu[this.apI];
               if (var1.hasNext()) {
                  break;
               }

               if (this.apI == 0) {
                  this.Vn();
                  break;
               }

               var1 = this.bOs[this.apI].iterator();
               this.bOu[this.apI] = var1;
               if (!var1.hasNext()) {
                  this.Vn();
                  break;
               }
            }
         }

         return this.apI >= 0;
      }
   }

   private void Vn() {
      this.apI = -1;
      Arrays.fill(this.bOu, (Object)null);
      Arrays.fill(this.bOt, (Object)null);
   }

   // $FF: synthetic method
   public Object next() {
      return this.Vo();
   }

   public Object[] Vo() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         while(this.apI < this.bOu.length) {
            this.bOt[this.apI] = this.bOu[this.apI].next();
            ++this.apI;
         }

         return this.bOt.clone();
      }
   }

   private Og(Class var1, Iterable[] var2) {
      this.apI = -2;
      this.bOs = var2;
      this.bOu = (Iterator[])Oc.w(Iterator.class, this.bOs.length);

      for(int var3 = 0; var3 < this.bOs.length; ++var3) {
         this.bOu[var3] = var2[var3].iterator();
      }

      this.bOt = Oc.w(var1, this.bOu.length);
   }
}
