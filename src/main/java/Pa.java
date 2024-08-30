public class PA extends Pz {
   private final vL bTF;

   public void Xv() {
      this.bTE = 0.0F;
      this.aPW = 0.0F;
      if (this.bTF.aDU.bC()) {
         ++this.aPW;
      }

      if (this.bTF.aDr.bC()) {
         --this.aPW;
      }

      if (this.bTF.aCp.bC()) {
         ++this.bTE;
      }

      if (this.bTF.aEO.bC()) {
         --this.bTE;
      }

      this.bTC = this.bTF.aDg.bC();
      this.bTD = this.bTF.aEw.bC();
      if (this.bTD) {
         this.bTE = (float)((double)this.bTE * 0.3D);
         this.aPW = (float)((double)this.aPW * 0.3D);
      }

   }

   public PA(vL var1) {
      this.bTF = var1;
   }
}
