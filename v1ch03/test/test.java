import java.math.BigInteger;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class test {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        int a=2;
        switch (a) {
            case 2:
                System.out.println("dssdadsdsd");
                break;
            default:
                break;
        }
        System.out.println(System.getProperty("java.class.path"));

        asd:
        while (true) {
            while(true){
                for(int i=0;i<10;i++){
                    System.out.println(i);
                    if(i==2){
                        break asd;
                    }
                }
            }
        }

        // BigInteger x=BigInteger.valueOf(1);
        BigInteger x=new BigInteger("1");
        for(int i=1;i<1000;i++){
            x=x.multiply(BigInteger.valueOf(i));

        }
        System.out.println(x);

        int[] arr1=new int[100];
        int[] arr2={};
        int[] arr3=new int[0];
        int[] arr4=Arrays.copyOf(arr1, 50);
        System.out.println(arr1[0]);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr2.length+arr3.length);
        System.out.println(Arrays.toString(arr4));

        String[] strings=new String[100];
        System.out.println(strings[0]);

        for(int xx:arr1){
            System.out.print(xx+" ");
        }
        for(String str:args){
            System.out.println(str);
        
        }
        int[] arr6={4,2,3};
        int[] arr5=new int[]{1,2,3};
        System.out.println("xai:"+Arrays.binarySearch(arr6,2));
        Arrays.fill(arr5, 2);
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.equals(arr5, arr6));

        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));

        int[][] arr7={{1,2},{3,4}};
        System.out.println(Arrays.deepToString(arr7));

        arr7[0]=arr7[1];
        arr7[1][0]=1;
        System.out.println(Arrays.deepToString(arr7));

        int[][] arr8=new int[10][];
        arr8[0]=new int[10];
        arr8[1]=new int[7];
        System.out.println(arr8[1][0]);

    }    

   
}
