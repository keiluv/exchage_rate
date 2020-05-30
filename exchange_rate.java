import java.util.Scanner;

class Main {
    //환전 메서드
    public static double changeMoney(float money, String nation){
        double tot=0.0;
        //switch문, 자바에서는 switch의 조건문에 String값이 들어갈 수 있음.
        switch(nation){
            //미국달러
            case "USD":
                tot = money*1156.0;
                break;
            //일본 엔
            case "JPY":
                tot = money*10.54;
                break;
            case "CNY":
            //중국 위안
                tot = money*167.54;
                break;
        }
        
        return tot;
    }
    
    public static void main(String[] args) {

        System.out.println("환율 계산기");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("원하는 나라를 입력하시오.");
        System.out.println("미국:USD 일본:JPY 중국:CNY");
        String nation = scanner.next();
        
        System.out.println("원하는 금액을 입력하시오.");
        float money = scanner.nextFloat();
        //함수 호출
        double result = changeMoney(money, nation);

        //결과값을 printf 함수로 호출
        System.out.printf("%.1f을 환전한 결과는 %.1f원입니다.",money,result);
    }
}