/**
 * Created by kuroma on 15/10/07.
 */
public class Biscuits {
    public static void main(String[] args) {
        BiscuitsGen BiscuitMachine = new BiscuitsGen();
        while(BiscuitMachine.BiscuitsNum < 100) {
            BiscuitMachine.AddBiscuits();
        }
        System.out.println(BiscuitMachine.ShowBiscuitsNum());
    }
}
