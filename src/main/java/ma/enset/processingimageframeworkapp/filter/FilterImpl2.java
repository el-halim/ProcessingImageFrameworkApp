package ma.enset.processingimageframeworkapp.filter;

public class FilterImpl2 implements Filter {
    @Override
    public int[] filter(int[] data) {
        int[] filteredImage =data;
        for (int i = 0; i <data.length ; i++) {
            filteredImage[i] = data[i]*3;
        }
        System.out.println("******************filter image using imple 2******************");

        return  filteredImage;    }
}
