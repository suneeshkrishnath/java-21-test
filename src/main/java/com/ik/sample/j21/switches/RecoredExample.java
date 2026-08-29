package com.ik.sample.j21.switches;

public class RecoredExample {
    public static void main(String[] args) {

        MyRecord myRecord = new MyRecord(1, 3);
        System.out.println(process(myRecord));
        MyRecord myRecord1 = new MyRecord(10, 3);
        System.out.println(processRecordPattern(myRecord1));
    }

    static int process(MyRecord myRecord) {

        if (myRecord instanceof MyRecord m) {
            return m.num() + m.num2();
        }
        return 0;
    }

    static int processRecordPattern(MyRecord myRecord){

        if (myRecord instanceof MyRecord(int m,int n) ) {
            return m+n;
        }
        return 0;
    }
}
