public class µÚ5Ìâ_Ìæ»»¿Õ¸ñ {

    public static void main(String[] args) {

        String string = "12 3 4 5";
        StringBuffer SB = new StringBuffer(string);
        System.out.println(replaceSpace(SB));

    }

    public static String replaceSpace(StringBuffer str){

        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++) {
            if (str.charAt(i)  == ' '){
                str.append("  ");
            }
        }

        int P2 = str.length() -1;
        while(P1 >= 0 && P2 >P1){
            char c = str.charAt(P1);
            P1--;
            if (c == ' '){
                str.setCharAt(P2--,'0');
                str.setCharAt(P2--,'2');
                str.setCharAt(P2--,'%');
            }else{
                str.setCharAt(P2,c);
                P2--;
            }
        }
        return str.toString();
    }

}
