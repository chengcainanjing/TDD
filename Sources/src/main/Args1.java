package main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengcai
 * @version 2.0 2020.03.02
 */


public class Args1 {
    public static String strArrayCmd = "";
    Map<String, String> values = new HashMap<>();

    public Args1(String strCmd) {
        String name;
        String value;
        if (getCmdFormat(strCmd)) {
            String[] arrayCmd = strCmd.split("\\s+");
            for (int i = 0; i <= arrayCmd.length - 1; i++) {
                if (arrayCmd[i].contains("-")) {
                    if (i + 1 < arrayCmd.length) {
                        System.out.println(arrayCmd[i + 1].charAt(1));
                        if (arrayCmd[i + 1].charAt(0) != '-' || arrayCmd[i + 1].length() > 2) {
                            name = arrayCmd[i];
                            value = arrayCmd[i + 1];
                            values.put(name, value);
                            i++;
                        }
                        else if (Character.getNumericValue(arrayCmd[i + 1].charAt(1)) <= 9 && Character.getNumericValue(arrayCmd[i + 1].charAt(1)) >= 0 ) {
                            name = arrayCmd[i];
                            value = arrayCmd[i + 1];
                            values.put(name, value);
                            i++;
                        } else {
                            name = arrayCmd[i];
                            value = null;
                            values.put(name, value);
                        }
                    } else {
                        name = arrayCmd[i];
                        value = null;
                        values.put(name, value);
                    }
                }
            }
        }
    }

    private boolean isValue(String value) {
        if (value.charAt(0) == '-') {
            if (value.length() > 2) {
                return true;
            }
            if (value.charAt(1) >= '0' && value.charAt(1) <= '9') {
                return true;
            }
            return false;
        }
        return true;
    }

    private Object getType(String name, String strValue) {
        switch (name) {
            case "-l":
                if (strValue == null || strValue == "false") {
                    return Boolean.FALSE;
                } else return Boolean.TRUE;
            case "-d":
                return strValue;
            case "-p":
                if (strValue == null) {
                    return Integer.valueOf(0);
                } else return Integer.valueOf(strValue);
            default:
                return strValue;

        }
    }

    private String getsStrValue(String name) {
        return values.get(name);
    }

    public Boolean getCmdFormat(String strCmd) {
        if (strCmd.charAt(0) != '-') {
            return false;
        } else return true;

    }

    public Object getValues(String name) {
        return getType(name, getsStrValue(name));
    }
}

