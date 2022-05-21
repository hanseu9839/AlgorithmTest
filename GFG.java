public class GFG {
    static void tower(int n,char sourcePole,char destinationPole, char auxiliaryPole){
        //Base case (termination condition)
        if(0==n) 
        return ;
        tower(n-1,sourcePole,auxiliaryPole,destinationPole);
        System.out.printf("Move to disk %d from %c to %c\n",n,sourcePole,destinationPole);
        tower(n-1,auxiliaryPole,destinationPole,sourcePole);
    }
    public static void main(String[] args) {
        tower(3,'S','D','A');
    }
}
