package Class17;

public class Ram {
    public static void main(String[] args) {
        int salary=10001001;
        StringBuilder sb=new StringBuilder(String.valueOf(salary));
        sb.reverse();
        salary=Integer.parseInt(sb.toString());
        System.out.println(salary);

        double salary1=0.00000012;
        String s=String.valueOf(salary1);
        System.out.println(s);
        String converted="";

        for(int i=s.length()-1; i>=0; i--){
            converted+=s.charAt(i);
        }
        System.out.println(converted);
    }
}
