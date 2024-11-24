import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class CharsetDecoderExample {
    public static void main(String[] args) throws Exception {
        byte[] data = "Привет, мир!".getBytes("UTF-8");
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();
        
        CharBuffer charBuffer = decoder.decode(ByteBuffer.wrap(data));
        System.out.println(charBuffer.toString()); 
    }
}
