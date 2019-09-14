package first;

public class nursery {
    public static void main(String[] args) {
        for(int i=99;i>=1;i--) {
            int beer = i;
            int nextBeer = i - 1;
            if (i>2) {
                System.out.print(beer +" bottles of beer on the wall," + beer +" bottles of beer.\n Take one down. \n Pass it around.\n " + nextBeer +" bottles of beer on the wall.");
            }else if (i==2) {
                System.out.print(beer +" bottles of beer on the wall." + beer +" bottles of beer.\n Take one down. \n Pass it around.\n " + nextBeer +" bottle of beer on the wall.");
            }else {
                System.out.print(beer +" bottle of beer on the wall," + beer +" bottle of beer.\n Take one down. \n Pass it around.\n No more bottles of beer on the wall.");
            }
        }
    }
}
