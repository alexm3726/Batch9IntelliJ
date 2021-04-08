package random;

public class simplified {
    String spaceOut(String s){
        StringBuffer sbuff=new StringBuffer(s);
        for(int i=0; i<(s.length()*2)-1; i++){
            if (i > 0) {
                sbuff.insert(i," ");
                i++;
            }

        }

        return sbuff.toString();

    }
}
