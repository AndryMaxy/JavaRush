package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    private ImageReader imageReader;

    public static ImageReader getImageReader(ImageTypes y) {
        if (ImageTypes.BMP.equals(y)) {
            return new BmpReader();
        } else if (ImageTypes.JPG.equals(y)) {
            return new JpgReader();
        } else if (ImageTypes.PNG.equals(y)) {
            return new PngReader();
        } else throw new IllegalArgumentException ("Неизвестный тип картинки");
    }
}
