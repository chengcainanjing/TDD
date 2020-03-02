package test;

import main.Args;
import org.junit.Assert;
import org.junit.Test;



public class ArgsTest {
    @Test
    public void testNormalCmd() {
        Args args=new Args("-l true -d /usr/local -p 8080");
        String strCmd = "-l true -d /usr/local -p 8080";
        Assert.assertEquals(true, args.getValues("-l"));
        Assert.assertEquals("/usr/local", args.getValues("-d"));
        Assert.assertEquals(8080, args.getValues("-p"));
//        args.values.get("-l");
    }
    @Test
    public void testCmdNegetive() {
        Args args=new Args("-l -p -d /usr/local");
        Assert.assertEquals(false, args.getValues("-l"));
        Assert.assertEquals("/usr/local", args.getValues("-d"));
        Assert.assertEquals(0, args.getValues("-p"));
    }
    @Test
    public void testCmdMoreParameter() {
        Args args=new Args("-l -p -9 -d /usr/local -g this,is,a,list");
//        Assert.assertEquals(false, args.getValues("-l"));
//        Assert.assertEquals("/usr/local", args.getValues("-d"));
        Assert.assertEquals(-9, args.getValues("-p"));
//        System.out.println(args.getValues("-p"));
//        Assert.assertEquals("this,is,a,list",args.getValues("-g"));
    }
    @Test
    public void testCmdFormat(){
        Args args=new Args("l -p -9 -d /usr/local");
        Assert.assertEquals(false,args.getCmdFormat("l -p -9 -d /usr/local"));
        Assert.assertEquals(true,args.getCmdFormat("-l -p -9 -d /usr/local -g this,is,a,list"));
    }

//    @Test
//    public void testCharAt() {
////        String strCmd = "l - -9-d/usr/local";
//        char str="-9".charAt(1);
//        System.out.println(str);
////        String[] arrayCmd = strCmd.split("\\s+");
////        for (int i = 0; i <= arrayCmd.length; i++) Assert.assertEquals(9, arrayCmd[2].charAt(1));
//
//    }
}
