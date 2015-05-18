package gofpatterns.structural.facade;

public class ComputerFacade {

    private CPU processor;
    private Memory ram;
    private HardDrive hdd;
    private final long BOOT_ADDRESS = 256;
    private final long BOOT_SECTOR = 100500;
    private final int SECTOR_SIZE = 8;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hdd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hdd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
