public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height =(float) 1.8;
        float weight = (float) 75.5;
        float bmi = service.calculate (height,weight);
        System.out.format("%.2f",bmi);


    }
}
