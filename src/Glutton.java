import java.util.Scanner;

public class Glutton {
    public static void main(String[] args){
        Scanner focus=new Scanner(System.in);
        String gnoll=Homer(focus.nextInt(),focus.nextInt(),focus.nextInt(),focus.nextInt(),focus.nextInt(), focus.nextInt());
        System.out.print(gnoll);
    }
    public static String Homer(int a,int b,int c,int d,int e,int f){
        double ops=1;
        int y=0;
        String s="";
        int [] ahuet={a,b,c,d,e,f};
        for(int t=0;t<5;t++){
            ops=ops-(ops/ahuet[t]);
            System.out.println(ops);
            if(ops<=0){
                y=t;
                break;
            }
        }


        if(y==0){
            s="Vsevolod";
        }
        else if(y==1){
            s="Kirill";
        }
        else if(y==2){
            s="Dmitry";
        }
        else if(y==3){
            s="Nikolay";
        }
        else if(y==4){
            s="Viktor";
        }
        else if(y==5){
            s="Marina";
        }
        return s;
    }
}
