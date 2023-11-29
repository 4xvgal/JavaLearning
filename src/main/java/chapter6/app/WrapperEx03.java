package chapter6.app;

public class WrapperEx03 {
    public static void main(String []args){
        //Character 사용
        System.out.println(Character.toLowerCase('A')); //A 를 소문자로 변환
        char c1= '4', c2='F';
        if(Character.isDigit(c1)); //문자 c1이 숫자이면 true
            System.out.println(c1+"는 숫자");
        if(Character.isAlphabetic(c2))//문자 c2가 영문자이면 true
            System.out.println(c2+"는 영문자");

        //Integer 사용
        System.out.println(Integer.parseInt("28")); //문자열 "28"을 10진수로 변환
        System.out.println(Integer.toString(28));   //정수 28을 2진수 문자열로 변화
        System.out.println(Integer.toBinaryString(28)); //28을 16진수 문자열로 변환
        System.out.println(Integer.bitCount(28)); //28에 대한 2진수의 1의 갯수

        Integer i = Integer.valueOf(28);
        System.out.println(i.doubleValue());

        //double 사용
        Double d = Double.valueOf(3.14); //박싱
        System.out.println(d.toString()); //Double 문자열 "3.14" 변환   (언박싱)

        //Boolean 사용
        boolean b = (4>3); //b 는 true
        System.out.println(Boolean.toString(b)); //true를 문자열 "true" 로 변환
        System.out.println(Boolean.parseBoolean("false")); //문자열을 false로 변환


    }
}
