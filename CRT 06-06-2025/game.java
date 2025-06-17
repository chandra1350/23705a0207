import java.util.*;
public class Game{
    public static void main(String[] args){
        String title;
        String[] zoner;
        int playcount;
        float rating;
        boolean familyfriend;
        String playmethod;
        String Summary;
        Game(String title,String playcount,float rating,boolean familyfriend,String playmethod,String Summary,String[] zoner) {
            this.title = title;
            this.playcount = playcount;
            this.rating = rating;
            this.familyfriend = familyfriend;
            this.playmethod =playmethod;
            this.summary=summar;
            this.zoner = zoner;
            void details() {
                System.out.println("Game title:"+ title);
                System.out.println("Game rating :" + rating);
                System.out.println("Game playcount:" + playcount);
                System.out.println("Game familyfriend" + familyfriend);
                System.out.println("Game playmethod:"+ playmethod);
                System.out.println("Game summary"+ Summary);
                System.out.print("zoner");
                for(String zoner:zoner){
                    System.out.println(zoner +"");
                }
                System.out.println();
                System.out.println("--------") 
            }
        }
        public class Main {
            public static void main(String[] args) {
                Game g1 = new game("free fire",20,3.5f;"familyfriend",25,
                "good",new string[] {"freefire","pubg","shoot"});
                g1.details();
            }
            
            
       }


      
}