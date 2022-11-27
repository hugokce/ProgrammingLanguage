public class arrayclass {
    public static void main(String[] args) {
        String friendList[] = new String[5];

        friendList[0]="Joe";
        friendList[1]="Dan";
        friendList[2]="Martha";
        friendList[3]="Marco";
        friendList[4]="Judith";
        
        System.out.println(friendList[3]);

        for (int i = 0; i < 5; i++) {
            System.out.println(friendList[i]);
        }
    }
}
