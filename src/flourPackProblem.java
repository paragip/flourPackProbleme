public class flourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(4,2,18));
    }


    public static boolean canPack (int bigCount,int smallCount, int goal) {

        String OK = "no";

        if (bigCount*5+smallCount < goal) {
            OK = "no";
        }

        for (int i = 0; i <= bigCount; i++){
            for (int j = 0; j <= smallCount; j++) {
                if ((i * 5 + j) == goal) {
                    OK = "yes";
                    break;
                }
            }
        }
        if (OK == "yes") {
            return true;
        } else {
            return false;
        }
    }



}
