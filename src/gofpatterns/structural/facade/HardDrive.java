package gofpatterns.structural.facade;

import java.util.Arrays;

public class HardDrive {
    public byte[] read(long lba, int size){
        System.out.println("HDD: Reading from position "+lba+" with sector size "+size);
        byte[] arr = new byte[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        System.out.println("HDD: <"+Arrays.toString(arr)+"> was read successfully");
        return arr;
    }
}
