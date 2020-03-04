package test;

import main.Args;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author chengcai
 * @version 1.0 2020.02.28
 */

public class ArgsTest {
    @Test
    public void testNormalCmd() {
        Args args=new Args("-l true -d /usr/local -p 8080");
        assertEquals(true,args.getValues("-l") );
        assertEquals("/usr/local",args.getValues("-d") );
        assertEquals(8080,args.getValues("-p") );
    }

    @Test
    public void testCmdNegetive() {
        Args args=new Args("-l -p -d /usr/local");
        assertEquals(false,args.getValues("-l") );
        assertEquals("/usr/local",args.getValues("-d") );
        assertEquals(0,args.getValues("-p") );
    }

    @Test
    public void testCmdMoreParameter() {
        Args args=new Args("-l -p -9 -d /usr/local -g this,is,a,list");
        Assert.assertEquals(false, args.getValues("-l"));
        assertEquals("/usr/local", args.getValues("-d"));
        assertEquals(-9, args.getValues("-p"));
        assertEquals("this,is,a,list",args.getValues("-g"));
    }
    @Test
    public void testCmdFormat(){
        Args args=new Args("l -p -9 -d /usr/local");
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
