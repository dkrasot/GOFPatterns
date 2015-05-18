
package gofpatterns.structural.facade;

import java.util.Arrays;

public class Memory {
    public void load (long position, byte[] data){
        System.out.println("RAM: Loading to position "+position+" from HDD <"+Arrays.toString(data)+">");
    }
}
