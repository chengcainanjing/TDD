import main.Args1;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author chengcai
 * @version 2.0 2020.03.02
 */

public class ArgsTest1 {
    @Test
    public void testNormalCmd() {
        Args1 args=new Args1("-l true -d /usr/local -p 8080");
        String strCmd = "-l true -d /usr/local -p 8080";
        Assert.assertEquals(true, args.getValues("-l"));
        Assert.assertEquals("/usr/local", args.getValues("-d"));
        Assert.assertEquals(8080, args.getValues("-p"));
    }
    @Test
    public void testCmdNegetive() {
        Args1 args=new Args1("-l -p -d /usr/local");
        Assert.assertEquals(false, args.getValues("-l"));
        Assert.assertEquals("/usr/local", args.getValues("-d"));
        Assert.assertEquals(0, args.getValues("-p"));
    }
    @Test
    public void testCmdMoreParameter() {
        Args1 args=new Args1("-l -p -9 -d /usr/local -g this,is,a,list");
        Assert.assertEquals(-9, args.getValues("-p"));
    }
    @Test
    public void testCmdFormat(){
        Args1 args=new Args1("l -p -9 -d /usr/local");
        Assert.assertEquals(false,args.getCmdFormat("l -p -9 -d /usr/local"));
        Assert.assertEquals(true,args.getCmdFormat("-l -p -9 -d /usr/local -g this,is,a,list"));
    }
}
