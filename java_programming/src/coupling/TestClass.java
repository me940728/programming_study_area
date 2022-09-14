package coupling;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
class ListObject{
    double PI = 3.14;
    void RW(boolean bol){
        if(bol){ System.out.println("true"); }
        else { System.out.println("false"); }
    }
    double getPI(){ return this.PI; }
}
public class TestClass {
    int num = 0;
    int[] arr = null;
    void setDataCoupling(int num){ this.num = num; }
    void setStampCoupling(int[] arr) { this.arr = arr;}
    void controlMethod(boolean bol){
        ListObject lo = new ListObject();
        lo.RW(bol);
    }
    void externalCoupling(String fileName){
        File file = new File(fileName);
    }
    double commonCoupling(double v1){
        return v1 * new ListObject().getPI();
    }
    double commonCoupling2(double v2){
        return v2 * new ListObject().getPI();
    }
    void contentsCoupling(double v3){
        ListObject lo = new ListObject();
        lo.PI = v3;
    }
}
