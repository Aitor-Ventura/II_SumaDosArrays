public class Excercise {
    public static double[] sum(double[] vec1, double[] vec2, int num) {
        double[] res = new double[num]; //creamos un array resultante de num términos
        
        //Sumamos vec1 y vec2    
        for (int i = 0; i < res.length; i++){ 
            res[i] = vec1[i] + vec2[i];
        } 
    return res;
    }
}