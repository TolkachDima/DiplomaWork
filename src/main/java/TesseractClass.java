import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TesseractClass {
    Tesseract tesseract = new Tesseract();
    File file = new File("C:\\Users\\USER\\Desktop\\photoshop\\image-crop.png");
    BufferedImage imageToSearch = ImageIO.read(file);

    public TesseractClass() throws IOException {
    }


    public String analyseText() throws TesseractException {
        System.out.println(tesseract.doOCR(imageToSearch));



        return "";
    }



}
