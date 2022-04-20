package ru.gvsmirnov.perv.labs.rekt;

public class ChecksumCalculator {
    final static int MAX_LEN_FILENAME = 16;

    private static native long calculateChecksum(String filename);

    public static void main(String[] args) {
        if (args[0].length() > MAX_LEN_FILENAME) {
            System.out.println("Could not process file. Filename too long.");
        } else {
            System.loadLibrary("main");
            long checksum = calculateChecksum(args[0]);
            System.out.println("Got checksum from native method: " + checksum);
        }

        
    }
}
