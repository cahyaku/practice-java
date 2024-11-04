public class Triangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {

        Triangle[] triangle = new Triangle[4];
        int x = 0;

        while (x < 4) {
            triangle[x] = new Triangle();
            triangle[x].height = (x + 1) * 2;
            triangle[x].length = x + 4;
            triangle[x].setArea();
            System.out.print("triangle " + x + " area");
            System.out.println(" = " + triangle[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = triangle[2];
        triangle[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t 5 area =  " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2;
    }
}
