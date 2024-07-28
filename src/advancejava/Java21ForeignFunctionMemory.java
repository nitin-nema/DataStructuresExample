package advancejava;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public class Java21ForeignFunctionMemory {
    public static void main(String[] args) {
        SegmentAllocator allocator = SegmentAllocator.nativeAllocator();

        try (MemorySegment segment = allocator.allocate(1024)) {
            System.out.println("Allocated memory segment: " + segment);
        }
    }
}
