package rank.demo;

public class mysteryAlgorighm {

    public static void show(int x,int y){
        //sum=sum+i; //业务代码1
        //递归头
        if(x==y){
            System.out.println(x);
            return;
        }

        if (x>y){
            x=x-y;
        }
        else if(x<y){
            y=y-x;
        }

       //业务代码2
        show(x,y); //递归体
    }
    public static void main(String[] args) {
       show(2437,875);
    }
}
