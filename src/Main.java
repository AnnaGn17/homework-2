public class Main {
    public static void main(String[] args) {

        var a = 1;
        byte q = 2;
        short w = 3;
        int e = 4;
        long r = 5L;
        float t = 6.8f;
        double u = 64.678545;
        char i = 'c';
        boolean o = true;



        float weight1 = 78.2f;
        float weight2 = 82.7f;
        float AllWeight = weight1 + weight2;
        float DiffWeight = weight2 - weight1;
        System.out.println(" вес обоих боксёров  "+AllWeight);
        System.out.println(" разница в весе боксёров  "+DiffWeight);


        var Banan = 80;
        var Moloko100Ml = 105;
        var Plombir = 100;
        var Yaitso = 70;
        var allBanan = Banan * 5;
        var allMoloko100Ml = Moloko100Ml *2;
        var allPlombir = Plombir*2;
        var allYaitso = Yaitso*4;
        double allWeightBreakfast = allBanan + allMoloko100Ml + allPlombir + allYaitso;
        double allWeightBreakfastKg = allWeightBreakfast / 1000;
         System.out.println(" вес завтрака  "+ allWeightBreakfastKg + "кг");

        float RealWeight = 78.2f;
        float NecessaryWeight = 70f;
        float Diff = RealWeight % 70;
        var W250 = Diff / 0.25;
        var W500 = Diff / 0.5;
        var Srednee = (W250 + W500) / 2;
        System.out.println(" Спортсмену бы потребовалось " + Srednee + " дня");

        var Masha = 67760;
        var Denis = 83690;
        var Kristina = 76320;
        var M10 = Masha / 100 * 110;
        var D10 = Denis / 100 * 110;
        var K10 = Kristina / 100 * 110;
        System.out.println(" Маша будет получать " + M10 + ", Денис будет получать " + D10 +
                ", Кристина будет получать " + K10);

        var DM = (M10 * 12) - (Masha * 12);
        var DD = (D10 * 12) - (Denis * 12);
        var DK = (K10 * 12) - (Kristina * 12);
        System.out.println("Разница в годовом доходе Маши составит " + DM +
                "р, Разница в годовом доходе Дениса составит " + DD +
                ",р Разница в годовом доходе Кристины составит " + DK + "р.");














    }
}