import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class acf extends FilterOutputStream {
   private boolean dcj;
   private byte[] buN;
   private int dck;
   private byte[] dcl;
   private boolean dcm;
   private byte[] dcn;
   private boolean dco;
   private int dcp;
   private int dcq;
   private int bAw;

   public acf(OutputStream var1) {
      this(var1, 16521 & -31997);
   }

   public void close() {
      this.apd();
      super.close();
      this.buN = null;
      this.out = null;
   }

   public void write(int var1) {
      if (this.dco) {
         this.out.write(var1);
      } else {
         if (this.dcm) {
            byte[] var10000 = this.buN;
            int var10001 = this.bAw;
            this.bAw += 97 & 8981;
            var10000[var10001] = (byte)var1;
            if (this.bAw >= this.dck) {
               this.out.write(ace.q(this.dcl, this.buN, this.dck, this.dcp));
               this.dcq += 4364 & 25206;
               if (this.dcj && this.dcq >= (204 & 14414)) {
                  this.out.write(-29094 & 4238);
                  this.dcq = 16646 & -29047;
               }

               this.bAw = 9 & -12288;
            }
         } else if (this.dcn[var1 & 8831 & 383] > (-5 & -1)) {
            byte[] var3 = this.buN;
            int var4 = this.bAw;
            this.bAw += -12017 & 17;
            var3[var4] = (byte)var1;
            if (this.bAw >= this.dck) {
               int var2 = ace.q(this.buN, 3466 & -32768, this.dcl, 17542 & 4416, this.dcp);
               this.out.write(this.dcl, 0 & 9247, var2);
               this.bAw = 8 & 16469;
            }
         } else if (this.dcn[var1 & -32641 & 24959] != (-5 & -5)) {
            throw new IOException(i.q[-22540 & -6402 & -30252 & 5622]);
         }

      }
   }

   public acf(OutputStream var1, int var2) {
      super(var1);
      this.dcj = (boolean)((var2 & 4265 & 28252) != 0 ? 259 & 10397 : 16457 & 9376);
      this.dcm = (boolean)((var2 & -32471 & 16597) != 0 ? 8205 & 4259 : 16 & -7136);
      this.dck = this.dcm ? 32003 & 635 : 16388 & 1159;
      this.buN = new byte[this.dck];
      this.bAw = 1538 & 2400;
      this.dcq = 2336 & 29194;
      this.dco = (boolean)(16387 & 8512);
      this.dcl = new byte[-28604 & 25095];
      this.dcp = var2;
      this.dcn = ace.jY(var2);
   }

   public void write(byte[] var1, int var2, int var3) {
      if (this.dco) {
         this.out.write(var1, var2, var3);
      } else {
         for(int var4 = 29090 & -32255; var4 < var3; ++var4) {
            this.write(var1[var2 + var4]);
         }

      }
   }

   public void apd() {
      if (this.bAw > 0) {
         if (!this.dcm) {
            throw new IOException(i.q[-8963 & -25379 & 25309 & -9483]);
         }

         this.out.write(ace.q(this.dcl, this.buN, this.bAw, this.dcp));
         this.bAw = 12554 & 19460;
      }

   }
}
