import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class Il extends MessageToByteEncoder {
   private final Deflater buM;
   private int buL;
   private final byte[] buN = new byte[8192];

   public void fA(int var1) {
      this.buL = var1;
   }

   protected void q(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      int var4 = var2.readableBytes();
      IG var5 = new IG(var3);
      if (var4 < this.buL) {
         var5.fC(0);
         var5.writeBytes(var2);
      } else {
         byte[] var6 = new byte[var4];
         var2.readBytes(var6);
         var5.fC(var6.length);
         this.buM.setInput(var6, 0, var4);
         this.buM.finish();

         while(!this.buM.finished()) {
            int var7 = this.buM.deflate(this.buN);
            var5.writeBytes(this.buN, 0, var7);
         }

         this.buM.reset();
      }

   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.q(var1, (ByteBuf)var2, var3);
   }

   public Il(int var1) {
      this.buL = var1;
      this.buM = new Deflater();
   }
}
