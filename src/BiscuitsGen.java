/**
 * Created by kuroma on 15/10/07.
 */
public class BiscuitsGen {
    int BiscuitsNum;
    public void AddBiscuits() {
        BiscuitsGen.this.BiscuitsNum++;
    }
    public int ShowBiscuitsNum() {
        return BiscuitsNum;
    }
    public void EatBiscuits() {
        BiscuitsGen.this.BiscuitsNum--;
    }
}
