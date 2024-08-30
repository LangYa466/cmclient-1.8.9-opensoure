import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;

public class Io {
   private byte[] buQ = new byte[0];
   private byte[] buR = new byte[0];
   private final Cipher buS;

   protected Io(Cipher var1) {
      this.buS = var1;
   }

   private byte[] w(ByteBuf var1) {
      int var2 = var1.readableBytes();
      if (this.buQ.length < var2) {
         this.buQ = new byte[var2];
      }

      var1.readBytes(this.buQ, 0, var2);
      return this.buQ;
   }

   protected void q(ByteBuf var1, ByteBuf var2) {
      int var3 = var1.readableBytes();
      byte[] var4 = this.w(var1);
      int var5 = this.buS.getOutputSize(var3);
      if (this.buR.length < var5) {
         this.buR = new byte[var5];
      }

      var2.writeBytes(this.buR, 0, this.buS.update(var4, 0, var3, this.buR));
   }

   protected ByteBuf q(ChannelHandlerContext var1, ByteBuf var2) {
      int var3 = var2.readableBytes();
      byte[] var4 = this.w(var2);
      ByteBuf var5 = var1.alloc().heapBuffer(this.buS.getOutputSize(var3));
      var5.writerIndex(this.buS.update(var4, 0, var3, var5.array(), var5.arrayOffset()));
      return var5;
   }
}
