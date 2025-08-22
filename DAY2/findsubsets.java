package DAY2;

public class findsubsets {
    public static void subsets(String str,int i,String ans){
        if(i==str.length()){
              if(ans.length()==0){
                System.out.println("null");
              }
              else{
                System.out.println(ans);
              }
              return;
        }
        subsets(str,i+1,ans);
        subsets(str,i+1,ans+str.charAt(i));

    }


    public static void main(String[] args) {
        String str="abc";
        subsets(str, 0, "");
    }
}
