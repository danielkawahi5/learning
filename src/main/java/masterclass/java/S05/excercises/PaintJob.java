package masterclass.java.S05.excercises;

public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(4,5,6,7));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }

        return (int)Math.ceil(width*height/areaPerBucket) - extraBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int)Math.ceil((width * height)/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int)Math.ceil(area/areaPerBucket);
    }

}
