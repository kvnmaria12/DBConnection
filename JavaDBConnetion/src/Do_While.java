public class Do_While {

    public static void main(String[] args) {

        int i = 0;
        String result = "";

        do{
            i+=1;

            result += i + " ";
            System.out.println(result);
        }while (i > 0 && i<5);


    }
}
