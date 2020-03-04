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
        assertEquals(true,args.getValues("-l") );
        assertEquals("/usr/local",args.getValues("-d") );
        assertEquals(8080,args.getValues("-p") );
    }

    @Test
    public void testCmdNegetive() {
        Args1 args=new Args1("-l -p -d /usr/local");
        assertEquals(false,args.getValues("-l") );
        assertEquals("/usr/local",args.getValues("-d") );
        assertEquals(0,args.getValues("-p") );
    }

    @Test
    public void testCmdMoreParameter() {
        Args1 args=new Args1("-l -p -9 -d /usr/local -g this,is,a,list");
        Assert.assertEquals(false, args.getValues("-l"));
        assertEquals("/usr/local", args.getValues("-d"));
        assertEquals(-9, args.getValues("-p"));
        assertEquals("this,is,a,list",args.getValues("-g"));
    }
    @Test
    public void testCmdFormat(){
        Args1 args=new Args1("l -p -9 -d /usr/local");
        assertEquals(false,args.getCmdFormat("l"));
        assertEquals(false,args.getCmdFormat("-l"));
        assertEquals(false,args.getCmdFormat("l -p -9"));
        assertEquals(false,args.getCmdFormat("l -p -9 -d /usr/local"));
        assertEquals(true,args.getCmdFormat("-l -p -9 -d /usr/local -g this,is,a,list"));
    }

    private void  assertEquals(String Str, Object Name) {
        Assert.assertEquals(Str,Name);
    }
    private void  assertEquals(int Num, Object Name) {
        Assert.assertEquals(Num,Name);
    }
    private void  assertEquals(boolean Bool, Object name) {
        Assert.assertEquals(Bool, name);
    }
}
