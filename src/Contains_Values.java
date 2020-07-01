public class Contains_Values {

    public static void main(String[]args){
        int [] num={14,17,29,27,20};
        int toFind =29;
        boolean found = false;

        for (int n : num ){
            if (n == toFind){
                found = true;
                break;
            }

        }

        if (found)
            System.out.println(toFind + "is found. " );
        else
                System.out.println(toFind + "is not found.");
    }

}
