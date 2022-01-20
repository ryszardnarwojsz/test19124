import java.util.Arrays;

public class RectangularTriangle {

    public static boolean isRectangularTriangle(float a ,float b,float c){

            float[] arrayTriangle = new float[3];

                arrayTriangle[0] = a;
                arrayTriangle[1] = b;
                arrayTriangle[2] = c;
                Arrays.sort(arrayTriangle);

        return (float) Math.pow(arrayTriangle[0], 2) + (float) Math.pow(arrayTriangle[1], 2) == (float) Math.pow(arrayTriangle[2], 2);
    }

}
