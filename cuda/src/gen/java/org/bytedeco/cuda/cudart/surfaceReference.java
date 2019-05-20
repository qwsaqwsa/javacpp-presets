// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA Surface reference
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class surfaceReference extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public surfaceReference() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public surfaceReference(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public surfaceReference(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public surfaceReference position(long position) {
        return (surfaceReference)super.position(position);
    }

    /**
     * Channel descriptor for surface reference
     */
    public native @ByRef cudaChannelFormatDesc channelDesc(); public native surfaceReference channelDesc(cudaChannelFormatDesc setter);
}
