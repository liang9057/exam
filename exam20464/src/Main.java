
import java.util.*;
import java.util.Map.Entry;
public class Main {

    public static void main(String[] args) {
      //第二题
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入你的工资：");
        double i=sc.nextDouble();
        double s=i-3500;
        double j=0;
        if(s>0){
            if(s<=1500){
                j=s*0.03;
            }else if(s<=4500){
                j=s*0.1-105;
            }else if(s<=9000){
                j=s*0.2-555;
            }else if(s<=35000){
                j=s*0.25-1005;
            }else if(s<=55000){
                j=s*0.3-2775;
            }else if(s<=80000){
                j=s*0.35-5505;
            }else {
                j=s*0.45-13505;
            }
            System.out.println("你应交的税为："+j);
        }else{
            System.out.println("不交税！");
        }

        //第三题
        int year;
        int month;
        int day;
        int e=0;
        Scanner scanner = new Scanner(System.in);
        do {
            e=0;
            System.out.print("输入日期:");
            Scanner sca=new Scanner(System.in);
            String datestr=sca.next();
            String[] array = datestr.split("-");
             year = Integer.valueOf(array[0]);
             month = Integer.valueOf(array[1]);
             day = Integer.valueOf(array[2]);
             if(year%4==0&&year%100!=0||year%400==0){
                 if((month==2)&&(day<0||day>29)){
                     System.out.println("您输入的日期不存在");
                     e=1;
                 }else if((month==1||month==3||month==5&&month==7||month==8||month==10||month==12)&&(day<0||day>31)){
                     System.out.println("您输入的日期不存在");e=1;
                 }else if((month==4||month==6||month==9||month==11)&&(day<0||day>30)){
                     System.out.println("您输入的日期不存在");e=1;
                 }

             }else {
                 if((month==2)&&(day<0||day>28)){
                     System.out.println("您输入的日期不存在");e=1;
                 }else if((month==1||month==3||month==5&&month==7||month==8||month==10||month==12)&&(day<0||day>31)){
                     System.out.println("您输入的日期不存在");e=1;
                 }else if((month==4||month==6||month==9||month==11)&&(day<0||day>30)){
                     System.out.println("您输入的日期不存在");e=1;
                 }
             }

        } while (e == 1);
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if(day==31){
                    day=1;
                    month++;
                }else{
                    day++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day==30){
                    day=1;
                    month++;
                }else{
                    day++;
                }
                break;
            case 12:
                if(day==31){
                    day=1;
                    month=1;
                    year++;
                }else{
                    day++;
                }
                break;
            case 2:
                if(year%4==0&&year%100!=0||year%400==0){
                    if(day==29){
                        day=1;
                        month++;
                    }else{
                        day++;
                    }
                }else{
                    if(day==28){
                        day=1;
                        month++;
                    }else{
                        day++;
                    }
                }
                break;
             default:
                 break;
        }

        System.out.println("下一天为："+year+"-"+month+"-"+day);


    }
}
