/*
Copyright (c) 2017, Nick Ivanov <nick@nnbits.org>

Permission to use, copy, modify, and/or distribute this software for any
purpose with or without fee is hereby granted, provided that the above
copyright notice and this permission notice appear in all copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE
OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
PERFORMANCE OF THIS SOFTWARE.
*/

import java.io.File;
import java.time.LocalDate;
import java.util.HashMap;

public class YosExample implements Yos {
    private double a;
    private double b;
    private double sum;
    private File logFile;

    private double sumHelper() {
        return a + b;
    }

    public boolean check() {
        if(a < 0.0) { return false; }
        if(b < 0.0) { return false; }
        return true;
    }

    public YosExample() {

        test();
        a = 0;
        b = 0;
    }

    public boolean go() {
        sum = sumHelper();
        return check();
    }

    public boolean test() {
        return true;
    }

    public String log(String comment) {
        HashMap<String, String> itemsToLog = new HashMap();
        itemsToLog.put("a", String.valueOf(a));
        itemsToLog.put("b", String.valueOf(b));
        itemsToLog.put("sum", String.valueOf(sum));

        return "[YosExample log @ " + LocalDate.now().toString() + " | "
                + comment + "]: " + itemsToLog.toString();
    }

    public void demo() {
        System.out.println("[YosExample Demo]");
        this.setA(10.1);
        this.setB(20.2);

    }

    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public double getSum() { return sum; }
}
