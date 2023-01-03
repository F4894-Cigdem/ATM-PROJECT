package J11_MethodCreation;

public class C04MethodCreation {//motor

    public static void main(String[] args) {
        String name="haluk";
        System.out.println("car car " +name);
        C04_MethodDepo.gecmeNotu(24);//depo class'dan class name ile method call ettik.

       C04_MethodDepo .topla(3,5);//8
/* farklı class'tan method call etmek için ..
1. method static-> gökteki güneş gibi
2.ClassName.methodName() şeklinde call edilir
aynı class daki method doğrudan methodName ile call edilir
 */
        selamVer();//aynı class dan methodName ile call edilir.


    }// main dışı

    public static void selamVer() {
        System.out.println("agam selamlar Devamkeee :)");
    }

}



